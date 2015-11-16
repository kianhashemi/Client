package org.bihe.bean;

import org.bihe.service.HandleCommand;
import org.bihe.service.entityService.Login;

public class LoginUser {
	private Login login;
	private HandleCommand hc;
	public LoginUser() {
		Person p=new Person("siavash", "123");
		this.login=new Login(p);
		this.hc= new HandleCommand(login,p);
	}
	
	public HandleCommand getLogin(){
		return this.hc;
	}
}
