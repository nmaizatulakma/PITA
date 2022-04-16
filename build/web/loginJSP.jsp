<%-- 
    Document   : loginJSP
    Created on : Apr 5, 2022, 10:20:24 AM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import= "java.sql.*"%>

<%
  
    
if(request.getParameter("btn_login")!=null){
    String role, email, password;
    
    role = request.getParameter("role");
    email = request.getParameter("userEmail");
    password = request.getParameter("password");
    
    String jdbcURL = "jdbc:mysql://localhost:3306/testfyp"; 
    String jdbcUsername = "root";
    String jdbcPassword = "admin";
    
    try{
        Class.forName("com.mysql.jdbc.Driver"); //load jdbc driver
        Connection con = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
        
        PreparedStatement pstmt = null;
        
        pstmt = con.prepareStatement("select * from user where roleID=? and userEmail=? and password=? ");
        pstmt.setString(1, role);
        pstmt.setString(2, email);
        pstmt.setString(3, password);
        ResultSet rs = pstmt.executeQuery();
        
        if(rs.next()){
            String dbrole = rs.getString("roleID");
            String dbemail = rs.getString("userEmail");
            String dbpassword = rs.getString("password");
            
            if(role.equals(dbrole) && email.equals(dbemail) && password.equals(dbpassword)){
                if(role.equals("1")){
                    session.setAttribute("admin_login", email);
                    response.sendRedirect("dashboardAdmin.jsp");
                }
                else if(role.equals("2")){
                    session.setAttribute("coordinator_login", email);
                    response.sendRedirect("dashboardCoordinator.jsp");
                }
                else if(role.equals("3")){
                    session.setAttribute("lecturer_login", email);
                    response.sendRedirect("dashboardLecturer.jsp");
                }
                else if(role.equals("4")){
                    session.setAttribute("student_login", email);
                    response.sendRedirect("dashboardStudent.jsp");
                }
                
            }
        }
        else{
            request.setAttribute("errorMsg", "Invalid email or password or role");
        }
        pstmt.close();
        con.close();
                
    }
    catch(Exception e){
        e.printStackTrace();
    }
}
%>
