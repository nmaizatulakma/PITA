/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Controller;

import com.Model.user;
import com.DAO.userDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/user")
public class userServlet extends HttpServlet {

    private userDAO userDAO;
    
    public void init(){
        userDAO = new userDAO();
    }
   

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getServletPath();
        
        try{
            switch (action){
                case "/insert":
                    insertUser(request,response);
                    break;
                default:
                    listUser(request, response);
                    break;
        }
    } catch (Exception ex){
    ex.printStackTrace();
}
    }
    
    private void insertUser (HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException {
        int roleID = Integer.parseInt(request.getParameter("roleID"));
        String userName = request.getParameter("userName");
        String userEmail = request.getParameter("userEmail");
        String userContact = request.getParameter("userContact");
        String password = request.getParameter("password");
        user newuser = new user(roleID, userName, userEmail, userContact, password);
        userDAO.insertUser(newuser);
        response.sendRedirect("list");        
    }
    
    private void listUser(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException, ServletException {
        List < user > listUser = userDAO.selectAllUser();
        request.setAttribute("listUser", listUser);
        RequestDispatcher dispatcher = request.getRequestDispatcher("manageaccountAdmin.jsp");
        dispatcher.forward(request, response);
        
    } 
   
       

   

}
