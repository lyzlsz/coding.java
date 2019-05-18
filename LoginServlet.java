package com.bittech.Servlet.Servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * package:com.bittech.Servlet
 * Description:TODO
 * @date:2019/5/18
 * @Author:weiwei
 **/
@WebServlet(name = "mylogin",urlPatterns = "/mylogin")
public class LoginServlet extends HttpServlet  {
    @Override
    public void init()throws ServletException {
        super.init();
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)throws ServletException,IOException{
        resp.setContentType("text/html;charset = utf-8");
        PrintWriter writer = resp.getWriter();
        writer.append("<html>")
                .append("<head><title></title></head>")
                .append("<form action = 'handleServlet'> method = 'post'>")
                .append("username :<input name = 'username'type='text'/></br>")
                .append("password :<input name = 'password'type='text'/></br>")
                .append("<input type='submit' values='Submit'>")
                .append("<input type='reset' values='Reset'>")
                .append("</form>")
                .append("</html>");
    }
    @Override
    protected void doGet(HttpServletRequest req,HttpServletResponse resp)throws ServletException,IOException{
        this.doPost(req,resp);
    }

    public void destory(){
        super.destroy();
    }
}
