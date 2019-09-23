package io.anchal.RestService.controller;

import java.io.FileReader;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReadJsonController {

	final Logger LOGGER = LoggerFactory.getLogger(ReadJsonController.class);

	@RequestMapping(value = "/read", method = RequestMethod.GET)
	public String readJson() {

		JSONParser parser = new JSONParser();

		try {

			Object obj = parser.parse(new FileReader("/detail.json"));
			JSONObject jsonObject = (JSONObject) obj;
			LOGGER.info(jsonObject.toString());
			return jsonObject.toString();
		}

		catch (Exception e) {
			LOGGER.error("Exception Caught", e);
			return "";
		}

	}

}
