package org.superbiz.calculator.jaxb.moxy.model;

import javax.xml.bind.annotation.XmlElement;

public class User {

    private String name;
    private String email;

    public String getName() {
        return name;
    }
    @XmlElement(name="Name")
    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }
    @XmlElement(name="Email")
    public void setEmail(String email) {
        this.email = email;
    }

}
