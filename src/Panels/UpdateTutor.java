/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Panels;
import training.center.Tutor;
import training.center.MyException;
/**
 *
 * @author User
 */
public class UpdateTutor extends javax.swing.JPanel {

    /**
     * Creates new form UpdateTutor
     */
    public UpdateTutor() {
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

        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        jTextFieldSearchKey = new javax.swing.JTextField();
        jTextFieldSalary = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldFname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldLname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldEmail = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        jPasswordField2 = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldAge = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextFieldOfficeHours = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextFieldUserName = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        Message = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setOpaque(false);
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnUpdate.setFont(new java.awt.Font("Britannic Bold", 0, 11)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(106, 135, 157));
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 410, -1, -1));

        btnDelete.setFont(new java.awt.Font("Britannic Bold", 0, 11)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(106, 135, 157));
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 410, -1, -1));

        btnSearch.setFont(new java.awt.Font("Britannic Bold", 0, 11)); // NOI18N
        btnSearch.setForeground(new java.awt.Color(106, 135, 157));
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 40, -1, -1));

        jTextFieldSearchKey.setFont(new java.awt.Font("Britannic Bold", 0, 11)); // NOI18N
        jTextFieldSearchKey.setForeground(new java.awt.Color(106, 135, 157));
        add(jTextFieldSearchKey, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 311, -1));

        jTextFieldSalary.setFont(new java.awt.Font("Britannic Bold", 0, 11)); // NOI18N
        jTextFieldSalary.setForeground(new java.awt.Color(106, 135, 157));
        add(jTextFieldSalary, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 360, 70, -1));

        jLabel8.setFont(new java.awt.Font("Berlin Sans FB", 1, 15)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(106, 135, 157));
        jLabel8.setText("Salary");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 360, -1, -1));

        jLabel1.setFont(new java.awt.Font("Berlin Sans FB", 1, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(106, 135, 157));
        jLabel1.setText("ID");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, -1, -1));

        jTextFieldID.setFont(new java.awt.Font("Britannic Bold", 0, 11)); // NOI18N
        jTextFieldID.setForeground(new java.awt.Color(106, 135, 157));
        add(jTextFieldID, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 298, -1));

        jLabel2.setFont(new java.awt.Font("Berlin Sans FB", 1, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(106, 135, 157));
        jLabel2.setText("First name");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, -1, -1));

        jTextFieldFname.setFont(new java.awt.Font("Britannic Bold", 0, 11)); // NOI18N
        jTextFieldFname.setForeground(new java.awt.Color(106, 135, 157));
        add(jTextFieldFname, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 298, -1));

        jLabel3.setFont(new java.awt.Font("Berlin Sans FB", 1, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(106, 135, 157));
        jLabel3.setText("Last name");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, -1, -1));

        jTextFieldLname.setFont(new java.awt.Font("Britannic Bold", 0, 11)); // NOI18N
        jTextFieldLname.setForeground(new java.awt.Color(106, 135, 157));
        add(jTextFieldLname, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 298, -1));

        jLabel4.setFont(new java.awt.Font("Berlin Sans FB", 1, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(106, 135, 157));
        jLabel4.setText("Email");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, -1, -1));

        jTextFieldEmail.setFont(new java.awt.Font("Britannic Bold", 0, 11)); // NOI18N
        jTextFieldEmail.setForeground(new java.awt.Color(106, 135, 157));
        jTextFieldEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEmailActionPerformed(evt);
            }
        });
        add(jTextFieldEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 298, -1));

        jLabel5.setFont(new java.awt.Font("Berlin Sans FB", 1, 15)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(106, 135, 157));
        jLabel5.setText("Password");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, -1, -1));

        jPasswordField1.setFont(new java.awt.Font("Britannic Bold", 0, 11)); // NOI18N
        jPasswordField1.setForeground(new java.awt.Color(106, 135, 157));
        add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, 298, -1));

        jLabel6.setFont(new java.awt.Font("Berlin Sans FB", 1, 15)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(106, 135, 157));
        jLabel6.setText("Repeat Pass");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, -1, -1));

        jPasswordField2.setFont(new java.awt.Font("Britannic Bold", 0, 11)); // NOI18N
        jPasswordField2.setForeground(new java.awt.Color(106, 135, 157));
        add(jPasswordField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 280, 298, -1));

        jLabel7.setFont(new java.awt.Font("Berlin Sans FB", 1, 15)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(106, 135, 157));
        jLabel7.setText("Age");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 320, -1, -1));

        jTextFieldAge.setFont(new java.awt.Font("Britannic Bold", 0, 11)); // NOI18N
        jTextFieldAge.setForeground(new java.awt.Color(106, 135, 157));
        add(jTextFieldAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 320, 70, -1));

        jLabel10.setFont(new java.awt.Font("Berlin Sans FB", 1, 15)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(106, 135, 157));
        jLabel10.setText("Office Hours");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 320, -1, -1));

        jTextFieldOfficeHours.setFont(new java.awt.Font("Britannic Bold", 0, 11)); // NOI18N
        jTextFieldOfficeHours.setForeground(new java.awt.Color(106, 135, 157));
        add(jTextFieldOfficeHours, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 320, 70, -1));

        jLabel11.setFont(new java.awt.Font("Britannic Bold", 1, 15)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(106, 135, 157));
        jLabel11.setText("UserName");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 64, 90, 20));

        jTextFieldUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldUserNameActionPerformed(evt);
            }
        });
        add(jTextFieldUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, 110, 20));

        jLabel12.setFont(new java.awt.Font("Berlin Sans FB", 1, 15)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(106, 135, 157));
        jLabel12.setText("Write Tutor ID");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, -1, -1));

        Message.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        Message.setForeground(new java.awt.Color(255, 0, 0));
        add(Message, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 354, 90, 30));

        jLabel9.setFont(new java.awt.Font("Britannic Bold", 0, 11)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(106, 135, 157));
        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\Beshoy sameh\\Desktop\\Project al 5ames\\GUI PHOTOS\\Admin\\add-delete teacher.jpg")); // NOI18N
        jLabel9.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 480));
    }// </editor-fold>//GEN-END:initComponents
