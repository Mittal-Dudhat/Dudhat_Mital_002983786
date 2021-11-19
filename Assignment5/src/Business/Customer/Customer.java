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
    private ArrayList<Order> CustomerOrderList;
    int id = 1;
    
    public Customer(String CustomerName){
        this.Name=CustomerName;
        CustomerOrderList = new ArrayList<Order>();
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
    
     public void addOrder(String restaurantName, String customerName, String deliverMan, ArrayList<Dishes> dishList, int TotalAmount, String deliveryAddress,Long ContactNo) {
        if(CustomerOrderList == null)
        {
            CustomerOrderList=new ArrayList<Order>();
        }
        System.out.println("Customer Add ORder");
        Order order=new Order();
        order.setOrderId(id);
        order.setCustomerName(customerName);
        order.setRestaurantName(restaurantName);
        order.setDeliverMan(deliverMan);
        order.setOrder(dishList);
        order.setTotalAmount(TotalAmount);
        order.setDeliveryAddress(deliveryAddress);
        order.setStatus("New Order");
        //order.setOrderDate(LocalDateTime.now());
        order.setContactNo(ContactNo);
        CustomerOrderList.add(order);
        System.out.println("Customer Add ORder done");
        id++;
    }
     
    public ArrayList<Order> getCustomerOrderList() {
        return CustomerOrderList;
    }

    public void setCustomerOrderList(ArrayList<Order> orderList) {
        this.CustomerOrderList = orderList;
    }
    
}
