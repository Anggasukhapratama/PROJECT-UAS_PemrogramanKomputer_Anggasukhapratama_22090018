/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package main;
import Connection.KoneksiDatabase;
import java.sql.*;
import javax.swinx.*;
import controller.KoneksiDatabase;
import javax.swing.JOptionPane;
/**
 *
 * @author ASUS
 */
public class loginform extends javax.swing.JFrame {
    Connection conn = KoneksiDatabase.getKoneksi();
    ResultSet rs = null;
    PreparedStatement pat = null;
    
int xx, xy;
   
     
    public loginform() {
        initComponents();
    }
     void bersih() {
        t_username.setText("USSERNAME");
        t_pasword.setText("PASSWORD");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Exit = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        t_pasword = new javax.swing.JPasswordField();
        btn_login = new javax.swing.JButton();
        t_username = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_exit.png"))); // NOI18N
        Exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExitMouseClicked(evt);
            }
        });
        getContentPane().add(Exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 10, 30, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_bacround.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 60, -1, -1));

        t_pasword.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        t_pasword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t_pasword.setText("PASSWORD");
        t_pasword.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255), 2));
        t_pasword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                t_paswordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                t_paswordFocusLost(evt);
            }
        });
        t_pasword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_paswordActionPerformed(evt);
            }
        });
        getContentPane().add(t_pasword, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 220, 40));

        btn_login.setBackground(new java.awt.Color(0, 0, 255));
        btn_login.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        btn_login.setForeground(new java.awt.Color(255, 255, 255));
        btn_login.setText("LOGIN");
        btn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginActionPerformed(evt);
            }
        });
        getContentPane().add(btn_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 220, 40));

        t_username.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        t_username.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t_username.setText("USSERNAME");
        t_username.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255), 2));
        t_username.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                t_usernameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                t_usernameFocusLost(evt);
            }
        });
        t_username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_usernameActionPerformed(evt);
            }
        });
        getContentPane().add(t_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 220, 40));

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 255));
        jLabel5.setText("JAYA MAKMUR");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 270, -1));

        jLabel4.setFont(new java.awt.Font("Arial Unicode MS", 1, 18)); // NOI18N
        jLabel4.setText("PETSHOP");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_maskot.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 204), 3));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 587, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 324, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 330));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
       xx = evt.getX();
       xy = evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y -xy);
    }//GEN-LAST:event_formMouseDragged

    private void t_paswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_paswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_paswordActionPerformed

    private void ExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitMouseClicked
       dispose();
    }//GEN-LAST:event_ExitMouseClicked

    private void btn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginActionPerformed
        // TODO add your handling code here:
        String sql = "select * from login where Ussername=? and Password=?";
        try {
            pat = conn.prepareStatement(sql);
            pat.setString(1, t_username.getText());
            pat.setString(2, String.valueOf(t_pasword.getPassword()));
            rs=pat.executeQuery();
            if(rs.next()){
            JOptionPane.showMessageDialog(null, "Koneksi Berhasil");
            menu_utama menuUtama = new menu_utama();
            menuUtama.setVisible(true);
            this.setVisible(false); // Menyembunyikan jendela login setelah berhasil login
            }else
                JOptionPane.showMessageDialog(null, "Gagal Terkoneksi");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
    }//GEN-LAST:event_btn_loginActionPerformed

    private void t_usernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_t_usernameFocusGained
        // TODO add your handling code here:
         String username = t_username.getText();
        if (username.equals("USSERNAME")) {
            t_username.setText("");
        }
    }//GEN-LAST:event_t_usernameFocusGained

    private void t_usernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_t_usernameFocusLost
        // TODO add your handling code here:
        String username = t_username.getText();
        if (username.equals("") || username.equals("USSERNAME")) {
            t_username.setText("USSERNAME");
        }
    }//GEN-LAST:event_t_usernameFocusLost

    private void t_paswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_t_paswordFocusGained
        // TODO add your handling code here:
        String pass = t_pasword.getText();
        if (pass.equals("PASSWORD")) {
            t_pasword.setText("");
        }
    }//GEN-LAST:event_t_paswordFocusGained

    private void t_paswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_t_paswordFocusLost
        // TODO add your handling code here:
         String pass = t_pasword.getText();
        if (pass.equals("") || pass.equals("PASSWORD")) {
            t_pasword.setText("PASSWORD");
        }
    }//GEN-LAST:event_t_paswordFocusLost

    private void t_usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_usernameActionPerformed

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
            java.util.logging.Logger.getLogger(loginform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loginform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loginform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loginform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loginform().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Exit;
    private javax.swing.JButton btn_login;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField t_pasword;
    private javax.swing.JTextField t_username;
    // End of variables declaration//GEN-END:variables
}
