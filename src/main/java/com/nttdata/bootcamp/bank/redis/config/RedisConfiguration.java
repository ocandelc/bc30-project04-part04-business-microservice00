package com.nttdata.bootcamp.bank.redis.config;

import com.nttdata.bootcamp.bank.springboot.document.DocumentType;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

@Configuration
public class RedisConfiguration {

    @Bean
    JedisConnectionFactory jedisConnectionFactory() {

        return new JedisConnectionFactory();
    }

    @Bean
    RedisTemplate<String, DocumentType> redisTemplate() {
        final RedisTemplate<String, DocumentType> redisTemplate = new RedisTemplate<>();
        redisTemplate.setConnectionFactory(jedisConnectionFactory());
        return redisTemplate;
    }

}
