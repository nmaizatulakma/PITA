<%-- 
    Document   : dashboardAdmin
    Created on : Jan 14, 2022, 11:50:37 PM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">  
        <title>Dashboard</title>
        <%@include file="navbarAdmin.jsp" %>  
        <%@include file="library.jsp" %>
        

    </head>
    <body>
        <%
            response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
            if(session.getAttribute("admin_login") == null || session.getAttribute("admin_login")==""){
                response.sendRedirect("../index.jsp");
            }
            %>
        
        <div class="container mt-3 jumbotron">
  <div class="mt-4 p-5 bg-info bg-gradient text-white rounded">
    <h1>Welcome, <%=session.getAttribute("admin_login")%></h1> 
    <p>Welcome to Final Year Student Assessment System (Science Computer)</p> 
  </div>

        <div class="card-group">
  <div class="card">
    <div class="card-body">
      <h5 class="card-title">Total User</h5>
      <p class="card-text">12</p>
    </div>
    <div class="card-footer">
      <small class="text-muted">Last updated 3 mins ago</small>
    </div>
  </div>
  <div class="card">
    <div class="card-body">
      <h5 class="card-title">Clock</h5>
      <p class="card-text">This card has supporting text below as a natural lead-in to additional content.</p>
    </div>
    <div class="card-footer">
      <small class="text-muted">Last updated 3 mins ago</small>
    </div>
  </div>
  <div class="card">
    <div class="card-body">
      <h5 class="card-title">XX</h5>
      <p class="card-text"></p>
    </div>
    <div class="card-footer">
      <small class="text-muted">Last updated 3 mins ago</small>
    </div>
  </div>
</div>
            
            </div>
        
    </body>
    <footer>
        <div class="container-fluid text-center">
             <%@include file="footer.jsp" %>
        </div>
    </footer>
</html>
