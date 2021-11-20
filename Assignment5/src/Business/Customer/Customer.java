/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import Business.Order.Order;
import Business.Restaurant.Dishes;
import java.util.ArrayList;

/**
 *
 * @author Dhaval
 */
public class Customer {
    private String Name;
    private String UserName;
    private String Address;
    private String PhoneNumber;
    private ArrayList<Order> OrderList;
    int id=1;
    
    public Customer(String CustomerName){
        this.Name=CustomerName;
        OrderList = new ArrayList<Order>();
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

    public ArrayList<Order> getCustomerOrderList() {
        if(OrderList == null)
        {
            OrderList = new ArrayList<Order>();
        }
        return OrderList;
    }

    public void setCustomerOrderList(ArrayList<Order> CustomerOrderList) {
        this.OrderList = CustomerOrderList;
    }
    
    public void addOrder(String restaurantName, String customerName, String deliverMan,ArrayList<Dishes> dishList, String TotalAmount, String deliveryAddress,Long ContactNo) {
        Order order=new Order();
        if(id== 0)
        {
            id=1;
        }
        order.setOrderId(String.valueOf(id));
        order.setCustomerName(customerName);
        order.setRestaurantName(restaurantName);
        order.setDeliverMan(deliverMan);
        order.setOrder(dishList);
        order.setTotalAmount(TotalAmount);
        order.setDeliveryAddress(deliveryAddress);
        order.setStatus("New Order");
        order.setContactNo(ContactNo);
        OrderList.add(order);
        id++;
    }
}
