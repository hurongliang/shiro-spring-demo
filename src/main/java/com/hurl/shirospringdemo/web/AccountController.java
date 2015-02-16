package com.hurl.shirospringdemo.web;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hurl.shirospringdemo.domain.AccountService;
import com.hurl.shirospringdemo.web.vo.ResponseVo;

@Controller
public class AccountController {

	@Resource
	private AccountService accountService;
	
	
	@RequestMapping("/go-to-login-page")
	@ResponseBody
	public ResponseVo loginPage(){
		return ResponseVo.success("This is a login page");
	}
	
	@RequestMapping("/login")
	@ResponseBody
	public ResponseVo login(@RequestParam String username, @RequestParam String password){
		try{
			accountService.login(username, password);
		}catch(Exception e){
			return ResponseVo.failure(e.getMessage());
		}
		return ResponseVo.success(null);
	}

	@RequestMapping("/logout")
	public String logout(){
		accountService.logout();
		return "redirect:/go-to-login-page";
	}
	
	
}
