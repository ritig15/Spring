package com.xworkz.hotel_vendor.repository;

import com.xworkz.hotel_vendor.entity.HotelVendorEntity;

public class HotelVendorRepositoryImpl implements HotelVendorRepository {

	@Override
	public void save(HotelVendorEntity entity) {
		System.out.println("Invoked save in HotelVendorRepositoryImpl");
		System.out.println("Need to write JPA code to save entity in DB");
		System.out.println(entity);
	}

}
