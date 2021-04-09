package com.xworkz.customer.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.xworkz.customer.entity.CustomerEntity;

public class CustomerRepositoryImpl implements CustomerRepository {
	private SessionFactory factory;

	public CustomerRepositoryImpl(SessionFactory factory) {
		System.out.println("Created " + this.getClass().getSimpleName());
		this.factory=factory;
	}

	@Override
	public void save(CustomerEntity entity) {
		try (Session session = factory.openSession()) {
			System.out.println("Invoked save in CustomerRepositoryImpl");
			Transaction transaction = session.beginTransaction();
			session.save(entity);
			transaction.commit();
			// System.out.println(entity);
		}
		
	}

}
