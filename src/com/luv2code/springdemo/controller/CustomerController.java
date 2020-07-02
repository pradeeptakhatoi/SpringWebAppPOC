package com.luv2code.springdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.luv2code.springdemo.dao.CustomerDao;
import com.luv2code.springdemo.entity.Customer;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	@Autowired    
	CustomerDao dao;//will inject dao from XML file    
	
	@RequestMapping("/list")
	public String list(Model m) {	
		List<Customer> customerList = dao.getEmployees();    
	    m.addAttribute("customerList", customerList); 
		return "customer-list";
	}
	
	
	@RequestMapping("/add")
	public String add(Model m) {
		Customer theCustomer = new Customer();
		m.addAttribute("customer", theCustomer);  
		return "add-customer";
	}
	
	@RequestMapping("/edit")
	public String edit(@RequestParam("customerId") int customerId, Model m) {
		Customer theCustomer = dao.getCustomer(customerId);
		m.addAttribute("customer", theCustomer); 
		return "edit-customer";
	}
	
	@PostMapping("/saveCustomer")
	public String saveCustomer(@ModelAttribute("customer") Customer c) {
		dao.save(c);   
		return "redirect:/customer/list";
	}
	
	@PostMapping("/updateCustomer")
	public String updateCustomer(@ModelAttribute("customer") Customer c) {
		dao.update(c);   
		return "redirect:/customer/list";
	}
	
	@RequestMapping("/view")
	public String view(@RequestParam("customerId") int customerId, Model m) {
		Customer theCustomer = dao.getCustomer(customerId);
		m.addAttribute("customer", theCustomer); 
		return "view-customer";
	}
	
	@GetMapping("/delete")
	public String deleteCustomer(@RequestParam("customerId") int theId) {
		dao.delete(theId);  
		return "redirect:/customer/list";
	}

}





