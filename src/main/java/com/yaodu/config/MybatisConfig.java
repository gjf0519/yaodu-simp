package com.yaodu.config;

import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.annotation.MapperScans;
import org.mybatis.spring.boot.autoconfigure.MybatisProperties;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.util.StringUtils;

@Configuration
@MapperScans(value = {@MapperScan("com.yaodu.mapper")})
public class MybatisConfig {

    @Bean
    @Primary
    public MybatisProperties mybatisProperties(){
        MybatisProperties properties = new MybatisProperties();
        properties.setConfigLocation("classpath:mybatis/mybatis-config.xml");
        properties.setTypeAliasesPackage("com.yaodu.entity");
        return properties;
    }
}
