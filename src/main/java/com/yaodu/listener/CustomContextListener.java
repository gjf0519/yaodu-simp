package com.yaodu.listener;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * 监听器
 * 主要作用：统计在线人数和在线用户、系统启动时加载初始化信息、统计网站访问量、记录用户访问路径
 * 生命周期：在项目中启动的时候实例化
 * 启动类需要加上扫描注解@ServletComponentScan
 */
@Slf4j
@WebListener
public class CustomContextListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        System.out.println("servletContextEvent初始化");

    }
    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        System.out.println("servletContextEvent销毁");
    }
}
