/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ooprep;

import Code.DBconnect;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

public class UpdateBook extends javax.swing.JFrame {
    
    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    public UpdateBook() {
        
        initComponents();
        conn = DBconnect.connect();
        TableLoadnew();
    }
    
    public void TableLoadnew() {
        try {
        String sql = "SELECT BookID, Title, Author, Price, Quantity, Catagory FROM books";
        pst = conn.prepareStatement(sql);
        rs = pst.executeQuery();
        tableupdatetbl.setModel(DbUtils.resultSetToTableModel(rs));
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, e);
    }
    
    }
    @SuppressWarnings("unchecked")
    
    public void dataTable(){
        int r1 = tableupdatetbl.getSelectedRow();
        String id = tableupdatetbl.getValueAt(r1, 0).toString();
        String title = tableupdatetbl.getValueAt(r1, 1).toString();
        String author = tableupdatetbl.getValueAt(r1, 2).toString();
        String price = tableupdatetbl.getValueAt(r1, 3).toString();
        String qua = tableupdatetbl.getValueAt(r1, 4).toString();
        String catagory = tableupdatetbl.getValueAt(r1, 5).toString();

        ubookidtxt.setText(id);
        utitletxt.setText(title);
        uauthortxt.setText(author);
        upricetxt.setText(price);
        uquatxt.setText(qua);
        
        ucatcmb.setSelectedItem(catagory);
    }
    
    public void update(){
        String id = ubookidtxt.getText();
        String title = utitletxt.getText();
        String author = uauthortxt.getText();
        String price = upricetxt.getText();
        String qua = uquatxt.getText();
        
        String cat = ucatcmb.getSelectedItem().toString();
        
        if(id.isEmpty()||title.isEmpty()||author.isEmpty()||price.isEmpty()||qua.isEmpty()||cat.isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "please fill all the required fields");
        }else{
            try {
            String sql = "UPDATE books SET Title='"+title+"',Author='"+author+"',Price='"+price+"',Quantity='"+qua+"',Catagory='"+cat+"' WHERE BookID='"+id+"'";
            pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "UPDATED");
           } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Please Enter the numeric values in price and Quantity field");
          }
        } 
    }
    public void clear(){
        ubookidtxt.setText("");
        utitletxt.setText("");
        uauthortxt.setText("");
        upricetxt.setText("");
        uquatxt.setText("");
        ucatcmb.setSelectedIndex(0);
    }
  
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        ubookidtxt = new javax.swing.JTextField();
        utitletxt = new javax.swing.JTextField();
        uauthortxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        upricetxt = new javax.swing.JTextField();
        uquatxt = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        ucatcmb = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        clearbtn = new javax.swing.JButton();
        jTextField4 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableupdatetbl = new javax.swing.JTable();
        jButton6 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton4.setBackground(new java.awt.Color(0, 102, 153));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/undo.png"))); // NOI18N
        jButton4.setBorder(null);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 50, 50));

        jButton5.setBackground(new java.awt.Color(0, 153, 204));
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Update");
        jButton5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, 140, 30));

        jLabel1.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Update Book Details");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 210, 40));

        ubookidtxt.setBackground(new java.awt.Color(0, 102, 153));
        ubookidtxt.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 3, 14)); // NOI18N
        ubookidtxt.setForeground(new java.awt.Color(255, 255, 255));
        ubookidtxt.setBorder(null);
        ubookidtxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ubookidtxtKeyReleased(evt);
            }
        });
        jPanel3.add(ubookidtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 40, 30));

        utitletxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                utitletxtKeyReleased(evt);
            }
        });
        jPanel3.add(utitletxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 110, 30));

        uauthortxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                uauthortxtKeyReleased(evt);
            }
        });
        jPanel3.add(uauthortxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, 110, 30));

        jLabel4.setFont(new java.awt.Font("Baskerville Old Face", 1, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("CITY BOOK SHOP");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 510, 50));

        jTextField3.setBackground(new java.awt.Color(0, 102, 153));
        jTextField3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 5));
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jPanel3.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 662, 90));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Book ID");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 70, 30));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Title");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 70, 30));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Author");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 60, 30));

        upricetxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                upricetxtKeyReleased(evt);
            }
        });
        jPanel3.add(upricetxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, 110, 30));

        uquatxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                uquatxtKeyReleased(evt);
            }
        });
        jPanel3.add(uquatxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, 110, 30));

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Quantity");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 70, 30));

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Catagory");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 60, 30));

        ucatcmb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Fiction", "Non-Fiction", "Mystery/Thriller", "Science and Nature", "Business and Economics", "History", "Art and Photography", "Travel", "Children's Books" }));
        ucatcmb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ucatcmbMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ucatcmbMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                ucatcmbMouseReleased(evt);
            }
        });
        ucatcmb.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                ucatcmbComponentShown(evt);
            }
        });
        ucatcmb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ucatcmbActionPerformed(evt);
            }
        });
        jPanel3.add(ucatcmb, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 330, 110, 30));

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Price");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 40, 30));

        clearbtn.setBackground(new java.awt.Color(0, 153, 204));
        clearbtn.setForeground(new java.awt.Color(255, 255, 255));
        clearbtn.setText("Clear");
        clearbtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        clearbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearbtnActionPerformed(evt);
            }
        });
        jPanel3.add(clearbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, 140, 30));

        jTextField4.setBackground(new java.awt.Color(0, 102, 153));
        jTextField4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 5));
        jPanel3.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 79, 240, 370));

        tableupdatetbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "BookID", "Title", "Author", "Price", "Quantity", "Catagory"
            }
        ));
        tableupdatetbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableupdatetblMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tableupdatetblMouseReleased(evt);
            }
        });
        tableupdatetbl.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tableupdatetblKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tableupdatetbl);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 120, 370, 230));

        jButton6.setBackground(new java.awt.Color(0, 153, 204));
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("EXIT");
        jButton6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 390, 150, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/sara-Skcr6X_aLjU-unsplash_1.jpg"))); // NOI18N
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 40, 430, 410));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void ubookidtxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ubookidtxtKeyReleased


    }//GEN-LAST:event_ubookidtxtKeyReleased

    private void utitletxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_utitletxtKeyReleased

    }//GEN-LAST:event_utitletxtKeyReleased

    private void uauthortxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_uauthortxtKeyReleased
 
    }//GEN-LAST:event_uauthortxtKeyReleased

    private void upricetxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_upricetxtKeyReleased
  
    }//GEN-LAST:event_upricetxtKeyReleased

    private void uquatxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_uquatxtKeyReleased

    }//GEN-LAST:event_uquatxtKeyReleased

    private void ucatcmbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ucatcmbMouseClicked

    }//GEN-LAST:event_ucatcmbMouseClicked

    private void ucatcmbMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ucatcmbMousePressed

    }//GEN-LAST:event_ucatcmbMousePressed

    private void ucatcmbMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ucatcmbMouseReleased

    }//GEN-LAST:event_ucatcmbMouseReleased

    private void ucatcmbComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_ucatcmbComponentShown

    }//GEN-LAST:event_ucatcmbComponentShown

    private void ucatcmbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ucatcmbActionPerformed

    }//GEN-LAST:event_ucatcmbActionPerformed

    private void tableupdatetblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableupdatetblMouseClicked
        dataTable();
    }//GEN-LAST:event_tableupdatetblMouseClicked

    private void tableupdatetblKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tableupdatetblKeyReleased
      
    }//GEN-LAST:event_tableupdatetblKeyReleased

    private void tableupdatetblMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableupdatetblMouseReleased

    }//GEN-LAST:event_tableupdatetblMouseReleased

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        update();
        TableLoadnew();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void clearbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearbtnActionPerformed
        clear();   
    }//GEN-LAST:event_clearbtnActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        ManageBook mb = new ManageBook();
        mb.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(UpdateBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateBook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clearbtn;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTable tableupdatetbl;
    private javax.swing.JTextField uauthortxt;
    private javax.swing.JTextField ubookidtxt;
    private javax.swing.JComboBox<String> ucatcmb;
    private javax.swing.JTextField upricetxt;
    private javax.swing.JTextField uquatxt;
    private javax.swing.JTextField utitletxt;
    // End of variables declaration//GEN-END:variables
}
