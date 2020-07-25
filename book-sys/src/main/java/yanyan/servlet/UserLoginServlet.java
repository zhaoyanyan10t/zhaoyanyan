package yanyan.servlet;

import yanyan.dao.UserDAO;
import yanyan.exception.BusinessException;
import yanyan.model.User;
import yanyan.util.JSONUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/user/login")
public class UserLoginServlet extends AbstractBaseServlet {


    @Override
    public Object process(HttpServletRequest req, HttpServletResponse resp) throws Exception {
        //req.getParameter("")这个方式只能获取URL和请求体，k=v形式的数据
        User user=JSONUtil.read(req.getInputStream(),User.class);//http请求的用户数据
        //在数据库校验用户相关的一些东西
        //queryUser是查询的结果
        User queryUser=UserDAO.query(user);//通过请求的用户名密码在数据库查询，获取查询的用户信息
        if(queryUser==null){
            throw new BusinessException("00001","用户名密码校验失败");
        }
        //如果不为空，创建一个session，把用户的信息保存进去
        HttpSession session=req.getSession();
        session.setAttribute("user",queryUser);

        return null;
    }
}
