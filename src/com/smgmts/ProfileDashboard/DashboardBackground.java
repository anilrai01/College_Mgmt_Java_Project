package com.smgmts.ProfileDashboard;

import com.smgmts.DataBase.Database;
import com.smgmts.ProfileDashboard.rightPanels.Student;
import com.smgmts.ProfileDashboard.rightPanels.rightContentPanel;
import com.smgmts.ProfileDashboard.rightPanels.rightTopIIPan;
import com.smgmts.ProfileDashboard.rightPanels.rightTopPan;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class DashboardBackground extends JPanel {
    public DashboardBackground(){
        DashboardBackgroundgui();
    }

    public void DashboardBackgroundgui(){
        setBounds(0,0,1400,800);
        setVisible(true);
        setBackground(Color.WHITE);
        setLayout(null);

//        setLayout(new GridBagLayout());
//        GridBagConstraints gc = new GridBagConstraints();
//
//        ////// First Column /////
//        leftPan leftP = new leftPan();
//
//        gc.weightx = 0.5;
//        gc.weighty = 0.5;
//
//        gc.gridx = 0;
//        gc.gridy = 0;
//        add(leftP, gc);
//
//        ////// Second Column //////
//        rightTopPan rtp = new rightTopPan();
//        add(rtp);
//        rightTopIIPan rtip = new rightTopIIPan();
//        add(rtip);
//
//        rightContentPanel rcp = new rightContentPanel();
//        add(rcp);
//
//        gc.gridx = 1;
//        gc.gridy = 0;
//        add(rtp, gc);
//
//        gc.gridx = 1;
//        gc.gridy = 1;
//        add(rtip, gc);





        //Left Panel
        leftPan leftP = new leftPan();
        add(leftP);

        //Right Panels
        rightTopPan rtp = new rightTopPan();
        add(rtp);
        rightTopIIPan rtip = new rightTopIIPan();
        add(rtip);

        rightContentPanel rcp = new rightContentPanel();
        add(rcp);

    }


}
