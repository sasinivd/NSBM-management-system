package nsbm;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.*;
/**
 *
 * @author DELL
 */
public class Welcome extends javax.swing.JFrame {
    GridBagLayout grid=new GridBagLayout();
    StudentPanel s1;
    CoursePanel s2;
    StaffPanel s3;
    AddUserPanel s4;
    /**
     * Creates new form Welcome
     */
    public Welcome() {
        initComponents();
        s1=new StudentPanel();
        s2=new CoursePanel();
        s3=new StaffPanel();
        s4=new AddUserPanel();
        dynamic_panel.setLayout(grid);
        GridBagConstraints gc=new GridBagConstraints();
        gc.gridx=0;
        gc.gridy=0;
        dynamic_panel.add(s1,gc);
        dynamic_panel.add(s2,gc);
        dynamic_panel.add(s3,gc);
        dynamic_panel.add(s4,gc);
        s1.setVisible(false);
        s2.setVisible(false);
        s3.setVisible(false);
        s4.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblStudent = new javax.swing.JLabel();
        lblCourse = new javax.swing.JLabel();
        lblStaff = new javax.swing.JLabel();
        lblAddUser = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        dynamic_panel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblStudent.setBackground(new java.awt.Color(85, 65, 118));
        lblStudent.setFont(new java.awt.Font("Berlin Sans FB", 0, 36)); // NOI18N
        lblStudent.setForeground(new java.awt.Color(255, 255, 255));
        lblStudent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/3.png"))); // NOI18N
        lblStudent.setText(" Student");
        lblStudent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblStudentMouseClicked(evt);
            }
        });
        getContentPane().add(lblStudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 290, 100));

        lblCourse.setFont(new java.awt.Font("Berlin Sans FB", 0, 36)); // NOI18N
        lblCourse.setForeground(new java.awt.Color(255, 255, 255));
        lblCourse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/8.png"))); // NOI18N
        lblCourse.setText(" Course");
        lblCourse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCourseMouseClicked(evt);
            }
        });
        getContentPane().add(lblCourse, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 290, 100));

        lblStaff.setFont(new java.awt.Font("Berlin Sans FB", 0, 36)); // NOI18N
        lblStaff.setForeground(new java.awt.Color(255, 255, 255));
        lblStaff.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/7.png"))); // NOI18N
        lblStaff.setText(" Staff");
        lblStaff.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblStaffMouseClicked(evt);
            }
        });
        getContentPane().add(lblStaff, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 290, 100));

        lblAddUser.setFont(new java.awt.Font("Berlin Sans FB", 0, 36)); // NOI18N
        lblAddUser.setForeground(new java.awt.Color(255, 255, 255));
        lblAddUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add.png"))); // NOI18N
        lblAddUser.setText(" Add User");
        lblAddUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAddUser(evt);
            }
        });
        getContentPane().add(lblAddUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 460, 290, 100));

        jLabel1.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/f3439a646dcc0317a9df3f75a9d55583.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 830));

        dynamic_panel.setBackground(new java.awt.Color(237, 252, 237));
        dynamic_panel.setPreferredSize(new java.awt.Dimension(1090, 830));

        javax.swing.GroupLayout dynamic_panelLayout = new javax.swing.GroupLayout(dynamic_panel);
        dynamic_panel.setLayout(dynamic_panelLayout);
        dynamic_panelLayout.setHorizontalGroup(
            dynamic_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1090, Short.MAX_VALUE)
        );
        dynamic_panelLayout.setVerticalGroup(
            dynamic_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 830, Short.MAX_VALUE)
        );

        getContentPane().add(dynamic_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 1090, 830));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblStudentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblStudentMouseClicked
        s1.setVisible(true);
        s2.setVisible(false);
        s3.setVisible(false);
        s4.setVisible(false);
        
    }//GEN-LAST:event_lblStudentMouseClicked

    private void lblCourseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCourseMouseClicked
        s1.setVisible(false);
        s2.setVisible(true);
        s3.setVisible(false);
        s4.setVisible(false);
    }//GEN-LAST:event_lblCourseMouseClicked

    private void lblStaffMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblStaffMouseClicked
        s3.setVisible(true);
        s1.setVisible(false);
        s2.setVisible(false);
        s4.setVisible(false);
    }//GEN-LAST:event_lblStaffMouseClicked

    private void lblAddUser(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAddUser
        s4.setVisible(true);
        s1.setVisible(false);
        s2.setVisible(false);
        s3.setVisible(false);
    }//GEN-LAST:event_lblAddUser

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
            java.util.logging.Logger.getLogger(Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Welcome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel dynamic_panel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblAddUser;
    private javax.swing.JLabel lblCourse;
    private javax.swing.JLabel lblStaff;
    private javax.swing.JLabel lblStudent;
    // End of variables declaration//GEN-END:variables
}
