package com.hurl.shirospringdemo.web;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {

	@RequestMapping("/index")
	@ResponseBody
	public Object index(){
		Map<String,Object> result = new HashMap<String,Object>();
		result.put("success", "true");
		result.put("message", "You are in index page");
		return result;
	}
}
