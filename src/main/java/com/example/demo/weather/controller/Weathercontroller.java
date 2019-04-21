package com.example.demo.weather.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.weather.Service.WeatherService;

@RestController
public class Weathercontroller {

	@Autowired
  public WeatherService weatherservice; 
	
  @RequestMapping("/test")
	public String app(HttpServletRequest request) {
	  String city=request.getParameter("city");
	  System.out.println("进入了controller"+city);
	  System.out.println("要查询的城市名字是："+city); 
	  return weatherservice.getDateCityName(city);
		
		
	}
}
