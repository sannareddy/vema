package edu.vemaschools.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import edu.vemaschools.dao.impl.LabelDAOImpl;

@Controller
public class TestController {
	@Autowired
	LabelDAOImpl labelDAOImpl;
	@RequestMapping("/test")
	@ResponseBody
	public String showLabel() {
		return labelDAOImpl.save().toString();
	}
}
