/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nsbm;

import java.sql.*;
import javax.swing.*;


/**
 *
 * @author DELL
 */
public class AddUserPanel extends javax.swing.JPanel {
    Connection conn=null;
    PreparedStatement pst =null;
    ResultSet rs=null;
    
    public AddUserPanel() {
        initComponents();
        lblWelcome.setText("Welcome User!");
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnEdit = new javax.swing.JButton();
        txtUser = new javax.swing.JTextField();
        pswrd = new javax.swing.JPasswordField();
        btnAdd = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        lblWelcome = new javax.swing.JLabel();
        lbl = new javax.swing.JLabel();
        lbl1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(237, 252, 237));
        setPreferredSize(new java.awt.Dimension(1090, 830));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        jLabel1.setText("Delete");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 590, 70, 40));

        jLabel2.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        jLabel2.setText("Username");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 350, 130, 50));

        jLabel3.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        jLabel3.setText("Password");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 430, 140, 50));

        jLabel4.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        jLabel4.setText("Add User");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 590, 100, 40));

        jLabel5.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        jLabel5.setText("Edit ");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 590, 50, 40));

        btnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/1.jpg"))); // NOI18N
        btnEdit.setText("jButton1");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });
        add(btnEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 580, 110, 60));

        txtUser.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtUser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtUserKeyReleased(evt);
            }
        });
        add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 340, 390, 50));

        pswrd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                pswrdKeyReleased(evt);
            }
        });
        add(pswrd, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 430, 390, 50));

        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/1.jpg"))); // NOI18N
        btnAdd.setText("jButton1");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 580, 120, 60));

        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/1.jpg"))); // NOI18N
        btnDelete.setText("jButton1");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 580, 110, 60));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/220px-User_icon_2.svg.png"))); // NOI18N
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 220, 210));

        lblWelcome.setFont(new java.awt.Font("Eras Medium ITC", 0, 56)); // NOI18N
        add(lblWelcome, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 70, 620, 120));

        lbl.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        lbl.setForeground(new java.awt.Color(255, 0, 0));
        add(lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 340, 240, 40));

        lbl1.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        lbl1.setForeground(new java.awt.Color(255, 0, 0));
        add(lbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 430, 240, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        if(txtUser.getText().trim().isEmpty() && pswrd.getText().trim().isEmpty()){
            lbl.setText("**Staff ID number is empty**");
            lbl1.setText("**Staff ID number is empty**");
        }
        else if(txtUser.getText().trim().isEmpty()){
            lbl.setText("**Staff ID number is empty**");
        }
        else if(pswrd.getText().trim().isEmpty()){
            lbl1.setText("**Staff ID number is empty**");
        }
        else{
        String query="insert into login values('"+txtUser.getText()+"','"+pswrd.getText()+"')";
        
        
        try{
            conn=MySqlConnect.ConnectDB();
            pst=conn.prepareStatement(query);
            pst.executeUpdate();
            conn.close();
            txtUser.setText("");pswrd.setText("");
            JOptionPane.showMessageDialog(null,"User added successfully");
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null,e);
        }
        }
        
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        try{
                conn=MySqlConnect.ConnectDB();
                pst=conn.prepareStatement("select * from login where username='"+txtUser.getText()+"'");
                rs=pst.executeQuery();
                if(rs.next()){
                   String query="update login set password=? where username=?";
                    int option=JOptionPane.showConfirmDialog(null,"Do you really want to change the password? ","Update",JOptionPane.YES_NO_OPTION);
                    if(option==0){
                        try{
                            conn=MySqlConnect.ConnectDB();
                            pst=conn.prepareStatement(query);
                            pst.setString(1, pswrd.getText());
                            pst.setString(2, txtUser.getText());

                            pst.executeUpdate();
                            conn.close();
                            txtUser.setText("");pswrd.setText("");
                        }
                        catch(SQLException e){
                            JOptionPane.showMessageDialog(null,e);
                        }
                    } 
                }
                else{
                    lbl.setText("Invalid Username");txtUser.setText("");pswrd.setText("");
                }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null,e);
        }
        
        
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        try{
                conn=MySqlConnect.ConnectDB();
                pst=conn.prepareStatement("select * from login where username='"+txtUser.getText()+"'");
                rs=pst.executeQuery();
                if(rs.next()){
                    String query="delete from login where username='"+txtUser.getText()+"'";
                    int option=JOptionPane.showConfirmDialog(null,"Do you really want to delete user? ","Delete",JOptionPane.YES_NO_OPTION);
                    if(option==0){
                        try{
                            conn=MySqlConnect.ConnectDB();
                            pst=conn.prepareStatement(query);
                            pst.executeUpdate();
                            conn.close();
                            txtUser.setText("");pswrd.setText("");
                        }catch(SQLException e){
                            JOptionPane.showMessageDialog(null,e);
                        }
                    }
                }
                else{
                    lbl.setText("Invalid Username");txtUser.setText("");pswrd.setText("");
                }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null,e);
        }
        
       
        
        
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void txtUserKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUserKeyReleased
        lbl.setText("");
    }//GEN-LAST:event_txtUserKeyReleased

    private void pswrdKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pswrdKeyReleased
        lbl1.setText("");
    }//GEN-LAST:event_pswrdKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lbl;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lblWelcome;
    private javax.swing.JPasswordField pswrd;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
