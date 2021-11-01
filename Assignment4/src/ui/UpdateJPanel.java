/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Encounter;
import model.EncounterHistory;
import model.Housing;
import model.Patient;
import model.PatientDirectory;
import model.Person;
import model.PersonDirectory;
import model.VitalSigns;

/**
 *
 * @author Dhaval
 */

public class UpdateJPanel extends javax.swing.JPanel {

    /**
     * Creates new form UpdateJPanel
     */
    
    PersonDirectory personDirectory;
    PatientDirectory patientDirectory;
    EncounterHistory encounterHistory;
    
    public UpdateJPanel(PersonDirectory personDirectory,PatientDirectory patientDirectory,EncounterHistory encounterHistory) {
        initComponents();
        this.personDirectory=personDirectory;
        this.patientDirectory=patientDirectory;
        this.encounterHistory=encounterHistory;
        displayPersonTableInfo();
        displayPatientTableInfo();
        lblBP.setVisible(false);
        txtBP.setVisible(false);
        btnCheck.setVisible(false);
        btnSave.setVisible(false);
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
        tblPerson = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();
        btnView = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnEncounter = new javax.swing.JButton();
        lblBP = new javax.swing.JLabel();
        txtBP = new javax.swing.JTextField();
        btnCheck = new javax.swing.JButton();
        lblCity = new javax.swing.JLabel();
        jCityCombo = new javax.swing.JComboBox<>();
        lblCommunity = new javax.swing.JLabel();
        jCommunityCombo = new javax.swing.JComboBox<>();
        lblHouseNo = new javax.swing.JLabel();
        jHousingCombo = new javax.swing.JComboBox<>();
        lblFirstName = new javax.swing.JLabel();
        txtFirstName = new javax.swing.JTextField();
        lblLastName = new javax.swing.JLabel();
        txtLastName = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lblAge = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        lblAddress = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        lblZipCode = new javax.swing.JLabel();
        txtZipcode = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblPatient = new javax.swing.JTable();
        lblPersonId = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();

        setBackground(new java.awt.Color(158, 174, 204));

        tblPerson.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Person Id", "Name", "Age", "City", "Community", "HouseNo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblPerson);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("View/ Update Person");

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnView.setText("View");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnEncounter.setText("Encounter");
        btnEncounter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEncounterActionPerformed(evt);
            }
        });

        lblBP.setText("Blood Pressure");

        btnCheck.setText("Check");
        btnCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckActionPerformed(evt);
            }
        });

        lblCity.setText("City:");

        jCityCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Select City --", "Boston" }));
        jCityCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCityComboActionPerformed(evt);
            }
        });

        lblCommunity.setText("Community:");

        jCommunityCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCommunityComboActionPerformed(evt);
            }
        });

        lblHouseNo.setText("HouseNo:");

        lblFirstName.setText("First Name:");

        lblLastName.setText("Last Name:");

        lblEmail.setText("Email:");

        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEmailKeyReleased(evt);
            }
        });

        lblAge.setText("Age:");

        lblAddress.setText("Address:");

        lblZipCode.setText("Zipcode:");

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

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
        jScrollPane2.setViewportView(tblPatient);

        lblPersonId.setText("Unique Id:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(btnUpdate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnView)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDelete)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEncounter)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblBP, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(txtBP, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCheck, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 169, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblHouseNo, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jHousingCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(lblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(lblAge, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(8, 8, 8)
                                        .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(345, 345, 345)
                                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblZipCode, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtZipcode, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblPersonId, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCommunityCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(16, 16, 16)
                                .addComponent(lblLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblCity, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCityCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(16, 16, 16)
                                .addComponent(lblFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jCityCombo, jCommunityCombo, jHousingCombo, txtAddress, txtZipcode});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lblAddress, lblCity, lblCommunity, lblHouseNo, lblZipCode});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lblAge, lblEmail, lblFirstName, lblLastName, lblPersonId});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtAge, txtEmail, txtFirstName, txtId, txtLastName});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdate)
                    .addComponent(btnView)
                    .addComponent(btnDelete)
                    .addComponent(btnEncounter)
                    .addComponent(lblBP)
                    .addComponent(txtBP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCheck))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCity, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCityCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCommunityCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHouseNo, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jHousingCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAge, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtZipcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblZipCode, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPersonId, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addComponent(btnSave)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jCityComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCityComboActionPerformed
        // TODO add your handling code here:
        DefaultComboBoxModel model = new DefaultComboBoxModel();
        model.addElement("Rural");
        model.addElement("Urban");
        model.addElement("Suburban");
        jCommunityCombo.setModel(model);
    }//GEN-LAST:event_jCityComboActionPerformed

    private void jCommunityComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCommunityComboActionPerformed
        // TODO add your handling code here:
        DefaultComboBoxModel model = new DefaultComboBoxModel();
        if(jCommunityCombo.getSelectedItem() != null)
        {
            if(jCommunityCombo.getSelectedItem().toString() == "Rural")
            {
                model.addElement("1011");
                model.addElement("1012");
                model.addElement("1013");
            }
            else if(jCommunityCombo.getSelectedItem().toString() == "Urban")
            {
                model.addElement("2011");
                model.addElement("2012");
                model.addElement("2013");
            }
            else if(jCommunityCombo.getSelectedItem().toString() == "Suburban")
            {
                model.addElement("301");
                model.addElement("302");
                model.addElement("303");
            }
            jHousingCombo.setModel(model);
        }
    }//GEN-LAST:event_jCommunityComboActionPerformed

    private void btnEncounterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEncounterActionPerformed
        // TODO add your handling code here:
        btnSave.setVisible(false);
        int selectedRowIndex = tblPerson.getSelectedRow();
        if(selectedRowIndex > 0)
        {
            lblBP.setVisible(true);
            txtBP.setVisible(true);
            btnCheck.setVisible(true);
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Please select one Person to Encounter");
        }
    }//GEN-LAST:event_btnEncounterActionPerformed

    private void btnCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblPerson.getSelectedRow();
        if(txtBP.getText() != "")
        {
            Person selectedPerson=personDirectory.getPersonList().get(selectedRowIndex);
            int bloodPressure = Integer.parseInt(txtBP.getText());
            VitalSigns vs = new VitalSigns();
            vs.setBloodPressure(bloodPressure);
            Housing housing = new Housing();
            Patient pe = new Patient("",0,"",housing,vs);
            boolean isNormal = pe.isPatientNormal(selectedPerson.getPersonAge());

            if(patientDirectory.getPatientList().stream().filter(a -> a.getId() == selectedPerson.getId()).collect(Collectors.toList()).size()== 0)
            {
                patientDirectory.AddPatient(pe);
                int PatientId= getPatientId();
                pe.setId(selectedPerson.getId());
                pe.setPersonAge(selectedPerson.getPersonAge());
                pe.setPersonName(selectedPerson.getPersonName());
                pe.setHousing(selectedPerson.getHousing());
                pe.setIsNormal(isNormal);
                pe.setPatientId(PatientId);
                pe.setVs(vs);
                displayPatientTableInfo();
            }
            else
            {
                pe = patientDirectory.getPatientList().stream().filter(a -> a.getId() == selectedPerson.getId()).collect(Collectors.toList()).get(0);
                pe.setIsNormal(isNormal);
                pe.setVs(vs);
                displayPatientTableInfo();
            }

            Encounter encounter = new Encounter(vs);
            encounterHistory.AddEncounter(encounter);
            encounter.setPatientId(pe.getPatientId());
            encounter.setVisitingDate(LocalDateTime.now());
            encounter.setIsPatientNormal(pe.isIsNormal());
            encounter.setVs(vs);
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Please enter Blood Pressure rate");
        }
        
    }//GEN-LAST:event_btnCheckActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        btnSave.setVisible(false);
        lblBP.setVisible(false);
        txtBP.setVisible(false);
        btnCheck.setVisible(false);

        int selectedRowIndex = tblPerson.getSelectedRow();
        if(selectedRowIndex > 0)
        {
            Person selectedPerson=personDirectory.getPersonList().get(selectedRowIndex);
            if(patientDirectory.getPatientList().size() > 0)
            {
                Patient pe = patientDirectory.getPatientList().stream().filter(a -> a.getId().equals(selectedPerson.getId())).collect(Collectors.toList()).get(0);
                List<Encounter> newEncounterList = encounterHistory.getEncounterList().stream().filter(a -> a.getPatientId() == pe.getPatientId()).collect(Collectors.toList());
                for(Encounter e : newEncounterList)
                {
                    encounterHistory.removeEncounterHistory(encounterHistory.getEncounterList().indexOf(e));
                }
                patientDirectory.removePatient(patientDirectory.getPatientList().indexOf(pe));
            }
            personDirectory.removePerson(selectedRowIndex);
            displayPersonTableInfo();
            displayPatientTableInfo();
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Please select one Person to Delete all details");
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
        btnSave.setVisible(false);
        lblBP.setVisible(false);
        txtBP.setVisible(false);
        btnCheck.setVisible(false);

        int selectedRowIndex = tblPerson.getSelectedRow();
        if(selectedRowIndex > 0)
        {
            Person selectedPerson=personDirectory.getPersonList().get(selectedRowIndex);
            DefaultComboBoxModel model = new DefaultComboBoxModel();
            model.addElement("Boston");
            jCityCombo.setModel(model);
            jCityCombo.setSelectedItem(selectedPerson.getHousing().getCityname());

            DefaultComboBoxModel Communitymodel = new DefaultComboBoxModel();
            Communitymodel.addElement("Rural");
            Communitymodel.addElement("Urban");
            Communitymodel.addElement("Suburban");
            jCommunityCombo.setModel(Communitymodel);
            jCommunityCombo.setSelectedItem(selectedPerson.getHousing().getCommunityName());

            DefaultComboBoxModel Housingmodel = new DefaultComboBoxModel();
            if(jCommunityCombo.getSelectedItem().toString() == "Rural")
            { 
                Housingmodel.addElement("1011");
                Housingmodel.addElement("1012");
                Housingmodel.addElement("1013"); 
            }
            else if(jCommunityCombo.getSelectedItem().toString() == "Urban")
            {
                Housingmodel.addElement("2011");
                Housingmodel.addElement("2012");
                Housingmodel.addElement("2013"); 
            }
            else if(jCommunityCombo.getSelectedItem().toString() == "Suburban")
            {
                Housingmodel.addElement("3011");
                Housingmodel.addElement("3012");
                Housingmodel.addElement("3013"); 
            }
            jHousingCombo.setModel(Housingmodel);
            jHousingCombo.setSelectedItem(String.valueOf(selectedPerson.getHousing().getHouseNo()));

            txtAddress.setText(selectedPerson.getHousing().getAddress());
            txtZipcode.setText(String.valueOf(selectedPerson.getHousing().getZipcode()));
            txtFirstName.setText(selectedPerson.getPersonName().split("\\s+")[0]);
            txtLastName.setText(selectedPerson.getPersonName().split("\\s+")[1]);
            txtEmail.setText(String.valueOf(selectedPerson.getEmail()));
            txtAge.setText(String.valueOf(selectedPerson.getPersonAge()));
            txtId.setText(selectedPerson.getId());
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Please select one Person to View all details");
        }
    }//GEN-LAST:event_btnViewActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        lblBP.setVisible(false);
        txtBP.setVisible(false);
        btnCheck.setVisible(false);
        int selectedRowIndex = tblPerson.getSelectedRow();
        if(selectedRowIndex >= 0)
        {
            btnSave.setVisible(true);
            Person selectedPerson=personDirectory.getPersonList().get(selectedRowIndex);
            DefaultComboBoxModel model = new DefaultComboBoxModel();
            model.addElement("Boston");
            jCityCombo.setModel(model);
            jCityCombo.setSelectedItem(selectedPerson.getHousing().getCityname());

            DefaultComboBoxModel Communitymodel = new DefaultComboBoxModel();
            Communitymodel.addElement("Rural");
            Communitymodel.addElement("Urban");
            Communitymodel.addElement("Suburban");
            jCommunityCombo.setModel(Communitymodel);
            jCommunityCombo.setSelectedItem(selectedPerson.getHousing().getCommunityName());

            DefaultComboBoxModel Housingmodel = new DefaultComboBoxModel();
            if(jCommunityCombo.getSelectedItem().toString() == "Rural")
            { 
                Housingmodel.addElement("1011");
                Housingmodel.addElement("1012");
                Housingmodel.addElement("1013"); 
            }
            else if(jCommunityCombo.getSelectedItem().toString() == "Urban")
            {
                Housingmodel.addElement("2011");
                Housingmodel.addElement("2012");
                Housingmodel.addElement("2013"); 
            }
            else if(jCommunityCombo.getSelectedItem().toString() == "Suburban")
            {
                Housingmodel.addElement("3011");
                Housingmodel.addElement("3012");
                Housingmodel.addElement("3013"); 
            }
            jHousingCombo.setModel(Housingmodel);
            jHousingCombo.setSelectedItem(String.valueOf(selectedPerson.getHousing().getHouseNo()));

            txtAddress.setText(selectedPerson.getHousing().getAddress());
            txtZipcode.setText(String.valueOf(selectedPerson.getHousing().getZipcode()));
            txtFirstName.setText(selectedPerson.getPersonName().split("\\s+")[0]);
            txtLastName.setText(selectedPerson.getPersonName().split("\\s+")[1]);
            txtEmail.setText(String.valueOf(selectedPerson.getEmail()));
            txtAge.setText(String.valueOf(selectedPerson.getPersonAge()));
            txtId.setText(selectedPerson.getId());
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Please select one Person Information to update");
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        if(txtId.getText() == "" || txtAge.getText() == "" || txtFirstName.getText()== "" || txtLastName.getText() == ""
           || txtAddress.getText()== "" || jHousingCombo.getSelectedItem() == "" || jHousingCombo.getSelectedItem()== "--Select House No--" ||
           jCityCombo.getSelectedItem() == "" || jCityCombo.getSelectedItem() == "-- Select City --" || jCommunityCombo.getSelectedItem() =="" || jCommunityCombo.getSelectedItem() == "--Select Community--"||
            txtZipcode.getText() == "")
        {
            JOptionPane.showMessageDialog(this, "Please fill all details");
        }
        else
        {
            int selectedRowIndex = tblPerson.getSelectedRow();
            Person person = personDirectory.getPersonList().get(selectedRowIndex);
            person.setId(txtId.getText());
            person.setPersonAge(Integer.parseInt(txtAge.getText()));
            person.setPersonName(txtFirstName.getText() + " " + txtLastName.getText());
            person.setEmail(txtEmail.getText());
            Housing house = new Housing();
            house.setAddress(txtAddress.getText());
            house.setHouseNo(Integer.parseInt(jHousingCombo.getSelectedItem().toString()));
            house.setCityname(jCityCombo.getSelectedItem().toString());
            house.setCommunityName(jCommunityCombo.getSelectedItem().toString());
            house.setZipcode(Integer.parseInt(txtZipcode.getText()));
            person.setHousing(house);
            JOptionPane.showMessageDialog(this, "Person Information Updated");

            if(patientDirectory.getPatientList().size() > 0)
            {
                System.out.println(patientDirectory.getPatientList().get(0).getId());
                Patient pe = patientDirectory.getPatientList().stream().filter(a -> a.getId().equals(person.getId())).collect(Collectors.toList()).get(0);
                pe.setPersonAge(person.getPersonAge());
                pe.setPersonName(person.getPersonName());
                pe.setHousing(person.getHousing());
            }

            displayPersonTableInfo();
            displayPatientTableInfo();

            btnSave.setVisible(false);
            txtAge.setText("");
            txtEmail.setText("");
            txtFirstName.setText("");
            txtLastName.setText("");
            txtAddress.setText("");
            jHousingCombo.setSelectedItem(null);
            jCityCombo.setSelectedItem(null);
            jCommunityCombo.setSelectedItem(null);
            txtZipcode.setText("");
            txtId.setText("");
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void txtEmailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyReleased
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtEmailKeyReleased

     private void displayPersonTableInfo() {
        //btnSave.setVisible(false);
        DefaultTableModel model=(DefaultTableModel) tblPerson.getModel();
        model.setRowCount(0);
        for(Person p : personDirectory.getPersonList()){
            Object[] row =new Object[10];
            row[0]=p.getId();
            row[1]=p.getPersonName();
            row[2]=p.getPersonAge();
            row[3]=p.getHousing().getCityname(); 
            row[4]=p.getHousing().getCommunityName(); 
            row[5]=p.getHousing().getHouseNo(); 
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
     
     private int getPatientId()
     {
         int PatientId=1;
         if(patientDirectory.getPatientList().size() > 0)
         {
             ArrayList<Integer> patientIdArr = new ArrayList<Integer>();
            for(int i=0; i<patientDirectory.getPatientList().size() ; i++ )
            {
                patientIdArr.add(patientDirectory.getPatientList().get(i).getPatientId());
            }
            Collections.sort(patientIdArr);
            PatientId = patientIdArr.get(patientIdArr.size()-1)+ 1;
         }
         return PatientId;
     }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCheck;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEncounter;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnView;
    private javax.swing.JComboBox<String> jCityCombo;
    private javax.swing.JComboBox<String> jCommunityCombo;
    private javax.swing.JComboBox<String> jHousingCombo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblBP;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblCommunity;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblFirstName;
    private javax.swing.JLabel lblHouseNo;
    private javax.swing.JLabel lblLastName;
    private javax.swing.JLabel lblPersonId;
    private javax.swing.JLabel lblZipCode;
    private javax.swing.JTable tblPatient;
    private javax.swing.JTable tblPerson;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtBP;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtZipcode;
    // End of variables declaration//GEN-END:variables
}
