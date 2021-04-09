package com.xworkz.customer.testers;

import org.hibernate.SessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.customer.entity.CustomerEntity;
import com.xworkz.customer.service.CustomerService;

public class CustomerSaveTester {

	public static void main(String[] args) {
		ApplicationContext container = new ClassPathXmlApplicationContext("customer.xml");
		CustomerEntity entity = new CustomerEntity("Aaron Paul", "America", 5, 123456789);
		// CustomerEntity entity2 = new CustomerEntity("John", "US", 4, 989898980);
		CustomerService customerService = container.getBean(CustomerService.class);
		customerService.validateAndSave(entity);
		// customerService.validateAndSave(entity2);
		
		/* SessionFactory refOfSessionFactory=container.getBean(SessionFactory.class);
		 * System.out.println(refOfSessionFactory);
		 */
	}
}
