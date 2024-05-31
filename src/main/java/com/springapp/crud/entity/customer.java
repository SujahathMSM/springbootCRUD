package com.springapp.crud.entity;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import org.springframework.data.annotation.Id;

@Table(name = "customer")
public class customer {
    @Id
    @Column(name = "customer_id", length = 20)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int CustID;
    @Column(name = "customer_name", length = 50)
    private String customerName;
    @Column(name = "customer_address", length = 80)
    private String customerAddress;
    @Column(name = "customer_mobile", length = 15)
    private int mobile;

    public customer(int custID, String customerName, String customerAddress, int mobile) {
        CustID = custID;
        this.customerName = customerName;
        this.customerAddress = customerAddress;
        this.mobile = mobile;
    }


    public customer() {
    }

    public int getCustID() {
        return CustID;
    }

    public void setCustID(int custID) {
        CustID = custID;
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

    public int getMobile() {
        return mobile;
    }

    public void setMobile(int mobile) {
        this.mobile = mobile;
    }

    @Override
    public String toString() {
        return "customer{" +
                "CustID=" + CustID +
                ", customerName='" + customerName + '\'' +
                ", customerAddress='" + customerAddress + '\'' +
                ", mobile=" + mobile +
                '}';
    }
}
