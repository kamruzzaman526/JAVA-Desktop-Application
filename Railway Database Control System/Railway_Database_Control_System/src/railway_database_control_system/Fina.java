/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package railway_database_control_system;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author hp
 */
public class Fina extends javax.swing.JFrame {

    /**
     * Creates new form Fina
     */
    public Fina() {
        initComponents();
        table_update();
    }
    
    Connection connect;
    PreparedStatement prestatement;
    PreparedStatement prestatement1;
    PreparedStatement prestatement2;
    PreparedStatement prestatement3;
    PreparedStatement prestatement4;
    PreparedStatement prestatement5;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtSubject = new javax.swing.JTextField();
        txtAmount = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtFrom = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtDate = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtEntry = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblFina = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Finance Section");

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Subject");

        txtSubject.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        txtAmount.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Amount");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("From");

        txtFrom.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        btnAdd.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnUpdate.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton4.setText("Cancel");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Deposit Date");

        txtDate.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Entry No.");

        txtEntry.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6)
                                .addComponent(jLabel2)))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtSubject)
                            .addComponent(txtAmount)
                            .addComponent(txtFrom, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                            .addComponent(txtDate)
                            .addComponent(txtEntry))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnUpdate, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(46, 46, 46))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtEntry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtSubject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFrom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(btnUpdate))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDelete)
                    .addComponent(jButton4))
                .addGap(30, 30, 30))
        );

        tblFina.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Entry", "Subject", "Amount", "From", "Date"
            }
        ));
        tblFina.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblFinaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblFina);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(252, 252, 252)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(109, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(191, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        try {
          
            
            
            
            DefaultTableModel dmdl = (DefaultTableModel) tblFina.getModel();        
            
            int selectIndex = tblFina.getSelectedRow();
            
            
             String id = dmdl.getValueAt(selectIndex, 0).toString();
             String ent = txtSubject.getText();
             String sub = txtSubject.getText();
             String amt =  txtAmount.getText();
             String frm = txtFrom.getText();
             String dat = txtDate.getText();
             
            
            
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/railway","root","");
            
            PreparedStatement ps = con.prepareStatement("UPDATE fina SET  subject=?, amount=?, fromO =?, date=? where entry=?");
            

            //ps.setString(1, ent);
            ps.setString(1, sub);
            ps.setString(2, amt);
            ps.setString(3, frm);
            ps.setString(4, dat);
            
            ps.setString(5, id);
            
            ps.executeUpdate();
            
            JOptionPane.showMessageDialog(this, "Record updated");
            
            //autoID();
            txtEntry.setText("");
           txtSubject.setText("");
           txtAmount.setText("");
           txtFrom.setText("");
           txtDate.setText("");
           txtEntry.requestFocus();
            
             table_update();
            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Fina.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Fina.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        DefaultTableModel dmdl = (DefaultTableModel) tblFina.getModel();        
           
        
            int selectIndex = tblFina.getSelectedRow();
        
          String id = dmdl.getValueAt(selectIndex, 0).toString();  
            
          int dialogResult = JOptionPane.showConfirmDialog(this, "Do you want to delete the record","Warning",JOptionPane.YES_NO_OPTION);
          if (dialogResult == JOptionPane.YES_OPTION)
          {
            try {
                // String entry = txtEntry.getText();
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost/railway","root","");
                
             PreparedStatement ps = con.prepareStatement("DELETE from fina where entry=?");
             ps.setString(1, id);  
           
           
              ps.executeUpdate();
              JOptionPane.showMessageDialog(this, "Record deleted");
              txtEntry.setText("");
           txtSubject.setText("");
           txtAmount.setText("");
           txtFrom.setText("");
           txtDate.setText("");
           txtEntry.requestFocus();
              table_update();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Fina.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(Fina.class.getName()).log(Level.SEVERE, null, ex);
            }
            
          }
          else
          {
              
          }
          
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        
        try {
            // TODO add your handling code here:
            String ent = txtEntry.getText();
            String sub = txtSubject.getText();
            String amt = txtAmount.getText();
            String frm = txtFrom.getText();
            String dat = txtDate.getText();
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/railway","root","");
            PreparedStatement ps = con.prepareStatement("INSERT into fina(entry,subject,amount,fromO,date) values (?,?,?,?,?)");
            ps.setString(1, ent);
            ps.setString(2, sub);
            ps.setString(3, amt);
            ps.setString(4, frm);
            ps.setString(5, dat);
            
            ps.executeUpdate();
            JOptionPane.showMessageDialog(this, "Data added successfully");
            
           txtEntry.setText("");
           txtSubject.setText("");
           txtAmount.setText("");
           txtFrom.setText("");
           txtDate.setText("");
           txtEntry.requestFocus();
           
            table_update();
        } catch (Exception ex) {
            Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
//        try {
//            
//            String kentry = txtEntry.getText();
//            String ksubject = txtSubject.getText();
//            
//            String kamount = txtAmount.getText();
//            String kfrom = txtFrom.getText();
//            
//            String kdate = txtDate.getText();
//            
//            
//            Class.forName("com.mysql.jdbc.Driver");
//            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/railway","root","");
//            
//            if( ksubject.equals("") || 
//                    kamount.equals("") || kfrom.equals("") || kdate.equals(""))
//            {
//                JOptionPane.showMessageDialog(this, "One or more fields are empty");
//            }
//            else
//            {
//             
//                
//            PreparedStatement ps = con.prepareStatement("insert into finance(entry,subject,amount,from,date) values(?,?,?,?,?)");
//            ps.setString(1, kentry);
//            ps.setString(2, ksubject);
//            ps.setString(3, kamount);
//            ps.setString(4, kfrom);
//            ps.setString(5, kdate);
//            
////          //  prestatement.setString(1, null);
////            prestatement.setString(1, kentry );
////            prestatement.setString(2, ksubject);
////            prestatement.setString(3, kamount);
////            prestatement.setString(4, kfrom);
////            prestatement.setString(5, kdate);
//            
//            ps.executeUpdate();
//            JOptionPane.showMessageDialog(this, "Finance Information added");
//            
//           txtSubject.setText("");
//           txtAmount.setText("");
//           txtFrom.setText("");
//           txtDate.setText("");
//           txtSubject.requestFocus();
//           
//         // autoID();
//          // table_update();
//           
//            }
//            
//            
//            
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(Fina.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (SQLException ex) {
//            Logger.getLogger(Fina.class.getName()).log(Level.SEVERE, null, ex);
//        }
        
    }//GEN-LAST:event_btnAddActionPerformed

    private void tblFinaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblFinaMouseClicked
        // TODO add your handling code here:
         DefaultTableModel dmdl = (DefaultTableModel) tblFina.getModel();
        
        int selectIndex = tblFina.getSelectedRow();
        
        txtEntry.setText(dmdl.getValueAt(selectIndex, 0).toString());
        txtSubject.setText(dmdl.getValueAt(selectIndex, 1).toString());
        txtAmount.setText(dmdl.getValueAt(selectIndex, 2).toString());
        txtFrom.setText(dmdl.getValueAt(selectIndex, 3).toString());
        txtDate.setText(dmdl.getValueAt(selectIndex, 4).toString());
        //comboBox_available_status.setSelectedItem(dmdl.getValueAt(selectIndex, 3).toString());
    }//GEN-LAST:event_tblFinaMouseClicked

                                                               
       
      
                                                              

     public void table_update()
    {
        try {
            int count;
            
            Class.forName("com.mysql.jdbc.Driver");
            connect = DriverManager.getConnection("jdbc:mysql://localhost/railway","root","");
            
            prestatement1 = connect.prepareStatement("select *  from fina");
            ResultSet rs = prestatement1.executeQuery();
            
            ResultSetMetaData rd =rs.getMetaData();
            
            count = rd.getColumnCount();
            DefaultTableModel df = (DefaultTableModel) tblFina.getModel();
            
            df.setRowCount(0);
            
            while(rs.next())
            {
                Vector v2 = new Vector();
                for (int i =1; i<= count; i++)
                {
                    v2.add(rs.getString("entry"));
                    v2.add(rs.getString("subject"));
                    v2.add(rs.getString("amount"));
                      v2.add(rs.getString("fromO"));
                      v2.add(rs.getString("date"));
                      
                      
                    
                }
                
                df.addRow(v2);
            }
            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Fina.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Fina.class.getName()).log(Level.SEVERE, null, ex);
        }
                
    }
    
//    public void autoID()
//    {
//        try {
//            
//            
//            try {
//                Class.forName("com.mysql.jdbc.Driver");
//                connect = DriverManager.getConnection("jdbc:mysql://localhost/railway","root","");
//                Statement s = connect.createStatement();
//                
//                ResultSet rs = s.executeQuery("select MAX(id) from finance");
//                rs.next();
//                
//                rs.getString("MAX(id)");
//                if(rs.getString("MAX(id)")== null)
//                {
//                    txtEntry.setText("K0001");
//                }
//                else
//                {
//                    long id = Long.parseLong(rs.getString("MAX(id)"));
//                    id++;
//                    txtEntry.setText("K0"+ String.format("%03d", id));
//                }
//                
//            } catch (SQLException ex) {
//                Logger.getLogger(Fina.class.getName()).log(Level.SEVERE, null, ex);
//            }
//            
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(Fina.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
    
    
    
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
                if ("windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Fina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Fina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Fina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Fina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Fina().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblFina;
    private javax.swing.JTextField txtAmount;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtEntry;
    private javax.swing.JTextField txtFrom;
    private javax.swing.JTextField txtSubject;
    // End of variables declaration//GEN-END:variables
}