package com.cg.spring.services;

import java.util.List;

import com.cg.spring.beans.Trainee;
import com.cg.spring.exceptions.TraineeNotFoundException;
import com.cg.spring.exceptions.TraineeServicesDownException;

public interface ITraineeService {

	public List<Trainee> getAllTrainees() throws TraineeServicesDownException;
	public Trainee getTraineeInfo(int traineeId) throws TraineeNotFoundException,TraineeServicesDownException;
	public Trainee addTrainee(Trainee trainee)throws TraineeServicesDownException;
	 public Trainee deleteTrainee(int traineeId)throws TraineeNotFoundException,TraineeServicesDownException;
	 public Trainee updateTrainee(Trainee trainee)throws TraineeNotFoundException,TraineeServicesDownException;
}
