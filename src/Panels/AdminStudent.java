/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Panels;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;


/**
 *
 * @author User
 */
public class AdminStudent extends javax.swing.JPanel {

    /**
     * Creates new form AdminStudent
     */
    GridBagLayout layout = new GridBagLayout();
    AddStudent as = null;
    ListStudent ls= null;
    UpdateStudent us = null;
    Activatecourses ac =null;
    public AdminStudent() {
        initComponents();
        DynamicPanel.setLayout(layout);
        as=new AddStudent();
        ls=new ListStudent();
        us=new UpdateStudent();
        ac=new Activatecourses();
        GridBagConstraints c = new GridBagConstraints();
        c.gridx = 0;
        c.gridy = 0;
        DynamicPanel.add(as,c);
        DynamicPanel.add(ls,c);
        DynamicPanel.add(us,c);
        DynamicPanel.add(ac,c);
        as.setVisible(false);
        ls.setVisible(false);
        us.setVisible(false);
        ac.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jButtonAddstudent = new javax.swing.JButton();
        jButtonListstudent = new javax.swing.JButton();
        jButtonUpdatestudent = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        DynamicPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setOpaque(false);
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setOpaque(false);

        jButtonAddstudent.setFont(new java.awt.Font("Britannic Bold", 0, 11)); // NOI18N
        jButtonAddstudent.setForeground(new java.awt.Color(106, 135, 157));
        jButtonAddstudent.setText("Add Student");
        jButtonAddstudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddstudentActionPerformed(evt);
            }
        });

        jButtonListstudent.setFont(new java.awt.Font("Britannic Bold", 0, 11)); // NOI18N
        jButtonListstudent.setForeground(new java.awt.Color(106, 135, 157));
        jButtonListstudent.setText("List Students");
        jButtonListstudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonListstudentActionPerformed(evt);
            }
        });

        jButtonUpdatestudent.setFont(new java.awt.Font("Britannic Bold", 0, 11)); // NOI18N
        jButtonUpdatestudent.setForeground(new java.awt.Color(106, 135, 157));
        jButtonUpdatestudent.setText("Update/Delete Student");
        jButtonUpdatestudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdatestudentActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Britannic Bold", 0, 11)); // NOI18N
        jButton2.setForeground(new java.awt.Color(106, 135, 157));
        jButton2.setText("Activate Courses");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jButtonAddstudent)
                .addGap(18, 18, 18)
                .addComponent(jButtonListstudent)
                .addGap(18, 18, 18)
                .addComponent(jButtonUpdatestudent)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAddstudent)
                    .addComponent(jButtonUpdatestudent)
                    .addComponent(jButtonListstudent)
                    .addComponent(jButton2))
                .addContainerGap())
        );

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 596, -1));

        DynamicPanel.setOpaque(false);

        javax.swing.GroupLayout DynamicPanelLayout = new javax.swing.GroupLayout(DynamicPanel);
        DynamicPanel.setLayout(DynamicPanelLayout);
        DynamicPanelLayout.setHorizontalGroup(
            DynamicPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        DynamicPanelLayout.setVerticalGroup(
            DynamicPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 470, Short.MAX_VALUE)
        );

        add(DynamicPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 600, 470));

        jLabel1.setFont(new java.awt.Font("Britannic Bold", 0, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(106, 135, 157));
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 0, 602, 540));
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonUpdatestudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdatestudentActionPerformed
        // TODO add your handling code here:
        as.setVisible(false);
        ls.setVisible(false);
        us.setVisible(true);
        ac.setVisible(false);
    }//GEN-LAST:event_jButtonUpdatestudentActionPerformed

    private void jButtonAddstudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddstudentActionPerformed
        // TODO add your handling code here:
        as.setVisible(true);
        ls.setVisible(false);
        us.setVisible(false);
        ac.setVisible(false);
    }//GEN-LAST:event_jButtonAddstudentActionPerformed

    private void jButtonListstudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonListstudentActionPerformed
        // TODO add your handling code here:
        as.setVisible(false);
        ls.setVisible(true);
        us.setVisible(false);
        ac.setVisible(false);
    }//GEN-LAST:event_jButtonListstudentActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        as.setVisible(false);
        ac.setVisible(true);
        us.setVisible(false);
        ls.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel DynamicPanel;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonAddstudent;
    private javax.swing.JButton jButtonListstudent;
    private javax.swing.JButton jButtonUpdatestudent;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
