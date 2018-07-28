package com.capgemini.spring.lab1_3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capgemini.spring.lab1_3.SBU;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext3.xml");
		SBU sbu=(SBU) context.getBean("sbu");
		System.out.println("SBU Details");
		System.out.println("-----------------------");
		System.out.println(sbu);
	}

}
