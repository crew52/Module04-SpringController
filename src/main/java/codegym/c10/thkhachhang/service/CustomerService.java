package codegym.c10.thkhachhang.service;

import codegym.c10.thkhachhang.model.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> findAll();
    Customer findById(int id);
    void save(Customer customer);
}
