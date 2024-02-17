package com.diworksdev.webproj.action;

import com.opensymphony.xwork2.ActionSupport;

public class TestAction extends ActionSupport{
	private String username;
	private String password;

	public String execute()
		{return SUCCESS;
		}
	public String getUsername()
		{return username;
		}
	public String setUsername(String username)
		{return username;
		}
	public String getPassword()
		{return password;
		}
	public void setPasswod(String password)
		{this.password=password;

		}
}