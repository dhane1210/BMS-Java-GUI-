/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ooprep;

import javax.swing.JOptionPane;


public class Cashier_Login extends javax.swing.JFrame {

    public Cashier_Login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        CashierUN = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        CashierPW = new javax.swing.JPasswordField();
        CasierRdo = new javax.swing.JRadioButton();
        loginbtn = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Cashier Login");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 150, 30));

        jLabel2.setFont(new java.awt.Font("Baskerville Old Face", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("CITY BOOK SHOP");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 440, 60));

        jButton2.setBackground(new java.awt.Color(0, 102, 153));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/undo.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 40, 40));

        jTextField1.setBackground(new java.awt.Color(0, 102, 153));
        jTextField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 5));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 76));
        getContentPane().add(CashierUN, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, 120, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/login (2).png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 70, 70));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Paasword");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 70, 20));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("User Name");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 70, 20));
        getContentPane().add(CashierPW, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, 120, -1));

        CasierRdo.setForeground(new java.awt.Color(255, 255, 255));
        CasierRdo.setText("Show Password");
        CasierRdo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasierRdoActionPerformed(evt);
            }
        });
        getContentPane().add(CasierRdo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, -1, 20));

        loginbtn.setBackground(new java.awt.Color(0, 153, 204));
        loginbtn.setForeground(new java.awt.Color(255, 255, 255));
        loginbtn.setText("LOGIN");
        loginbtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        loginbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginbtnActionPerformed(evt);
            }
        });
        getContentPane().add(loginbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 372, 110, 30));

        jTextField2.setBackground(new java.awt.Color(0, 102, 153));
        jTextField2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 5));
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 230, 360));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/sara-Skcr6X_aLjU-unsplash_1.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, 460, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
       
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void loginbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginbtnActionPerformed
        // TODO add your handling code here:
        String un = CashierUN.getText();
        String pw = CashierPW.getText();
        
        if(un.equals("cashier")&&pw.equals("1234")){
            JOptionPane.showMessageDialog(null, "Successfull");
            CashierDashboard c1 = new  CashierDashboard();
            c1.setVisible(true);
            this.dispose();
        }
        else{
            JOptionPane.showMessageDialog(null,"Wrong User Name or Password");
        }        
    }//GEN-LAST:event_loginbtnActionPerformed

    private void CasierRdoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasierRdoActionPerformed
        // TODO add your handling code here:
        if(CasierRdo.isSelected()){
            CashierPW.setEchoChar((char)0);
        }
        else{
            CashierPW.setEchoChar('*');
        }
    }//GEN-LAST:event_CasierRdoActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        SlelectUser su = new SlelectUser();
        su.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Cashier_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cashier_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cashier_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cashier_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cashier_Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField CashierPW;
    private javax.swing.JTextField CashierUN;
    private javax.swing.JRadioButton CasierRdo;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JButton loginbtn;
    // End of variables declaration//GEN-END:variables
}
