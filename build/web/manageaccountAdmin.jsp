<%-- 
    Document   : manageaccountAdmin
    Created on : Jan 15, 2022, 1:23:44 AM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
    <head>
            <title>Manage Lecturer Details</title>
            <meta charset="utf-8">
            <meta name="viewport" content="width=device-width, initial-scale=1">
            <link rel="stylesheet" href="internal.css">
            <%@ include file="library.jsp" %>
          <%@include file="navbarAdmin.jsp" %>

          <style>
              .table, .breadcrumb {
              margin: 0 auto;
              width: 80%;
              text-align: center;
          }
          </style>
    </head>
<header>   
    <div class="row d-flex">
        <div class="col-md-6"> 
       <nav style="--bs-breadcrumb-divider:url(&#34;data:image/svg+xml,%3Csvg xmlns='http://www.w3.org/2000/svg' width='8' height='8'%3E%3Cpath d='M2.5 0L1 1.5 3.5 4 1 6.5 2.5 8l4-4-4-4z' fill='currentColor'/%3E%3C/svg%3E&#34;);" aria-label="breadcrumb">
            <ol class="breadcrumb">
              <li class="breadcrumb-item"><a href="dashboardAdmin.jsp">Dashboard</a></li>
              <li class="breadcrumb-item active" aria-current="page">Manage account</li>
            </ol>
       </nav>
        </div>
    </div>
</header>
    
    <body>
        <div class="container-fluid justify-content-center">
      <table class="table align-middle">
          <thead>
    <tr>
     
      <th scope="col"></th>
      <th scope="col"></th>
      <th scope="col"></th>
      <td scope="col"> <ul class="nav navbar-nav pull-xs-right text-sm m-xs-t-xs">
          <li class="nav-item">
            <a class="nav-link" href="formUser.jsp" data-submit="parent" rel="nofollow"><i class="fa fa-plus"></i>Add User</a>
          </li>
        </ul>
      </td>
    </tr>
  </thead>
  <thead>
      
    <tr>
      <th scope="col">No</th>
      <th scope="col">Lecturer Name</th>
      <th scope="col">Account Status</th>
      <th scope="col">Action</th>
    </tr>
  </thead>
  <tbody href="<%=request.getContextPath()%>/list">
    <tr>
        <c:forEach var="user" items="${listUser}">
      <th scope="row">1</th>
      <td><c:out value="${user.userName}"/></td>
      <td><c:out value="${user.userEmail}"/></td>
      <td>
        <ul class="nav navbar-nav pull-xs-right text-sm m-xs-t-xs">
          <li class="nav-item">
            <a class="nav-link" href="/sessions/new" data-submit="parent" rel="nofollow"><i class="fa fa-edit"></i></a>
          </li>
        </ul>
      </td>  
    </tr>
    </c:forEach>
  </tbody>
</table>
        </div>
    </body>
     <footer>
        <div class="container-fluid text-center">
             <%@include file="footer.jsp" %>
        </div>
    </footer>
</html>
