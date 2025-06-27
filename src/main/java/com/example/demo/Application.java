package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(Application.class, args);
		Repository bean = run.getBean(Repository.class);
		Iterable<Student> findAll = bean.findAll();
		for(Student s:findAll) {
			System.out.println(s);
		}
	}

}