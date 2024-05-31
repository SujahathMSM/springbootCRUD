package com.springapp.crud.Controller;

import com.springapp.crud.DTO.customerDTO;
import com.springapp.crud.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("api/v2/home")
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @PostMapping
    public String saveCustomer(@RequestBody customerDTO customerDTO){
        String id = customerService.addCustomer(customerDTO);
        return id;
    }
}
