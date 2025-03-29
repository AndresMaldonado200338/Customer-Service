package edu.uptc.swii.customerservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.uptc.swii.customerservice.model.Customer;
import edu.uptc.swii.customerservice.repository.CustomerRepository;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public void save(Customer customer) {
        customerRepository.save(customer);
    }

    public void delete(Customer customer) {
        customerRepository.delete(customer);
    }

    public Customer findById(Integer id) {
        return customerRepository.findById(id).get();
    }

    public List<Customer> findAll() {
        return customerRepository.findAll();
    }
}