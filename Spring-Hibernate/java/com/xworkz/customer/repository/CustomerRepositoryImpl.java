package com.xworkz.customer.repository;

import com.xworkz.customer.entity.CustomerEntity;

public class CustomerRepositoryImpl implements CustomerRepository {
	public CustomerRepositoryImpl() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}

	@Override
	public void save(CustomerEntity entity) {
		System.out.println("Invoked save in CustomerRepositoryImpl");
		System.out.println("Need to write JPA code to save entity in DB");
		System.out.println(entity);

	}

}
