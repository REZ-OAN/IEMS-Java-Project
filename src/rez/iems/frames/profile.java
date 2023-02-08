
package rez.iems.frames;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import rez.iems.info.customerentities;

public class profile extends javax.swing.JFrame {

    public int w;
    static customerentities cus = login.getcus();
    public profile() {
        initComponents();
        initialize();
        slidingpanel.setVisible(false);
        w=0;
    }
   public void initialize() {
       String url = cus.getImg();
       System.out.println(url);
       Icon icon = new ImageIcon(cus.getImg());
       profilepic.setIcon(icon);
       nametxt.setText(cus.getName());
       emailtxt.setText(cus.getEmail());
       addresstxt.setText(cus.getAddress());
       phonenotxt.setText(cus.getContactno());
       nidtxt.setText(cus.getCnid());
   }

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
        phbtn.setText("Purchase History");
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

        profilepic.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 255, 255)));
        jPanel1.add(profilepic, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 70, 320, 240));

        phonenotxt.setEditable(false);
        phonenotxt.setBackground(new java.awt.Color(84, 180, 53));
        phonenotxt.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        phonenotxt.setForeground(new java.awt.Color(255, 251, 235));
        phonenotxt.setBorder(null);
        jPanel1.add(phonenotxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 250, 290, 40));

        nametxt.setEditable(false);
        nametxt.setBackground(new java.awt.Color(84, 180, 53));
        nametxt.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        nametxt.setForeground(new java.awt.Color(255, 251, 235));
        nametxt.setBorder(null);
        nametxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nametxtActionPerformed(evt);
            }
        });
        jPanel1.add(nametxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 90, 290, 40));

        emailtxt.setEditable(false);
        emailtxt.setBackground(new java.awt.Color(84, 180, 53));
        emailtxt.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        emailtxt.setForeground(new java.awt.Color(255, 251, 235));
        emailtxt.setBorder(null);
        jPanel1.add(emailtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 140, 290, 40));

        addresstxt.setEditable(false);
        addresstxt.setBackground(new java.awt.Color(84, 180, 53));
        addresstxt.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        addresstxt.setForeground(new java.awt.Color(255, 251, 235));
        addresstxt.setBorder(null);
        jPanel1.add(addresstxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 200, 290, 40));

        nidtxt.setEditable(false);
        nidtxt.setBackground(new java.awt.Color(84, 180, 53));
        nidtxt.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        nidtxt.setForeground(new java.awt.Color(255, 251, 235));
        nidtxt.setBorder(null);
        jPanel1.add(nidtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 330, 400, 35));

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(252, 255, 231));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("National Id No :");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 340, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(252, 255, 231));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Name  :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 90, -1, 30));

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(252, 255, 231));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Email :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 130, -1, 40));

        jLabel4.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(252, 255, 231));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Address : ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 200, -1, 30));

        jLabel5.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(252, 255, 231));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Phone No :");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 260, -1, 20));

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

    private void homebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homebtnActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
         Thread th=new Thread(){
                @Override
                public void run(){
                    try{
                           
                            Thread.sleep(200);
                            home fr = new home();
                            fr.setVisible(true);
                        }catch(Exception e){
                        e.printStackTrace();
                    }}
                
            };th.start();
    }//GEN-LAST:event_homebtnActionPerformed

    private void eprofilebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eprofilebtnActionPerformed
        // TODO add your handling code here:
         initialize();
         this.setVisible(false);
       Thread th=new Thread(){
                @Override
                public void run(){
                    try{
                           
                            Thread.sleep(200);
                            editprofile fr = new editprofile();
                            fr.setVisible(true);
                        }catch(Exception e){
                        e.printStackTrace();
                    }}
                
            };th.start();
    }//GEN-LAST:event_eprofilebtnActionPerformed

    private void profilebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profilebtnActionPerformed
        // TODO add your handling code here:
         initialize();
        this.setVisible(false);
       
         Thread th=new Thread(){
                @Override
                public void run(){
                    try{
                           
                            Thread.sleep(200);
                            profile fr = new profile();
                            fr.setVisible(true);
                        }catch(Exception e){
                        e.printStackTrace();
                    }}
                
            };th.start();
    }//GEN-LAST:event_profilebtnActionPerformed

    private void searchbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchbtnActionPerformed
        // TODO add your handling code here:
         initialize();
         this.setVisible(false);
         new clientsearch().setVisible(true);
    }//GEN-LAST:event_searchbtnActionPerformed

    private void phbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phbtnActionPerformed
        // TODO add your handling code here:
        // initialize();
         this.setVisible(false);
         new clientpurchase().setVisible(true);
    }//GEN-LAST:event_phbtnActionPerformed
       
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
            java.util.logging.Logger.getLogger(profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new profile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addresstxt;
    private javax.swing.JLabel close;
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
    private rojerusan.RSMaterialButtonRectangle phbtn;
    private javax.swing.JTextField phonenotxt;
    private rojerusan.RSMaterialButtonRectangle profilebtn;
    private javax.swing.JLabel profilepic;
    private rojerusan.RSMaterialButtonRectangle searchbtn;
    private javax.swing.JPanel slidingpanel;
    // End of variables declaration//GEN-END:variables
}
