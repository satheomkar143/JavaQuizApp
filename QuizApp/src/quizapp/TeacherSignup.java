/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package quizapp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Random;
import javax.swing.JOptionPane;
import java.util.regex.*;

/**
 *
 * @author sathe
 */
public class TeacherSignup extends javax.swing.JFrame {

    
     int OTP;
    /**
     * Creates new form StudentSignup
     */
    public TeacherSignup() {
        initComponents();
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
        jLabel5 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel18 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jTextField8 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Answer:");
        jLabel5.setToolTipText("");
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 460, 200, 40));

        jLabel14.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("*");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 500, 250, 20));

        jLabel6.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("Email ID :");
        jLabel6.setToolTipText("");
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 200, 40));

        jLabel7.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("Name :");
        jLabel7.setToolTipText("");
        jLabel7.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 200, 40));

        jLabel8.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setText("Mobile Number");
        jLabel8.setToolTipText("");
        jLabel8.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 200, 40));

        jLabel9.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel9.setText("Password:");
        jLabel9.setToolTipText("");
        jLabel9.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, 200, 40));

        jLabel10.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setText("Confirm Password:");
        jLabel10.setToolTipText("");
        jLabel10.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, 200, 40));

        jLabel11.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel11.setText("Security Question:");
        jLabel11.setToolTipText("");
        jLabel11.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 400, 200, 40));

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Create New Account");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 450, 50));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 70, 500, 10));

        jTextField2.setBackground(new java.awt.Color(204, 255, 204));
        jTextField2.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(0, 0, 0));
        jTextField2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField2KeyReleased(evt);
            }
        });
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 465, 250, 30));

        jTextField3.setBackground(new java.awt.Color(204, 255, 204));
        jTextField3.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(0, 0, 0));
        jTextField3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField3KeyReleased(evt);
            }
        });
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 225, 250, 30));

        jTextField4.setBackground(new java.awt.Color(204, 255, 204));
        jTextField4.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(0, 0, 0));
        jTextField4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        jTextField4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField4KeyReleased(evt);
            }
        });
        jPanel1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 105, 250, 30));

        jTextField5.setBackground(new java.awt.Color(204, 255, 204));
        jTextField5.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jTextField5.setForeground(new java.awt.Color(0, 0, 0));
        jTextField5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        jTextField5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField5KeyReleased(evt);
            }
        });
        jPanel1.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 165, 250, 30));

        jTextField6.setBackground(new java.awt.Color(204, 255, 204));
        jTextField6.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jTextField6.setForeground(new java.awt.Color(0, 0, 0));
        jTextField6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        jTextField6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField6KeyReleased(evt);
            }
        });
        jPanel1.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 285, 250, 30));

        jTextField7.setBackground(new java.awt.Color(204, 255, 204));
        jTextField7.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jTextField7.setForeground(new java.awt.Color(0, 0, 0));
        jTextField7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });
        jTextField7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField7KeyReleased(evt);
            }
        });
        jPanel1.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 345, 250, 30));

        jComboBox1.setBackground(new java.awt.Color(204, 255, 204));
        jComboBox1.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Your Nickname", "Best Friend", "Lucky Number", "Favorite superhero" }));
        jComboBox1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 405, 250, 32));

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("*");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 140, 250, 20));

        jLabel4.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("*");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 200, 250, 20));

        jLabel15.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("*");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 260, 250, 20));

        jLabel16.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("*");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 320, 250, 20));

        jLabel17.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("*");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 380, 250, 20));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 630, 500, 10));

        jLabel18.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(102, 255, 255));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel18.setText("Enter OTP:");
        jLabel18.setToolTipText("");
        jLabel18.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 520, 130, 40));

        jButton4.setBackground(new java.awt.Color(0, 153, 153));
        jButton4.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(51, 51, 51));
        jButton4.setText("Send");
        jButton4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 520, 80, 40));

        jButton5.setBackground(new java.awt.Color(0, 153, 153));
        jButton5.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(51, 51, 51));
        jButton5.setText("Create Account");
        jButton5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 580, 170, 40));

        jTextField8.setBackground(new java.awt.Color(204, 255, 204));
        jTextField8.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jTextField8.setForeground(new java.awt.Color(0, 0, 0));
        jTextField8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });
        jTextField8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField8KeyReleased(evt);
            }
        });
        jPanel1.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 520, 250, 30));

        jLabel21.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 0, 0));
        jLabel21.setText("*");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 555, 250, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 60, 650, 650));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Lawrencium.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, 696, 696));

        jButton16.setBackground(new java.awt.Color(255, 255, 255,0));
        jButton16.setForeground(new java.awt.Color(255, 255, 255,0));
        jButton16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Close.png"))); // NOI18N
        jButton16.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton16.setPreferredSize(new java.awt.Dimension(70, 70));
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 10, -1, -1));

        jButton17.setBackground(new java.awt.Color(255, 255, 255,0));
        jButton17.setForeground(new java.awt.Color(255, 255, 255,0));
        jButton17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back student.png"))); // NOI18N
        jButton17.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton17.setPreferredSize(new java.awt.Dimension(70, 70));
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton17, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 10, -1, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logoBlackbig.png"))); // NOI18N
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/welcomeBackground.jpg"))); // NOI18N
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        // TODO add your handling code here:
        int a = JOptionPane.showConfirmDialog(null,"do you really want to exit application?","Exit Application",JOptionPane.YES_NO_OPTION);
        if (a == 0){
            System.exit(0);
            //              new Rules().setVisible(true);
        }
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        // TODO add your handling code here:
          dispose();
        new TeacherLogin().setVisible(true);
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jTextField4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4KeyReleased
        // TODO add your handling code here:
        String PATTERN = "^[a-zA-Z ]{2,20}$";
        Pattern namePattern = Pattern.compile(PATTERN);
        Matcher match = namePattern.matcher(jTextField4.getText().trim());
        
        if(!match.matches()){
            jLabel3.setForeground(new java.awt.Color(255, 0, 0));
            jLabel3.setText("Incorrect Name");
        }else{
             jLabel3.setText("");
        }
    }//GEN-LAST:event_jTextField4KeyReleased

    private void jTextField5KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField5KeyReleased
        // TODO add your handling code here:
        String PATTERN = "^[a-zA-Z0-9]{1,20}[@][a-zA-Z]{2,10}[.][a-zA-Z.]{2,10}$";
        Pattern emailPattern = Pattern.compile(PATTERN);
        Matcher match = emailPattern.matcher(jTextField5.getText().trim());
        
        if(!match.matches()){
             jLabel4.setForeground(new java.awt.Color(255, 0, 0));
            jLabel4.setText("Incorrect email id");
        }else{
             jLabel4.setText("");
        }
    }//GEN-LAST:event_jTextField5KeyReleased

    private void jTextField3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyReleased
        // TODO add your handling code here:
        String PATTERN = "^[6789]{1,1}[0-9]{9,9}$";
        Pattern mobilePattern = Pattern.compile(PATTERN);
        Matcher match = mobilePattern.matcher(jTextField3.getText().trim());
        
        if(!match.matches()){
             jLabel15.setForeground(new java.awt.Color(255, 0, 0));
            jLabel15.setText("Incorrect mobile number");
        }else{
             jLabel15.setText("");
        }
    }//GEN-LAST:event_jTextField3KeyReleased

    private void jTextField6KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField6KeyReleased
        // TODO add your handling code here:
        int length = jTextField6.getText().trim().length();
        
         if(length<8){
              jLabel16.setForeground(new java.awt.Color(255, 0, 0));
            jLabel16.setText("minimum 8 characters required");
        }else{
             jLabel16.setText("");
        }
    }//GEN-LAST:event_jTextField6KeyReleased

    private void jTextField7KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField7KeyReleased
        // TODO add your handling code here:
        String Password  = jTextField6.getText().trim();
        String PasswordConf = jTextField7.getText().trim();
        
        if(Password.equals(PasswordConf)){
            jLabel17.setText("");
        }else{
             jLabel17.setForeground(new java.awt.Color(255, 0, 0));
            jLabel17.setText("Password must be same");
        }
    }//GEN-LAST:event_jTextField7KeyReleased

    private void jTextField2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyReleased
        // TODO add your handling code here:
         String answer = jTextField2.getText().trim();
        if(answer.length()>0){
            jLabel14.setText("");
        }else{
             jLabel14.setForeground(new java.awt.Color(255, 0, 0));
            jLabel14.setText("Answer required");
        }
    }//GEN-LAST:event_jTextField2KeyReleased

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
         try {
			// Construct data
			
                        
                        Random rand = new Random();
                        OTP = rand.nextInt(99999);
                        String name = jTextField4.getText().trim();
                   
			
                        JOptionPane.showMessageDialog(null, "Hi "+name+". Your OTP "+OTP);
		} catch (Exception e) {
//		
                        JOptionPane.showMessageDialog(null, e);
		}
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        
         
        String nameErr = jLabel3.getText();
        String emailErr = jLabel4.getText();
        String mobileErr = jLabel15.getText();
        String passErr = jLabel16.getText();
        String confPassErr = jLabel17.getText();
        String answerErr = jLabel14.getText();
        String OTPErr = jLabel21.getText();
        
        if( "".equals(nameErr) && "".equals(emailErr) && "".equals(mobileErr) && "".equals(passErr) && "".equals(confPassErr) && "".equals(answerErr) && "Account Varified".equals(OTPErr)){
           
            
            String userName = jTextField4.getText();
            String email = jTextField5.getText();
            String mobile = jTextField3.getText();
            String password = jTextField6.getText();
            String security = jComboBox1.getSelectedItem().toString();
            String answer = jTextField2.getText();
            
            
            try {
                Connection con = Conn.getCon();
                PreparedStatement ps= con.prepareStatement("insert into teacherInfo values(?,?,?,?,?,?)");
                 ps.setString(1, userName);
                ps.setString(2, email);
                ps.setString(3, mobile);
                ps.setString(4, password);
                ps.setString(5, security);
                ps.setString(6, answer);
                ps.executeUpdate();
                
                JOptionPane.showMessageDialog(null, "signup Successfull.");
                dispose();
                new TeacherLogin(jTextField5.getText()).setVisible(true);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            } 
         
        }else{
            if(nameErr != ""){
                JOptionPane.showMessageDialog(null, "Enter correct name");
            }else if(emailErr != ""){
                JOptionPane.showMessageDialog(null, "Enter correct Email Id");
            }else if(mobileErr != ""){
                JOptionPane.showMessageDialog(null, "Enter correct mobile number");
            }else if(passErr != ""){
                JOptionPane.showMessageDialog(null, "minimum 8 characters required in password");
            }else if(confPassErr != ""){
                JOptionPane.showMessageDialog(null, "password must be same");
            }else if(answerErr != ""){
                JOptionPane.showMessageDialog(null, "Please fill security answer");
            }else if(OTPErr != "Account Varified"){
                JOptionPane.showMessageDialog(null, "Enter correct OTP");
            }
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8ActionPerformed

    private void jTextField8KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField8KeyReleased
        // TODO add your handling code here:
         if(OTP == Integer.parseInt(jTextField8.getText())){
            jLabel21.setForeground(new java.awt.Color(0, 255, 0));
            jLabel21.setText("Account Varified");
        }else{
            jLabel21.setForeground(new java.awt.Color(255, 0, 0));
            jLabel21.setText("Incorrect OTP");
        }
    }//GEN-LAST:event_jTextField8KeyReleased

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
            java.util.logging.Logger.getLogger(TeacherSignup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TeacherSignup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TeacherSignup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TeacherSignup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TeacherSignup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox<String> jComboBox1;
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    // End of variables declaration//GEN-END:variables
}
