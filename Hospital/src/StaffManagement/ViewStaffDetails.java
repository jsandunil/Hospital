package StaffManagement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Attendace.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Alex
 */

public class ViewStaffDetails extends javax.swing.JFrame {

    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    /* Creates new form main
     */
    
    public ViewStaffDetails() {
        initComponents();
        con = DBConnect.ConnectDB();
        
        Update_table();
        

    }
    

    private void Update_table() {
        //con = DBConnect.ConnectDB();

        try {

            String sql = "SELECT e.employeeNo,e.name,e.attendaceNo,e.anualSalary,e.phone,d.furtherSpecialitation,d.specialitation FROM employee e,doctor d where e.employeeNo=d.employeeNo";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            tblemployee.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        cmbdesig = new javax.swing.JComboBox();
        cmbsupp = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblemployee = new javax.swing.JTable();
        btnview = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        btnupdate = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtview = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Equipment Management System");
        setBackground(new java.awt.Color(204, 204, 204));
        setForeground(java.awt.SystemColor.activeCaptionText);
        setMinimumSize(new java.awt.Dimension(829, 690));
        setResizable(false);
        getContentPane().setLayout(null);
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(0, 100, 820, 10);

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Attendace/admin1.png"))); // NOI18N
        getContentPane().add(jLabel12);
        jLabel12.setBounds(750, 10, 60, 80);

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 0, 51));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Logout");
        jLabel13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(jLabel13);
        jLabel13.setBounds(650, 70, 50, 20);

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel14.setText("<html>Hello Sleepy!<br> level : Admin </html>");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(640, 30, 100, 30);

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(102, 102, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Profile");
        jLabel15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(jLabel15);
        jLabel15.setBounds(650, 10, 50, 20);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Attendace/home.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(20, 20, 73, 60);

        jLabel2.setText("Designation");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(130, 180, 70, 14);

        cmbdesig.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Designation", "Doctor", "Nurse", "Support Staff" }));
        cmbdesig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbdesigActionPerformed(evt);
            }
        });
        getContentPane().add(cmbdesig);
        cmbdesig.setBounds(270, 180, 140, 20);

        cmbsupp.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Support Staff", "Receptionist", "Administrator", " " }));
        cmbsupp.setEnabled(false);
        getContentPane().add(cmbsupp);
        cmbsupp.setBounds(270, 220, 140, 20);

        jLabel3.setText("Staff Type");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(130, 220, 70, 20);

        tblemployee.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblemployee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblemployeeMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblemployee);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(40, 250, 710, 120);

        btnview.setText("View");
        btnview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnviewActionPerformed(evt);
            }
        });
        getContentPane().add(btnview);
        btnview.setBounds(480, 440, 73, 23);

        btndelete.setText("Delete");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btndelete);
        btndelete.setBounds(580, 440, 90, 23);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(150, 440, 160, 30);
        getContentPane().add(jTextField2);
        jTextField2.setBounds(150, 480, 160, 30);

        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField5);
        jTextField5.setBounds(150, 400, 160, 30);

        btnupdate.setText("Update");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnupdate);
        btnupdate.setBounds(390, 440, 80, 23);

        jLabel1.setText("Salary");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(77, 450, 40, 14);

        jLabel4.setText("Phone");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(77, 490, 40, 14);

        jLabel5.setText("Name");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(77, 410, 40, 14);

        txtview.setText("jLabel23");
        getContentPane().add(txtview);
        txtview.setBounds(0, 0, 830, 690);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnviewActionPerformed
        // TODO add your handling code here:
        String desig = (String) cmbdesig.getSelectedItem();
        cmbsupp.setEnabled(true);

        if ("Doctor".equals(desig)) {
            try {

                String sql = "SELECT e.employeeNo,e.name,e.attendaceNo,e.anualSalary,e.phone,d.specialitation,d.furtherSpecialitation FROM employee e,doctor d where e.employeeNo=d.employeeNo";
                pst = con.prepareStatement(sql);
                rs = pst.executeQuery();
                tblemployee.setModel(DbUtils.resultSetToTableModel(rs));
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);

            }
        } else if ("Nurse".equals(desig)) {
            try {

                String sql = "SELECT e.employeeNo,e.name,e.attendaceNo,e.anualSalary,e.phone,n.grade FROM employee e,nurse n where e.employeeNo=n.employeeNo";
                pst = con.prepareStatement(sql);
                rs = pst.executeQuery();
                tblemployee.setModel(DbUtils.resultSetToTableModel(rs));
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);

            }
        } else if ("Support Staff".equals(desig)) {
            try {
                

                String sql = "SELECT e.employeeNo,e.name,e.attendaceNo,e.anualSalary,e.phone,s.staffType FROM employee e,supportstaff s where e.employeeNo=s.employeeNo";
                pst = con.prepareStatement(sql);
                rs = pst.executeQuery();
                tblemployee.setModel(DbUtils.resultSetToTableModel(rs));
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);

            }

        }


    }//GEN-LAST:event_btnviewActionPerformed

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
        // TODO add your handling code here:
        int row = tblemployee.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) tblemployee.getModel();

        String selected = model.getValueAt(row, 0).toString();

        if (row >= 0) {

            model.removeRow(row);

            try {
                pst = con.prepareStatement("delete from employee where employeeNo=?");
                pst.setString(1, selected);
                pst.executeUpdate();
            } catch (Exception w) {
                JOptionPane.showMessageDialog(this, "Connection Error!");
            }
        }

    }//GEN-LAST:event_btndeleteActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        AdminJFrame ajf = new AdminJFrame();
        ajf.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
        // TODO add your handling code here:
        String value1=jTextField5.getText();
        String value2=jTextField1.getText();
        String value3=jTextField2.getText();
        
        int row=tblemployee.getSelectedRow();
        String Table_click=(String) (tblemployee.getModel().getValueAt(row,0));
        
        String sql="update employee set name=?,anualSalary=?,phone=? where employeeNo='"+Table_click+"'";
        
        try {
        pst=con.prepareStatement(sql);
        pst.setString(1, value1);
        pst.setString(2, value2);
        pst.setString(3, value3);
        pst.execute();
        
        } catch (SQLException ex) {
            Logger.getLogger(ViewStaffDetails.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }//GEN-LAST:event_btnupdateActionPerformed

    private void tblemployeeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblemployeeMouseClicked
        // TODO add your handling code here:
       try{
        int row=tblemployee.getSelectedRow();
        String Table_click=(String) (tblemployee.getModel().getValueAt(row,0));
        
        String sql = "SELECT employeeNo,name,attendaceNo,anualSalary,phone from employee where employeeNo='"+Table_click+"'";
        pst=con.prepareStatement(sql);
        rs=pst.executeQuery();
        if(rs.next()){
        
        String add1=rs.getString("name");
        jTextField5.setText(add1);
        String add2=rs.getString("anualSalary");
        jTextField1.setText(add2);
        String add3=rs.getString("phone");
        
        jTextField2.setText(add3);
                }
            
        }
        catch(Exception e){
           
        }
    }//GEN-LAST:event_tblemployeeMouseClicked

    private void cmbdesigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbdesigActionPerformed
        // TODO add your handling code here:
        
        String desig = (String) cmbdesig.getSelectedItem();
        if(desig.equals("Support Staff")){
        cmbsupp.setEnabled(true);
        }
        else{
        cmbsupp.setEnabled(false);
        }
    }//GEN-LAST:event_cmbdesigActionPerformed

 /*public class CustomTableModel extends DefaultTableModel {

        public boolean isCellEditable(int row, int col) {
            return true;
        }

        public void setValueAt(Object value, int row, int col) {
            Object[][] rowData = null;
            rowData[row][col] = value;
            fireTableCellUpdated(row, col);
        }
    }*/
