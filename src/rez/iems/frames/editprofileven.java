/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package rez.iems.frames;

import java.io.File;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import rez.iems.connectionprovider.getcon;
import static rez.iems.frames.vendorprofile.cus;
import rez.iems.info.vendorentities;
import rez.iems.info.vendorinfo;

/**
 *
 * @author ahmed
 */
public class editprofileven extends javax.swing.JFrame {

    /**
     * Creates new form profile
     */
     static vendorentities cus = login.getven();
      public int w;
      public editprofileven() {
        initComponents();
        initialize();
        slidingpanel.setVisible(false);
        w=0;
    }
public void initialize() {
       Icon icon = new ImageIcon(cus.getImg());
       profilepic.setIcon(icon);
       nametxt.setText(cus.getName());
       emailtxt.setText(cus.getEmail());
       addresstxt.setText(cus.getAddress());
       phonenotxt.setText(cus.getContactno());
       nidtxt.setText(cus.getBin());
       
   }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        close = new javax.swing.JLabel();
        slidingpanel = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        phbtn = new rojerusan.RSMaterialButtonRectangle();
        homebtn = new rojerusan.RSMaterialButtonRectangle();
        profilebtn = new rojerusan.RSMaterialButtonRectangle();
        eprofilebtn = new rojerusan.RSMaterialButtonRectangle();
        searchbtn = new rojerusan.RSMaterialButtonRectangle();
        logoutbtn = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        profilepic = new javax.swing.JLabel();
        phonenotxt = new javax.swing.JTextField();
        nametxt = new javax.swing.JTextField();
        emailtxt = new javax.swing.JTextField();
        addresstxt = new javax.swing.JTextField();
        nidtxt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cpasstxt = new rojerusan.RSPasswordTextPlaceHolder();
        passtxt = new rojerusan.RSPasswordTextPlaceHolder();
        uptbtn = new rojerusan.RSMaterialButtonRectangle();
        showpasswordbtn = new rojerusan.RSMaterialButtonRectangle();
        uploadimgbtn = new rojerusan.RSMaterialButtonRectangle();
        rSMaterialButtonRectangle1 = new rojerusan.RSMaterialButtonRectangle();
        footerpanel = new javax.swing.JPanel();
        footer = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Profile");
        setMinimumSize(new java.awt.Dimension(1080, 720));
        setName("profile"); // NOI18N
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(1080, 720));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(84, 180, 53));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rez/iems/figures/icons8-cancel-25.png"))); // NOI18N
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                closeMousePressed(evt);
            }
        });
        jPanel1.add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 20, -1, -1));

        slidingpanel.setBackground(new java.awt.Color(255, 204, 102));
        slidingpanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rez/iems/figures/icons8-multiply-30.png"))); // NOI18N
        jLabel9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        slidingpanel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rez/iems/figures/icons8-edit-profile-30.png"))); // NOI18N
        jLabel11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        slidingpanel.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 254, -1, 40));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rez/iems/figures/icons8-hut-30.png"))); // NOI18N
        jLabel12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        slidingpanel.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 150, -1, 40));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rez/iems/figures/icons8-find-user-male-30.png"))); // NOI18N
        jLabel13.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        slidingpanel.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 304, -1, 40));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rez/iems/figures/icons8-order-history-30.png"))); // NOI18N
        jLabel14.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        slidingpanel.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 352, 40, 50));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rez/iems/figures/icons8-user-menu-male-30.png"))); // NOI18N
        jLabel15.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        slidingpanel.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 202, -1, 40));

        phbtn.setBackground(new java.awt.Color(84, 180, 53));
        phbtn.setForeground(new java.awt.Color(255, 251, 235));
        phbtn.setText("Dash Board");
        phbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        phbtn.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        phbtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        phbtn.setIconTextGap(0);
        phbtn.setMargin(new java.awt.Insets(0, 0, 0, 0));
        phbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phbtnActionPerformed(evt);
            }
        });
        slidingpanel.add(phbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(-5, 348, 280, 60));

        homebtn.setBackground(new java.awt.Color(84, 180, 53));
        homebtn.setForeground(new java.awt.Color(255, 251, 235));
        homebtn.setText("HOME");
        homebtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        homebtn.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        homebtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        homebtn.setIconTextGap(0);
        homebtn.setMargin(new java.awt.Insets(0, 0, 0, 0));
        homebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homebtnActionPerformed(evt);
            }
        });
        slidingpanel.add(homebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(-5, 140, 280, 60));

        profilebtn.setBackground(new java.awt.Color(84, 180, 53));
        profilebtn.setForeground(new java.awt.Color(255, 251, 235));
        profilebtn.setText("Profile");
        profilebtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        profilebtn.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        profilebtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        profilebtn.setIconTextGap(0);
        profilebtn.setMargin(new java.awt.Insets(0, 0, 0, 0));
        profilebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profilebtnActionPerformed(evt);
            }
        });
        slidingpanel.add(profilebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(-5, 192, 280, 60));

        eprofilebtn.setBackground(new java.awt.Color(84, 180, 53));
        eprofilebtn.setForeground(new java.awt.Color(255, 251, 235));
        eprofilebtn.setText("Edit Profile");
        eprofilebtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        eprofilebtn.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        eprofilebtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        eprofilebtn.setIconTextGap(0);
        eprofilebtn.setMargin(new java.awt.Insets(0, 0, 0, 0));
        eprofilebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eprofilebtnActionPerformed(evt);
            }
        });
        slidingpanel.add(eprofilebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(-5, 244, 280, 60));

        searchbtn.setBackground(new java.awt.Color(84, 180, 53));
        searchbtn.setForeground(new java.awt.Color(255, 251, 235));
        searchbtn.setText("Search");
        searchbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        searchbtn.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        searchbtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        searchbtn.setIconTextGap(0);
        searchbtn.setMargin(new java.awt.Insets(0, 0, 0, 0));
        searchbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchbtnActionPerformed(evt);
            }
        });
        slidingpanel.add(searchbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(-5, 296, 280, 60));

        logoutbtn.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        logoutbtn.setForeground(new java.awt.Color(51, 51, 51));
        logoutbtn.setText("LOGOUT");
        logoutbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutbtnMouseClicked(evt);
            }
        });
        slidingpanel.add(logoutbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 560, -1, 30));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rez/iems/figures/icons8-logout-30.png"))); // NOI18N
        slidingpanel.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 560, -1, -1));

        jPanel1.add(slidingpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, 690));

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rez/iems/figures/icons8-menu-30.png"))); // NOI18N
        jLabel8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 50, 30));

        profilepic.setBackground(new java.awt.Color(84, 180, 53));
        profilepic.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 255, 255)));
        jPanel1.add(profilepic, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 30, 320, 240));

        phonenotxt.setBackground(new java.awt.Color(84, 180, 53));
        phonenotxt.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        phonenotxt.setForeground(new java.awt.Color(255, 251, 235));
        phonenotxt.setBorder(null);
        phonenotxt.setCaretColor(new java.awt.Color(255, 255, 255));
        jPanel1.add(phonenotxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 360, 250, 35));

        nametxt.setBackground(new java.awt.Color(84, 180, 53));
        nametxt.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        nametxt.setForeground(new java.awt.Color(255, 251, 235));
        nametxt.setBorder(null);
        nametxt.setCaretColor(new java.awt.Color(255, 255, 255));
        nametxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nametxtActionPerformed(evt);
            }
        });
        jPanel1.add(nametxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 310, 250, 35));

        emailtxt.setBackground(new java.awt.Color(84, 180, 53));
        emailtxt.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        emailtxt.setForeground(new java.awt.Color(255, 251, 235));
        emailtxt.setBorder(null);
        emailtxt.setCaretColor(new java.awt.Color(255, 255, 255));
        jPanel1.add(emailtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 360, 250, 35));

        addresstxt.setBackground(new java.awt.Color(84, 180, 53));
        addresstxt.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        addresstxt.setForeground(new java.awt.Color(255, 251, 235));
        addresstxt.setBorder(null);
        addresstxt.setCaretColor(new java.awt.Color(255, 255, 255));
        jPanel1.add(addresstxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 310, 250, 35));

        nidtxt.setEditable(false);
        nidtxt.setBackground(new java.awt.Color(84, 180, 53));
        nidtxt.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        nidtxt.setForeground(new java.awt.Color(255, 251, 235));
        nidtxt.setBorder(null);
        nidtxt.setCaretColor(new java.awt.Color(255, 255, 255));
        jPanel1.add(nidtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 420, 350, 35));

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(252, 255, 231));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Business Identification Number :");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 430, 240, -1));

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(252, 255, 231));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Name  :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 310, -1, 30));

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(252, 255, 231));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Email :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 360, -1, 40));

        jLabel4.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(252, 255, 231));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Address : ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 310, -1, 30));

        jLabel5.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(252, 255, 231));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Contact No :");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 370, -1, -1));

        cpasstxt.setBackground(new java.awt.Color(84, 180, 53));
        cpasstxt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(255, 255, 255)));
        cpasstxt.setForeground(new java.awt.Color(255, 251, 235));
        cpasstxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cpasstxt.setCaretColor(new java.awt.Color(255, 255, 255));
        cpasstxt.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        cpasstxt.setMargin(new java.awt.Insets(0, 10, 0, 0));
        cpasstxt.setPhColor(new java.awt.Color(255, 255, 255));
        cpasstxt.setPlaceholder("New Password.....");
        jPanel1.add(cpasstxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 480, 330, 40));

        passtxt.setBackground(new java.awt.Color(84, 180, 53));
        passtxt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(255, 255, 255)));
        passtxt.setForeground(new java.awt.Color(255, 251, 235));
        passtxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        passtxt.setCaretColor(new java.awt.Color(255, 255, 255));
        passtxt.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        passtxt.setMargin(new java.awt.Insets(0, 10, 0, 0));
        passtxt.setPhColor(new java.awt.Color(255, 255, 255));
        passtxt.setPlaceholder("Password.....");
        jPanel1.add(passtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 480, 330, 40));

        uptbtn.setBackground(new java.awt.Color(255, 251, 193));
        uptbtn.setForeground(new java.awt.Color(51, 51, 51));
        uptbtn.setText("UPDATE PROFILE");
        uptbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uptbtnActionPerformed(evt);
            }
        });
        jPanel1.add(uptbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 570, 150, 40));

        showpasswordbtn.setBackground(new java.awt.Color(255, 251, 193));
        showpasswordbtn.setForeground(new java.awt.Color(51, 51, 51));
        showpasswordbtn.setText("SHOW PASSWORD");
        showpasswordbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showpasswordbtnActionPerformed(evt);
            }
        });
        jPanel1.add(showpasswordbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 570, 150, 40));

        uploadimgbtn.setBackground(new java.awt.Color(255, 251, 193));
        uploadimgbtn.setForeground(new java.awt.Color(51, 51, 51));
        uploadimgbtn.setText("Upload Image");
        uploadimgbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadimgbtnActionPerformed(evt);
            }
        });
        jPanel1.add(uploadimgbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 40, 130, 40));

        rSMaterialButtonRectangle1.setBackground(new java.awt.Color(255, 251, 193));
        rSMaterialButtonRectangle1.setForeground(new java.awt.Color(51, 51, 51));
        rSMaterialButtonRectangle1.setText("Add Events");
        rSMaterialButtonRectangle1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSMaterialButtonRectangle1ActionPerformed(evt);
            }
        });
        jPanel1.add(rSMaterialButtonRectangle1, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 40, 120, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 690));

        footerpanel.setBackground(new java.awt.Color(0, 51, 51));

        footer.setBackground(new java.awt.Color(255, 255, 255));
        footer.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 10)); // NOI18N
        footer.setForeground(new java.awt.Color(255, 255, 255));
        footer.setText("Serving with pure passion it's our oath © 2023 IEMS. All rights reserved.");

        javax.swing.GroupLayout footerpanelLayout = new javax.swing.GroupLayout(footerpanel);
        footerpanel.setLayout(footerpanelLayout);
        footerpanelLayout.setHorizontalGroup(
            footerpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1080, Short.MAX_VALUE)
            .addGroup(footerpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(footerpanelLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(footer)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        footerpanelLayout.setVerticalGroup(
            footerpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 29, Short.MAX_VALUE)
            .addGroup(footerpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(footerpanelLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(footer, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        getContentPane().add(footerpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 690, 1080, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void closeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMousePressed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_closeMousePressed

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        // TODO add your handling code here:
        if(w==270)
        {
            slidingpanel.setSize(270,600);
            Thread th=new Thread(){
                @Override
                public void run(){
                    try{
                        for(int i=270;i>=0;i--){
                            Thread.sleep(1);
                            slidingpanel.setSize(i,690);
                        }
                    }catch(Exception e){
                        e.printStackTrace();
                    }
                }
            };th.start();
            w=0;
        }
    }//GEN-LAST:event_jLabel9MouseClicked

    private void logoutbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutbtnMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        Thread th=new Thread(){
                @Override
                public void run(){
                    try{
                           
                            Thread.sleep(200);
                          login fr = new login();
                            fr.setVisible(true);
                        }catch(Exception e){
                        e.printStackTrace();
                    }}
                
            };th.start();
    }//GEN-LAST:event_logoutbtnMouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        // TODO add your handling code here:
        if(w==0)
        {
            slidingpanel.show();
            slidingpanel.setSize(w,600);
            Thread th=new Thread(){
                @Override
                public void run(){
                    try{
                        for(int i=0;i<=270;i++){
                            Thread.sleep(1);
                            slidingpanel.setSize(i,690);
                        }
                    }catch(Exception e){
                        e.printStackTrace();
                    }
                }
            };th.start();
            w=270;
        }
    }//GEN-LAST:event_jLabel8MouseClicked

    private void nametxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nametxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nametxtActionPerformed
     
    private void uptbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uptbtnActionPerformed
        // TODO add your handling code here:
        int vcode = cus.getCode();
        String vname = nametxt.getText();
        String vaddress = addresstxt.getText();
        String vcontactno = phonenotxt.getText();
        String vemail = emailtxt.getText();
        String vbin = nidtxt.getText();
        String vpass = passtxt.getText();
        String vcpass = cpasstxt.getText();
        String img = cus.getImg();
        cus.setAddress(vaddress);
        cus.setName(vname);
        cus.setContactno(vcontactno);
        cus.setEmail(vemail);
        cus.setBin(vbin);
        cus.setImg(img);
        cus.setPass(vcpass);
        cus.setCode(vcode);
        boolean bb = true;
       String query = "select * from vendor where email='"+vemail+"' and pass='"+vpass+"' ";
       Connection connect = getcon.getConnection();
         try {
             PreparedStatement  psmt=connect.prepareStatement(query);
             ResultSet rs=psmt.executeQuery(query);
             if(rs == null)
             {
                 new invaliddialog().setVisible(true);
                 
             }
             else 
             {
                 query = "UPDATE `iems`.`vendor` SET `name` = '"+vname+"', `email` = '"+vemail+"', `pass` = '"+vcpass+"', `address` = '"+vaddress+"', `profilepic` = ?, `contactno` = '"+vcontactno+"' WHERE (`code` = '"+vcode+"');";
                 psmt = connect.prepareStatement(query);
                 psmt.setString(1, img);
                 psmt.executeLargeUpdate();
                 
                      
                
             }
         } catch (Exception e) {
             e.printStackTrace();
             new updateerror().setVisible(true);
             bb=false;
         }
         if(bb==true)
         {
             new successfullyupdated().setVisible(true);
         }
        
        
    }//GEN-LAST:event_uptbtnActionPerformed
int x=0;
    private void showpasswordbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showpasswordbtnActionPerformed
        // TODO add your handling code here:
         if(x == 0)
         {
             passtxt.setEchoChar((char)0);
             cpasstxt.setEchoChar((char)0);
             x=1;
         }
         else 
         {
             passtxt.setEchoChar('\u2022');
             cpasstxt.setEchoChar('\u2022');
             x=0;   
         }
    }//GEN-LAST:event_showpasswordbtnActionPerformed

    private void uploadimgbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uploadimgbtnActionPerformed
        // TODO add your handling code here:
        JFileChooser ch = new JFileChooser();
        ch.setCurrentDirectory(new File(System.getProperty("user.home")));
        FileNameExtensionFilter filter = new FileNameExtensionFilter("*.Image","jpg","jpeg","JPG","JPEG","png","PNG");
        ch.addChoosableFileFilter(filter);
        int check =  ch.showSaveDialog(null);
        if(check==JFileChooser.APPROVE_OPTION){
            File fl = ch.getSelectedFile();
            String url = fl.getAbsolutePath();
            String filename = fl.getName();
             Icon icon = new ImageIcon(url);
            int w = icon.getIconWidth();
            int h= icon.getIconHeight();
            if(w==320&&h==240&&(filename.endsWith(".JPG")||filename.endsWith(".jpg")||filename.endsWith(".jpeg")||filename.endsWith(".JPEG")||filename.endsWith(".png")||filename.endsWith(".PNG")))
            {
              cus.setImg(url);
                 profilepic.setIcon(icon);
            }
            else
            {
 Thread th=new Thread(){
                @Override
                public void run(){
                    try{
                           
                        loading ff = new loading();
                        ff.setVisible(true);
                            Thread.sleep(500);
                        ff.setVisible(false);
                            invalidimg fr = new invalidimg();
                            fr.setVisible(true);
                        }catch(Exception e){
                        e.printStackTrace();
                    }}
                
            };th.start();
            }

        }
        else {

        }
    }//GEN-LAST:event_uploadimgbtnActionPerformed

    private void homebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homebtnActionPerformed
         // TODO add your handling code here:
         this.setVisible(false);
         Thread th=new Thread(){
                @Override
                public void run(){
                    try{
                           
                            Thread.sleep(200);
                            vendorhome  fr = new vendorhome();
                            fr.setVisible(true);
                        }catch(Exception e){
                        e.printStackTrace();
                    }}
                
            };th.start();
    }//GEN-LAST:event_homebtnActionPerformed

    private void profilebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profilebtnActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        Thread th=new Thread(){
                @Override
                public void run(){
                    try{
                           
                            Thread.sleep(200);
                          vendorprofile fr = new vendorprofile();
                            fr.setVisible(true);
                        }catch(Exception e){
                        e.printStackTrace();
                    }}
                
            };th.start();
    }//GEN-LAST:event_profilebtnActionPerformed

    private void searchbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchbtnActionPerformed
        // TODO add your handling code here:
          this.setVisible(false);
          new vendorsearch().setVisible(true);
        
    }//GEN-LAST:event_searchbtnActionPerformed

    private void eprofilebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eprofilebtnActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
       
         Thread th=new Thread(){
                @Override
                public void run(){
                    try{
                           
                            Thread.sleep(200);
                            editprofileven fr = new editprofileven();
                            fr.setVisible(true);
                        }catch(Exception e){
                        e.printStackTrace();
                    }}
                
            };th.start();
    }//GEN-LAST:event_eprofilebtnActionPerformed

    private void phbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phbtnActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new dashboard().setVisible(true);
    }//GEN-LAST:event_phbtnActionPerformed

    private void rSMaterialButtonRectangle1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSMaterialButtonRectangle1ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new crevent().setVisible(true);
    }//GEN-LAST:event_rSMaterialButtonRectangle1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(editprofileven.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(editprofileven.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(editprofileven.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(editprofileven.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new editprofileven().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addresstxt;
    private javax.swing.JLabel close;
    private rojerusan.RSPasswordTextPlaceHolder cpasstxt;
    private javax.swing.JTextField emailtxt;
    private rojerusan.RSMaterialButtonRectangle eprofilebtn;
    private javax.swing.JLabel footer;
    private javax.swing.JPanel footerpanel;
    private rojerusan.RSMaterialButtonRectangle homebtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel logoutbtn;
    private javax.swing.JTextField nametxt;
    private javax.swing.JTextField nidtxt;
    private rojerusan.RSPasswordTextPlaceHolder passtxt;
    private rojerusan.RSMaterialButtonRectangle phbtn;
    private javax.swing.JTextField phonenotxt;
    private rojerusan.RSMaterialButtonRectangle profilebtn;
    private javax.swing.JLabel profilepic;
    private rojerusan.RSMaterialButtonRectangle rSMaterialButtonRectangle1;
    private rojerusan.RSMaterialButtonRectangle searchbtn;
    private rojerusan.RSMaterialButtonRectangle showpasswordbtn;
    private javax.swing.JPanel slidingpanel;
    private rojerusan.RSMaterialButtonRectangle uploadimgbtn;
    private rojerusan.RSMaterialButtonRectangle uptbtn;
    // End of variables declaration//GEN-END:variables
}
