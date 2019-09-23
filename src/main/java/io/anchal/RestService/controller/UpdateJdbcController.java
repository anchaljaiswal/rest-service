package io.anchal.RestService.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.anchal.model.Student;
import io.anchal.repository.StudentRepository;

@RestController
public class UpdateJdbcController {

	final Logger LOGGER = LoggerFactory.getLogger(UpdateJdbcController.class);
	@Autowired
	StudentRepository studentRepository;
	Student student = new Student(10002, "neha", "female");

	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public void updateJdbc() {
		if (studentRepository.updateRecord(student) == 0)
			LOGGER.error("Cannot update");
		else
			LOGGER.info("Successfully Updated");

	}
}
