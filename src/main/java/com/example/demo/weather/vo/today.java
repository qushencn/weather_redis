package com.example.demo.weather.vo;

import java.io.Serializable;

public class today implements Serializable {

	public static final long seriaVersionUID =1L;
	//今天温度
	private String temperature;
	//天气情况
	private String weather;
	//风
	private String wind;
    //城市
	private String city;
	//日期
	private String date_y;
	//提示
	private String dressing_advice;
	public String getTemperature() {
		return temperature;
	}
	public void setTemperature(String temperature) {
		this.temperature = temperature;
	}
	public String getWeather() {
		return weather;
	}
	public void setWeather(String weather) {
		this.weather = weather;
	}
	public String getWind() {
		return wind;
	}
	public void setWind(String wind) {
		this.wind = wind;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getDate_y() {
		return date_y;
	}
	public void setDate_y(String date_y) {
		this.date_y = date_y;
	}
	public String getDressing_advice() {
		return dressing_advice;
	}
	public void setDressing_advice(String dressing_advice) {
		this.dressing_advice = dressing_advice;
	}
	public static long getSeriaversionuid() {
		return seriaVersionUID;
	}

}
