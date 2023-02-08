/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package rez.iems.frames;


import java.awt.Color;
import java.io.File;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import rez.iems.info.customerentities;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import rez.iems.connectionprovider.getcon;
import rez.iems.info.customerinfo;

/**
 *
 * @author ahmed
 */
public class vendorsearch extends javax.swing.JFrame {

    /**
     * Creates new form profile
     */
    public int w;
   static customerentities cus = login.getcus();
   public static Connection connect = new getcon().getConnection();
    public vendorsearch() {
        initComponents();
         slidingpanel.setVisible(false);
        
         w=0;
        try {
            
            String query="select distinct(vendor.name) from vendor inner join event where vendor.code = event.code";
            PreparedStatement psmt = connect.prepareStatement(query);
            ResultSet rs = psmt.executeQuery(query);
           
            while(rs.next()){
                String name = rs.getString("name");
                combox.addItem(name);
            }
            query = "select distinct(section) from  event";
             psmt = connect.prepareStatement(query);
              rs = psmt.executeQuery(query);
            while(rs.next()){
                String name = rs.getString("section");
                combox1.addItem(name);
            } 
         
        } catch (SQLException ex) {
            Logger.getLogger(vendorsearch.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        jLabel6 = new javax.swing.JLabel();
        combox = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        combox1 = new javax.swing.JComboBox<>();
        scbtn = new rojerusan.RSMaterialButtonRectangle();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new rojeru_san.complementos.RSTableMetro();
        view = new rojerusan.RSMaterialButtonRectangle();
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
        phbtn.setText("DASH BOARD");
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

        jLabel6.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Search By Event Type ");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 100, 230, 40));

        jPanel1.add(combox, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 50, 210, 30));

        jLabel7.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Search By Company Name");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 40, 270, 40));

        jPanel1.add(combox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 110, 210, 30));

        scbtn.setBackground(new java.awt.Color(255, 255, 153));
        scbtn.setForeground(new java.awt.Color(51, 51, 51));
        scbtn.setText("SEARCH");
        scbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scbtnActionPerformed(evt);
            }
        });
        jPanel1.add(scbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 150, 170, 40));

        table.setAutoCreateRowSorter(true);
        table.setBackground(new java.awt.Color(255, 255, 153));
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Event ID", "BIN", "Event Name", "Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.setColorBackgoundHead(new java.awt.Color(255, 153, 51));
        table.setColorBordeFilas(new java.awt.Color(255, 255, 255));
        table.setColorBordeHead(new java.awt.Color(255, 255, 255));
        table.setColorFilasBackgound2(new java.awt.Color(255, 255, 255));
        table.setColorSelBackgound(new java.awt.Color(153, 255, 153));
        table.setColorSelForeground(new java.awt.Color(51, 51, 51));
        table.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        table.setFuenteFilas(new java.awt.Font("Arial", 1, 14)); // NOI18N
        table.setRowHeight(40);
        table.setSelectionBackground(new java.awt.Color(204, 255, 153));
        table.setSelectionForeground(new java.awt.Color(51, 51, 51));
        table.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(table);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 230, 760, 260));

        view.setBackground(new java.awt.Color(255, 255, 102));
        view.setForeground(new java.awt.Color(51, 51, 51));
        view.setText("View Profile");
        view.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewActionPerformed(evt);
            }
        });
        jPanel1.add(view, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 500, 120, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 690));

        footerpanel.setBackground(new java.awt.Color(0, 51, 51));

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
     
    private void homebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homebtnActionPerformed
         // TODO add your handling code here:
       //  initialize();
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
       // initialize();
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
        //  initialize();
          this.setVisible(false);
          this.setVisible(true);
        
    }//GEN-LAST:event_searchbtnActionPerformed

    private void eprofilebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eprofilebtnActionPerformed
        // TODO add your handling code here:
       // initialize();
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
       //   initialize();
       this.setVisible(false);
       new dashboard().setVisible(true);
    }//GEN-LAST:event_phbtnActionPerformed
    DefaultTableModel model;
    private void scbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scbtnActionPerformed
        // TODO add your handling code here:
        model = (DefaultTableModel)table.getModel();
            int rows = model.getRowCount();
            for(int i=rows-1;i>=0;i--)
            {
                model.removeRow(i);
            }
        
        String query ="";
       String cname = combox.getSelectedItem().toString();
            String type = combox1.getSelectedItem().toString();
        if(cname.equals("")==false && type.equals("")==false)
        {
          
            query ="select vendor.bin,event.eid,event.name,event.askingprice from vendor inner join event where  vendor.code=event.code and vendor.name='"+cname+"' and event.section ='"+type+"' order by event.askingprice asc";
        }
        else 
        {
              query = null;
              new blankfields().setVisible(true);
        }
        if(query!=null)
        {
           
            try {
            
                PreparedStatement psmt = connect.prepareStatement(query);
                ResultSet rs = psmt.executeQuery(query);
                    boolean kk = false;
                while(rs.next())
                {
                    int eid = rs.getInt("eid");
                    String code = rs.getString("bin");
                    String ename = rs.getString("name");
                    float pay = rs.getFloat("askingprice");
                 
                    
                    Object[] row={eid,code,ename,pay};
                    
                    model = (DefaultTableModel) table.getModel();
                    model.addRow(row);
                    kk=true;
                   
                }
                if(kk == false)
                {
                    new nosuch().setVisible(true);
                }
                   
                }
             catch (SQLException ex) {
                Logger.getLogger(vendorsearch.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        
    }//GEN-LAST:event_scbtnActionPerformed
 
    private void viewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewActionPerformed
        try {
            // TODO add your handling code here:
            model = (DefaultTableModel)table.getModel();
            int row =table.getSelectedRow();
            String bn = model.getValueAt(row, 1).toString();
            String query ="select code from vendor where bin='"+bn+"'";
            PreparedStatement pst = getcon.getConnection().prepareStatement(query);
            ResultSet rs = pst.executeQuery(query);
            int code=-1;
            while(rs.next())
            {
               code = rs.getInt("code");
            }
           pfven fr = new pfven(code);
              fr.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(vendorsearch.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_viewActionPerformed
    int b=0;
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
            java.util.logging.Logger.getLogger(vendorsearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vendorsearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vendorsearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vendorsearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vendorsearch().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel close;
    private javax.swing.JComboBox<String> combox;
    private javax.swing.JComboBox<String> combox1;
    private rojerusan.RSMaterialButtonRectangle eprofilebtn;
    private javax.swing.JLabel footer;
    private javax.swing.JPanel footerpanel;
    private rojerusan.RSMaterialButtonRectangle homebtn;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel logoutbtn;
    private rojerusan.RSMaterialButtonRectangle phbtn;
    private rojerusan.RSMaterialButtonRectangle profilebtn;
    private rojerusan.RSMaterialButtonRectangle scbtn;
    private rojerusan.RSMaterialButtonRectangle searchbtn;
    private javax.swing.JPanel slidingpanel;
    private rojeru_san.complementos.RSTableMetro table;
    private rojerusan.RSMaterialButtonRectangle view;
    // End of variables declaration//GEN-END:variables
}
