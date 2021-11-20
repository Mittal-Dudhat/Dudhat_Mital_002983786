/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

/**
 *
 * @author Dhaval
 */
public class Dishes {
    private String dishName;
    private String dishAmount;
    private String description;
    
    public Dishes(String dishName,String description,String dishAmount) {
        this.dishName=dishName;
        this.dishAmount=dishAmount;
        this.description=description;
    }

    public String getdishName() {
        return dishName;
    }

    public void setdishName(String name) {
        this.dishName = name;
    }

    public String getDishAmount() {
        return dishAmount;
    }

    public void setDishAmount(String amount) {
        this.dishAmount = amount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    @Override
    public String toString() {
        return dishName;
    }
}
