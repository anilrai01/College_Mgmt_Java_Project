package com.smgmts.ProfileDashboard.rightPanels;

import javax.swing.*;
import java.awt.*;

public class rightTopPan extends JPanel{

    private Color brand = new Color(232, 17, 35);

    public rightTopPan(){
        rightPangui();
    }

    public void rightPangui(){
        setBounds(600,20,800,30);
        setBackground(brand);
        setVisible(true);

    }
}
