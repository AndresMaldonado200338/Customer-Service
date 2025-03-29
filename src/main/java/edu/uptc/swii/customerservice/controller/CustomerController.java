package edu.uptc.swii.customerservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import edu.uptc.swii.customerservice.model.Customer;
import edu.uptc.swii.customerservice.service.CustomerService;

@CrossOrigin(origins = "${FRONTEND_URL}")
@RestController
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @PostMapping("/addcustomer")
    public String addCustomer(@RequestBody Customer customer) {
        customerService.save(customer);
        return "Customer saved!";
    }

    @GetMapping("/deletecustomer/{id}")
    public String deleteCustomer(@PathVariable Integer id) {
        Customer customer = new Customer();
        customer.setId(id);
        customerService.delete(customer);
        return "Customer deleted!";
    }
    
    @GetMapping("/allcustomers")
    public List<Customer> findAllCustomers() {
        return customerService.findAll();
    }
    
    @GetMapping("/findcustomer/{id}")
    public Customer findById(@PathVariable Integer id) {
        return customerService.findById(id);
    }
}