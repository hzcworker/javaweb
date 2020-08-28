package com.atguigu.servlet;
import com.atguigu.pojo.Person;
import com.google.gson.Gson;
import jdk.management.resource.internal.inst.SocketOutputStreamRMHooks;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author 郝哲超
 * @create 2020-07-11 9:37
 */
public class AjaxServlet extends  BaseServlet {

    protected void javaScriptAjax(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Ajax请求过来了");
        Person person=new Person("王一博",3);
        //服务器给客户端返回数据
        //json格式的字符串
        Gson gson=new Gson();
        String personJsonString = gson.toJson(person);
//      //把字符串返回给客户端，先得到响应的字符输出流
       resp.getWriter().write(personJsonString);
    }



    protected void jQueryAjax(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("jQueryAjax==方法调用了");
        Person person=new Person("王博",4);
        Gson gson=new Gson();
        String personJsonString = gson.toJson(person);
//      //把字符串返回给客户端，先得到响应的字符输出流
        resp.getWriter().write(personJsonString);
    }

    protected void jQueryGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("get==方法调用了");
        Person person=new Person("洗海新",4);
        Gson gson=new Gson();
        String personJsonString = gson.toJson(person);
//      //把字符串返回给客户端，先得到响应的字符输出流
        resp.getWriter().write(personJsonString);
    }

    protected void jQueryPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("post==方法调用了");
        Person person=new Person("张瑞宇",66);
        Gson gson=new Gson();
        String personJsonString = gson.toJson(person);
//      //把字符串返回给客户端，先得到响应的字符输出流
        resp.getWriter().write(personJsonString);
    }


    protected void jQuerygetJSON(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("getJSON==方法调用了");
        Person person=new Person("王福",66);
        Gson gson=new Gson();
        String personJsonString = gson.toJson(person);
//      //把字符串返回给客户端，先得到响应的字符输出流
        resp.getWriter().write(personJsonString);
    }

    protected void jQuerySerialize(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("jQuerySerialize==方法调用了");
        System.out.println("用户名:"+req.getParameter("username"));
        System.out.println("密码:"+req.getParameter("password"));
        Person person=new Person("王真",66);
        Gson gson=new Gson();
        String personJsonString = gson.toJson(person);
//      //把字符串返回给客户端，先得到响应的字符输出流
        resp.getWriter().write(personJsonString);
    }

}
