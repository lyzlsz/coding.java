package com.bittech.Servlet.Servlet;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * package:com.bittech.Servlet
 * Description:TODO
 * @date:2019/5/18
 * @Author:weiwei
 **/
@WebServlet("/handlerServlet")
public class HandlerServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)throws ServletException,IOException{
        //1.获取用户请求的参数
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        //2.调用业务逻辑进行判断
        req.getSession().getAttribute("key_username",username);
        req.getSession().getAttribute("key_password",password);

        //3.返回相应的结果
        req.getRequestDispatcher("resultServlet").forward(req,resp);
    }
}
