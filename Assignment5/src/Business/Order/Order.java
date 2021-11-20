/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Order;

import Business.Restaurant.Dishes;
import java.util.ArrayList;

/**
 *
 * @author Dhaval
 */
public class Order {
    private String orderId;
    private String restaurantName;
    private String customerName;
    private String deliverMan;
    private ArrayList<Dishes> Order;
    private String totalAmount;
    private String status;
    private String deliveryAddress;
    private Long ContactNo;
    //private String custComment;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getDeliverMan() {
        return deliverMan;
    }

    public void setDeliverMan(String deliverMan) {
        this.deliverMan = deliverMan;
    }

    public ArrayList<Dishes> getOrder() {
        return Order;
    }

    public void setOrder(ArrayList<Dishes> Order) {
        this.Order = Order;
    }

    public String getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(String cost) {
        this.totalAmount = cost;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }
    
   
    public Long getContactNo() {
        return ContactNo;
    }

    public void setContactNo(Long ContactNo) {
        this.ContactNo = ContactNo;
    }
    
    /*public String getCustComment() {
        return custComment;
    }

    public void setCustComment(String custComment) {
        this.custComment = custComment;
    }*/
    
    @Override
    public String toString() {
        return orderId;
    }
    
}
