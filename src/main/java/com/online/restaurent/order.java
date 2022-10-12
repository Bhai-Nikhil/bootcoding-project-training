package com.online.restaurent;

import java.util.Date;
import java.util.List;

public class order {
    private String orderId;
    private Double totalAmount;
    private vendor vendor;
    private Customer customer;
    private String deliveryAddress;
    private List<OrderMenuItem> menuItems;
    private Date orderDate;
    private String ordeStatus;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public com.online.restaurent.vendor getVendor() {
        return vendor;
    }

    public void setVendor(com.online.restaurent.vendor vendor) {
        this.vendor = vendor;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public List<OrderMenuItem> getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(List<OrderMenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public String getOrdeStatus() {
        return ordeStatus;
    }

    public void setOrdeStatus(String ordeStatus) {
        this.ordeStatus = ordeStatus;
    }
}
