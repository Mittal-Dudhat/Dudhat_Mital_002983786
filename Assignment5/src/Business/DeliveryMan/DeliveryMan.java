/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DeliveryMan;

import Business.Order.Order;
import Business.Restaurant.Dishes;
import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class DeliveryMan {
    private String Name;
    private String UserName;
    private String address;
    private String number;
    private ArrayList<Order> orderList;

    public DeliveryMan(String Name){
        this.Name=Name;
        orderList=new ArrayList<Order>();
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
    
    public ArrayList<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(ArrayList<Order> orderList) {
        this.orderList = orderList;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
    
    public void addOrder(String restaurentName, String customerName, String deliverMan, ArrayList<Dishes> Order, String cost, String deliveryAddress) {
        Order order=new Order();
        //order.setOrder_id(String.valueOf(id));
        order.setCustomerName(customerName);
        order.setRestaurantName(restaurentName);
        order.setDeliverMan(deliverMan);
        order.setOrder(Order);
        order.setTotalAmount(cost);
        order.setDeliveryAddress(deliveryAddress);
        order.setStatus("New Order");
        orderList.add(order);
        
    }
    
    @Override
    public String toString() {
        return Name;
    }
    
}