MyException e=new MyException();
    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        jTextFieldUserName.setText(e.checkFoundUserName(jTextFieldUserName.getText()));
        jTextFieldID.setText(e.CheckPositive(jTextFieldID.getText()));
        jTextFieldID.setText(e.checkFoundIdStudent(jTextFieldID.getText()));
        jTextFieldAge.setText(e.CheckPositive(jTextFieldAge.getText()));
        jTextFieldSalary.setText(e.CheckPositive(jTextFieldSalary.getText()));
        jTextFieldEmail.setText(e.checkEmail(jTextFieldEmail.getText()));
        jPasswordField1.setText(e.checkPassLength(jPasswordField1.getText()));
        jTextFieldOfficeHours.setText(e.CheckPositive(jTextFieldOfficeHours.getText()));
        if (!jTextFieldSearchKey.getText().equals("") && !jTextFieldUserName.getText().equals("") &&!jTextFieldID.getText().equals("") && !jTextFieldFname.getText().equals("") && !jTextFieldLname.getText().equals("") && !jTextFieldEmail.getText().equals("") && !jPasswordField1.getText().equals("") && !jPasswordField2.getText().equals("") && !jTextFieldAge.getText().equals("") && !jTextFieldOfficeHours.getText().equals("") && !jTextFieldSalary.getText().equals("")) {
            Tutor x = new Tutor();
            x.setID(Integer.parseInt(jTextFieldID.getText()));
            x.setFName(jTextFieldFname.getText());
            x.setLName(jTextFieldLname.getText());
            x.setUserName(jTextFieldUserName.getText());
            x.setEmail(jTextFieldEmail.getText());
            if (jPasswordField1.getText().equals(jPasswordField2.getText())) {
                x.setPass(jPasswordField1.getText());
            }

            x.setAge(Integer.parseInt(jTextFieldAge.getText()));
            x.setHours(Integer.parseInt(jTextFieldOfficeHours.getText()));
            x.setSalary(Double.parseDouble(jTextFieldSalary.getText()));

            if (x.Update()) {
                Message.setText("Updated Successfully ... !");
                resetPanelData();
            } else {
                Message.setText("Failed to Update ... !");
            }
        } else {
            Message.setText("Missing required Fields ... !  Please, complete them before submit ...!");
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        if (!jTextFieldSearchKey.getText().equals("")) {
            Tutor x = new Tutor();
            if (x.Delete(Integer.parseInt(jTextFieldSearchKey.getText()))) {
                Message.setText("Deleted Successfully ... !");
                resetPanelData();
            } else {
                Message.setText("Failed to delete ... !");
            }
        } else {
            Message.setText("Missing required Fields ... !  Please, Search By ID before submit ...!");
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        jTextFieldSearchKey.setText(e.CheckPositive(jTextFieldSearchKey.getText()));
        if (!jTextFieldSearchKey.getText().equals("")) {
           Tutor x = new Tutor();
            Tutor returned = x.Search(Integer.parseInt(jTextFieldSearchKey.getText()));
            if (returned.getID() > 0) {
                setPanelData(returned);
            } else {
                Message.setText("Not Found ...!");
            }
        } else {
            Message.setText("Missing required Fields ... !  Please, Search By ID before submit ...!");
        }
    }//GEN-LAST:event_btnSearchActionPerformed

     protected void resetPanelData() {
        jTextFieldSearchKey.setText("");
        jTextFieldUserName.setText("");
        jTextFieldID.setText("");
        jTextFieldFname.setText("");
        jTextFieldLname.setText("");
        jTextFieldEmail.setText("");
        jPasswordField1.setText("");
        jPasswordField2.setText("");
        jTextFieldAge.setText("");
        jTextFieldOfficeHours.setText("");
        jTextFieldSalary.setText("");
     
    }

    protected void setPanelData(Tutor x) {
      //  jTextFieldSearchCourse.setText("" + x.getID());
       // jTextFieldSearchKey.setText("");
        jTextFieldUserName.setText("" + x.getuserName() );
        jTextFieldID.setText("" + x.getID());
        jTextFieldFname.setText("" + x.getFNname());
        jTextFieldLname.setText("" + x.getLName());
        jTextFieldEmail.setText("" + x.getEmail());
        jPasswordField1.setText("" + x.getPass());
        jPasswordField2.setText("" + x.getPass());
        jTextFieldAge.setText("" + x.getAge());
        jTextFieldOfficeHours.setText("" + x.getoHours());
        jTextFieldSalary.setText("" + x.getSalary());
        
    }
    
    private void jTextFieldUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldUserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldUserNameActionPerformed

    private void jTextFieldEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEmailActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Message;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JTextField jTextFieldAge;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldFname;
    private javax.swing.JTextField jTextFieldID;
    private javax.swing.JTextField jTextFieldLname;
    private javax.swing.JTextField jTextFieldOfficeHours;
    private javax.swing.JTextField jTextFieldSalary;
    private javax.swing.JTextField jTextFieldSearchKey;
    private javax.swing.JTextField jTextFieldUserName;
    // End of variables declaration//GEN-END:variables
}
