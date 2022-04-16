
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">  
        <title>Dashboard</title>
        <%@include file="navbarCoordinator.jsp" %>  
        <%@include file="library.jsp" %>
    </head>
    <body>
        <div class="container mt-3 jumbotron">
  <div class="mt-4 p-5 bg-info bg-gradient text-white rounded">
    <h3>Welcome, <%=session.getAttribute("coordinator_login")%></h3> 
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
      <h5 class="card-title">Total Student</h5>
      <p class="card-text">120</p>
    </div>
    <div class="card-footer">
      <small class="text-muted">Last updated 3 mins ago</small>
    </div>
  </div>
  <div class="card">
    <div class="card-body">
      <h5 class="card-title">Clock</h5>
      <p class="card-text">xxxxx</p>
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
