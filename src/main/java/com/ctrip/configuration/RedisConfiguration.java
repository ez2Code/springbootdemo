package com.ctrip.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

/**
 * Created by li_weia on 2017/6/22.
 */
@Configuration
public class RedisConfiguration {

    @Bean(name= "spring.redis")
    @Autowired
    public JedisPool jedisPool(@Qualifier("spring.redis.config") JedisPoolConfig config,
                               @Value("${spring.redis.host}")String host,
                               @Value("${spring.redis.port}")int port) {
        return new JedisPool(config, host, port);
    }

    @Bean(name= "spring.redis.config")
    public JedisPoolConfig jedisPoolConfig (@Value("${spring.redis.pool.max-active}")int maxTotal,
                                            @Value("${spring.redis.pool.max-idle}")int maxIdle,
                                            @Value("${spring.redis.pool.max-wait}")int maxWaitMillis) {
        JedisPoolConfig config = new JedisPoolConfig();
        config.setMaxTotal(maxTotal);
        config.setMaxIdle(maxIdle);
        config.setMaxWaitMillis(maxWaitMillis);
        return config;
    }
}
