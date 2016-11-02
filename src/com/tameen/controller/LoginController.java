package com.tameen.controller;

import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

import com.tameen.model.Status;
import com.tameen.model.User;
import com.tameen.service.UserService;


@Component
public class LoginController implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Autowired
	private UserService userService;
	private String userName;
	private String password;

	public LoginController() {
		System.out.println("login controller");
	}

	
	public void loginAction() {		
		if (userName == null && userName.isEmpty())
			return;
			User user=userService.getUserByUsername(userName);
			if (user != null ) {
				if (user.getPassword().equals(getPassword())){
					System.out.println("true");
				}
		} else {
			System.out.println("wrong user name");
			FacesContext.getCurrentInstance().addMessage(
                    null,
                    new FacesMessage(FacesMessage.SEVERITY_WARN,
                    "Invalid Login!",
                    "Please Try Again!"));
		}
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}

}
