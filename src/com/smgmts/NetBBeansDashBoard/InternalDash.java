package com.smgmts.NetBBeansDashBoard;

import javax.swing.*;
import java.awt.*;
import java.awt.Color;
import java.util.HashSet;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;


public class InternalDash extends javax.swing.JFrame{


        private Color focuslost = new Color(220, 17, 35);
        private Color focus = new Color(255, 102, 102);
        public InternalDash() {
            initComponents();
        }


        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">
        private void initComponents() {

            bgPanel = new javax.swing.JPanel();
            leftPanel = new javax.swing.JPanel();
            jPanelBtnHome = new javax.swing.JPanel();
            jLabelIcon1 = new javax.swing.JLabel();
            jLabelHOME = new javax.swing.JLabel();
            jPanelBtnAssignments = new javax.swing.JPanel();
            jLabelIcon2 = new javax.swing.JLabel();
            jLabelAssignments = new javax.swing.JLabel();
            jPanelBtnRegister = new javax.swing.JPanel();
            jLabelIcon3 = new javax.swing.JLabel();
            jLabelRegister = new javax.swing.JLabel();
            jPanelBtnReports = new javax.swing.JPanel();
            jLabelIcon4 = new javax.swing.JLabel();
            jLabelReports = new javax.swing.JLabel();
            jPanelBtnSettings = new javax.swing.JPanel();
            jLabelIcon5 = new javax.swing.JLabel();
            jLabelSettings = new javax.swing.JLabel();
            rightTopPan = new javax.swing.JPanel();
            rightTopDPan = new javax.swing.JPanel();
            jPanelContentPanel = new javax.swing.JPanel();

            setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

            bgPanel.setBackground(new java.awt.Color(255, 255, 255));

            leftPanel.setBackground(new java.awt.Color(232, 17, 35));

            jPanelBtnHome.setBackground(new java.awt.Color(255, 102, 102));
            jPanelBtnHome.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jPanelBtnHomeMouseClicked(evt);
                }
            });

            jLabelIcon1.setIcon(new javax.swing.ImageIcon("D:\\Anil College\\Third Semester\\JAVA Project\\College Management System\\src\\com\\smgmts\\Icons\\homew.png")); // NOI18N

            jLabelHOME.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
            jLabelHOME.setForeground(new java.awt.Color(255, 255, 255));
            jLabelHOME.setText("Home");

            javax.swing.GroupLayout jPanelBtnHomeLayout = new javax.swing.GroupLayout(jPanelBtnHome);
            jPanelBtnHome.setLayout(jPanelBtnHomeLayout);
            jPanelBtnHomeLayout.setHorizontalGroup(
                    jPanelBtnHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelBtnHomeLayout.createSequentialGroup()
                                    .addGap(32, 32, 32)
                                    .addComponent(jLabelIcon1)
                                    .addGap(35, 35, 35)
                                    .addComponent(jLabelHOME, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(122, 122, 122))
            );
            jPanelBtnHomeLayout.setVerticalGroup(
                    jPanelBtnHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelBtnHomeLayout.createSequentialGroup()
                                    .addContainerGap()
                                    .addGroup(jPanelBtnHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabelIcon1, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                                            .addComponent(jLabelHOME, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addContainerGap())
            );

            jPanelBtnAssignments.setBackground(new java.awt.Color(220, 17, 35));
            jPanelBtnAssignments.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jPanelBtnAssignmentsMouseClicked(evt);
                }
            });

            jLabelIcon2.setIcon(new javax.swing.ImageIcon("D:\\Anil College\\Third Semester\\JAVA Project\\College Management System\\src\\com\\smgmts\\Icons\\notebookb.png")); // NOI18N

            jLabelAssignments.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
            jLabelAssignments.setText("Assignments");

            javax.swing.GroupLayout jPanelBtnAssignmentsLayout = new javax.swing.GroupLayout(jPanelBtnAssignments);
            jPanelBtnAssignments.setLayout(jPanelBtnAssignmentsLayout);
            jPanelBtnAssignmentsLayout.setHorizontalGroup(
                    jPanelBtnAssignmentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelBtnAssignmentsLayout.createSequentialGroup()
                                    .addGap(33, 33, 33)
                                    .addComponent(jLabelIcon2)
                                    .addGap(35, 35, 35)
                                    .addComponent(jLabelAssignments, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(122, 122, 122))
            );
            jPanelBtnAssignmentsLayout.setVerticalGroup(
                    jPanelBtnAssignmentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBtnAssignmentsLayout.createSequentialGroup()
                                    .addContainerGap()
                                    .addGroup(jPanelBtnAssignmentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabelIcon2, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                                            .addComponent(jLabelAssignments, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addContainerGap())
            );

            jPanelBtnRegister.setBackground(new java.awt.Color(220, 17, 35));
            jPanelBtnRegister.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jPanelBtnRegisterMouseClicked(evt);
                }
            });

            jLabelIcon3.setIcon(new javax.swing.ImageIcon("D:\\Anil College\\Third Semester\\JAVA Project\\College Management System\\src\\com\\smgmts\\Icons\\clipboardb.png")); // NOI18N

            jLabelRegister.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
            jLabelRegister.setText("Register");

            javax.swing.GroupLayout jPanelBtnRegisterLayout = new javax.swing.GroupLayout(jPanelBtnRegister);
            jPanelBtnRegister.setLayout(jPanelBtnRegisterLayout);
            jPanelBtnRegisterLayout.setHorizontalGroup(
                    jPanelBtnRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelBtnRegisterLayout.createSequentialGroup()
                                    .addGap(32, 32, 32)
                                    .addComponent(jLabelIcon3)
                                    .addGap(35, 35, 35)
                                    .addComponent(jLabelRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(122, 122, 122))
            );
            jPanelBtnRegisterLayout.setVerticalGroup(
                    jPanelBtnRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelBtnRegisterLayout.createSequentialGroup()
                                    .addContainerGap()
                                    .addGroup(jPanelBtnRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabelIcon3, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                                            .addComponent(jLabelRegister, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addContainerGap())
            );

            jPanelBtnReports.setBackground(new java.awt.Color(220, 17, 35));
            jPanelBtnReports.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jPanelBtnReportsMouseClicked(evt);
                }
            });

            jLabelIcon4.setIcon(new javax.swing.ImageIcon("D:\\Anil College\\Third Semester\\JAVA Project\\College Management System\\src\\com\\smgmts\\Icons\\statisticsb.png")); // NOI18N

            jLabelReports.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
            jLabelReports.setText("Reports");

            javax.swing.GroupLayout jPanelBtnReportsLayout = new javax.swing.GroupLayout(jPanelBtnReports);
            jPanelBtnReports.setLayout(jPanelBtnReportsLayout);
            jPanelBtnReportsLayout.setHorizontalGroup(
                    jPanelBtnReportsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelBtnReportsLayout.createSequentialGroup()
                                    .addGap(32, 32, 32)
                                    .addComponent(jLabelIcon4)
                                    .addGap(35, 35, 35)
                                    .addComponent(jLabelReports, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(122, 122, 122))
            );
            jPanelBtnReportsLayout.setVerticalGroup(
                    jPanelBtnReportsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelBtnReportsLayout.createSequentialGroup()
                                    .addContainerGap()
                                    .addGroup(jPanelBtnReportsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabelIcon4, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                                            .addComponent(jLabelReports, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addContainerGap())
            );

            jPanelBtnSettings.setBackground(new java.awt.Color(220, 17, 35));
            jPanelBtnSettings.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jPanelBtnSettingsMouseClicked(evt);
                }
            });

            jLabelIcon5.setIcon(new javax.swing.ImageIcon("D:\\Anil College\\Third Semester\\JAVA Project\\College Management System\\src\\com\\smgmts\\Icons\\settingsb.png")); // NOI18N

            jLabelSettings.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
            jLabelSettings.setText("Settings");

            javax.swing.GroupLayout jPanelBtnSettingsLayout = new javax.swing.GroupLayout(jPanelBtnSettings);
            jPanelBtnSettings.setLayout(jPanelBtnSettingsLayout);
            jPanelBtnSettingsLayout.setHorizontalGroup(
                    jPanelBtnSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelBtnSettingsLayout.createSequentialGroup()
                                    .addGap(32, 32, 32)
                                    .addComponent(jLabelIcon5)
                                    .addGap(35, 35, 35)
                                    .addComponent(jLabelSettings, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(122, 122, 122))
            );
            jPanelBtnSettingsLayout.setVerticalGroup(
                    jPanelBtnSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelBtnSettingsLayout.createSequentialGroup()
                                    .addContainerGap()
                                    .addGroup(jPanelBtnSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabelIcon5, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                                            .addComponent(jLabelSettings, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addContainerGap())
            );

            javax.swing.GroupLayout leftPanelLayout = new javax.swing.GroupLayout(leftPanel);
            leftPanel.setLayout(leftPanelLayout);
            leftPanelLayout.setHorizontalGroup(
                    leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanelBtnRegister, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanelBtnSettings, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanelBtnReports, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanelBtnAssignments, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanelBtnHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            );
            leftPanelLayout.setVerticalGroup(
                    leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(leftPanelLayout.createSequentialGroup()
                                    .addGap(202, 202, 202)
                                    .addComponent(jPanelBtnHome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jPanelBtnAssignments, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jPanelBtnRegister, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jPanelBtnReports, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jPanelBtnSettings, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addContainerGap(239, Short.MAX_VALUE))
            );

            rightTopPan.setBackground(new java.awt.Color(255, 51, 51));

            javax.swing.GroupLayout rightTopPanLayout = new javax.swing.GroupLayout(rightTopPan);
            rightTopPan.setLayout(rightTopPanLayout);
            rightTopPanLayout.setHorizontalGroup(
                    rightTopPanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGap(0, 792, Short.MAX_VALUE)
            );
            rightTopPanLayout.setVerticalGroup(
                    rightTopPanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGap(0, 48, Short.MAX_VALUE)
            );

            rightTopDPan.setBackground(new java.awt.Color(255, 51, 0));

            javax.swing.GroupLayout rightTopDPanLayout = new javax.swing.GroupLayout(rightTopDPan);
            rightTopDPan.setLayout(rightTopDPanLayout);
            rightTopDPanLayout.setHorizontalGroup(
                    rightTopDPanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGap(0, 545, Short.MAX_VALUE)
            );
            rightTopDPanLayout.setVerticalGroup(
                    rightTopDPanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGap(0, 42, Short.MAX_VALUE)
            );

            jPanelContentPanel.setBackground(new java.awt.Color(255, 255, 255));

            javax.swing.GroupLayout jPanelContentPanelLayout = new javax.swing.GroupLayout(jPanelContentPanel);
            jPanelContentPanel.setLayout(jPanelContentPanelLayout);
            jPanelContentPanelLayout.setHorizontalGroup(
                    jPanelContentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGap(0, 0, Short.MAX_VALUE)
            );
            jPanelContentPanelLayout.setVerticalGroup(
                    jPanelContentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGap(0, 0, Short.MAX_VALUE)
            );

            javax.swing.GroupLayout bgPanelLayout = new javax.swing.GroupLayout(bgPanel);
            bgPanel.setLayout(bgPanelLayout);
            bgPanelLayout.setHorizontalGroup(
                    bgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bgPanelLayout.createSequentialGroup()
                                    .addComponent(leftPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(bgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(bgPanelLayout.createSequentialGroup()
                                                    .addGap(0, 110, Short.MAX_VALUE)
                                                    .addGroup(bgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                            .addComponent(rightTopPan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(rightTopDPan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(bgPanelLayout.createSequentialGroup()
                                                    .addComponent(jPanelContentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addContainerGap())))
            );
            bgPanelLayout.setVerticalGroup(
                    bgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(leftPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(bgPanelLayout.createSequentialGroup()
                                    .addGap(39, 39, 39)
                                    .addComponent(rightTopPan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(rightTopDPan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jPanelContentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addContainerGap())
            );

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bgPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            );
            layout.setVerticalGroup(
                    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bgPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            );

            pack();
        }// </editor-fold>

        private void jPanelBtnHomeMouseClicked(java.awt.event.MouseEvent evt) {
            // TODO add your handling code here:

            //Change Activeness
            setColor(jPanelBtnHome);
            resetColor(jPanelBtnAssignments);
            resetColor(jPanelBtnRegister);
            resetColor(jPanelBtnReports);
            resetColor(jPanelBtnSettings);

            //Change Active Logo
            jLabelIcon1.setIcon(new javax.swing.ImageIcon("D:\\Anil College\\Third Semester\\JAVA Project\\College Management System\\src\\com\\smgmts\\Icons\\homew.png"));
            jLabelIcon2.setIcon(new javax.swing.ImageIcon("D:\\Anil College\\Third Semester\\JAVA Project\\College Management System\\src\\com\\smgmts\\Icons\\notebookb.png"));
            jLabelIcon3.setIcon(new javax.swing.ImageIcon("D:\\Anil College\\Third Semester\\JAVA Project\\College Management System\\src\\com\\smgmts\\Icons\\clipboardb.png"));
            jLabelIcon4.setIcon(new javax.swing.ImageIcon("D:\\Anil College\\Third Semester\\JAVA Project\\College Management System\\src\\com\\smgmts\\Icons\\statisticsb.png"));
            jLabelIcon5.setIcon(new javax.swing.ImageIcon("D:\\Anil College\\Third Semester\\JAVA Project\\College Management System\\src\\com\\smgmts\\Icons\\settingsb.png"));

            //Change Active Foreground Color
            jLabelHOME.setForeground(Color.white);
            jLabelAssignments.setForeground(Color.black);
            jLabelRegister.setForeground(Color.black);
            jLabelReports.setForeground(Color.black);
            jLabelSettings.setForeground(Color.black);

        }

        private void jPanelBtnAssignmentsMouseClicked(java.awt.event.MouseEvent evt) {
            // TODO add your handling code here:

            //Change Activeness
            setColor(jPanelBtnAssignments);
            resetColor(jPanelBtnHome);
            resetColor(jPanelBtnRegister);
            resetColor(jPanelBtnReports);
            resetColor(jPanelBtnSettings);


            //Change Active Logo
            jLabelIcon1.setIcon(new javax.swing.ImageIcon("D:\\Anil College\\Third Semester\\JAVA Project\\College Management System\\src\\com\\smgmts\\Icons\\homeb.png"));
            jLabelIcon2.setIcon(new javax.swing.ImageIcon("D:\\Anil College\\Third Semester\\JAVA Project\\College Management System\\src\\com\\smgmts\\Icons\\notebookw.png"));
            jLabelIcon3.setIcon(new javax.swing.ImageIcon("D:\\Anil College\\Third Semester\\JAVA Project\\College Management System\\src\\com\\smgmts\\Icons\\clipboardb.png"));
            jLabelIcon4.setIcon(new javax.swing.ImageIcon("D:\\Anil College\\Third Semester\\JAVA Project\\College Management System\\src\\com\\smgmts\\Icons\\statisticsb.png"));
            jLabelIcon5.setIcon(new javax.swing.ImageIcon("D:\\Anil College\\Third Semester\\JAVA Project\\College Management System\\src\\com\\smgmts\\Icons\\settingsb.png"));

            //Change Active Foreground
            jLabelHOME.setForeground(Color.black);
            jLabelAssignments.setForeground(Color.white);
            jLabelRegister.setForeground(Color.black);
            jLabelReports.setForeground(Color.black);
            jLabelSettings.setForeground(Color.black);
        }

        private void jPanelBtnRegisterMouseClicked(java.awt.event.MouseEvent evt) {
            // TODO add your handling code here:

            //Change Activeness
            setColor(jPanelBtnRegister);
            resetColor(jPanelBtnHome);
            resetColor(jPanelBtnAssignments);
            resetColor(jPanelBtnReports);
            resetColor(jPanelBtnSettings);



            //Change Active Logo
            jLabelIcon1.setIcon(new javax.swing.ImageIcon("D:\\Anil College\\Third Semester\\JAVA Project\\College Management System\\src\\com\\smgmts\\Icons\\homeb.png"));
            jLabelIcon2.setIcon(new javax.swing.ImageIcon("D:\\Anil College\\Third Semester\\JAVA Project\\College Management System\\src\\com\\smgmts\\Icons\\notebookb.png"));
            jLabelIcon3.setIcon(new javax.swing.ImageIcon("D:\\Anil College\\Third Semester\\JAVA Project\\College Management System\\src\\com\\smgmts\\Icons\\clipboardw.png"));
            jLabelIcon4.setIcon(new javax.swing.ImageIcon("D:\\Anil College\\Third Semester\\JAVA Project\\College Management System\\src\\com\\smgmts\\Icons\\statisticsb.png"));
            jLabelIcon5.setIcon(new javax.swing.ImageIcon("D:\\Anil College\\Third Semester\\JAVA Project\\College Management System\\src\\com\\smgmts\\Icons\\settingsb.png"));

            //Change Active Foreground
            jLabelHOME.setForeground(Color.black);
            jLabelAssignments.setForeground(Color.black);
            jLabelRegister.setForeground(Color.white);
            jLabelReports.setForeground(Color.black);
            jLabelSettings.setForeground(Color.black);

        }

        private void jPanelBtnReportsMouseClicked(java.awt.event.MouseEvent evt) {
            // TODO add your handling code here:

            //Change Activeness
            setColor(jPanelBtnReports);
            resetColor(jPanelBtnHome);
            resetColor(jPanelBtnRegister);
            resetColor(jPanelBtnAssignments);
            resetColor(jPanelBtnSettings);



            //Change Active Logo
            jLabelIcon1.setIcon(new javax.swing.ImageIcon("D:\\Anil College\\Third Semester\\JAVA Project\\College Management System\\src\\com\\smgmts\\Icons\\homeb.png"));
            jLabelIcon2.setIcon(new javax.swing.ImageIcon("D:\\Anil College\\Third Semester\\JAVA Project\\College Management System\\src\\com\\smgmts\\Icons\\notebookb.png"));
            jLabelIcon3.setIcon(new javax.swing.ImageIcon("D:\\Anil College\\Third Semester\\JAVA Project\\College Management System\\src\\com\\smgmts\\Icons\\clipboardb.png"));
            jLabelIcon4.setIcon(new javax.swing.ImageIcon("D:\\Anil College\\Third Semester\\JAVA Project\\College Management System\\src\\com\\smgmts\\Icons\\statisticsw.png"));
            jLabelIcon5.setIcon(new javax.swing.ImageIcon("D:\\Anil College\\Third Semester\\JAVA Project\\College Management System\\src\\com\\smgmts\\Icons\\settingsb.png"));

            //Change Active Foreground
            jLabelHOME.setForeground(Color.black);
            jLabelAssignments.setForeground(Color.black);
            jLabelRegister.setForeground(Color.black);
            jLabelReports.setForeground(Color.white);
            jLabelSettings.setForeground(Color.black);

        }

        private void jPanelBtnSettingsMouseClicked(java.awt.event.MouseEvent evt) {
            // TODO add your handling code here:

            //Change Activeness
            setColor(jPanelBtnSettings);
            resetColor(jPanelBtnHome);
            resetColor(jPanelBtnRegister);
            resetColor(jPanelBtnReports);
            resetColor(jPanelBtnAssignments);


            //Change Active Logo
            jLabelIcon1.setIcon(new javax.swing.ImageIcon("D:\\Anil College\\Third Semester\\JAVA Project\\College Management System\\src\\com\\smgmts\\Icons\\homeb.png"));
            jLabelIcon2.setIcon(new javax.swing.ImageIcon("D:\\Anil College\\Third Semester\\JAVA Project\\College Management System\\src\\com\\smgmts\\Icons\\notebookb.png"));
            jLabelIcon3.setIcon(new javax.swing.ImageIcon("D:\\Anil College\\Third Semester\\JAVA Project\\College Management System\\src\\com\\smgmts\\Icons\\clipboardb.png"));
            jLabelIcon4.setIcon(new javax.swing.ImageIcon("D:\\Anil College\\Third Semester\\JAVA Project\\College Management System\\src\\com\\smgmts\\Icons\\statisticsb.png"));
            jLabelIcon5.setIcon(new javax.swing.ImageIcon("D:\\Anil College\\Third Semester\\JAVA Project\\College Management System\\src\\com\\smgmts\\Icons\\settingsw.png"));

            //Change Active Foreground
            jLabelHOME.setForeground(Color.black);
            jLabelAssignments.setForeground(Color.black);
            jLabelRegister.setForeground(Color.black);
            jLabelReports.setForeground(Color.black);
            jLabelSettings.setForeground(Color.white);

        }


        void setColor(JPanel panel){
            panel.setBackground(focus);
        }

        void resetColor(JPanel panel){
            panel.setBackground(focuslost);
        }

        void hideTable(JPanel panel){
            panel.setVisible(false);
        }
        void showTable(JPanel panel){
            panel.setVisible(true);
        }


        // Variables declaration
        private javax.swing.JPanel bgPanel;
        private javax.swing.JLabel jLabelAssignments;
        private javax.swing.JLabel jLabelHOME;
        private javax.swing.JLabel jLabelIcon1;
        private javax.swing.JLabel jLabelIcon2;
        private javax.swing.JLabel jLabelIcon3;
        private javax.swing.JLabel jLabelIcon4;
        private javax.swing.JLabel jLabelIcon5;
        private javax.swing.JLabel jLabelRegister;
        private javax.swing.JLabel jLabelReports;
        private javax.swing.JLabel jLabelSettings;
        private javax.swing.JPanel jPanelBtnAssignments;
        private javax.swing.JPanel jPanelBtnHome;
        private javax.swing.JPanel jPanelBtnRegister;
        private javax.swing.JPanel jPanelBtnReports;
        private javax.swing.JPanel jPanelBtnSettings;
        private javax.swing.JPanel jPanelContentPanel;
        private javax.swing.JPanel leftPanel;
        private javax.swing.JPanel rightTopDPan;
        private javax.swing.JPanel rightTopPan;
        // End of variables declaration

}
