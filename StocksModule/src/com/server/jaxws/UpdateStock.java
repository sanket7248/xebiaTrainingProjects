
package com.server.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * This class was generated by Apache CXF 3.2.7
 * Tue Jan 15 15:47:56 IST 2019
 * Generated source version: 3.2.7
 */

@XmlRootElement(name = "updateStock", namespace = "http://server.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateStock", namespace = "http://server.com/", propOrder = {"arg0", "arg1"})

public class UpdateStock {

    @XmlElement(name = "arg0")
    private java.lang.String arg0;
    @XmlElement(name = "arg1")
    private double arg1;

    public java.lang.String getArg0() {
        return this.arg0;
    }

    public void setArg0(java.lang.String newArg0)  {
        this.arg0 = newArg0;
    }

    public double getArg1() {
        return this.arg1;
    }

    public void setArg1(double newArg1)  {
        this.arg1 = newArg1;
    }

}
