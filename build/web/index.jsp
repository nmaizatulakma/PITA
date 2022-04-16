<%-- 
    Document   : index
    Created on : Jan 11, 2022, 11:55:57 AM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@page import="com.Model.user"%>
<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <!-- For google icons  -->
  <link href="https://fonts.googleapis.com/icon?family=Material+Icons+Outlined" rel="stylesheet">
  <link rel="stylesheet" type="text/css" href="css/index.css"/> 
  <title>Final Year Student Assessment System</title>
  
  <style>
       .background {
    background: url("image/loginbackground.jpg")
      rgba(0, 0, 0, 0.61);
    background-repeat: no-repeat;
    background-size: cover;
    background-blend-mode: darken;
    position: absolute;
    top: 0;
    bottom: 0;
    left: 0;
    right: 0;
    z-index: -1;
    filter: blur(5px);
    min-height: 800px;
  }
  .radio{
      display: inline-flex;
      padding: 0;
    margin: 10px auto;
    font-family: Arial, Helvetica, sans-serif;
    color: white;
      font-size: 15px;

  
  </style>
  
</head>

<body>
   

  <!-- background -->
  <div class="background"></div>
<br>

</br>
<br>
</br>
  <!-- form container -->
  <div class="container">
      <figure>
      <img src="image/logoUMT.png" alt="logoUMT" width="150" height="150">
      <figcaption>Final Year Student Asessment System</figcaption>
  </figure>
      
    <form action="loginJSP.jsp" class="sign-in-form" method="post">
        <select name="role" class="form-control">
            <option value="" selected="selected"> - Select Role - </option>
            <option value="1">Admin</option> 
            <option value="2">Coordinator</option> 
            <option value="3">Lecturer</option>
            <option value="4">Student</option> 
            </select>
      <div class="form-item">
        <span class="material-icons-outlined">
          account_circle
        </span>
        <input type="text" name="userEmail" id="user" placeholder="Email Address">
      </div>

      <div class="form-item">
        <span class="material-icons-outlined">
          lock
        </span>
        <input type="password" name="password" id="pass" placeholder="Password">
      </div>
        <p> TEST GITHUB 123</p>
      <button type="submit" name="btn_login">Login</button>
    </form>
  </div>
</body>

</html>