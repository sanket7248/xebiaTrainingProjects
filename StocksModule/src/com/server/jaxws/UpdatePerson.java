
package com.server.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * This class was generated by Apache CXF 3.2.7
 * Tue Jan 15 16:27:53 IST 2019
 * Generated source version: 3.2.7
 */

@XmlRootElement(name = "updatePerson", namespace = "http://server.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updatePerson", namespace = "http://server.com/", propOrder = {"arg0", "arg1"})

public class UpdatePerson {

    @XmlElement(name = "arg0")
    private com.server.model.Person arg0;
    @XmlElement(name = "arg1")
    private int arg1;

    public com.server.model.Person getArg0() {
        return this.arg0;
    }

    public void setArg0(com.server.model.Person newArg0)  {
        this.arg0 = newArg0;
    }

    public int getArg1() {
        return this.arg1;
    }

    public void setArg1(int newArg1)  {
        this.arg1 = newArg1;
    }

}
