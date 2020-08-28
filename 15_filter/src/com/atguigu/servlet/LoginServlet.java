package com.atguigu.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author 郝哲超
 * @create 2020-07-07 13:32
 */
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        if("haozhechao".equals(username) && "123456".equals(password)){
            req.getSession().setAttribute("user",username);
            resp.setHeader("Content-type", "text/html;charset=UTF-8");
            resp.getWriter().write("登录成功啦!!!!");

        }else{
            req.getRequestDispatcher("/login.jsp").forward(req,resp);
        }
    }
}
