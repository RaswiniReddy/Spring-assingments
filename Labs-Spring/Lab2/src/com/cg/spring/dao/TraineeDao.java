package com.cg.spring.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.spring.beans.Trainee;

public interface TraineeDao extends JpaRepository<Trainee,Integer> {
}
