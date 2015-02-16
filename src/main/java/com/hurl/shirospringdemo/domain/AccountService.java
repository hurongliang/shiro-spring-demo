package com.hurl.shirospringdemo.domain;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Service;

@Service
public class AccountService {
	
	public void login(String username, String password){
		Subject subject = SecurityUtils.getSubject();
		UsernamePasswordToken token = new UsernamePasswordToken(username,password);
		subject.login(token);
	}
	
	public void logout(){
		SecurityUtils.getSubject().logout();
	}
}
