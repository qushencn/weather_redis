package com.example.demo.weather.redis;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

public class ConnentRedis {


	
	public static final String REDIS_HOST="192.168.1.126";
	public static final int REDIS_PORT=6379;
	public static final int TIMEOUT=200;
	//Redis服务器设置密码，可以配置下面这个参数
	//public static final String REDIS_AUTH="admin";
	
	public static void main(String[] args) {
		//首先如果想使用Jedis连接池，则必须有一个类可以保存所有连接池相关的属性的配置项
		JedisPoolConfig poolConfig=new JedisPoolConfig();
		poolConfig.setMaxTotal(1000);//设置最大连接数
		poolConfig.setMaxIdle(200);  //设置空闲的连接数
		poolConfig.setMaxWaitMillis(1000); //设置最大的等待时间
		poolConfig.setTestOnBorrow(true);  //是否要进行链接测试，以保证返回的链接为可用链接。
		
		
		JedisPool pool =new JedisPool(poolConfig,REDIS_HOST,REDIS_PORT,TIMEOUT);
		
		Jedis jedis=pool.getResource();
		
		System.out.println(jedis.ping());
		jedis.get("122");
		System.out.println("jedis.get(\"122\");:"+jedis.get("122"));
		jedis.close();
		pool.close();
	}
}
