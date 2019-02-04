package com.smgmts.ProfileDashboard.rightPanels;


import com.smgmts.DataBase.Database;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;


public class rightDHomePan extends JPanel{


    private Font fon = new Font("Forte",Font.PLAIN,52);


    public rightDHomePan(){
        rightDHomePangui();
    }


    public void rightDHomePangui(){
        List<Student> list = Database.show_student();
        int size = list.size();
        String data[][]= new String[size][13];
        int row = 0;
        for (Student student:list){
            data[row][0] = student.getId();
            data[row][2] = student.getId();
            data[row][3] = student.getId();
            data[row][4] = student.getId();
            data[row][5] = student.getId();
            data[row][6] = student.getId();
            data[row][7] = student.getId();
            data[row][8] = student.getId();
            data[row][9] = student.getId();
            data[row][10] = student.getId();
            data[row][11] = student.getId();
            data[row][12] = student.getId();
            row++;
        }

        String column_name[]={"ID","FirstName","LastName","DOB","Email","Contact","Parent Name"
        ,"ParentContact","Semester","Intake","Faculty","Username","Password"};

        JTable std_table = new JTable(data,column_name);
        JScrollPane scrollPane = new JScrollPane(std_table);
        add(scrollPane);

    }
}
