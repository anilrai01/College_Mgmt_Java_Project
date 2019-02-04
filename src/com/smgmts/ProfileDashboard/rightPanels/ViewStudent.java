package com.smgmts.ProfileDashboard.rightPanels;

import javax.swing.*;
import java.awt.*;
import java.util.List;
import com.smgmts.DataBase.Database;

public class ViewStudent extends JFrame {
    static ViewStudent frame;
    public ViewStudent(){
        super("Student Details");
        List<Student> list =Database.show_student();
        int size=list.size();
        String data[][]=new String[size][11];
        int row=0;
        for (Student student:list){
            data[row][0]=student.getId();
            data[row][1]=student.getFname();
            data[row][2]=student.getLname();
            data[row][3]=student.getDOB();
            data[row][4]=student.getEmail();
            data[row][5]=student.getContact();
            data[row][6]=student.getParent_name();
            data[row][7]=student.getParent_contact();
            data[row][8]=student.getSemester();
            data[row][9]=student.getIntake();
            data[row][10]=student.getFaculty();
            row++;
        }
        String columnNames[]={"ID","First Name","Last Name","DOB","Email","Contact No","Parent Name","Parent Contact","Semester","Intake","Faculty"};
        JTable table = new JTable(data,columnNames);
        JScrollPane scrollPane = new JScrollPane(table);
        add(scrollPane);

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setMinimumSize(new Dimension(1000,400));
        setLocationRelativeTo(null);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    frame = new ViewStudent();
                    frame.setVisible(true);
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        });
    }
}
