/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Dhaval
 */
public class CarModelHistory {
    private ArrayList<CarModel> carHistory;
    private ArrayList<CarModel> tempCarData;

    public ArrayList<CarModel> getTempCarData() {
        return tempCarData;
    }

    public void setTempCarData(ArrayList<CarModel> tempCarData) {
        this.tempCarData = tempCarData;
    }
    private LocalDateTime UpdatedDate;

    public LocalDateTime getUpdatedDate() {
        return UpdatedDate;
    }

    public void setUpdatedDate(LocalDateTime UpdatedDate) {
        this.UpdatedDate = UpdatedDate;
    }
    
    public CarModelHistory(){
        this.carHistory = new ArrayList<CarModel>();
    }

    public ArrayList<CarModel> getCarHistory() {
        return carHistory;
    }

    public void setCarHistory(ArrayList<CarModel> carHistory) {
        this.carHistory = carHistory;
    }
    
    public CarModel addNewCar(){
        CarModel newCar=new CarModel();
        carHistory.add(newCar);
        return newCar;
    }
    
    public void updateCarInfo(int position,CarModel cm){
        carHistory.set(position,cm);
    }
    
}
