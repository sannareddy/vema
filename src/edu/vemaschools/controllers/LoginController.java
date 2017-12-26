package edu.vemaschools.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
	@RequestMapping("/authenticate")
	public String login() {
		return null;
	}
}
