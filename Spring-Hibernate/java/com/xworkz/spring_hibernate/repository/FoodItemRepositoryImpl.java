package com.xworkz.spring_hibernate.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.hibernateutil.SFUtil;
import com.xworkz.spring_hibernate.entity.FoodItemEntity;

public class FoodItemRepositoryImpl implements FoodItemRepository {
	private SessionFactory factory;

	public FoodItemRepositoryImpl(SessionFactory factory) {
		System.out.println("Created " + this.getClass().getSimpleName());
		this.factory = factory;
	}

	@Override
	public void save(FoodItemEntity entity) {

		try (Session session = this.factory.openSession()) {
			System.out.println("Invoked save in FoodItemRepositoryImpl");
			Transaction transaction = session.beginTransaction();
			session.save(entity);
			transaction.commit();
			// System.out.println(entity);
		}
//		Configuration cfg = new Configuration();
//		cfg.configure();
//		SessionFactory factory = cfg.buildSessionFactory();
//		Session session = factory.openSession();
//		Transaction transaction = session.beginTransaction();
//		session.save(entity);
//		transaction.commit();
//		session.close();
//		factory.close();
	}
}
