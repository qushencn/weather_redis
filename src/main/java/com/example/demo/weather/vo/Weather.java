package com.example.demo.weather.vo;

import java.io.Serializable;
import java.util.List;

/**
 * 
 * @author qushen
 *
 */
public class Weather implements Serializable{
	
	public static final long seriaVersionUID =1L;

	private String sk;
	private String today;
	private List<future> future;
	public String getSk() {
		return sk;
	}
	public void setSk(String sk) {
		this.sk = sk;
	}
	public String getToday() {
		return today;
	}
	public void setToday(String today) {
		this.today = today;
	}

	public List<future> getFuture() {
		return future;
	}
	public void setFuture(List<future> future) {
		this.future = future;
	}
	public static long getSeriaversionuid() {
		return seriaVersionUID;
	}
	
	


}
