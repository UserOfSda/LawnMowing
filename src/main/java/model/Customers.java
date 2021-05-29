package model;

import javax.persistence.*;

@Entity
@Table(name = "customers")
public class Customers {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_id")
    private int customerId;


    @Column(name = "customer_name")
    private String customerName;


    @Column(name = "customer_address")
    private String customerAddress;


    @Column(name = "customer_phoneNumber")
    private String customerPhoneNumber;


    @Column(name = "customer_email")
    private String customerEmail;


    @Column(name = "customer_workingArea")
    private int customerWorkingArea;

    public Customers(int customerId, String customerName, String customerAddress, String customerPhoneNumber, String customerEmail, int customerWorkingArea) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerAddress = customerAddress;
        this.customerPhoneNumber = customerPhoneNumber;
        this.customerEmail = customerEmail;
        this.customerWorkingArea = customerWorkingArea;
    }

    public Customers() {
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public int getCustomerWorkingArea() {
        return customerWorkingArea;
    }

    public void setCustomerWorkingArea(int customerWorkingArea) {
        this.customerWorkingArea = customerWorkingArea;
    }

    @Override
    public String toString() {
        return "Customers{" +
                "customerId=" + customerId +
                ", customerName='" + customerName + '\'' +
                ", customerAddress='" + customerAddress + '\'' +
                ", customerPhoneNumber='" + customerPhoneNumber + '\'' +
                ", customerEmail='" + customerEmail + '\'' +
                ", customerWorkingArea=" + customerWorkingArea +
                '}';
    }
}
