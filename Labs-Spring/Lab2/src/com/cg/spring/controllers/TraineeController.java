package com.cg.spring.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cg.spring.beans.Trainee;
import com.cg.spring.exceptions.TraineeNotFoundException;
import com.cg.spring.exceptions.TraineeServicesDownException;
import com.cg.spring.services.ITraineeService;

@Controller
public class TraineeController {

	@Autowired(required = true)
	private ITraineeService traineeService;

	@RequestMapping(value = "/addTraineeC", method = RequestMethod.POST)
	public ModelAndView addPage(@ModelAttribute("trainee") Trainee trainee) {
		try {
			trainee = traineeService.addTrainee(trainee);
			ModelAndView modelAndView = new ModelAndView("indexPage", "trainee", trainee);
			return modelAndView;
		} catch (TraineeServicesDownException e) {
			e.printStackTrace();
		}
		return new ModelAndView("errorPage");

	}

	@RequestMapping(value = "/deleteTraineeC", method = RequestMethod.POST)
	public ModelAndView getDelete(@ModelAttribute("trainee") Trainee trainee)
			throws TraineeNotFoundException, TraineeServicesDownException {
		trainee = traineeService.deleteTrainee(trainee.getTraineeId());
		ModelAndView modelAndView = new ModelAndView("deleteTraineeInfo", "trainee", trainee);
		return modelAndView;

	}

	@RequestMapping(value = "/modifyTraineeC", method = RequestMethod.POST)
	public ModelAndView modifyPage(@ModelAttribute("trainee") Trainee trainee)
			throws TraineeNotFoundException, TraineeServicesDownException {
		trainee = traineeService.getTraineeInfo(trainee.getTraineeId());
		ModelAndView modelAndView = new ModelAndView("modifyTraineePage", "trainee", trainee);
		return modelAndView;

	}

	@RequestMapping(value = "/update")
	public ModelAndView getUpdateTrainee(@ModelAttribute("trainee") Trainee trainee)
			throws TraineeNotFoundException, TraineeServicesDownException {
		trainee = traineeService.updateTrainee(trainee);
		ModelAndView modelAndView = new ModelAndView("indexPage", "trainee", trainee);
		return modelAndView;

	}

	@RequestMapping(value = "/retrieveC")
	public ModelAndView getInformation(@ModelAttribute("trainee") Trainee trainee)
			throws TraineeNotFoundException, TraineeServicesDownException {
		trainee = traineeService.getTraineeInfo(trainee.getTraineeId());
		ModelAndView modelAndView = new ModelAndView("retrieveTraineeInfo", "trainee", trainee);
		return modelAndView;

	}

	public ModelAndView getInformations() throws TraineeNotFoundException, TraineeServicesDownException {
		List<Trainee> list = traineeService.getAllTrainees();
		ModelAndView modelAndView = new ModelAndView("retrievetraineesInfo", "trainee", list);
		return modelAndView;

	}
}
