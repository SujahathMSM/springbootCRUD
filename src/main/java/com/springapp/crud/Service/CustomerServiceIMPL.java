package com.springapp.crud.Service;

import com.springapp.crud.DTO.CustomerSaveDTO;
import com.springapp.crud.entity.Customer;

public class CustomerServiceIMPL implements CustomerService{
    @Override
    public String addCustomer(CustomerSaveDTO customerSaveDTO) {
        Customer customer = new Customer(
                23,
                customerSaveDTO.getCustomerName(),
                customerSaveDTO.getCustomerAddress(),
                customerSaveDTO.getMobile()
        );

        return "pass";
    }
}
