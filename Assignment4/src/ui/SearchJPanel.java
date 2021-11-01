/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Encounter;
import model.EncounterHistory;
import model.Patient;
import model.PatientDirectory;

/**
 *
 * @author Dhaval
 */
public class SearchJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SearchJPanel
     */
    
    PatientDirectory patientDirectory;
    String SelectedText="";
    public SearchJPanel(PatientDirectory patientDirectory) {
        initComponents();
        this.patientDirectory=patientDirectory;
        displayPatientTableInfo();
        txtSearch1.setVisible(false);
        txtSearch2.setVisible(false);
        btnSearch.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSearchCombo = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        txtSearch1 = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        txtSearch2 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblAbnormalPatient = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblPatient = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(158, 174, 204));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Search Patient");

        jSearchCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Select Criteria--", "Search by Age Group", "Search by Community", "Search by HouseNo", "Search by PatientId" }));
        jSearchCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSearchComboActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Search Abnormal Patient");

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        tblAbnormalPatient.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Patient Id", "Name", "Age", "City", "Community", "House No", "Blood Pressure", "Is Normal"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblAbnormalPatient);

        tblPatient.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Patient Id", "Name", "Age", "City", "Community", "House No", "Blood Pressure", "Is Normal"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tblPatient);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("All Patient List");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 811, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSearchCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtSearch1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSearch2, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSearch)
                .addContainerGap(83, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 783, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSearchCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSearch1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch)
                    .addComponent(txtSearch2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(63, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
            ArrayList<Patient> patientList = patientDirectory.getPatientList();
            
            if(SelectedText =="Search by Age Group")
            {
                int minAge = Integer.parseInt(txtSearch1.getText());
                int maxAge = Integer.parseInt(txtSearch2.getText());
                List<Patient> newpatientList= patientList.stream().filter(a -> a.getPersonAge()>=minAge && a.getPersonAge()<=maxAge && a.isIsNormal() == false).collect(Collectors.toList());
                if(newpatientList.size() == 0)
                {
                    JOptionPane.showMessageDialog(this, "No data Found");
                }
                displayAbnormalPatientTableInfo(newpatientList);
            }
            else if(SelectedText =="Search by Community")
            {
                String communityName = txtSearch1.getText();
                List<Patient> newpatientList = patientList.stream().filter(a -> a.getHousing().getCommunityName().contains(communityName) && a.isIsNormal()== false).collect(Collectors.toList());;
                if(newpatientList.size() == 0)
                {
                    JOptionPane.showMessageDialog(this, "No data Found");
                }
                displayAbnormalPatientTableInfo(newpatientList);
            }
            else if(SelectedText =="Search by HouseNo")
            {
                int HouseNo = Integer.parseInt(txtSearch1.getText());
                List<Patient> newpatientList = patientList.stream().filter(a -> a.getHousing().getHouseNo()== HouseNo && a.isIsNormal()==false).collect(Collectors.toList());;
                 if(newpatientList.size() == 0)
                {
                    JOptionPane.showMessageDialog(this, "No data Found");
                }
                displayAbnormalPatientTableInfo(newpatientList);
            }
            else if(SelectedText =="Search by PatientId")
            {
                int PatientId = Integer.parseInt(txtSearch1.getText());
                List<Patient> newpatientList= patientList.stream().filter(a -> a.getPatientId()==PatientId && a.isIsNormal()==false).collect(Collectors.toList());
                 if(newpatientList.size() == 0)
                {
                    JOptionPane.showMessageDialog(this, "No data Found");
                }
                displayAbnormalPatientTableInfo(newpatientList);
            }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void jSearchComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSearchComboActionPerformed
        // TODO add your handling code here:
        SelectedText=jSearchCombo.getSelectedItem().toString();
        if(SelectedText =="Search by Age Group")
            {
                txtSearch1.setVisible(true);
                txtSearch2.setVisible(true);
                btnSearch.setVisible(true);
            }
            else if(SelectedText =="Search by Community")
            {
                txtSearch1.setVisible(true);
                txtSearch2.setVisible(false);
                btnSearch.setVisible(true);
            }
            else if(SelectedText =="Search by HouseNo")
            {
                txtSearch1.setVisible(true);
                txtSearch2.setVisible(false);
                btnSearch.setVisible(true);
            }
            else if(SelectedText =="Search by PatientId")
            {
                txtSearch1.setVisible(true);
                txtSearch2.setVisible(false);
                btnSearch.setVisible(true);
            }
            else
            {
                txtSearch1.setVisible(false);
                txtSearch2.setVisible(false);
                btnSearch.setVisible(false);
            }
        
    }//GEN-LAST:event_jSearchComboActionPerformed

    
    private void displayAbnormalPatientTableInfo(List<Patient> patientList) {
        //btnSave.setVisible(false);
        DefaultTableModel model=(DefaultTableModel) tblAbnormalPatient.getModel();
        model.setRowCount(0);
        for(Patient p : patientList){
            Object[] row =new Object[8];
            row[0]=p.getPatientId();
            row[1]=p.getPersonName();
            row[2]=p.getPersonAge();
            row[3]=p.getHousing().getCityname(); 
            row[4]=p.getHousing().getCommunityName(); 
            row[5]=p.getHousing().getHouseNo(); 
            row[6]=p.getVs().getBloodPressure();
            row[7]=p.isIsNormal()? "Normal" : "Abnormal";
            model.addRow(row);
        }
    }
    
    private void displayPatientTableInfo() {
        //btnSave.setVisible(false);
        DefaultTableModel model=(DefaultTableModel) tblPatient.getModel();
        model.setRowCount(0);
        for(Patient p : patientDirectory.getPatientList()){
            Object[] row =new Object[10];
            row[0]=p.getPatientId();
            row[1]=p.getPersonName();
            row[2]=p.getPersonAge();
            row[3]=p.getHousing().getCityname(); 
            row[4]=p.getHousing().getCommunityName(); 
            row[5]=p.getHousing().getHouseNo(); 
            row[6]=p.getVs().getBloodPressure();
            row[7]=p.isIsNormal()? "Normal" : "Abnormal";
            model.addRow(row);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JComboBox<String> jSearchCombo;
    private javax.swing.JTable tblAbnormalPatient;
    private javax.swing.JTable tblPatient;
    private javax.swing.JTextField txtSearch1;
    private javax.swing.JTextField txtSearch2;
    // End of variables declaration//GEN-END:variables
}