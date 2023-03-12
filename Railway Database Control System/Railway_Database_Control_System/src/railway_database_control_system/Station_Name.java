/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package railway_database_control_system;

import javax.swing.JOptionPane;
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
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author hp
 */
public class Station_Name extends javax.swing.JFrame {

    /**
     * Creates new form Station_Name
     */
    public Station_Name() {
        initComponents();
 //                autoID();
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtSid = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtMid = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtLocation = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Station ID");

        txtSid.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Station Name");

        txtName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Master ID");

        txtMid.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtMid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMidActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Railway Zone");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Location");

        txtLocation.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton3.setText("Update");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton4.setText("Delete");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jRadioButton1.setText("West Zone");

        jRadioButton2.setText("East Zone");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel5)
                                .addComponent(jLabel3)))
                        .addGap(34, 34, 34))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1)
                        .addGap(16, 16, 16)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jRadioButton2)
                            .addComponent(txtLocation, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton2)
                                    .addComponent(jButton3))
                                .addGap(58, 58, 58)
                                .addComponent(jButton4))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jRadioButton1)
                                    .addGap(108, 108, 108))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtSid, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                                    .addComponent(txtName)
                                    .addComponent(txtMid))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtMid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtLocation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton3)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(31, 31, 31))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 410, 420));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel6.setText("Station Name Info");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(369, 13, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Add info");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Station_id", "Station_Name", "Master_id", "Location", "Zone"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 70, 410, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtMidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMidActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
         DefaultTableModel dmdl = (DefaultTableModel) jTable1.getModel();        
           
        
            int selectIndex = jTable1.getSelectedRow();
        
          String id = dmdl.getValueAt(selectIndex, 0).toString();  
            
          int dialogResult = JOptionPane.showConfirmDialog(this, "Do you want to delete the record","Warning",JOptionPane.YES_NO_OPTION);
          if (dialogResult == JOptionPane.YES_OPTION)
          {
            try {
                // String entry = txtEntry.getText();
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = java.sql.DriverManager.getConnection("jdbc:mysql://localhost/railway","root","");
                
             PreparedStatement ps = con.prepareStatement("DELETE from station where station_id=?");
             ps.setString(1, id);  
           
           
              ps.executeUpdate();
              JOptionPane.showMessageDialog(this, "Record deleted");
               txtSid.setText("");
              txtName.setText("");
              txtMid.setText("");
              txtLocation.setText("");
           
               txtSid.requestFocus();
              
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
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            String ent = txtSid.getText();
            String sub = txtName.getText();
            String amt = txtMid.getText();
            String frm = txtLocation.getText();
         // String dat = jTextField5.getText();
          //String six = jTextField6.getText();
            Class.forName("com.mysql.jdbc.Driver");
            java.sql.Connection con = java.sql.DriverManager.getConnection("jdbc:mysql://localhost/railway","root","");
            PreparedStatement ps = con.prepareStatement("INSERT into station(station_id,station_name,master_id,location,station_zone) values (?,?,?,?,?)");
            ps.setString(1, ent);
            ps.setString(2, sub);
            ps.setString(3, amt);
            ps.setString(4, frm);
            if(jRadioButton1.isSelected()){
                ps.setString(5, jRadioButton1.getText());
                
            }
            else
               ps.setString(5, jRadioButton2.getText());


            
            ps.executeUpdate();
            JOptionPane.showMessageDialog(this, "Data added successfully");
            txtSid.setText("");
           txtName.setText("");
           txtMid.setText("");
           txtLocation.setText("");
 
           
           txtSid.requestFocus();
            
            table_update();
        } catch (Exception ex) {
            Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
//         try {
//            // TODO add your handling code here:
//            String ids = txtSid.getText();
//            String name = txtName.getText();
//            String master = txtMid.getText();
//            String location = txtLocation.getText();
//            Class.forName("com.mysql.jdbc.Driver");
//            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/railway","root","");
//            PreparedStatement ps = con.prepareStatement("insert into station(station_id,station_name,master_id,location,station_zone) values (?,?,?,?,?) ");
//            ps.setString(1, ids);
//            ps.setString(2, name);
//            ps.setString(3, master);
//            ps.setString(4, location);
//            
//            if(jRadioButton1.isSelected()){
//                ps.setString(5, jRadioButton1.getText());
//                
//            }
//            else
//               ps.setString(5, jRadioButton2.getText());
//           
//            
//            ps.executeUpdate();
//            JOptionPane.showMessageDialog(this, "Data added successfully");
//            
//            table_update();
//            
//        } catch (Exception ex) {
//            Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
//        }
        
        
//        try {
//            
//            
//            String car_registration_number = txtSid.getText();
//            
//            String car_manufacturing_company_name = txtName.getText();
//            String  car_Model_number = txtMid.getText();
//            
//            String  avaliable_status = cmbZone.getSelectedItem().toString();
//
//            
//            
//            Class.forName("com.mysql.jdbc.Driver");
//            connect = DriverManager.getConnection("jdbc:mysql://localhost/railway","root","");
//            
//            if( car_manufacturing_company_name.equals("") || 
//                    car_Model_number.equals(""))
//            {
//                JOptionPane.showMessageDialog(this, "One or more fields are empty");
//            }
//            else
//            {
//             
//                
//            prestatement = connect.prepareStatement("insert into station(train_id, train_name, master_id, station_zone) values(?,?,?,?) ");
//            
//            prestatement.setString(1, car_registration_number);
//            prestatement.setString(2, car_manufacturing_company_name);
//            prestatement.setString(3, car_Model_number);
//            prestatement.setString(4, avaliable_status);
//            
//            prestatement.executeUpdate();
//            JOptionPane.showMessageDialog(this, "Car Registration Information added");
//            
//           txtSid.setText("");
//           txtName.setText("");
//           cmbZone.setSelectedIndex(0);
//                      txtSid.requestFocus();
//          // autoID();
//           
//          // table_update();
//           
//            }
//            
//            
//            
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(Station_Name.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (SQLException ex) {
//            Logger.getLogger(Station_Name.class.getName()).log(Level.SEVERE, null, ex);
//        }
        
        
//        if( jComboBox1.getSelectedIndex() ==0 ){
//            JOptionPane.showMessageDialog(Station_Name.this, "Please select a Zone");
//            return;
//        }
//        JOptionPane.showMessageDialog(Station_Name.this, "You select:" + jComboBox1.getSelectedItem());
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        try {
          
            
            
            
            DefaultTableModel dmdl = (DefaultTableModel) jTable1.getModel();        
            
            int selectIndex = jTable1.getSelectedRow();
            
            
             String id = dmdl.getValueAt(selectIndex, 0).toString();
             String ent = txtSid.getText();
             String sub = txtName.getText();
             String amt = txtMid.getText();
             String frm = txtLocation.getText();

             
            
            
            Class.forName("com.mysql.jdbc.Driver");
            java.sql.Connection con = java.sql.DriverManager.getConnection("jdbc:mysql://localhost/railway","root","");
            
            PreparedStatement ps = con.prepareStatement("UPDATE station SET station_name=?, master_id =?,location =?, station_zone =? where station_id=?");
            

            //ps.setString(1, ent);
            ps.setString(1, sub);
            ps.setString(2, amt);
            ps.setString(3, frm);
            
            if(jRadioButton1.isSelected()){
                ps.setString(4, jRadioButton1.getText());
                
            }
            else
               ps.setString(4, jRadioButton2.getText());

            
            ps.setString(5, id);
            
            ps.executeUpdate();
            
            JOptionPane.showMessageDialog(this, "Record updated");
            txtSid.setText("");
           txtName.setText("");
           txtMid.setText("");
           txtLocation.setText("");
           
           txtSid.requestFocus();
            
            //autoID();
            
             table_update();
            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Fina.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Fina.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        DefaultTableModel dmdl = (DefaultTableModel) jTable1.getModel();
        
        int selectIndex = jTable1.getSelectedRow();
        
        txtSid.setText(dmdl.getValueAt(selectIndex, 0).toString());
        txtName.setText(dmdl.getValueAt(selectIndex, 1).toString());
        txtMid.setText(dmdl.getValueAt(selectIndex, 2).toString());
        txtLocation.setText(dmdl.getValueAt(selectIndex, 3).toString());
        
      //  jRadioButton1.setText(dmdl.getValueAt(selectIndex, 4).toString());
      //  jRadioButton2.setText(dmdl.getValueAt(selectIndex, 5).toString());
        
    }//GEN-LAST:event_jTable1MouseClicked

    
      public void table_update()
    {
        try {
            int count;
            
            Class.forName("com.mysql.jdbc.Driver");
            connect = DriverManager.getConnection("jdbc:mysql://localhost/railway","root","");
            
            prestatement1 = connect.prepareStatement("select *  from station");
            ResultSet rs = prestatement1.executeQuery();
            
            ResultSetMetaData rd =rs.getMetaData();
            
            count = rd.getColumnCount();
            DefaultTableModel df = (DefaultTableModel) jTable1.getModel();
            
            df.setRowCount(0);
            
            while(rs.next())
            {
                Vector v2 = new Vector();
                for (int i =1; i<= count; i++)
                {
                    v2.add(rs.getString("station_id"));
                    v2.add(rs.getString("station_name"));
                    v2.add(rs.getString("master_id"));
                      v2.add(rs.getString("location"));
                      v2.add(rs.getString("station_Zone"));
                      
                      
                    
                }
                
                df.addRow(v2);
            }
            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Fina.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Fina.class.getName()).log(Level.SEVERE, null, ex);
        }
                
    }
    
    
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
            java.util.logging.Logger.getLogger(Station_Name.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Station_Name.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Station_Name.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Station_Name.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Station_Name().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtLocation;
    private javax.swing.JTextField txtMid;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtSid;
    // End of variables declaration//GEN-END:variables
}
