/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

import Business.Order.Order;
import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class Restaurant {
    private String RestaurantName;
    private String Address;
    private String ContactNo;
    private ArrayList<Dishes> menuList;
    private ArrayList<Order> orderList;

    int id=1;

    public Restaurant(String RestaurantName){
        this.RestaurantName = RestaurantName;
        orderList = new ArrayList<Order>(); 
        menuList = new ArrayList<Dishes>();
    }
    
    public String getRestaurantName() {
        return RestaurantName;
    }

    public void setRestaurantName(String RestaurantName) {
        this.RestaurantName = RestaurantName;
    }
    
    public void addDishes(Dishes menu){
        menuList.add(menu);
    }
    
    public void removeDishes(Dishes menu){
        menuList.remove(menu);
    }
    
    public ArrayList<Dishes> getMenu() {
        return menuList;
    }
    
    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getContactNo() {
        return ContactNo;
    }

    public void setContactNo(String ContactNo) {
        this.ContactNo = ContactNo;
    }
    
    public void addOrder(String restaurantName, String customerName, String deliverMan, ArrayList<Dishes> Order, int TotalAmt, String deliveryAddress, Long ContatcNo) {
        Order order=new Order();
        order.setOrderId(id);
        order.setCustomerName(customerName);
        order.setRestaurantName(restaurantName);
        order.setDeliverMan(deliverMan);
        order.setOrder(Order);
        order.setTotalAmount(TotalAmt);
        order.setDeliveryAddress(deliveryAddress);
        order.setStatus("New Order");
        order.setOrderDate(LocalDateTime.now());
        order.setContactNo(ContatcNo);
        orderList.add(order);
        id++;
    }
    
    public ArrayList<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(ArrayList<Order> orderList) {
        this.orderList = orderList;
    }
}
