
package vn.edu.phenikaauni.qlks1.Entity;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Customer {
    private String name;
    private String cccd;
    private String phoneNumber;
    private String roomType;
    private String roomNumber;
    private String bookingDate;
    private String payingDate;

    public Customer() {
    }

    public Customer(String name, String cccd, String phoneNumber, String roomType, String roomNumber, String bookingDate) {
        this.name = name;
        this.cccd = cccd;
        this.phoneNumber = phoneNumber;
        this.roomType = roomType;
        this.roomNumber = roomNumber;
        this.bookingDate = bookingDate;
    }

    public Customer(String name, String cccd, String phoneNumber, String roomType, String roomNumber, String bookingDate, String payingDate) {
        this.name = name;
        this.cccd = cccd;
        this.phoneNumber = phoneNumber;
        this.roomType = roomType;
        this.roomNumber = roomNumber;
        this.bookingDate = bookingDate;
        this.payingDate = payingDate;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCccd() {
        return cccd;
    }

    public void setCccd(String cccd) {
        this.cccd = cccd;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(String bookingDate) {
        this.bookingDate = bookingDate;
    }

    public String getPayingDate() {
        return payingDate;
    }

    public void setPayingDate(String payingDate) {
        this.payingDate = payingDate;
    }
    
}
