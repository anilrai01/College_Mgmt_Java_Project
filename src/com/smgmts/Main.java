package com.smgmts;

import com.smgmts.Logging.LogIn;
import com.smgmts.NetBBeansDashBoard.InternalDash;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
//                LogIn login = new LogIn();
//                ProfileDash pd = new ProfileDash();

                InternalDash idss = new InternalDash();
                idss.setVisible(true);
                idss.setLocationRelativeTo(null);
                idss.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//                Database db = new Database();
//                System.out.println(db.getFetched());
            }
        });

    }
}
