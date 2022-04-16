/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.DAO;
import com.Model.user;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class userDAO {
    
    
    //declare database username and password
    private String jdbcURL = "jdbc:mysql://localhost:3306/testfyp"; 
    private String jdbcUsername = "root";
    private String jdbcPassword = "admin";
    
    
    //declare SQL string to manipulate data
    private static final String INSERT_USER = "insert into user "
            + "(roleID, userName, userEmail, userContact, password) values"
            + "(?,?,?,?,?);";
    private static  final String LIST_USER = "select * from user";

public userDAO(){
    
}
 protected Connection getConnection() {
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }
 
 public void insertUser (user user) throws SQLException{
     System.out.println(INSERT_USER);
     //try-with-resource statement will auto close connection
     try
         (Connection connection = getConnection();
         PreparedStatement pstmt = connection.prepareStatement(INSERT_USER)){
         pstmt.setInt(1, user.getRoleID());
         pstmt.setString(2, user.getUserName());
         pstmt.setString(3, user.getUserEmail());
         pstmt.setString(4, user.getUserContact());
         pstmt.setString(5, user.getPassword());
         System.out.println(pstmt);
         pstmt.executeUpdate();
     } catch (SQLException e){
         printSQLException(e);
     }
 }
 
public List <user> selectAllUser(){
    //using try-with-resources to avoid closing resources
    List <user> user = new ArrayList<>();
    //Step 1: establishing a connection
    try
         (Connection connection = getConnection();
         PreparedStatement pstmt = connection.prepareStatement(LIST_USER)){
        System.out.println(pstmt);
        //step 3: execute query @ update query
        ResultSet rs = pstmt.executeQuery();
        
        //step 4: process the ResultSet object
        while(rs.next()){
            int roleID = rs.getInt("roleID");
            String userName = rs.getString("userName");
            String userEmail = rs.getString("userEmail");
            String userContact = rs.getString("userContact");
            String password = rs.getString("password");
        }
    }
    catch (SQLException e){
        printSQLException (e);
    }
    return user;
}

 private void printSQLException (SQLException ex){
     for(Throwable e: ex){if(e instanceof SQLException){
         e.printStackTrace(System.err);
         System.out.println("SQLState: " +((SQLException) e).getSQLState());
         System.out.println("Error Code: " + ((SQLException) e).getErrorCode());
         System.out.println("Message: " + e.getMessage());
         Throwable t = ex.getCause();
         while (t != null){
             System.out.println("Cause: " + t);
             t = t.getCause();
         }
     }
 }

 }
}

