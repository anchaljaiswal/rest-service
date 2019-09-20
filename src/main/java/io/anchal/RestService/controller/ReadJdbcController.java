package io.anchal.RestService.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.anchal.model.Student;
import io.anchal.repository.StudentRepository;

@RestController
public class ReadJdbcController {

	final Logger LOGGER = LoggerFactory.getLogger(WriteJsonController.class);
	@Autowired
	StudentRepository studentRepository;
	@RequestMapping(value = "/readAll" , method = RequestMethod.GET)
	public List<Student> readTable(){
		
		return studentRepository.readRecord();
	}
}
