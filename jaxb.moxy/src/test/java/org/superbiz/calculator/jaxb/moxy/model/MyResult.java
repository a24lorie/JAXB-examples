package org.superbiz.calculator.jaxb.moxy.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name="MyResult")
@XmlType(name="",
	 propOrder={
		"accountID",
		"user",
		"result"})
public class MyResult {

    private String accountID;
    private User user;
    private Result result;

    
    public String getAccountID() {
        return accountID;
    }
    @XmlElement(name="AccountID")
    public void setAccountID(String accountID) {
        this.accountID = accountID;
    }

    public User getUser() {
        return user;
    }
    @XmlElement(name="User")
    public void setUser(User user) {
        this.user = user;
    }

    public Result getResult() {
        return result;
    }
    @XmlElement(name="Result")
    public void setResult(Result result) {
        this.result = result;
    }
}