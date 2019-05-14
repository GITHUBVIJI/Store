package com.store.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@RequestMapping(value = "/")
	public String printMsg()
	{
		return "Welcome to the Store!";
	}

}
