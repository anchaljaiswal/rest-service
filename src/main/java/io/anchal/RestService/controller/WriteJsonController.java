package io.anchal.RestService.controller;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WriteJsonController {
	
	final Logger logger = LoggerFactory.getLogger(WriteJsonController.class);
	@RequestMapping(value="/write")
	public void writeJson() {
		
		
		JSONObject obj= new JSONObject();
		obj.put("name","Anchal");
		obj.put("gender","female");
		obj.put("country","India");
		
		JSONArray list=new JSONArray();
		list.add("remark 1");
		list.add("remark 2");
		list.add("remark 3");
		
		obj.put("remarks", list);
		
		try {
			
			FileWriter file=new FileWriter("/detail.json");
			file.write(obj.toJSONString());
			file.flush();
		    }
			catch (IOException e) {
				logger.error("Exception Caught", e);
			}
		
			//System.out.println(obj);
		
		
		
		
	}
	

}
