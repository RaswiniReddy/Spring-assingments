package com.cg.spring.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cg.spring.beans.Trainee;
import com.cg.spring.dao.TraineeDao;
import com.cg.spring.exceptions.TraineeNotFoundException;
import com.cg.spring.exceptions.TraineeServicesDownException;

@Component(value="traineeService")
public class TraineeService implements ITraineeService{
	 @Autowired
		private TraineeDao traineeDao;
		 
		@Transactional
		@Override
		public List<Trainee> getAllTrainees() throws TraineeServicesDownException {
			List<Trainee> list=traineeDao.findAll();
			return list;
		}
		@Transactional
		@Override
		public Trainee getTraineeInfo(int traineeId) throws TraineeNotFoundException, TraineeServicesDownException {
			Trainee trainee=traineeDao.findOne(traineeId);
			traineeDao.findAll();
			return trainee;
		}
		@Transactional
		@Override
		public Trainee addTrainee(Trainee trainee) throws TraineeServicesDownException {
			
			return traineeDao.save(trainee);
			
		}
		@Transactional
		@Override
		public Trainee deleteTrainee(int traineeId) throws TraineeNotFoundException, TraineeServicesDownException {
			
			Trainee trainee=traineeDao.findOne(traineeId);
			
			traineeDao.delete(trainee);
			return trainee;
			
		}
		@Transactional
		@Override
		public Trainee updateTrainee(Trainee trainee) throws TraineeNotFoundException, TraineeServicesDownException {
			Trainee trainee1=traineeDao.findOne(trainee.getTraineeId());
			trainee1.setTraineeName(trainee.getTraineeName());
			trainee1.setTraineeLocation(trainee.getTraineeLocation());
			trainee1.setTraineeDomain(trainee.getTraineeDomain());
			traineeDao.save(trainee1);
			return trainee1;
			
			
		}
}
