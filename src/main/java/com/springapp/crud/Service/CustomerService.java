package com.springapp.crud.Service;

import com.springapp.crud.DTO.CustomerSaveDTO;

public interface CustomerService {
    String addCustomer(CustomerSaveDTO customerSaveDTO);
}
