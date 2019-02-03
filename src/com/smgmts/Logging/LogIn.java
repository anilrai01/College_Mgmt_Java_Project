package com.smgmts.Logging;

import javax.swing.*;

public class LogIn extends JFrame{

    public LogIn(){
        loginGui();
    }

    public void loginGui(){
        //        myFrame = new JFrame("Apple");

        this.setUndecorated(true); //before making visible
        setVisible(true);
        setSize(800,500);
        setResizable(false);


        setLayout(null);

        LeftPanel leftPanel = new LeftPanel();
        add(leftPanel);

        RightPanel rightPanel = new RightPanel();
        add(rightPanel);

        setLayout(null); //Frame
        setLocationRelativeTo(null); //Display in middle
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}