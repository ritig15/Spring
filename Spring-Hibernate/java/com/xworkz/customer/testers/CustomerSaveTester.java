package com.xworkz.customer.testers;

import com.xworkz.customer.entity.CustomerEntity;
import com.xworkz.customer.repository.CustomerRepository;
import com.xworkz.customer.repository.CustomerRepositoryImpl;
import com.xworkz.customer.service.CustomerService;
import com.xworkz.customer.service.CustomerServiceImpl;

public class CustomerSaveTester {

	public static void main(String[] args) {
		CustomerEntity entity = new CustomerEntity("John", "US", 4, 989898980);
		CustomerRepository repository = new CustomerRepositoryImpl();
		CustomerService service = new CustomerServiceImpl(repository);
		boolean getvalid = service.validateAndSave(entity);
		if (getvalid) {
			System.out.println("Can save entity");
			repository.save(entity);
		} else {
			System.out.println("Cannot save!");
		}
	}

}
