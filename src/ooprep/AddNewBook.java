
package ooprep;

import Code.DBconnect;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;




public class AddNewBook extends javax.swing.JFrame {
    
    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    public AddNewBook() {
        initComponents();
        conn = DBconnect.connect();
        tableload1();
    }

    public void tableload1(){
        try {
            
            String sql = "SELECT BookID,Title,Author,Price,Quantity FROM books";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            table2.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
   

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        Exitbtn = new javax.swing.JButton();
        Addbtn = new javax.swing.JButton();
        BookTitletxt = new javax.swing.JTextField();
        Authortxt = new javax.swing.JTextField();
        Pricetxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        quatxt = new javax.swing.JTextField();
        catagorycmb = new javax.swing.JComboBox<>();
        jTextField2 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        table2 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

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
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 60, 50));

        jLabel3.setFont(new java.awt.Font("Baskerville Old Face", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("CITY BOOK SHOP");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 440, 70));

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
        jLabel1.setText("Add New Book");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 210, 40));

        Exitbtn.setBackground(new java.awt.Color(0, 153, 204));
        Exitbtn.setForeground(new java.awt.Color(255, 255, 255));
        Exitbtn.setText("EXIT");
        Exitbtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        Exitbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitbtnActionPerformed(evt);
            }
        });
        jPanel1.add(Exitbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 380, 150, 30));

        Addbtn.setBackground(new java.awt.Color(0, 153, 204));
        Addbtn.setForeground(new java.awt.Color(255, 255, 255));
        Addbtn.setText("ADD");
        Addbtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        Addbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddbtnActionPerformed(evt);
            }
        });
        jPanel1.add(Addbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, 150, 30));
        jPanel1.add(BookTitletxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 110, 30));
        jPanel1.add(Authortxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 110, 30));
        jPanel1.add(Pricetxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, 110, 30));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Book Title");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 70, 20));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Price");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 60, 20));

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Quantity");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 60, -1));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Catagory");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 60, 30));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Author");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 70, -1));

        quatxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quatxtActionPerformed(evt);
            }
        });
        jPanel1.add(quatxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, 110, 30));

        catagorycmb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Fiction", "Non-Fiction", "Mystery/Thriller", "Science and Nature", "Business and Economics", "History", "Art and Photography", "Travel", "Children's Books" }));
        catagorycmb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                catagorycmbActionPerformed(evt);
            }
        });
        jPanel1.add(catagorycmb, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 300, 110, 30));

        jTextField2.setBackground(new java.awt.Color(0, 102, 153));
        jTextField2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 5));
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 79, 240, 370));

        table2.setModel(new javax.swing.table.DefaultTableModel(
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
        table2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table2MouseClicked(evt);
            }
        });
        table2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                table2KeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(table2);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 120, 370, 230));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/sara-Skcr6X_aLjU-unsplash_1.jpg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, 460, 370));

        jLabel7.setFont(new java.awt.Font("Baskerville Old Face", 1, 48)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("CITY BOOK SHOP");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 510, 50));

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

    private void AddbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddbtnActionPerformed
        
    String bname = BookTitletxt.getText();
    String author = Authortxt.getText();
    String catagory = catagorycmb.getSelectedItem().toString();

    int price;
    try {
        price = Integer.parseInt(Pricetxt.getText());
    } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(null, "Please enter a valid numeric value for Price.");
        return;
    }
    
    int qua;
    try {
        qua = Integer.parseInt(quatxt.getText());
    } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(null, "Please enter a valid numeric value for Quantity.");
        return; 
    }
    
    if(bname.isEmpty()||author.isEmpty()||catagory.isEmpty()){
        JOptionPane.showMessageDialog(rootPane, "please fill all the required fields");
    }else{
        try {
       
        String sql = "INSERT INTO books (Title, Author, Price, Quantity, Catagory) VALUES (?, ?, ?, ?, ?)";
        pst = conn.prepareStatement(sql);
        pst.setString(1, bname);
        pst.setString(2, author);
        pst.setInt(3, price);
        pst.setInt(4, qua);
        pst.setString(5, catagory);
        pst.execute();
        JOptionPane.showMessageDialog(null, "Successfully Added");
      
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, e);
    }
    }

    
    tableload1();
    
    }//GEN-LAST:event_AddbtnActionPerformed

    private void table2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table2MouseClicked
       
    }//GEN-LAST:event_table2MouseClicked

    private void table2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_table2KeyReleased
    
    }//GEN-LAST:event_table2KeyReleased

    private void catagorycmbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_catagorycmbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_catagorycmbActionPerformed

    private void quatxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quatxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quatxtActionPerformed

    private void ExitbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitbtnActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_ExitbtnActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        ManageBook mb = new ManageBook();
        mb.setVisible(true);
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
            java.util.logging.Logger.getLogger(AddNewBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddNewBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddNewBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddNewBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddNewBook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Addbtn;
    private javax.swing.JTextField Authortxt;
    private javax.swing.JTextField BookTitletxt;
    private javax.swing.JButton Exitbtn;
    private javax.swing.JTextField Pricetxt;
    private javax.swing.JComboBox<String> catagorycmb;
    private javax.swing.JButton jButton2;
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
    private javax.swing.JTextField quatxt;
    private javax.swing.JTable table2;
    // End of variables declaration//GEN-END:variables
}
