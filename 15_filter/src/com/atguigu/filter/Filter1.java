package com.atguigu.filter;
import org.omg.Messaging.SyncScopeHelper;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;
import java.net.StandardSocketOptions;

/**
 * @author 郝哲超
 * @create 2020-07-07 18:54
 */
public class Filter1 implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("Filter1前置代码");
        System.out.println("Filter1线程:"+ Thread.currentThread().getName());
        System.out.println("Filter1"+servletRequest.getParameter("username"));
        servletRequest.setAttribute("key1","value1");
        filterChain.doFilter(servletRequest,servletResponse);
        System.out.println("Filter1后置代码");
    }

    @Override
    public void destroy() {

    }
}
