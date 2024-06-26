package com.springapp.crud.Controller;

import com.springapp.crud.DTO.CustomerDTO;
import com.springapp.crud.DTO.CustomerSaveDTO;
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
    public String saveCustomer(@RequestBody CustomerSaveDTO customerSaveDTO){
        String id = customerService.addCustomer(customerSaveDTO);
        return id;
    }
}
