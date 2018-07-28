package com.cg.spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cg.spring.beans.Trainee;

@Controller
public class URIController {

	@RequestMapping("/")
	public String getIndexPage() {
		return "login";
	}

	@RequestMapping("/login")
	public String getLoginPage() {
		return "indexPage";

	}

	@RequestMapping("addTrainee")
	public String getaddTraineePage() {
		return "addTraineePage";
	}

	@RequestMapping("deleteTrainee")
	public String getDeleteTraineePage() {
		return "deleteTraineePage";
	}

	@RequestMapping("modifyTrainee")
	public String getModifyTraineePage() {
		return "modifyTraineePage";
	}

	@RequestMapping("retrieveTrainee")
	public String getRetrieveTraineePage() {
		return "retrieveTraineePage";
	}

	@RequestMapping("retrieveTrainees")
	public String getRetrieveTraineesPage() {
		return "retrieveTraineesPage";
	}

	@ModelAttribute("trainee")
	public Trainee getTrainee() {
		return new Trainee();
	}
}
