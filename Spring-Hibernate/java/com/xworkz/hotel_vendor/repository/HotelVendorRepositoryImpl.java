package com.xworkz.hotel_vendor.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.xworkz.hibernateutil.SFUtil;
import com.xworkz.hotel_vendor.entity.HotelVendorEntity;

public class HotelVendorRepositoryImpl implements HotelVendorRepository {
	private SessionFactory factory ;

	public HotelVendorRepositoryImpl(SessionFactory factory ) {
		System.out.println("Created " + this.getClass().getSimpleName());
		this.factory=factory;
	}

	@Override
	public void save(HotelVendorEntity entity) {
		try (Session session = factory.openSession()) {
			System.out.println("Invoked save in HotelVendorRepositoryImpl");
			Transaction transaction = session.beginTransaction();
			session.save(entity);
			transaction.commit();
			// System.out.println(entity);
		}
	}

}
