/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class RestaurantDirectory {
    private Restaurant restaurant;
    private ArrayList<Restaurant> restaurantList;
    private Dishes menu;

    public RestaurantDirectory(){
        this.restaurantList=new ArrayList<Restaurant>();
    }
    
    public Restaurant createRestaurantInfo(String uName){
            restaurant= new Restaurant(uName);
            restaurantList.add(restaurant);
            return restaurant;
    }
    
    public void deleteRestaurant(String username){
        for(int i=0;i<restaurantList.size();i++){
            if(restaurantList.get(i).getRestaurantName().equals(username)){
                restaurantList.remove(i);
            }
        }
    }
    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public ArrayList<Restaurant> getRestaurantList() {
        return restaurantList;
    }

    public void setRestaurantList(ArrayList<Restaurant> restaurantList) {
        this.restaurantList = restaurantList;
    }
    
    public Dishes AddMenuDishes(Restaurant restaurant,String name,String desc,String amount){
        menu=new Dishes(name, desc, amount);
        restaurant.addDishes(menu);
        return menu;
    }
    
    public void DeleteDishes(Restaurant restaurant,Dishes menu){
        restaurant.removeDishes(menu); 
    }
    
    public void updateRestaurantInfo(Restaurant restraurant,String name,String number,String address){
        restraurant.setRestaurantName(name);
        restraurant.setAddress(address);
        restraurant.setContactNo(number);
    }
    
   /* public void updateDishes(Dishes dish,String dishName,String description, int Amount){
        dish.setdishName(dishName);
        dish.setDescription(description);
        dish.setDishAmount(Amount);
    }*/
}