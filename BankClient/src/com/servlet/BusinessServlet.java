package com.servlet;

import java.io.IOException;
import java.net.URL;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.rpc.ServiceException;

import com.bank.Address;
import com.bank.Bank;
import com.bank.BankServiceLocator;
import com.bank.User;

/**
 * Servlet implementation class BusinessServlet
 */
public class BusinessServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BusinessServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		String id=request.getParameter("uid");
		int uid=Integer.parseInt(id);
		BankServiceLocator bankServiceLocator=new BankServiceLocator();
		try {
			Bank bank = bankServiceLocator.getBank(new URL("http://localhost:1012/Banking/services/Bank"));
			
			User readUserFromAccounts = bank.readUserFromAccounts(uid);
			System.out.println("The user - "+readUserFromAccounts.getUserId());
			System.out.println("User address - "+readUserFromAccounts.getAddress().getLocation());
			Address locationForUser = bank.getLocationForUser(readUserFromAccounts);
			response.getWriter().println("Location for user - "+locationForUser.getLocation());
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
