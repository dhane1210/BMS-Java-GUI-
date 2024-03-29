/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ooprep;

import Code.DBconnect;
import java.sql.PreparedStatement;
import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import javax.swing.text.html.HTML;
import net.proteanit.sql.DbUtils;


public class SearchBook extends javax.swing.JFrame {

    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    public SearchBook() {
        initComponents();
        conn = DBconnect.connect();
        tableload();
      
    }
    public void tableload(){
        try {
            String sql = "SELECT BookID,Title,Author,Price,Quantity,Catagory FROM books";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            table1.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void tabledata(){
        
        int r = table1.getSelectedRow();
        String id = table1.getValueAt(r,0).toString();
        String title = table1.getValueAt(r, 1).toString();
        String author = table1.getValueAt(r, 2).toString();
        String price = table1.getValueAt(r, 3).toString();
        String qua = table1.getValueAt(r, 4).toString();
        String catagory = table1.getValueAt(r,5).toString();
        
        bookidtxt.setText(id);
        titletxt.setText(title);
        authortxt.setText(author);
        pricetxt.setText(price);
        quatxt.setText(qua);
        catcmb.setSelectedItem(catagory);

    }
//    Polymophism
    private void executeSearch(String columnName, String searchValue) {
        try {
            String sql = "SELECT * FROM books WHERE " + columnName + " LIKE ?";
            pst = conn.prepareStatement(sql);
            pst.setString(1, "%" + searchValue + "%");
            rs = pst.executeQuery();
            table1.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void Titlesrc(){
        String srch = titletxt.getText();
        executeSearch("Title", srch);
    }
    
    public void BookIDsrc(){
        String srch1 = bookidtxt.getText();
        executeSearch("BookID", srch1);
    }
    
    public void AthorSrch(){
        String srch2 = authortxt.getText();
        executeSearch("Author", srch2);
    }

    public void Pricesrch(){
        String srch3 = pricetxt.getText();
        executeSearch("Price", srch3);
    }
    
    public void Quasrch(){
        String srch4 = quatxt.getText();
        executeSearch("Quantity", srch4);
    }
    
    public void cmbsrch() {
        String selectedCategory = (String) catcmb.getSelectedItem();
        executeSearch("Catagory", selectedCategory);
}
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        bookidtxt = new javax.swing.JTextField();
        titletxt = new javax.swing.JTextField();
        authortxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        pricetxt = new javax.swing.JTextField();
        quatxt = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        catcmb = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        table1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Baskerville Old Face", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("CITY BOOK SHOP");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 440, 70));

        jButton2.setBackground(new java.awt.Color(0, 102, 153));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/undo.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 50, 50));

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(0, 102, 153));
        jTextField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 5));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 662, 90));

        jLabel1.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Search Book Details");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 210, 40));

        jButton5.setBackground(new java.awt.Color(0, 153, 204));
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("EXIT");
        jButton5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 380, 150, 30));

        bookidtxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                bookidtxtKeyReleased(evt);
            }
        });
        jPanel1.add(bookidtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, 110, 30));

        titletxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                titletxtKeyReleased(evt);
            }
        });
        jPanel1.add(titletxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 110, 30));

        authortxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                authortxtKeyReleased(evt);
            }
        });
        jPanel1.add(authortxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, 110, 30));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Book ID");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 70, 30));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Title");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 70, 30));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Author");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 60, 30));

        pricetxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                pricetxtKeyReleased(evt);
            }
        });
        jPanel1.add(pricetxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, 110, 30));

        quatxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                quatxtKeyReleased(evt);
            }
        });
        jPanel1.add(quatxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, 110, 30));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Quantity");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 70, 30));

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Catagory");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 60, 30));

        catcmb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Fiction", "Non-Fiction", "Mystery/Thriller", "Science and Nature", "Business and Economics", "History", "Art and Photography", "Travel", "Children's Books" }));
        catcmb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                catcmbMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                catcmbMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                catcmbMouseReleased(evt);
            }
        });
        catcmb.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                catcmbComponentShown(evt);
            }
        });
        catcmb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                catcmbActionPerformed(evt);
            }
        });
        jPanel1.add(catcmb, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 350, 110, 30));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Price");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 40, 30));

        jTextField2.setEditable(false);
        jTextField2.setBackground(new java.awt.Color(0, 102, 153));
        jTextField2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 5));
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 79, 240, 370));

        table1.setModel(new javax.swing.table.DefaultTableModel(
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
                {null, null, null, null, null, null}
            },
            new String [] {
                "BookID", "Title", "Author", "Price", "Quantity", "Catagory"
            }
        ));
        table1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table1MouseClicked(evt);
            }
        });
        table1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                table1KeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(table1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 120, 370, 230));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/sara-Skcr6X_aLjU-unsplash_1.jpg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 480, 360));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void table1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table1MouseClicked
        tabledata();
    }//GEN-LAST:event_table1MouseClicked

    private void table1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_table1KeyReleased
        tabledata();
    }//GEN-LAST:event_table1KeyReleased

    private void bookidtxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bookidtxtKeyReleased

        BookIDsrc();
    }//GEN-LAST:event_bookidtxtKeyReleased

    private void titletxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_titletxtKeyReleased
        Titlesrc();
    }//GEN-LAST:event_titletxtKeyReleased

    private void authortxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_authortxtKeyReleased
        AthorSrch();
    }//GEN-LAST:event_authortxtKeyReleased

    private void pricetxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pricetxtKeyReleased
        Pricesrch();
    }//GEN-LAST:event_pricetxtKeyReleased

    private void quatxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_quatxtKeyReleased
        Quasrch();
    }//GEN-LAST:event_quatxtKeyReleased

    private void catcmbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_catcmbActionPerformed
        cmbsrch();
    }//GEN-LAST:event_catcmbActionPerformed

    private void catcmbMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_catcmbMouseReleased

    }//GEN-LAST:event_catcmbMouseReleased

    private void catcmbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_catcmbMouseClicked
 
    }//GEN-LAST:event_catcmbMouseClicked

    private void catcmbMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_catcmbMousePressed

    }//GEN-LAST:event_catcmbMousePressed

    private void catcmbComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_catcmbComponentShown

    }//GEN-LAST:event_catcmbComponentShown

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        SlelectUser su = new SlelectUser();
        su.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(SearchBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SearchBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SearchBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SearchBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SearchBook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField authortxt;
    private javax.swing.JTextField bookidtxt;
    private javax.swing.JComboBox<String> catcmb;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField pricetxt;
    private javax.swing.JTextField quatxt;
    private javax.swing.JTable table1;
    private javax.swing.JTextField titletxt;
    // End of variables declaration//GEN-END:variables
}
