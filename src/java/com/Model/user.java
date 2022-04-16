/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Model;

/**
 *
 * @author User
 */
public class user {
    
    private int userID;
   private int roleID;
   private String userName;
   private String userEmail;
   private String userContact;
   private String password

   
   
public user(){
    
}
    public user(int userID, int roleID, String userName, String userEmail, String userContact, String password) { //declare contructor
        this.userID = userID;
        this.roleID = roleID;
        this.userName = userName;
        this.userEmail = userEmail;
        this.userContact = userContact;
        this.password = password;
    }

    public user(int roleID, String userName, String userEmail, String userContact, String password) {
        this.roleID = roleID;
        this.userName = userName;
        this.userEmail = userEmail;
        this.userContact = userContact;
        this.password = password;
    }
    
   
   

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public int getRoleID() {
        return roleID;
    }

    public void setRoleID(int roleID) {
        this.roleID = roleID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserContact() {
        return userContact;
    }

    public void setUserContact(String userContact) {
        this.userContact = userContact;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
   
   
   
   
    
}
