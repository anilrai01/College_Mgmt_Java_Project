package com.smgmts.ProfileDashboard;

import com.smgmts.DataBase.Database;
import com.smgmts.ProfileDashboard.rightPanels.Student;
import com.smgmts.ProfileDashboard.rightPanels.rightTopIIPan;
import com.smgmts.ProfileDashboard.rightPanels.rightTopPan;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class ProfileDash extends JFrame {
    private JPanel rightDHomePane;
    public ProfileDash(){
        rightDHomePane = new JPanel(null);
        setSize(1400,800);
        setVisible(true);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setBackground(Color.white);
//sagar

        ArrayList<Student> list = Database.show_student();
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
        rightDHomePane.add(scrollPane);







//        anil

        //Left Panel
        leftPan leftP = new leftPan();
        add(leftP);

        //Right Panels
        rightTopPan rtp = new rightTopPan();
        add(rtp);
        rightTopIIPan rtip = new rightTopIIPan();
        add(rtip);

//        rightDRegister rdr = new rightDRegister();
//        add(rdr);
        add(rightDHomePane);
    }
}
