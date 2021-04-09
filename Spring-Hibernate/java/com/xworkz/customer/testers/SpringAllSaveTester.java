package com.xworkz.customer.testers;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.customer.entity.CustomerEntity;
import com.xworkz.customer.repository.CustomerRepository;
import com.xworkz.customer.repository.CustomerRepositoryImpl;
import com.xworkz.customer.service.CustomerService;
import com.xworkz.customer.service.CustomerServiceImpl;
import com.xworkz.hotel_vendor.constants.VendorType;
import com.xworkz.hotel_vendor.entity.HotelVendorEntity;
import com.xworkz.hotel_vendor.service.HotelVendorService;
import com.xworkz.spring_hibernate.constants.FoodType;
import com.xworkz.spring_hibernate.entity.FoodItemEntity;
import com.xworkz.spring_hibernate.service.FoodItemService;

public class SpringAllSaveTester {

	public static void main(String[] args) {
		ApplicationContext container = new ClassPathXmlApplicationContext("injection.xml");
		CustomerService customerService = container.getBean(CustomerService.class);
		FoodItemService foodItemService = container.getBean(FoodItemService.class);
		HotelVendorService hotelVendorService = container.getBean(HotelVendorService.class);
		System.out.println("***************************************");

		CustomerEntity customerEntity = new CustomerEntity("John", "US", 4, 989898980);
		customerService.validateAndSave(customerEntity);
		System.out.println("***************************************");

		FoodItemEntity foodItemEntity = new FoodItemEntity("Masala Dosa", 40, FoodType.SOUTH_INDIAN, 1, 10, "Veg");
		foodItemService.validateAndSave(foodItemEntity);
		System.out.println("***************************************");

		HotelVendorEntity hotelVendorEntity = new HotelVendorEntity("MagicBlockInteriors", "Bangalore", 4,
				VendorType.B2C);
		hotelVendorService.validateAndSave(hotelVendorEntity);
		System.out.println("***************************************");
	}

}
