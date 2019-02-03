package com.smgmts.ProfileDashboard.rightPanels;

import javax.swing.*;
import java.awt.*;

public class rightTopIIPan extends JPanel{

    private Color brand = new Color(232, 17, 35);

    public rightTopIIPan(){
        rightPangui();
    }

    public void rightPangui(){
        setBounds(700,60,700,25);
        setBackground(brand);
        setVisible(true);


    }
}
