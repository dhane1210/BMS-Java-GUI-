/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ooprep;

import javax.swing.JOptionPane;

/**
 *
 * @author Radhana
 */
public class Manager_Login extends javax.swing.JFrame {


    public Manager_Login() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    public class Manager{
//        Encapsulation
        
        private String un = managertxt.getText();
        private String pw = managerpw.getText();

        public void setun(String un){
            this.un = un;
        }
    
        public String getun(){
            return un;
        }
        
        public void setpw(String pw){
            this.pw = pw;
        }
        
        public String getpw(){
            return pw;  
        }
        
    }
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        managertxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        managerpw = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        mngerrdo = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setBackground(new java.awt.Color(0, 102, 153));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/undo.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 50, 40));

        jLabel1.setFont(new java.awt.Font("Baskerville Old Face", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CITY BOOK SHOP");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 440, -1));

        jTextField1.setBackground(new java.awt.Color(0, 102, 153));
        jTextField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 5));
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 75));

        jLabel2.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Manager Login");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 150, 30));
        jPanel1.add(managertxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 120, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/login (2).png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, -1, 70));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("User Name");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 70, 20));
        jPanel1.add(managerpw, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, 120, -1));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Password");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 60, 20));

        mngerrdo.setForeground(new java.awt.Color(255, 255, 255));
        mngerrdo.setText("Show Password");
        mngerrdo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mngerrdoActionPerformed(evt);
            }
        });
        jPanel1.add(mngerrdo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, -1, -1));

        jButton1.setBackground(new java.awt.Color(0, 153, 204));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("LOGIN");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 332, 100, 30));

        jTextField2.setBackground(new java.awt.Color(0, 102, 153));
        jTextField2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 5));
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 230, 320));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/sara-Skcr6X_aLjU-unsplash_1.jpg"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 480, 320));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        Manager m1 = new Manager();
        
        m1.setun("manager");
        m1.setpw("1234");
        
        
        if(m1.getun().equals("manager") && m1.getpw().equals("1234")){
            JOptionPane.showMessageDialog(null, "Successfull");
            ManagerDashboard m2 = new  ManagerDashboard();
            m2.setVisible(true);
            this.dispose();
        }
        else{
            JOptionPane.showMessageDialog(null,"Wrong User Name or Password");
        }        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void mngerrdoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mngerrdoActionPerformed
        // TODO add your handling code here:
        if (mngerrdo.isSelected()) {
        managerpw.setEchoChar((char) 0);
        } else {
        managerpw.setEchoChar('*');  
        }
    }//GEN-LAST:event_mngerrdoActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        SlelectUser mu = new SlelectUser();
        mu.setVisible(true);
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
            java.util.logging.Logger.getLogger(Manager_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Manager_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Manager_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Manager_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Manager_Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JPasswordField managerpw;
    private javax.swing.JTextField managertxt;
    private javax.swing.JRadioButton mngerrdo;
    // End of variables declaration//GEN-END:variables
}
