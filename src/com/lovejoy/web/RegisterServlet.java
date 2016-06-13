package com.lovejoy.web;

import com.lovejoy.model.User;
import com.lovejoy.service.UserService;
import com.lovejoy.utils.AppException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by LOVEJOY on 2016/6/8.
 * 接收注册页面提交的注册信息，并进行注册处理
 */
public class RegisterServlet extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");

        //获取注册信息
        String name = request.getParameter("name");
        String password = request.getParameter("password");
        String password2 = request.getParameter("password2");

        //实例化User UserService
        String message="";
        User user=new User();
        UserService userService=new UserService();
        //验证并输出提示信息
        if (name == "" || password == "" || password2 == "") {
            System.out.println("you can't leave it blank");
        } else if (!password2.equals(password)) {
            System.out.println("two passwords can't match");
        } else {
            //封装注册信息
            user.setName(name);
            user.setPassword(password);

            //调用业务逻辑
            try {
                boolean flag = userService.register(user);
                if(flag){
                    message="register success";
                }
                else{
                    message="register success";
                }
            }catch (AppException e){
                e.printStackTrace();
                request.getRequestDispatcher("/error.jsp").forward(request,response);
            }

            //带着message跳转到ToRegister界面
            request.setAttribute("message",message);
            request.getRequestDispatcher("ToRegister").forward(request,response);
        }
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
