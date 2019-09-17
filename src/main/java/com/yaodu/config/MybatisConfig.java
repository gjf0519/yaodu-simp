package com.yaodu.config;

import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.StringUtils;

@Configuration
public class MybatisConfig implements ApplicationContextAware {

    @Value("${mybatis.base-package}")
    private String basePackage;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
//        MapperScannerConfigurer mapperScannerConfigurer = applicationContext.getBean(MapperScannerConfigurer.class);
//        if(StringUtils.isEmpty(this.basePackage)){
//            return;
//        }
//        mapperScannerConfigurer.setBasePackage(this.basePackage);
    }
}
