package com.smgmts;

import com.smgmts.Logging.LogIn;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                LogIn login = new LogIn();
//                ProfileDash pd = new ProfileDash();

//                Database db = new Database();
//                System.out.println(db.getFetched());
            }
        });

    }
}
