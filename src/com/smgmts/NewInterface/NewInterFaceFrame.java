package com.smgmts.NewInterface;


import javax.swing.*;

public class NewInterFaceFrame extends JFrame {

    private JMenuBar menuBar;
    private JMenu filemenu, editmenu, filesubmenu, demo;
    private JMenuItem filemenuItem, filesubmenuItem;



    public NewInterFaceFrame(){
        NewInterFaceFramegui();
    }

    public void NewInterFaceFramegui(){
        setTitle("College Management System");
        NewInterface nf = new NewInterface();
        add(nf);

        setSize(1200,800);
        setVisible(true);
        setLayout(null);

        menuBar = new JMenuBar();
        setJMenuBar(menuBar);


        //Build Menu
        filemenu = new JMenu("File");
        menuBar.add(filemenu);




        //JMenu Items
        filemenuItem = new JMenuItem("Add", new ImageIcon("images//add.png"));
        filemenu.add(filemenuItem);
        filemenuItem = new JMenuItem("Remove", new ImageIcon("images//remove-user.png"));
        filemenu.add(filemenuItem);
        filemenuItem = new JMenuItem("Update", new ImageIcon("images//refresh-button.png"));
        filemenu.add(filemenuItem);
        //Edit menu item

        //Submenu
        filemenu.addSeparator();
        filesubmenu = new JMenu("Others");
        filesubmenuItem = new JMenuItem("LogOut", new ImageIcon("images//logout.png"));
        filesubmenu.add(filesubmenuItem);
        filesubmenuItem = new JMenuItem("Exit", new ImageIcon("images//error.png"));
        filesubmenu.add(filesubmenuItem);
        filemenu.add(filesubmenu);






        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