public class CustomTable implements TableModelListener {
    public CustomTable() {
        
        tblemployee.getModel().addTableModelListener(this);
        
    }
    public void fireTableDataChanged(TableModelEvent e) {
        
        if (e.getType() == TableModelEvent.UPDATE) {
            int col = tblemployee.getSelectedColumn();
            int row = tblemployee.getSelectedRow();
//do the update query on this row
            String Table_click=(String) (tblemployee.getModel().getValueAt(row,0));
        
            try {
                pst = con.prepareStatement("UPDATE employee SET name = ?,anualsalary = ?, phone= ? WHERE employeeNo=?");

                pst.setString(1, (String) tblemployee.getValueAt(row, 1));
                pst.setInt(2, (Integer) tblemployee.getValueAt(row, 3));
                pst.setInt(3, (Integer) tblemployee.getValueAt(row, 4));
                pst.setInt(4,(Integer) tblemployee.getValueAt(row, 0));

                pst.executeUpdate();
                pst.close();

            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }
//now you have the data in the cell and the place in the grid where the 

//cell is so you can use the data as you want

        @Override
        public void tableChanged(TableModelEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
            java.util.logging.Logger.getLogger(ViewStaffDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewStaffDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewStaffDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewStaffDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewStaffDetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btnupdate;
    private javax.swing.JButton btnview;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox cmbdesig;
    private javax.swing.JComboBox cmbsupp;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTable tblemployee;
    private javax.swing.JLabel txtview;
    // End of variables declaration//GEN-END:variables
}
