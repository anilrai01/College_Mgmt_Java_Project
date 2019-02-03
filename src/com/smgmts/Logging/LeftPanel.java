package com.smgmts.Logging;

import javax.swing.*;
import java.awt.*;

public class LeftPanel extends JPanel{

    //Using RGBA Values
//    private Color brand = new Color(211,24,33);
    //Creating left Panel

    private JLabel background = new JLabel();
    private Color brand = new Color(211,24,33);

    public LeftPanel(){
        leftPanelgui();
    }

    public void leftPanelgui(){

        setLayout(null);
        setBounds(0,0,300,500);
        setBackground(Color.white);

        background.setBounds(10,110,300,260);
//        background.setBorder(BorderFactory.createMatteBorder(0,2,0,0,Color.white));

        ImageIcon img = new ImageIcon(Toolkit.getDefaultToolkit().getImage
                (getClass().getResource("logo.jpg")));

        Image img1 = img.getImage();
        Image img2 = img1.getScaledInstance(background.getWidth(),background.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon i = new ImageIcon(img2);

        background.setIcon(i);
        add(background);

    }
}
