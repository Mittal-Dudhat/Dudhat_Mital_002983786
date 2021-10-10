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
public class CarModel {
    private boolean isAvailable;
    private String manufracturer;
    private int year;
    private int noOfSeats;
    private String vehRegNo;
    private String modelNo;
    private boolean isUsedByUber;
    //private String catalogDate;
    private String city;
    private String maintainanceCertificateDate;
    private LocalDateTime UpdatedDate;

    public LocalDateTime getUpdatedDate() {
        return UpdatedDate;
    }

    public void setUpdatedDate(LocalDateTime  UpdatedDate) {
        this.UpdatedDate = UpdatedDate;
    }

    public boolean isIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public String getManufracturer() {
        return manufracturer;
    }

    public void setManufracturer(String manufracturer) {
        this.manufracturer = manufracturer;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getNoOfSeats() {
        return noOfSeats;
    }

    public void setNoOfSeats(int noOfSeats) {
        this.noOfSeats = noOfSeats;
    }

    public String getVehRegNo() {
        return vehRegNo;
    }

    public void setVehRegNo(String vehRegNo) {
        this.vehRegNo = vehRegNo;
    }

    public String getModelNo() {
        return modelNo;
    }

    public void setModelNo(String modelNo) {
        this.modelNo = modelNo;
    }

    public boolean isIsUsedByUber() {
        return isUsedByUber;
    }

    public void setIsUsedByUber(boolean isUsedByUber) {
        this.isUsedByUber = isUsedByUber;
    }

//    public String getCatalogDate() {
//        return catalogDate;
//    }
//
//    public void setCatalogDate(String catalogDate) {
//        this.catalogDate = catalogDate;
//    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getMaintainanceCertificateDate() {
        return maintainanceCertificateDate;
    }

    public void setMaintainanceCertificateDate(String maintainanceCertificateDate) {
        this.maintainanceCertificateDate = maintainanceCertificateDate;
    }
}
