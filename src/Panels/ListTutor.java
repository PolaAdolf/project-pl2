/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Panels;
import training.center.Tutor;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author User
 */
public class ListTutor extends javax.swing.JPanel {

    /**
     * Creates new form ListTutor
     */
    public ListTutor() {
        initComponents();
        addRowsTojTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Fname", "Lname", "Age", "Salary", "Office H"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 580, 234));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Beshoy sameh\\Desktop\\Project al 5ames\\GUI PHOTOS\\Admin\\add-delete teacher.jpg")); // NOI18N
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -40, 600, 520));
    }// </editor-fold>//GEN-END:initComponents
public void addRowsTojTable() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        Object rowData[] = new Object[7];

        Tutor t = new Tutor();
        ArrayList<Tutor> Tutors = new ArrayList<Tutor>();

        Tutors = t.List();

        for (Tutor x : Tutors) {
            rowData[0] = x.getID();
            rowData[1] = x.getFNname();
            rowData[2] = x.getLName();
            rowData[4] = x.getSalary();
            rowData[3] = x.getAge();
            rowData[5] = x.getoHours();

            model.addRow(rowData);
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
