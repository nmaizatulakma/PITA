<%-- 
    Document   : navbar
    Created on : Jan 11, 2022, 12:12:48 PM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Coordinator Navbar</title>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <%@include file="library.jsp" %>

</head>
<body>
    
<nav class="navbar navbar-expand-lg navbar-light" style="background-color: #e3f2fd;">
    <div class="container-fluid">
      <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarTogglerDemo03" aria-controls="navbarTogglerDemo03" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
      </button>
      <a class="navbar-brand" href="dashboardCoordinator.jsp">Dashboard</a>
      <div class="collapse navbar-collapse" id="navbarTogglerDemo03">
        <ul class="navbar-nav me-auto mb-2 mb-lg-0">
          <li class="nav-item">
            <a class="nav-link active" aria-current="page" href="managestudentdetailsCoordinator.jsp">Manage Student Details</a>
          </li>
          <li class="nav-item">
            <a class="nav-link active" aria-current="page" href="managegroupdistributionCoordinator.jsp">Manage Group</a>
          </li>
          <li class="nav-item">
            <a class="nav-link active" aria-current="page" href="createrubric.jsp">Create Rubric</a>
          </li>
          <li class="nav-item">
            <a class="nav-link active" aria-current="page" href="#">Print Report</a>
          </li>
        </ul>
        <form action="logout.jsp" class="d-flex" method="post">
          <button class="fa fa-sign-out" type="submit">Sign Out</button>
      </form>
      </div>
    </div>
  </nav>
 
  </body>
</html>