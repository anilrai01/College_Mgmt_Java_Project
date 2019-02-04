package com.smgmts.Logging;

import com.smgmts.DataBase.Database;
import com.smgmts.NetBBeansDashBoard.InternalDash;
import com.smgmts.NewInterface.NewInterFaceFrame;
import com.smgmts.NewInterface.NewInterface;
import com.smgmts.ProfileDashboard.ProfileDash;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RightPanel extends JPanel {

    private JTextArea txtarea;
    private JTextField txtuser;
    private JLabel lbluser,lblpwd;
    private JPasswordField txtpwd;
    private JButton btnlogin, btnexit;


    private String username, password;

    private Font fon = new Font("Aerial",Font.PLAIN,17);
    private Color brand = new Color(232, 17, 35);
    private Color loginbtcol = new Color(118, 184, 98);

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    //Creating right Panel
    public RightPanel(){
       rightPanelgui();
    }

    public void rightPanelgui(){

        setLayout(null);
        setBackground(Color.white);
        setBounds(300 , 0 , 500, 500);


        //Username
        lbluser = new JLabel("Username:");
        lbluser.setBounds(120,130,100,15);
        lbluser.setFont(fon);
        add(lbluser);

        txtuser = new JTextField();
        txtuser.setBounds(120,155,200,25);
        txtuser.setBorder(BorderFactory.createMatteBorder
                (0,0,2,0,brand));
        txtuser.setFont(fon);
        add(txtuser);

        //Password
        lblpwd = new JLabel("Password:");
        lblpwd.setBounds(120,215,100,15);
        lblpwd.setFont(fon);
        add(lblpwd);

        txtpwd = new JPasswordField();
        txtpwd.setBounds(120,240,200,30);
        txtpwd.setBorder(BorderFactory.createMatteBorder
                (0,0,2,0,brand));
        txtpwd.setFont(fon);
        add(txtpwd);

        //Login Button
        btnlogin = new JButton("LogIn");
        btnlogin.setBounds(130,330,90,35);
        btnlogin.setBackground(loginbtcol);
        btnlogin.setFont(fon);
        btnlogin.setForeground(Color.white);
        add(btnlogin);

        btnlogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Database db = new Database();
                setUsername(txtuser.getText());
                setPassword(txtpwd.getText());
                db.setUser(getUsername());
                db.setPswrd(getPassword());
                boolean status = db.connection();


                if (status) {
                    JOptionPane.showMessageDialog(null, "Welcome " + getUsername());
                    InternalDash ids = new InternalDash();
                    ids.setVisible(true);
                }
                else {
                    JOptionPane.showMessageDialog(null, "Incorrect Username or Password");
                }
            }
        });

        //Register Button
        btnexit = new JButton("Exit");
        btnexit.setBackground(Color.white);
        btnexit.setBounds(230,330,95,35);
        btnexit.setFont(fon);
        btnexit.setBackground(brand);
        btnexit.setForeground(Color.white);
        add(btnexit);



        btnexit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });


    }

}
