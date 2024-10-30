package com.user.model;

public class User {

      private int id;
      private String name;
      private String email;
      private int mobile;
      private String password;

      public User(){

      }

      public User(String name,String email,int mobile,String password){
        this.name=name;
        this.email=email;
        this.mobile=mobile;
        this.password=password;
      }

      public int getId(){
        return id;
      }

      public void setId(int id){
           this.id=id;
      }

      public int getmobile(){
        return mobile;
      }

      public void setmobile(int mobile){
           this.mobile=mobile;
      }

      public String getname(){
        return name;
      }

      public void setname(String name){
        this.name=name;
      }

      public String getemail(){
        return email;
      }

      public void setemail(String email){
        this.email=email;
      }

      public String getpassword(){
        return password;
      }

      public void setpassword(String password){
        this.password=password;
      }
}
