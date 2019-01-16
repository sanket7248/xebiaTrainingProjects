

import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import com.server.Account;
import com.server.AccountServiceLocator;

public class Client {

	public static void main(String[] args) throws ServiceException, RemoteException, MalformedURLException {
		// TODO Auto-generated method stub
		AccountServiceLocator accountServiceLocator = new AccountServiceLocator();
		URL url=new URL("http://localhost:1070/MyService/services/Account");
		Account account = accountServiceLocator.getAccount(url);
		System.out.println("The stub helper : "+account);
		String name = account.getName(12345);
		System.out.println("The name retrieved : "+name);
		String bal=account.readBalance(name);
		System.out.println("balance : "+bal);
		
	}

}
