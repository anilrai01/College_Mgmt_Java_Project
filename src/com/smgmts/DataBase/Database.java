package com.smgmts.DataBase;


import com.smgmts.ProfileDashboard.rightPanels.Student;

import java.sql.*;
import java.util.ArrayList;

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



    public static ArrayList<Student> show_student(){
        ArrayList<Student> student = new ArrayList<Student>();

        String url = "jdbc:mysql://localhost:3306/collegeproject";
        String sqluser = "root";
        String pwd = "CollegeProject";

        Connection con = null;
        ResultSet rs = null;
        Statement st = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url,sqluser,pwd);
            //Connection Established
            String sql = "select * from student";
            rs = st.executeQuery(sql);
//            ResultSetMetaData rsmt = rs.getMetaData();
//            int count = rsmt.getColumnCount();
//            Vector column = new Vector(count);
//            for(int i=1; i<=count; i++){
//                column.add(rsmt.getColumnName(i));
//            }
//
//            Vector data = new Vector();
//            Vector row = new Vector();

            while(rs.next()){
//                row = new Vector(count);
//                for (int i=1; i<=count; i++){
//                    row.add(rs.getString(i));
//                }
//                data.add(row);

                Student std = new Student();
                std.setId(rs.getString(1));
                std.setFname(rs.getString(2));
                std.setLname(rs.getString(3));
                std.setDOB(rs.getString(4));
                std.setEmail(rs.getString(5));
                std.setContact(rs.getString(6));
                std.setParent_name(rs.getString(7));
                std.setParent_contact(rs.getString(8));
                std.setSemester(rs.getString(9));
                std.setIntake(rs.getString(10));
                std.setFaculty(rs.getString(11));
                std.setUsern(rs.getString(12));
                std.setPaswor(rs.getString(13));
                student.add(std);

            }


        }catch(Exception e){
            System.out.println(e);
        }
        return student;
    }

    }

