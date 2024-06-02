package com.springapp.crud.DTO;

public class CustomerUpdateDTO {
    private int CustID;
    private String customerName;
    private String customerAddress;
    private int mobile;

    public CustomerUpdateDTO(int custID, String customerName, String customerAddress, int mobile) {
        CustID = custID;
        this.customerName = customerName;
        this.customerAddress = customerAddress;
        this.mobile = mobile;
    }

    public CustomerUpdateDTO() {
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
}


