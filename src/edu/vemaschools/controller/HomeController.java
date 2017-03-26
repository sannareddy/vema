package edu.vemaschools.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	@RequestMapping({"/index","/"})
	public ModelAndView index() {
		ModelAndView modelAndView=new ModelAndView("index");
		modelAndView.addObject("name","Vamsikrishna");
		return modelAndView;
	}
}
