package yanyan.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

//@WebFilter("/*")
public class LoginFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

//    @Override
//    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
//        HttpServletRequest req=(HttpServletRequest) servletRequest;
//        String uri=req.getServletPath();
//        if("/login.html".equals(uri)||uri.startsWith("/public/")||uri.startsWith("/static/")||"/user/login".equals(uri)){
//            //访问敏感资源
//
//                filterChain.doFilter(servletRequest,servletResponse);
//            }else{
//           HttpSession session=req.getSession(false);
//            if(session==null){
//                //没有登录，进行跳转到登录页面，
//                String schema=req.getScheme();//http
//                String host=req.getServerName();//服务器ip或域名
//                int port=req.getServerPort();//服务器端口号n
//                String contextPath=req.getContextPath();
//                String basePath=schema+"://"+host+":"+port+contextPath;
//                ((HttpServletResponse) servletRequest).sendRedirect(basePath+"/public/index.html");
////                ((HttpServletResponse) servletResponse).sendRedirect(basePath+"/public/index.html");
//                return;
//            }
//            filterChain.doFilter(servletRequest,servletResponse);
//        }
//
//    }
//
//    @Override
//    public void destroy() {
//
//    }


//    @Override
//    public void init(FilterConfig filterConfig) throws ServletException {
//
//    }
//
//    @Override
//    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
//        HttpServletRequest req=(HttpServletRequest) servletRequest;
//        String uri=req.getServletPath();
//        if(!"/login.html".equals(uri)&& !uri.startsWith("/public/")&& !uri.startsWith("/static/")&& !"/user/login".equals(uri)){
//            //访问敏感资源
//           HttpSession session=req.getSession(false);
//            if(session==null){
//                //没有登录，进行跳转到登录页面，
//                String schema=req.getScheme();//http
//                String host=req.getServerName();//服务器ip或域名
//                int port=req.getServerPort();//服务器端口号n
//                String contextPath=req.getContextPath();
//                String basePath=schema+"://"+host+":"+port+contextPath;
//                ((HttpServletResponse) servletResponse).sendRedirect(basePath+"/public/index.html");
//                return;
//            }
//        }
//        filterChain.doFilter(servletRequest,servletResponse);
//    }
//
//    @Override
//    public void destroy() {
//
//    }


//
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        //进行过滤的方法
        HttpServletRequest req=(HttpServletRequest) request;
        String uri=req.getServletPath();
        //访问首页/public/page/main.html,没有登录重定向到登录页面
        //访问九台的敏感资源，servlet的敏感服务，返回json数据
        if(!"/login.html".equals(uri)&& !uri.startsWith("/public/")&& !uri.startsWith("/static/")&& !"/user/login".equals(uri)){
            //访问敏感资源
           HttpSession session=req.getSession(false);
            if(session==null){
                //没有登录，进行跳转到登录页面，
                String schema=req.getScheme();//http
                String host=req.getServerName();//服务器ip或域名
                int port=req.getServerPort();//服务器端口号n
                String contextPath=req.getContextPath();
                String basePath=schema+"://"+host+":"+port+contextPath;
                ((HttpServletResponse) response).sendRedirect(basePath+"/public/index.html");
                return;
            }
        }
        chain.doFilter(request,response);
    }

    @Override
    public void destroy() {
//        销毁方法
    }
}
