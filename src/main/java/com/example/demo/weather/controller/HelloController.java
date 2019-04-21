package com.example.demo.weather.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @author qushen
 *
 */
@Controller
public class HelloController {

	
	@RequestMapping("/hello")
	public String hello() {
		return "index";
		
	}
}
