/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package rez.iems.frames;

import java.awt.Desktop;
import java.awt.Image;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import rez.iems.connectionprovider.getcon;

/**
 *
 * @author ahmed
 */
public class vendorhome extends javax.swing.JFrame {

    /**
     * Creates new form home
     */
    public int w;
    public int c1,c2,c3;
 
    public vendorhome() {
        initComponents();
        slidingpane.setVisible(false);
        w=0;
         try {
             
            String query = "select * from vendor order by response desc ";
            PreparedStatement  psmt=getcon.getConnection().prepareStatement(query);
           ResultSet rs=psmt.executeQuery(query);
       
            int i=0;
            while(rs.next() && i<3){
                String b = rs.getString("name");
                String g = rs.getString("profilepic");
                String h = rs.getString("contactno");
                ImageIcon icon = new ImageIcon(g);
                Image image =icon.getImage(); // transform it 
                Image newimg = image.getScaledInstance(100, 100,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
                icon = new ImageIcon(newimg);
                if(i==0)
                {
                   pic1.setIcon(icon);
                   name1.setText(b);
                   cnt1.setText(h);
                   c1=rs.getInt("code");
                  
                }
                else if( i==1)
                {
                   pic2.setIcon(icon);
                   name2.setText(b);
                   cnt2.setText(h);
                    c2=rs.getInt("code");
                }
                else 
                {
                    pic3.setIcon(icon);
                   name3.setText(b);
                   cnt3.setText(h);
                   c3=rs.getInt("code");
                }
                i++;
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(home.class.getName()).log(Level.SEVERE, null, ex);
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

        jPanel3 = new javax.swing.JPanel();
        headerpanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        close = new javax.swing.JLabel();
        bodypanel = new javax.swing.JPanel();
        slidingpane = new javax.swing.JPanel();
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
        goto1btn = new rojerusan.RSMaterialButtonRectangle();
        goto1btn2 = new rojerusan.RSMaterialButtonRectangle();
        goto1btn1 = new rojerusan.RSMaterialButtonRectangle();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        cnt3 = new app.bolivia.swing.JCTextField();
        jLabel22 = new javax.swing.JLabel();
        pic1 = new javax.swing.JLabel();
        name1 = new app.bolivia.swing.JCTextField();
        cnt1 = new app.bolivia.swing.JCTextField();
        jLabel21 = new javax.swing.JLabel();
        pic2 = new javax.swing.JLabel();
        name2 = new app.bolivia.swing.JCTextField();
        cnt2 = new app.bolivia.swing.JCTextField();
        jLabel7 = new javax.swing.JLabel();
        pic3 = new javax.swing.JLabel();
        name3 = new app.bolivia.swing.JCTextField();
        footerpanel = new javax.swing.JPanel();
        footer = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Home");
        setMinimumSize(new java.awt.Dimension(1080, 720));
        setName("home"); // NOI18N
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(1080, 720));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        headerpanel.setBackground(new java.awt.Color(0, 51, 51));
        headerpanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Forte", 2, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Integrated Event Management System");
        headerpanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 420, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rez/iems/figures/iconlogo.png"))); // NOI18N
        headerpanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 90, 80));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rez/iems/figures/icons8-gmail-30.png"))); // NOI18N
        jLabel3.setFocusable(false);
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        headerpanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 30, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rez/iems/figures/icons8-facebook-30.png"))); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        headerpanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 20, 30, 50));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rez/iems/figures/icons8-github-35.png"))); // NOI18N
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        headerpanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 30, -1, 30));

        jLabel6.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Get us on");
        headerpanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 40, -1, -1));

        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rez/iems/figures/icons8-cancel-25.png"))); // NOI18N
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                closeMousePressed(evt);
            }
        });
        headerpanel.add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 10, -1, -1));

        getContentPane().add(headerpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 90));

        bodypanel.setBackground(new java.awt.Color(84, 180, 53));
        bodypanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        slidingpane.setBackground(new java.awt.Color(255, 204, 102));
        slidingpane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rez/iems/figures/icons8-multiply-30.png"))); // NOI18N
        jLabel9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        slidingpane.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rez/iems/figures/icons8-edit-profile-30.png"))); // NOI18N
        jLabel11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        slidingpane.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 254, -1, 40));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rez/iems/figures/icons8-hut-30.png"))); // NOI18N
        jLabel12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        slidingpane.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 150, -1, 40));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rez/iems/figures/icons8-find-user-male-30.png"))); // NOI18N
        jLabel13.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        slidingpane.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 304, -1, 40));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rez/iems/figures/icons8-order-history-30.png"))); // NOI18N
        jLabel14.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        slidingpane.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 352, 40, 50));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rez/iems/figures/icons8-user-menu-male-30.png"))); // NOI18N
        jLabel15.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        slidingpane.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 202, -1, 40));

        phbtn.setBackground(new java.awt.Color(84, 180, 53));
        phbtn.setForeground(new java.awt.Color(255, 251, 235));
        phbtn.setText("Dashboard");
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
        slidingpane.add(phbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(-5, 348, 280, 60));

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
        slidingpane.add(homebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(-5, 140, 280, 60));

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
        slidingpane.add(profilebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(-5, 192, 280, 60));

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
        slidingpane.add(eprofilebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(-5, 244, 280, 60));

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
        slidingpane.add(searchbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(-5, 296, 280, 60));

        logoutbtn.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        logoutbtn.setForeground(new java.awt.Color(51, 51, 51));
        logoutbtn.setText("LOGOUT");
        logoutbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutbtnMouseClicked(evt);
            }
        });
        slidingpane.add(logoutbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 560, -1, 30));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rez/iems/figures/icons8-logout-30.png"))); // NOI18N
        slidingpane.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 560, -1, -1));

        bodypanel.add(slidingpane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, 600));

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rez/iems/figures/icons8-menu-30.png"))); // NOI18N
        jLabel8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        bodypanel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 50, 30));

        goto1btn.setBackground(new java.awt.Color(204, 255, 153));
        goto1btn.setForeground(new java.awt.Color(51, 51, 51));
        goto1btn.setText("Goto Profile");
        goto1btn.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 8)); // NOI18N
        goto1btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goto1btnActionPerformed(evt);
            }
        });
        bodypanel.add(goto1btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 260, 90, 40));

        goto1btn2.setBackground(new java.awt.Color(204, 255, 153));
        goto1btn2.setForeground(new java.awt.Color(51, 51, 51));
        goto1btn2.setText("Goto Profile");
        goto1btn2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 8)); // NOI18N
        goto1btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goto1btn2ActionPerformed(evt);
            }
        });
        bodypanel.add(goto1btn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 260, 90, 40));

        goto1btn1.setBackground(new java.awt.Color(204, 255, 153));
        goto1btn1.setForeground(new java.awt.Color(51, 51, 51));
        goto1btn1.setText("Goto Profile");
        goto1btn1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 8)); // NOI18N
        goto1btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goto1btn1ActionPerformed(evt);
            }
        });
        bodypanel.add(goto1btn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 260, 90, 40));

        jLabel16.setBackground(new java.awt.Color(51, 51, 51));
        jLabel16.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(51, 51, 51));
        jLabel16.setText("Engage others to serve with you...");
        bodypanel.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 80, -1, -1));

        jLabel17.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 36)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 251, 235));
        jLabel17.setText("Lead powerful services with");
        bodypanel.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, -1, -1));

        jLabel18.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 251, 235));
        jLabel18.setText("Services can help you schedule volunteers,create worship and equip your team ");
        bodypanel.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 60, -1, -1));

        jLabel19.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 251, 235));
        jLabel19.setText("Our Top 3 Event Management Companies!!");
        bodypanel.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 170, -1, 40));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rez/iems/figures/icons8-rhombus-loader.gif"))); // NOI18N
        jLabel20.setToolTipText("");
        bodypanel.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 180, -1, -1));

        cnt3.setBackground(new java.awt.Color(84, 180, 53));
        cnt3.setBorder(null);
        cnt3.setForeground(new java.awt.Color(51, 51, 51));
        cnt3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        bodypanel.add(cnt3, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 430, -1, -1));

        jLabel22.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(255, 255, 255)));
        bodypanel.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 240, 250, 240));

        pic1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        bodypanel.add(pic1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 260, 100, 100));

        name1.setBackground(new java.awt.Color(84, 180, 53));
        name1.setBorder(null);
        name1.setForeground(new java.awt.Color(51, 51, 51));
        name1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        bodypanel.add(name1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 380, -1, -1));

        cnt1.setBackground(new java.awt.Color(84, 180, 53));
        cnt1.setBorder(null);
        cnt1.setForeground(new java.awt.Color(51, 51, 51));
        cnt1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        bodypanel.add(cnt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 430, -1, -1));

        jLabel21.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(255, 255, 255)));
        bodypanel.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 240, 250, 240));

        pic2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        bodypanel.add(pic2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 260, 100, 100));

        name2.setBackground(new java.awt.Color(84, 180, 53));
        name2.setBorder(null);
        name2.setForeground(new java.awt.Color(51, 51, 51));
        name2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        bodypanel.add(name2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 380, -1, -1));

        cnt2.setBackground(new java.awt.Color(84, 180, 53));
        cnt2.setBorder(null);
        cnt2.setForeground(new java.awt.Color(51, 51, 51));
        cnt2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        bodypanel.add(cnt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 430, -1, -1));

        jLabel7.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(255, 255, 255)));
        bodypanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 240, 250, 240));

        pic3.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        bodypanel.add(pic3, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 260, 100, 100));

        name3.setBackground(new java.awt.Color(84, 180, 53));
        name3.setBorder(null);
        name3.setForeground(new java.awt.Color(51, 51, 51));
        name3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        bodypanel.add(name3, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 380, -1, -1));

        getContentPane().add(bodypanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 1080, 600));

        footerpanel.setBackground(new java.awt.Color(0, 51, 51));
        footerpanel.setForeground(new java.awt.Color(51, 51, 51));

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

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        // TODO add your handling code here:
        if(w==0)
        {
            slidingpane.show();
            slidingpane.setSize(w,600);
           Thread th=new Thread(){
                @Override
                public void run(){
                    try{
                        for(int i=0;i<=270;i++){
                            Thread.sleep(0,5);
                            slidingpane.setSize(i,600);
                        }
                    }catch(Exception e){
                        e.printStackTrace();
                    }
                }
            };th.start();
            w=270;
        }
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        // TODO add your handling code here:
        if(w==270)
        {
            slidingpane.setSize(270,600);
            Thread th=new Thread(){
                @Override
                public void run(){
                    try{
                        for(int i=270;i>=0;i--){
                            Thread.sleep(0,5);
                            slidingpane.setSize(i,600);
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

    private void profilebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profilebtnActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
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

    private void homebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homebtnActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
       
         Thread th=new Thread(){
                @Override
                public void run(){
                    try{
                           
                            Thread.sleep(200);
                            vendorhome fr = new vendorhome();
                            fr.setVisible(true);
                        }catch(Exception e){
                        e.printStackTrace();
                    }}
                
            };th.start();
    }//GEN-LAST:event_homebtnActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
         try {
         
        Desktop.getDesktop().browse(new URI("https://mail.google.com/mail/u/0/?ogbl#inbox?compose=CllgCJqVPBCXKmDQPrXGZgWfWkqBVQHMbMMNdMZxPTmzmvhHJxvkfMkxmCqmtqbmnVhRsHzbGQq"));
         
    } catch (IOException | URISyntaxException e1) {
        e1.printStackTrace();
    }
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
             try {
         
        Desktop.getDesktop().browse(new URI("https://www.github.com/REZ-OAN"));
         
    } catch (IOException | URISyntaxException e1) {
        e1.printStackTrace();
    }
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
           try {
         
        Desktop.getDesktop().browse(new URI("https://www.facebook.com/ahmedabir02"));
         
    } catch (IOException | URISyntaxException e1) {
        e1.printStackTrace();
    }
    }//GEN-LAST:event_jLabel4MouseClicked

    private void searchbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchbtnActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new vendorsearch().setVisible(true);
    }//GEN-LAST:event_searchbtnActionPerformed

    private void phbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phbtnActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new dashboard().setVisible(true);
    }//GEN-LAST:event_phbtnActionPerformed

    private void goto1btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goto1btnActionPerformed
        // TODO add your handling code here:
         pfven fr = new pfven(c1);
              fr.setVisible(true);
    }//GEN-LAST:event_goto1btnActionPerformed

    private void goto1btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goto1btn1ActionPerformed
        // TODO add your handling code here:
        pfven fr = new pfven(c2);
              fr.setVisible(true);
    }//GEN-LAST:event_goto1btn1ActionPerformed

    private void goto1btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goto1btn2ActionPerformed
        // TODO add your handling code here:
        pfven fr = new pfven(c3);
              fr.setVisible(true);
    }//GEN-LAST:event_goto1btn2ActionPerformed

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
            java.util.logging.Logger.getLogger(vendorhome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vendorhome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vendorhome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vendorhome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vendorhome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bodypanel;
    private javax.swing.JLabel close;
    private app.bolivia.swing.JCTextField cnt1;
    private app.bolivia.swing.JCTextField cnt2;
    private app.bolivia.swing.JCTextField cnt3;
    private rojerusan.RSMaterialButtonRectangle eprofilebtn;
    private javax.swing.JLabel footer;
    private javax.swing.JPanel footerpanel;
    private rojerusan.RSMaterialButtonRectangle goto1btn;
    private rojerusan.RSMaterialButtonRectangle goto1btn1;
    private rojerusan.RSMaterialButtonRectangle goto1btn2;
    private javax.swing.JPanel headerpanel;
    private rojerusan.RSMaterialButtonRectangle homebtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel logoutbtn;
    private app.bolivia.swing.JCTextField name1;
    private app.bolivia.swing.JCTextField name2;
    private app.bolivia.swing.JCTextField name3;
    private rojerusan.RSMaterialButtonRectangle phbtn;
    private javax.swing.JLabel pic1;
    private javax.swing.JLabel pic2;
    private javax.swing.JLabel pic3;
    private rojerusan.RSMaterialButtonRectangle profilebtn;
    private rojerusan.RSMaterialButtonRectangle searchbtn;
    private javax.swing.JPanel slidingpane;
    // End of variables declaration//GEN-END:variables
}
