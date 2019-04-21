package com.example.demo.weather.vo;

import java.io.Serializable;

public class future implements Serializable{
	
	public static final long seriaVersionUID =1L;

	private String futureTemperature;
	private String futureWeather;
	private String futureWind;
	private String futureDate;
	public String getFutureTemperature() {
		return futureTemperature;
	}
	public void setFutureTemperature(String futureTemperature) {
		this.futureTemperature = futureTemperature;
	}
	public String getFutureWeather() {
		return futureWeather;
	}
	public void setFutureWeather(String futureWeather) {
		this.futureWeather = futureWeather;
	}
	public String getFutureWind() {
		return futureWind;
	}
	public void setFutureWind(String futureWind) {
		this.futureWind = futureWind;
	}
	public String getFutureDate() {
		return futureDate;
	}
	public void setFutureDate(String futureDate) {
		this.futureDate = futureDate;
	}

	
	
}
