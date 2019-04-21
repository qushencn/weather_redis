package com.example.demo.weather.Service;


import org.springframework.stereotype.Service;
import com.example.demo.weather.config.HttpRequesttest;
import redis.clients.jedis.Jedis;

/**
 * 
 * @author qushen
 *
 */
@Service
public class WeatherServiceiml implements WeatherService {
	
	public static final String REDIS_HOST="192.168.1.126";
	public static final int REDIS_PORT=6379;
	public static final long TIME_OUT=18000;
	
	public String getDateCityName(String city) {
		String Response;

		String url="http://v.juhe.cn/weather/index?format=2&cityname="+city+"&key=ba790e992e77a6f5f7e1ce854dcb4203";
		
		Jedis jedis=new Jedis(REDIS_HOST,REDIS_PORT);

		String key=url;
		
		System.out.println("key:"+key);
		
	  if(jedis.get(key)!=null) {
		  
		  System.out.println("走了redis");
		  Response=jedis.get(key);
		  
	  }else {
		   Response =HttpRequesttest.sendGet(key);
		   
		   System.out.println("jedis.get(key):"+jedis.get(key));
		   
		   System.out.println("走了API");
		  
		  jedis.set(key, Response,"NX", "EX", TIME_OUT);
		  
		  
	  }
		
	    jedis.close();
		
		return Response;
	}

	
}
