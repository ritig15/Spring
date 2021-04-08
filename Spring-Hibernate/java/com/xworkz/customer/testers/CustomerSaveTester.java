package com.xworkz.customer.testers;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.customer.entity.CustomerEntity;
import com.xworkz.customer.service.CustomerService;

public class CustomerSaveTester {

	public static void main(String[] args) {
		ApplicationContext container = new ClassPathXmlApplicationContext("customer.xml");
		CustomerEntity entity = new CustomerEntity("Neil", "UK", 3, 999999999);
		// CustomerEntity entity2 = new CustomerEntity("John", "US", 4, 989898980);
		CustomerService customerService = container.getBean(CustomerService.class);
		customerService.validateAndSave(entity);
		// customerService.validateAndSave(entity2);

	}

}
