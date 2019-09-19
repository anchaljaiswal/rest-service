package io.anchal.RestService.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestServiceController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String printMessage()
	{
		return "Hello, I am running !";
	}
	
}
