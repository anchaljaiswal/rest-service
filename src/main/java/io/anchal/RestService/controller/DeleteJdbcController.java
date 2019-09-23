package io.anchal.RestService.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.anchal.repository.StudentRepository;

@RestController 
public class DeleteJdbcController {
	
	@Autowired
	StudentRepository studentRepository;
	final Logger LOGGER = LoggerFactory.getLogger(DeleteJdbcController.class);
	@RequestMapping(value="/delete" , method=RequestMethod.DELETE)
	public void deleteRecord() {
		
		if(studentRepository.deleteById(10001) == 0)
			LOGGER.error("Cannot delete record");
		else
			LOGGER.info("Deletion was successful");
				
	}

}
