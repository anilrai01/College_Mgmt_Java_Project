package com.smgmts.NewInterface;

import javax.swing.*;

public class NewInterFaceFrame extends JFrame {

    private JMenuBar menuBar;
    private JMenu menu, submenu;
    private JMenuItem menuItem;
    private JCheckBoxMenuItem cbMenuItem;
    private JRadioButtonMenuItem rbMenuItem;

    public NewInterFaceFrame(){
        NewInterFaceFramegui();
    }

    public void NewInterFaceFramegui(){
        setTitle("College Management System");

        setSize(1200,800);
        setVisible(true);


        setLayout(null);
//        setLayout(new GridBagLayout());
//        GridBagConstraints cs = new GridBagConstraints();


        //Create MenuBar
        menuBar = new JMenuBar();
        setJMenuBar(menuBar);


        //Build Menu
        menu = new JMenu("File");
        menuBar.add(menu);

        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
