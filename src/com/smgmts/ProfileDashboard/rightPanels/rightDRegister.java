package com.smgmts.ProfileDashboard.rightPanels;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class rightDRegister extends JPanel {

    private Font fon = new Font("Aerial",Font.PLAIN,17);
    private Color signupc = new Color(118, 184, 98);


    public JLabel id, fname, lname, DOB, email, contact, parent_name, parent_contact,
            semester, intake, faculty, usern, paswor;
    public JTextField idField, fnameField, lnameField, DOBField, emailField, contactField,
            parent_nameField, parent_contact_field, semesterField, intakeField,
            facultyField, usernField,pasworField;

    JCheckBox agreement;
    JButton register;
    String insertQuery;
    int flag = 1;


    public rightDRegister(){
        rightDRegistergui();
    }

    public void rightDRegistergui(){
        setBounds(350,70,1050,730);
        setLayout(null);
        setVisible(false);

        id = new JLabel("ID :");
        id.setBounds(100,70,50,30);
        id.setFont(fon);
        add(id);

        idField = new JTextField();
        idField.setBounds(200,70,180,30);
        add(idField);

        fname = new JLabel("First Name :");
        fname.setBounds(100,120,100,30);
        fname.setFont(fon);
        add(fname);

        fnameField = new JTextField();
        fnameField.setBounds(200,120,180,30);
        add(fnameField);

        lname = new JLabel("Last Name :");
        lname.setBounds(100,170,100,30);
        lname.setFont(fon);
        add(lname);

        lnameField = new JTextField();
        lnameField.setBounds(200,170,180,30);
        add(lnameField);

        DOB = new JLabel("DOB :");
        DOB.setBounds(100,220,100,30);
        DOB.setFont(fon);
        add(DOB);

        DOBField = new JTextField();
        DOBField.setBounds(200,220,180,30);
        add(DOBField);

        email = new JLabel("Email :");
        email.setBounds(100,270,100,30);
        email.setFont(fon);
        add(email);

        emailField = new JTextField();
        emailField.setBounds(200,270,180,30);
        add(emailField);

        contact = new JLabel("Contact :");
        contact.setBounds(100,320,100,30);
        contact.setFont(fon);
        add(contact);

        contactField = new JTextField();
        contactField.setBounds(200,320,180,30);
        add(contactField);

        parent_name = new JLabel("Parent :");
        parent_name.setBounds(100,370,100,30);
        parent_name.setFont(fon);
        add(parent_name);

        parent_nameField = new JTextField();
        parent_nameField.setBounds(200,370,180,30);
        add(parent_nameField);

        parent_contact = new JLabel("Contact :");
        parent_contact.setBounds(100,420,100,30);
        parent_contact.setFont(fon);
        add(parent_contact);

        parent_contact_field = new JTextField();
        parent_contact_field.setBounds(200,420,180,30);
        add(parent_contact_field);

        semester = new JLabel("Semester :");
        semester.setBounds(100,470,100,30);
        semester.setFont(fon);
        add(semester);

        semesterField = new JTextField();
        semesterField.setBounds(200,470,180,30);
        add(semesterField);

        intake = new JLabel("Intake :");
        intake.setBounds(100,520,100,30);
        intake.setFont(fon);
        add(intake);

        intakeField = new JTextField();
        intakeField.setBounds(200,520,180,30);
        add(intakeField);

        faculty = new JLabel("Faculty :");
        faculty.setBounds(100,570,100,30);
        faculty.setFont(fon);
        add(faculty);

        facultyField = new JTextField();
        facultyField.setBounds(200,570,180,30);
        add(facultyField);

        usern = new JLabel("Username :");
        usern.setBounds(600,200,100,30);
        usern.setFont(fon);
        add(usern);

        usernField = new JTextField();
        usernField.setBounds(700,200,180,30);
        add(usernField);

        paswor = new JLabel("Password :");
        paswor.setBounds(600,250,100,30);
        paswor.setFont(fon);
        add(paswor);

        pasworField = new JTextField();
        pasworField.setBounds(700,250,180,30);
        add(pasworField);

        Student std = new Student(idField.getText(), fnameField.getText(), lnameField.getText(),
                DOBField.getText(),emailField.getText(),contactField.getText(),parent_nameField.getText(),
                parent_contact_field.getText(),semesterField.getText(),intakeField.getText(),facultyField.getText(),
                usern.getText(), paswor.getText());

        agreement = new JCheckBox(" I Agree with all the terms and conditions");
        agreement.setBounds(650,300,300,16);
        add(agreement);

        agreement.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                flag++;
            }
        });

        register = new JButton("Register");
        register.setBounds(735,350,100,30);
        register.setBackground(signupc);
        register.setForeground(Color.white);
        add(register);

        register.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(flag % 2 != 0){
                    JOptionPane.showMessageDialog(null, "You must agree our terms and condition first");
                }else{}
                try{
                    insertQuery = "insert into student values('"+ idField +"','"+fnameField+"','"+lnameField+"','"+DOBField+"','"+
                            emailField+"','"+contactField+"','"+parent_contact_field+"',"+semesterField+"','"+intakeField+"',"+facultyField+
                            "','"+usernField+"','"+pasworField+"'";
                }catch (Exception ee){
                    System.out.println(ee);
                }

            }
        });



    }

    public void makeVisible(){
        setBackground(Color.black);
    }
}