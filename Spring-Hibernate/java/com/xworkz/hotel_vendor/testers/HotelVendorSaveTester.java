package com.xworkz.hotel_vendor.testers;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.hotel_vendor.constants.VendorType;
import com.xworkz.hotel_vendor.entity.HotelVendorEntity;
import com.xworkz.hotel_vendor.service.HotelVendorService;

public class HotelVendorSaveTester {

	public static void main(String[] args) {
		ApplicationContext container = new ClassPathXmlApplicationContext("hotelVendor.xml");
		HotelVendorEntity entity = new HotelVendorEntity("PerfectoInteriors", "Mysore", 2, VendorType.B2C);
		// HotelVendorEntity entity2 = new HotelVendorEntity("HomeLaneInteriors",
		// "Mumbai", 4, VendorType.B2B);
		// HotelVendorEntity entity3 = new HotelVendorEntity("OfficeInteriors",
		// "Chennai", 5, VendorType.B2C);

		HotelVendorService hotelService = container.getBean(HotelVendorService.class);
		hotelService.validateAndSave(entity);
		// hotelService.validateAndSave(entity2);
		// hotelService.validateAndSave(entity3);
	}

}
