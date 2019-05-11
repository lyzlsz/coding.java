import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

/**
 * Author:weiwei
 * description:
 * Creat:2019/5/11
 **/
@WebServlet(name="Hello",urlPatterns = "/demoServlet")
public class DemoServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest requst, HttpServletResponse response)throws ServletException,IOException {
        this.doPost(requst,response);
    }
    @Override
    protected void doPost(HttpServletRequest requst,HttpServletResponse response)throws ServletException,IOException{
        response.setContentType("text/html;charset = utf-8");
        PrintWriter pw = response.getWriter();
        pw.append("<html>")
                .append("<head><title>my first servlet program<title></head>")
                .append("<body>")
                .append("<h1>")
                .append("data is = " + new Date())
                .append("</h1>")
                .append("</body>")
                .append("<html>");
    }
}