package com.yaodu.filter;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.*;
import java.io.IOException;

/**
 * 过滤器
 * 主要作用：实现URL级别的权限访问控制、过滤敏感词汇、压缩响应信息、字符集统一等一些高级功能。
 * 生命周期：web应用停止或重新部署的时候才销毁。（每次热部署后，都会销毁）。
 * @WebFilter这个注解是Servlet3.0的规范，并不是Springboot提供的。启动类需要加上扫描注解@ServletComponentScan
 */
@Slf4j
//@WebFilter(urlPatterns = "/*", filterName = "LogCostFilter")
public class LogCostFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) {
        log.info("实例化log过滤器");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        log.info("执行log过滤器");
        filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void destroy() {
        log.info("销毁log过滤器");
    }
}
