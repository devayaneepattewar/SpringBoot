package com.tejaswiniShopee.demo.service;

import java.util.List;

import com.tejaswiniShopee.demo.entity.Customer;
import com.tejaswiniShopee.demo.exception.ResourceNotFound;


public interface CustomerService {
	List<Customer> getAllCustomer();

	Customer saveCustomer(Customer customer);

	Customer getCustomerById(long id) throws ResourceNotFound;

	Customer updateCustomer(Customer customer, long id);
	
	Customer getCustomerFullNameById(long id);

	List<Customer> getCustomerInDescOrder();

	List<Customer> getCustomerByFirstNameAndLastName(String firstName, String lastName);

	void deleteCustomer(long id);

	
}
