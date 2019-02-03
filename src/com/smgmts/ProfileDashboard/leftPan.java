package com.smgmts.ProfileDashboard;

import com.smgmts.ProfileDashboard.rightPanels.rightDRegister;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class leftPan extends JPanel {

//    private JLabel background = new JLabel();
    private Font fon = new Font("Aerial",Font.PLAIN,20);
    private Color brand = new Color(232, 17, 35);

    private JButton home, assignments, settings, register, status;

    public leftPan(){
        leftPangui();
    }

    public void leftPangui(){
        setBounds(0,0,350,800);
        setBackground(brand);
        setLayout(null);
        setVisible(false);


        JButton home = new JButton("Home");
        home.setBounds(0,220,350,50);
        home.setBackground(null);
        home.setBorder(null);
        home.setFocusPainted(false);
        home.setForeground(Color.white);
        home.setFont(fon);
        add(home);

        JButton assignments = new JButton("Assignments");
        assignments.setBounds(0,280,350,50);
        assignments.setBackground(null);
        assignments.setBorder(null);
        assignments.setFocusPainted(false);
        assignments.setForeground(Color.white);
        assignments.setFont(fon);
        add(assignments);

        JButton status = new JButton("Status");
        status.setBounds(0,340,350,50);
        status.setBackground(null);
        status.setBorder(null);
        status.setFocusPainted(false);
        status.setForeground(Color.white);
        status.setFont(fon);
        add(status);

        JButton register = new JButton("Register");
        register.setBounds(0,400,350,50);
        register.setBackground(null);
        register.setBorder(null);
        register.setFocusPainted(false);
        register.setForeground(Color.white);
        register.setFont(fon);
        add(register);

        register.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ee) {
                rightDRegister rdj = new rightDRegister();
                rdj.makeVisible();

            }
        });

        JButton settings = new JButton("Settings");
        settings.setBounds(0,460,350,50);
        settings.setBackground(null);
        settings.setBorder(null);
        settings.setFocusPainted(false);
        settings.setForeground(Color.white);
        settings.setFont(fon);
        add(settings);





    }
}