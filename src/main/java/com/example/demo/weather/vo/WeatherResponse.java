package com.example.demo.weather.vo;

import java.io.Serializable;

public class WeatherResponse implements Serializable{
	
	public static final long seriaVersionUID =1L;

	private int resultcode;
	private String reason;
	private String result;
	public int getResultcode() {
		return resultcode;
	}
	public void setResultcode(int resultcode) {
		this.resultcode = resultcode;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	
	
}
