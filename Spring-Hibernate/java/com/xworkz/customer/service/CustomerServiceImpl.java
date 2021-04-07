package com.xworkz.customer.service;

import com.xworkz.customer.entity.CustomerEntity;
import com.xworkz.customer.repository.CustomerRepository;

public class CustomerServiceImpl implements CustomerService {
	private CustomerRepository repo;

	public CustomerServiceImpl(CustomerRepository repo) {
		System.out.println("Created " + this.getClass().getSimpleName());
		this.repo = repo;
	}

	@Override
	public boolean validateAndSave(CustomerEntity entity) {
		boolean valid = false;
		if (entity != null) {
			System.out.println("Entity is valid");
			this.repo.save(entity);
			valid = true;
		} else {
			System.out.println("Entity is invalid");
		}
		return valid;
	}

}
