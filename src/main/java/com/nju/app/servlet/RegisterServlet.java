package com.nju.app.servlet;

import com.nju.app.controller.RegisterServiceImpl;
import com.nju.app.entities.RegUser;
import com.nju.app.service.RegisterService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

public class RegisterServlet extends HttpServlet {
    //注入 service
    RegisterService service = new RegisterServiceImpl();
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException,IOException {
        doPost(request,response);
    }

    public void doPost(HttpServletRequest request,HttpServletResponse response)
            throws ServletException,IOException{
        String name = request.getParameter("name");
        String password = request.getParameter("password");
        String mail = request.getParameter("mail");

        RegUser user = new RegUser();
        user.setName(name);
        user.setPassword(password);
        user.setMail(mail);

        try{
            user=service.regUser(user);

        }catch (SQLException e){
            response.getWriter().println("注册失败");
        }
    }
}
