/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package quizapp;
import java.sql.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author sathe
 */
public class DeleteQuestion extends javax.swing.JFrame {

    /**
     * Creates new form AddNewQuestion
     */
    public DeleteQuestion() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        deleteButton = new javax.swing.JButton();
        ClearButton = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setLocation(new java.awt.Point(150, 183));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete Question.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 23, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 40)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 51, 204));
        jLabel2.setText("Delete Question");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 28, -1, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Close.png"))); // NOI18N
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(953, 13, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 109, 1066, 10));

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Question ID:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 115, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Question:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 1, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Option 2:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI Black", 1, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Option 1:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI Black", 1, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Option 3:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI Black", 1, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Option 4:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 360, -1, -1));

        jTextField1.setBackground(new java.awt.Color(189, 245, 246));
        jTextField1.setFont(new java.awt.Font("Segoe UI Black", 1, 20)); // NOI18N
        jTextField1.setPreferredSize(new java.awt.Dimension(700, 40));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 155, -1, -1));

        jTextField2.setBackground(new java.awt.Color(189, 245, 246));
        jTextField2.setFont(new java.awt.Font("Segoe UI Black", 1, 20)); // NOI18N
        jTextField2.setPreferredSize(new java.awt.Dimension(700, 40));
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 205, -1, -1));

        jTextField3.setBackground(new java.awt.Color(189, 245, 246));
        jTextField3.setFont(new java.awt.Font("Segoe UI Black", 1, 20)); // NOI18N
        jTextField3.setPreferredSize(new java.awt.Dimension(700, 40));
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 255, -1, -1));

        jTextField4.setBackground(new java.awt.Color(189, 245, 246));
        jTextField4.setFont(new java.awt.Font("Segoe UI Black", 1, 20)); // NOI18N
        jTextField4.setPreferredSize(new java.awt.Dimension(700, 40));
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 305, -1, -1));

        jTextField5.setBackground(new java.awt.Color(189, 245, 246));
        jTextField5.setFont(new java.awt.Font("Segoe UI Black", 1, 20)); // NOI18N
        jTextField5.setPreferredSize(new java.awt.Dimension(700, 40));
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 355, -1, -1));

        deleteButton.setFont(new java.awt.Font("Segoe UI Black", 1, 20)); // NOI18N
        deleteButton.setForeground(new java.awt.Color(0, 102, 102));
        deleteButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete.png"))); // NOI18N
        deleteButton.setText("Delete");
        deleteButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });
        getContentPane().add(deleteButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 456, -1, -1));

        ClearButton.setFont(new java.awt.Font("Segoe UI Black", 1, 20)); // NOI18N
        ClearButton.setForeground(new java.awt.Color(0, 102, 102));
        ClearButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/clear.png"))); // NOI18N
        ClearButton.setText("Clear");
        ClearButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ClearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearButtonActionPerformed(evt);
            }
        });
        getContentPane().add(ClearButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(402, 456, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI Black", 1, 20)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Answer:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 410, -1, -1));

        jTextField6.setBackground(new java.awt.Color(189, 245, 246));
        jTextField6.setFont(new java.awt.Font("Segoe UI Black", 1, 20)); // NOI18N
        jTextField6.setPreferredSize(new java.awt.Dimension(700, 40));
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 405, -1, -1));

        jTextField7.setBackground(new java.awt.Color(189, 245, 246));
        jTextField7.setFont(new java.awt.Font("Segoe UI Black", 1, 16)); // NOI18N
        jTextField7.setPreferredSize(new java.awt.Dimension(100, 30));
        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 115, -1, -1));

        searchButton.setFont(new java.awt.Font("Segoe UI Black", 1, 20)); // NOI18N
        searchButton.setForeground(new java.awt.Color(0, 102, 102));
        searchButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search.png"))); // NOI18N
        searchButton.setText("Search");
        searchButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        searchButton.setPreferredSize(new java.awt.Dimension(133, 30));
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });
        getContentPane().add(searchButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 115, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Midnight City.jpg"))); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        // TODO add your handling code here:
        String id  = jTextField7.getText();
        
        if(!"".equals(id)){
            try {
                Connection con = Conn.getCon();
                PreparedStatement ps= con.prepareStatement("delete from question where id=?", ResultSet.TYPE_FORWARD_ONLY,ResultSet.CONCUR_UPDATABLE);             
                ps.setString(1, id);
                ps.executeUpdate();
                JFrame jf = new JFrame();
                jf.setAlwaysOnTop(true);
                JOptionPane.showMessageDialog(jf, "Successfully Deleted");
                dispose();
                new DeleteQuestion().setVisible(true); 
            } catch (Exception e) {
                JFrame jf = new JFrame();
                jf.setAlwaysOnTop(true);
                JOptionPane.showMessageDialog(jf, e);
            }
        }else{
              JFrame jf = new JFrame();
              jf.setAlwaysOnTop(true);
              JOptionPane.showMessageDialog(jf, "Question id required");
        }  
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void ClearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearButtonActionPerformed
        // TODO add your handling code here:
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
        jTextField6.setText("");
        jTextField7.setText("");
        jTextField7.setEditable(true);
    }//GEN-LAST:event_ClearButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        TeacherHome.open=0;
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        // TODO add your handling code here:
        String id  = jTextField7.getText();
        
        try {
             Connection con = Conn.getCon();
//             Statement st = con.createStatement();
              PreparedStatement pstat=con.prepareStatement("select * from question where id = '"+id+"'", ResultSet.TYPE_FORWARD_ONLY,ResultSet.CONCUR_UPDATABLE);
             ResultSet rs = pstat.executeQuery();
             if(rs.next()){
                 jTextField1.setText(rs.getString(2));
                 jTextField2.setText(rs.getString(3));
                 jTextField3.setText(rs.getString(4));
                 jTextField4.setText(rs.getString(5));
                 jTextField5.setText(rs.getString(6));
                 jTextField6.setText(rs.getString(7));
                 jTextField7.setEditable(false);
             }else{
                  JFrame jf = new JFrame();
                  jf.setAlwaysOnTop(true);
                  JOptionPane.showMessageDialog(jf, "Question id does not exist");
             }
        } catch (Exception e) {
             JFrame jf = new JFrame();
             jf.setAlwaysOnTop(true);
             JOptionPane.showMessageDialog(jf, e);
        }
    }//GEN-LAST:event_searchButtonActionPerformed

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
            java.util.logging.Logger.getLogger(DeleteQuestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DeleteQuestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DeleteQuestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DeleteQuestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DeleteQuestion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ClearButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JButton searchButton;
    // End of variables declaration//GEN-END:variables
}
