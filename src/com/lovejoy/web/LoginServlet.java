package com.lovejoy.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.lovejoy.model.Role;
import com.lovejoy.model.User;
import com.lovejoy.service.UserService;
import com.lovejoy.utils.AppException;

public class LoginServlet extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String name = request.getParameter("name");
        String password = request.getParameter("password");
        String message = "";

        if (name == "" || password == "") {
            message = "can't leave it blank";
            request.setAttribute("message", message);
            request.getRequestDispatcher("ToLogin").forward(request, response);
        } else {
            UserService userService = new UserService();
            User user = new User();
            try {
                user.setName(name);
                user.setPassword(password);
                int userId = -1;
                userId = userService.login(name, password);
                if (userId >= 0) {
                    HttpSession session = null;
                    session = request.getSession();
                    Role role = userService.getUserRole(userId);
                    session.setAttribute("userId", userId);
                    session.setAttribute("userName", name);

                    int a = role.getId();
                    session.setAttribute("roleId", a);
                    if (a == 1) {
                        request.getRequestDispatcher("/frame1.jsp").forward(request, response);
                    } else if (a == 2) {
                        request.getRequestDispatcher("/frame2.jsp").forward(request, response);
                    } else {
                        response.sendRedirect("ToNewUser");
                    }
                } else {
                    message = "something you have typed is wrong";
                    request.setAttribute("message", message);
                    request.getRequestDispatcher("ToLogin").forward(request, response);
                }
            } catch (AppException e) {
                e.printStackTrace();
                request.getRequestDispatcher("/error.jsp").forward(request, response);
            }
        }
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
