package edu.vemaschools.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller 
public class RootController {
	@RequestMapping(path="/") 
	public String defaultPath() {
		return "redirect:index";
	}

	@RequestMapping(path="/login") 
	public String login() {
		return "login";
	}
	@RequestMapping(path="/login",params="error") 
	public String loginFailed() {
		return "invalidlogin";
	}
	@RequestMapping(path="/loginSuccess")
	@ResponseBody
	public String loginSuccess() {
		return "SUCCESS";
	}
}
