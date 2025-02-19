package codegym.c10.thkhachhang.service;

import codegym.c10.thkhachhang.model.Customer;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SimpleCustomerServiceImpl implements CustomerService{
    private static final List<Customer> customers = new ArrayList<>();

    static {
        customers.add(new Customer(1, "John Doe", "john@example.com", "New York"));
        customers.add(new Customer(2, "Jane Smith", "jane@example.com", "Los Angeles"));
        customers.add(new Customer(3, "Mike Johnson", "mike@example.com", "Chicago"));
    }

    @Override
    public List<Customer> findAll() {
        return customers;
    }

    @Override
    public Customer findById(int id) {
        return customers.stream()
                .filter(customer -> customer.getId() == id)
                .findFirst()
                .orElse(null);
    }

    @Override
    public void save(Customer customer) {
        Customer c = findById(customer.getId());
        c.setName(customer.getName());
        c.setEmail(customer.getEmail());
        c.setAddress(customer.getAddress());
    }
}
