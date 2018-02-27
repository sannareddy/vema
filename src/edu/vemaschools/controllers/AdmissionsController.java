package edu.vemaschools.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import edu.vemaschools.entities.EduClass;

@Controller
public class AdmissionsController {
	@RequestMapping("/admissions")
	public ModelAndView loadAdmissionHome() {
		ModelAndView admissionsView=new ModelAndView();
		String[] classes=new String[]{"10th","Inter"};
		admissionsView.addObject("allClasses", classes);
		admissionsView.setViewName("admissions");
		return admissionsView;
	}
}
