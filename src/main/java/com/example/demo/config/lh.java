package com.example.demo.config;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//SpringBoot之HandlerInterceptor拦截器
public class lh  implements HandlerInterceptor{
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        Object loginuser = request.getSession().getAttribute("loginuser");
        if(loginuser==null){
            request.setAttribute("msg","先登录");
            request.getRequestDispatcher("/index.html").forward(request,response);
            /*System.out.println(loginuser);*/
            return false;
        }else {
            /*System.out.println(loginuser);*/
            return true;

        }

    }
}
