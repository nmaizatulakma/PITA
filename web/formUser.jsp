<%-- 
    Document   : lecturerdetailsForm
    Created on : Jan 15, 2022, 2:47:22 AM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<html>
    <head>
        <title>Lecturer Details Form</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
        <link rel="stylesheet" href="internal.css">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
        <%@include file="navbarAdmin.jsp" %>
    </head>
    
    <body>     
        <div class="row d-flex justify-content-center">
            <div class="col-md-6"> 
          <nav aria-label="breadcrumb">
            <ol class="breadcrumb">
              <li class="breadcrumb-item"><a href="#">Dashboard</a></li>
              <li class="breadcrumb-item"><a href="<%=request.getContextPath()%>/list">Manage Account</a></li>
              <li class="breadcrumb-item"><a href="#">Lecturer Details Form</a></li>
            </ol>
          </nav>
          </div>
          </div>
        <div class="container-fluid text-center">
            <div class="row">
                <div class="col-md-6 offset-md-3">
                    <div class="signup-form">
                        <c:if test="${user != null}">
                        <form action="update" method="post" class="mt-5 border p-4 bg-light shadow">
                            </c:if>
                            <c:if test="${user == null}">
                                <form action="insert" method="post">
                            </c:if>
                            <h4 class="mb-5 text-secondary">User Details Form</h4>
                            <div class="row">
        
                                <div class="mb-3 col-md-6">
                                    <label>Name<span class="text-danger">*</span></label>
                                    <input type="text" name="userName" class="form-control" placeholder="Enter Name">
                                </div>
            
                                <div class="mb-3 col-md-6">
                                    <label>Email<span class="text-danger">*</span></label>
                                    <input type="text" name="userEmail" class="form-control" placeholder="Enter Email">
                                </div>

                                <div class="mb-3 col-md-6">
                                    <label>Contact No<span class="text-danger">*</span></label>
                                    <input type="text" name="userContact" class="form-control" placeholder="Enter Contact No">
                                </div>
                                
                                <div class="mb-3 col-md-6">
                                    <label>Role<span class="text-danger">*</span></label>
                                    <select name="roleID" class="form-control">
                                    <option value="" selected="selected"> - Select Role - </option> 
                                    <option value="2">Coordinator</option> 
                                    <option value="3">Lecturer</option>
                                    <option value="4">Student</option> 
                                    </select>
                                </div>

                                <div class="mb-3 col-md-6">
                                    <label>Password<span class="text-danger">*</span></label>
                                    <input type="text" name="password" class="form-control" placeholder="Enter Password">
                                </div>

                                <div class="col-md-12">
                                   <button class="btn btn-primary float-end">Add User</button>
                                </div>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>
       
        <br>
    </body>
    <footer>
         <div class="container-fluid text-center">
             <%@include file="footer.jsp" %>
        </div>
    </footer>
</html>