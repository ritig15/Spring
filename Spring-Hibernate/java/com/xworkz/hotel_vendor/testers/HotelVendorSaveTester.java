package com.xworkz.hotel_vendor.testers;

import com.xworkz.hotel_vendor.constants.VendorType;
import com.xworkz.hotel_vendor.entity.HotelVendorEntity;
import com.xworkz.hotel_vendor.repository.HotelVendorRepository;
import com.xworkz.hotel_vendor.repository.HotelVendorRepositoryImpl;
import com.xworkz.hotel_vendor.service.HotelVendorService;
import com.xworkz.hotel_vendor.service.HotelVendorServiceImpl;

public class HotelVendorSaveTester {

	public static void main(String[] args) {
		HotelVendorEntity entity=new HotelVendorEntity("MagicBlockInteriors", "Bangalore", 4, VendorType.B2C);
		HotelVendorRepository repository=new HotelVendorRepositoryImpl();
		HotelVendorService service=new HotelVendorServiceImpl(repository);
		boolean getValid=service.validateAndSave(entity);
		if(getValid) {
			System.out.println("Can save entity");
			repository.save(entity);
		}
		else{
			System.out.println("Cannot save!!");
		}
	}

}
