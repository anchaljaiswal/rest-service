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
public class WriteJdbcController {

	
	final Logger LOGGER = LoggerFactory.getLogger(WriteJdbcController.class);
	
	@Autowired
	StudentRepository studentRepository;
	@RequestMapping(value = "/writeIN", method = RequestMethod.PUT)
	public void writeToTable() {
		Student student=new Student(101,"Anaya","Female");
		
		
		if(studentRepository.writeRecord(student)== 0) {
			LOGGER.error("Could not process request");	
		}
		else
		{
			LOGGER.info("Successful insertion of record");
		}
		
		
	}
}
