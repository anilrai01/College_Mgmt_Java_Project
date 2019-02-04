package com.smgmts.DataBase;


import com.smgmts.ProfileDashboard.rightPanels.Student;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Database {

    private String user;
    private String pswrd;

    public void setUser(String user) {
        this.user = user;
    }

    public void setPswrd(String pswrd) {
        this.pswrd = pswrd;
    }

    private String fetched;

    public String getFetched() {
        return fetched;
    }

    public void setFetched(String fetched) {
        this.fetched = fetched;
    }

    String url = "jdbc:mysql://localhost:3306/collegeproject";
    String sqluser = "root";
    String pwd = "CollegeProject";


    public boolean connection(){
        boolean status = false;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url,sqluser,pwd);
            //Connection Established
//            String sql = "select * from student";
            PreparedStatement statement = con.prepareStatement("SELECT * from student where username =? and pasword= ?");
            statement.setString(1,user);
            statement.setString(2,pswrd);
            ResultSet rs = statement.executeQuery();
            status = rs.next();
            con.close();

        }catch (ClassNotFoundException | SQLException e){
            System.out.println(e);
        }
        return status;
    }



    public static List<Student> show_student(){
        List<Student> list = new ArrayList<Student>();

        String url = "jdbc:mysql://localhost:3306/collegeproject";
        String sqluser = "root";
        String pwd = "";

        Connection con = null;
        ResultSet rs = null;
        Statement st = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url,sqluser,pwd);
            PreparedStatement statement = con.prepareStatement("select * from student");
            rs = statement.executeQuery();
            while(rs.next()){
                Student student = new Student();
                student.setId(rs.getString(1));
                student.setFname(rs.getString(2));
                student.setLname(rs.getString(3));
                student.setDOB(rs.getString(4));
                student.setEmail(rs.getString(5));
                student.setContact(rs.getString(6));
                student.setParent_name(rs.getString(7));
                student.setParent_contact(rs.getString(8));
                student.setSemester(rs.getString(9));
                student.setIntake(rs.getString(10));
                student.setFaculty(rs.getString(11));
                student.setUsern(rs.getString(12));
                student.setPaswor(rs.getString(13));
                list.add(student);

            }
        }catch(Exception e){
            System.out.println(e);
        }
        return list;
    }

    }

