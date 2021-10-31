/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.time.LocalDateTime;

/**
 *
 * @author Dhaval
 */
public class Encounter {
    private VitalSigns vs;
    private LocalDateTime visitingDate; 
    private int patientId;
    private boolean isPatientNormal;
    
    public Encounter(VitalSigns vitalSigns)
    {
        this.vs = vitalSigns;
    }

    public VitalSigns getVs() {
        return vs;
    }

    public void setVs(VitalSigns vs) {
        this.vs = vs;
    }

    public LocalDateTime getVisitingDate() {
        return visitingDate;
    }

    public void setVisitingDate(LocalDateTime visitingDate) {
        this.visitingDate = visitingDate;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public boolean isIsPatientNormal() {
        return isPatientNormal;
    }

    public void setIsPatientNormal(boolean isPatientNormal) {
        this.isPatientNormal = isPatientNormal;
    }
    
}
