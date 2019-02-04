package com.smgmts.ProfileDashboard;

import javax.swing.*;
import java.awt.*;

public class ProfileDash extends JFrame {
    private JPanel rightDHomePane;
    public ProfileDash(){
        rightDHomePane = new JPanel(null);
        setSize(1400,800);
        setVisible(true);
        setLayout(new GridBagLayout());

        GridBagConstraints gc = new GridBagConstraints();


        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setBackground(Color.black);

        //// First Column /////



        DashboardBackground dbg = new DashboardBackground();
        add(dbg);
    }
}
