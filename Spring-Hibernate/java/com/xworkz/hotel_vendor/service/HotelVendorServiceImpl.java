package com.xworkz.hotel_vendor.service;

import com.xworkz.hotel_vendor.entity.HotelVendorEntity;
import com.xworkz.hotel_vendor.repository.HotelVendorRepository;

public class HotelVendorServiceImpl implements HotelVendorService {
	private HotelVendorRepository repo;

	public HotelVendorServiceImpl(HotelVendorRepository repo) {
		System.out.println("Created " + this.getClass().getSimpleName());
		this.repo = repo;
	}

	@Override
	public boolean validateAndSave(HotelVendorEntity entity) {
		boolean valid = false;
		if (entity != null) {
			System.out.println("Entity is valid");
			valid = true;
			this.repo.save(entity);
		} else {
			System.out.println("Entity is invalid");
		}
		return valid;
	}

}
