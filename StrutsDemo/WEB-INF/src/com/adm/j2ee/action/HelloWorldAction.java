package com.adm.j2ee.action;

import com.opensymphony.xwork2.ActionSupport;

public class HelloWorldAction extends ActionSupport {
	
	public String userName;
	
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String sayHello()
	{
		if("amd".equals(userName))
		{
			return "success";
		}
		return "error";
	}
	
	public String execute()
	{
		if("amd".equals(userName))
		{
			return SUCCESS;
		}
		return ERROR;
	}

}
