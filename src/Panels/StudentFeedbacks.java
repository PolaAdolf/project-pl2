/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Panels;

import training.center.FeedBack;

/**
 *
 * @author Abanoub
 */
public class StudentFeedbacks extends javax.swing.JPanel {

    /**
     * Creates new form NewJPanel
     */
    public StudentFeedbacks() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaFeedback = new javax.swing.JTextArea();
        jButtonSubmit = new javax.swing.JButton();
        jTextFieldCName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldCID = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldSName = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldSID = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setOpaque(false);
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Berlin Sans FB", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(106, 135, 157));
        jLabel4.setText("Your Feedback");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 150, 20));

        jLabel3.setFont(new java.awt.Font("Berlin Sans FB", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(106, 135, 157));
        jLabel3.setText("Course Name");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 130, 20));

        jTextAreaFeedback.setColumns(20);
        jTextAreaFeedback.setRows(5);
        jScrollPane1.setViewportView(jTextAreaFeedback);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, 330, -1));

        jButtonSubmit.setFont(new java.awt.Font("Britannic Bold", 0, 11)); // NOI18N
        jButtonSubmit.setForeground(new java.awt.Color(106, 135, 157));
        jButtonSubmit.setText("Submit Your Feedback");
        jButtonSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSubmitActionPerformed(evt);
            }
        });
        add(jButtonSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 340, -1, -1));

        jTextFieldCName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCNameActionPerformed(evt);
            }
        });
        add(jTextFieldCName, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, 190, -1));

        jLabel5.setFont(new java.awt.Font("Berlin Sans FB", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(106, 135, 157));
        jLabel5.setText("Course ID");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 120, 20));

        jTextFieldCID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCIDActionPerformed(evt);
            }
        });
        add(jTextFieldCID, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 190, -1));

        jLabel6.setFont(new java.awt.Font("Berlin Sans FB", 1, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(106, 135, 157));
        jLabel6.setText("Student NAME");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 140, 20));

        jTextFieldSName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldSNameActionPerformed(evt);
            }
        });
        add(jTextFieldSName, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 190, -1));

        jLabel7.setFont(new java.awt.Font("Berlin Sans FB", 1, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(106, 135, 157));
        jLabel7.setText("Student ID");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 120, 20));

        jTextFieldSID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldSIDActionPerformed(evt);
            }
        });
        add(jTextFieldSID, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 190, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Beshoy sameh\\Desktop\\Project al 5ames\\GUI PHOTOS\\Admin\\add-delete teacher.jpg")); // NOI18N
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 490));
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSubmitActionPerformed
        // TODO add your handling code here:
        if(! jTextFieldCName.equals("") && !jTextFieldCID.equals("") && !jTextFieldSName.equals("") && !jTextFieldSID.equals("") && !jTextAreaFeedback.equals("")){
            FeedBack f=new FeedBack();
            f.setCname(jTextFieldCName.getText());
            f.setCid(Integer.parseInt(jTextFieldCID.getText()));
            f.setSname(jTextFieldSName.getText());
            f.setSid(Integer.parseInt(jTextFieldSID.getText()));
            f.setFeed(jTextAreaFeedback.getText());
            if(f.AddFeedBack())
            {resetPanelData();
           // resetPanelData();
                
            }
        }
    }//GEN-LAST:event_jButtonSubmitActionPerformed
protected void resetPanelData() {
        jTextFieldCName.setText("");
        jTextFieldCID.setText("");
        jTextFieldSName.setText("");
        jTextFieldSID.setText("");
        jTextAreaFeedback.setText("");
        
    }
    private void jTextFieldSIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldSIDActionPerformed

    private void jTextFieldCNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCNameActionPerformed

    private void jTextFieldCIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCIDActionPerformed

    private void jTextFieldSNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldSNameActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonSubmit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaFeedback;
    private javax.swing.JTextField jTextFieldCID;
    private javax.swing.JTextField jTextFieldCName;
    private javax.swing.JTextField jTextFieldSID;
    private javax.swing.JTextField jTextFieldSName;
    // End of variables declaration//GEN-END:variables
}
