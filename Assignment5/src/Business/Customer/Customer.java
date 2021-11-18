/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import Business.Order.Order;
import Business.Restaurant.Dishes;
import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class Customer {
    private String Name;
    private String UserName;
    private String Address;
    private String PhoneNumber;
    private ArrayList<Order> orderList;
    int id = 1;
    
    public Customer(String CustomerName){
        this.Name=CustomerName;
        orderList = new ArrayList<Order>();
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }
    
     public void addOrder(String restaurantName, String customerName, String deliverMan, ArrayList<Dishes> Order, int TotalAmount, String deliveryAddress,Long ContactNo) {
        Order order=new Order();
        order.setOrderId(id);
        order.setCustomerName(customerName);
        order.setRestaurantName(restaurantName);
        order.setDeliverMan(deliverMan);
        order.setOrder(Order);
        order.setTotalAmount(TotalAmount);
        order.setDeliveryAddress(deliveryAddress);
        order.setStatus("New Order");
        order.setOrderDate(LocalDateTime.now());
        order.setContactNo(ContactNo);
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
