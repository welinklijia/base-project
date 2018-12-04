package com.test.redis;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

public class TestPool {

	public static void main(String[] args) {
		//JedisPoolConfig继承apache的GenericObjectPoolConfig，配置Pool的相关参数如下
		JedisPoolConfig config = new JedisPoolConfig();
		//如果赋值为-1，则表示不限制；如果pool已经分配了MaxActive个jedis实例，则此时pool的状态为exhausted(耗尽)。
		config.setMaxTotal(500);
		//控制一个pool最多有多少个Idle(空闲的)jedis实例
		config.setMaxIdle(5);
		//表示当borrow(引入)一个jedis实例时，最大的等待时间，如果超过等待时间，则直接抛出JedisConnectionException；
		config.setMaxWaitMillis(30000);
		//在borrow一个jedis实例时，是否提前进行validate操作；如果为true，则得到的jedis实例均是可用的；
		config.setTestOnBorrow(true);
		JedisPool pool = new JedisPool(config, "10.10.1.231",17001);
		//从pool中获取对象
		Jedis jedis = pool.getResource();
		String value = jedis.get("aa");
		System.out.println(value);
		pool.close();
	}

}
