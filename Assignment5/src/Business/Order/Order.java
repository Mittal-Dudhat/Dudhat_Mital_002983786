/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Order;

import Business.Restaurant.Dishes;
import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 *
 * @author Dhaval
 */
public class Order {
    private int orderId;
    private String restaurantName;
    private String customerName;
    private String deliverMan;
    private ArrayList<Dishes> Order;
    private int totalAmount;
    private String status;
    private String deliveryAddress;
    private LocalDateTime OrderDate;
    private Long ContactNo;
    private String custComment;

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
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

    public int getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(int cost) {
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

    public LocalDateTime getOrderDate() {
        return OrderDate;
    }

    public void setOrderDate(LocalDateTime OrderDate) {
        this.OrderDate = OrderDate;
    }
    
     public Long getContactNo() {
        return ContactNo;
    }

    public void setContactNo(Long ContactNo) {
        this.ContactNo = ContactNo;
    }
    
    public String getCustComment() {
        return custComment;
    }

    public void setCustComment(String custComment) {
        this.custComment = custComment;
    }
    
}
