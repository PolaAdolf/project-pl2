/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Panels;
import training.center.MyException;
/**
 *
 * @author Beshoy sameh
 */
public class StudentGrade extends javax.swing.JPanel {

    /** Creates new form StudentGrade */
    public StudentGrade() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        jStudentID2 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jCourseID2 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jStudentGrade2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Berlin Sans FB", 1, 15)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(106, 135, 157));
        jLabel8.setText("Student ID");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, -1, -1));

        jStudentID2.setFont(new java.awt.Font("Britannic Bold", 0, 11)); // NOI18N
        jStudentID2.setForeground(new java.awt.Color(106, 135, 157));
        add(jStudentID2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, 210, -1));

        jLabel9.setFont(new java.awt.Font("Berlin Sans FB", 1, 15)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(106, 135, 157));
        jLabel9.setText("Course ID");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, -1, -1));

        jCourseID2.setFont(new java.awt.Font("Britannic Bold", 0, 11)); // NOI18N
        jCourseID2.setForeground(new java.awt.Color(106, 135, 157));
        add(jCourseID2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, 210, -1));

        jLabel10.setFont(new java.awt.Font("Berlin Sans FB", 1, 15)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(106, 135, 157));
        jLabel10.setText("Student Grade");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, -1, -1));

        jStudentGrade2.setEditable(false);
        jStudentGrade2.setFont(new java.awt.Font("Britannic Bold", 0, 11)); // NOI18N
        jStudentGrade2.setForeground(new java.awt.Color(106, 135, 157));
        jStudentGrade2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jStudentGrade2ActionPerformed(evt);
            }
        });
        add(jStudentGrade2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, 210, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Beshoy sameh\\Desktop\\Project al 5ames\\GUI PHOTOS\\Student\\View grades.jpg")); // NOI18N
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 490));
    }// </editor-fold>//GEN-END:initComponents
MyException e=new MyException();
    private void jStudentGrade2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jStudentGrade2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jStudentGrade2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField jCourseID;
    private javax.swing.JTextField jCourseID1;
    private javax.swing.JTextField jCourseID2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jStudentGrade;
    private javax.swing.JTextField jStudentGrade1;
    private javax.swing.JTextField jStudentGrade2;
    private javax.swing.JTextField jStudentID;
    private javax.swing.JTextField jStudentID1;
    private javax.swing.JTextField jStudentID2;
    // End of variables declaration//GEN-END:variables

}
