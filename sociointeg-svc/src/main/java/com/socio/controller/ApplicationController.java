package com.socio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/greeting-svc")
public class ApplicationController {

	@RequestMapping(method = RequestMethod.GET)
	public @ResponseBody Greetings sayHello(@RequestParam(value="name", required= false, defaultValue = "Robot") String userName) {
		return new Greetings(userName, "1234", "Phoenix");
	}
	
}
