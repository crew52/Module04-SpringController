package codegym.c10.thkhachhang.controller;

import codegym.c10.thkhachhang.model.Customer;
import codegym.c10.thkhachhang.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/customers")
public class CustomerController {
    @Autowired
    private CustomerService customerService ;

    @GetMapping()
    public ModelAndView showList() {
        List<Customer> customers = customerService.findAll();
        return new ModelAndView("customers/list", "customers", customers);
    }

    @GetMapping("/{id}")
    public ModelAndView showDetail(@PathVariable int id) {
        Customer customer = customerService.findById(id);
        if (customer == null) {
            return new ModelAndView("error/404");
        }
        return new ModelAndView("customers/detail", "customer", customer);
    }

    @PostMapping
    public String updateCustomer(Customer customer) {
        customerService.save(customer);
        return "redirect:/customers";
    }
}
