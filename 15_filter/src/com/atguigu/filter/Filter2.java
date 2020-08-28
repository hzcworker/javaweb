package com.atguigu.filter;


import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;

/**
 * @author 郝哲超
 * @create 2020-07-07 19:02
 */
public class Filter2  implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("Filter2前置代码");
        System.out.println("Filter2线程:"+ Thread.currentThread().getName());
        System.out.println("Filter2"+servletRequest.getParameter("username"));

        System.out.println("Filter2中取Filter2中的数据为"+servletRequest.getAttribute("key1"));
        filterChain.doFilter(servletRequest,servletResponse);
        System.out.println("Filter2后置代码");
    }

    @Override
    public void destroy() {

    }
}
