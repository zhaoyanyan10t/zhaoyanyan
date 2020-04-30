import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    @Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    doPost(req, resp);
}
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=UTF-8");

        String username=req.getParameter("username");
        String password=req.getParameter("password");
        System.out.printf("username=%s,password=%s\n",username,password);
        PrintWriter pw=resp.getWriter();
        if("abc".equalsIgnoreCase(username)&&"123".equalsIgnoreCase(password)){
            pw.println("<p>登陆成功</p>");
        }else{
            pw.println("<p>用户名密码错误，登陆不成功</p>");
        }
        pw.flush();
    }
}
