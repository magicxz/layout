package com.example.layout;

public class OrderModel {
    public String paymentStatus;
    public String statusMessage;
    public String orderId;
    public String dateTime;
    public String totalAmount;
    public String title;
    public String pack;
    public String quantity;
    public String meetupLocation;
    public String departureDate;
    public String image;

    public OrderModel(String paymentStatus, String statusMessage, String orderId, String dateTime, String totalAmount, String title, String pack, String quantity, String meetupLocation, String departureDate, String image) {
        this.paymentStatus = paymentStatus;
        this.statusMessage = statusMessage;
        this.orderId = orderId;
        this.dateTime = dateTime;
        this.totalAmount = totalAmount;
        this.title = title;
        this.pack = pack;
        this.quantity = quantity;
        this.meetupLocation = meetupLocation;
        this.departureDate = departureDate;
        this.image = image;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public String getStatusMessage() {
        return statusMessage;
    }

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public String getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(String totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPack() {
        return pack;
    }

    public void setPack(String pack) {
        this.pack = pack;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getMeetupLocation() {
        return meetupLocation;
    }

    public void setMeetupLocation(String meetupLocation) {
        this.meetupLocation = meetupLocation;
    }

    public String getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(String departureDate) {
        this.departureDate = departureDate;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
