package com.xworkz.spring_hibernate.testers;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.spring_hibernate.constants.FoodType;
import com.xworkz.spring_hibernate.entity.FoodItemEntity;
import com.xworkz.spring_hibernate.service.FoodItemService;

public class SaveTester {

	public static void main(String[] args) {
		ApplicationContext container = new ClassPathXmlApplicationContext("foodItem.xml");
		// FoodItemEntity foodEntity1 = new FoodItemEntity("Masala Dosa", 50,
		// FoodType.SOUTH_INDIAN, 1, 10, "Veg");
		// FoodItemEntity foodEntity2 = new FoodItemEntity("Rava Idli", 40,
		// FoodType.SOUTH_INDIAN, 1, 10, "Veg");
		FoodItemEntity foodEntity3 = new FoodItemEntity("Schezwan Noodles", 80, FoodType.CHINESE, 1, 10, "Veg");
		FoodItemService foodservice = container.getBean(FoodItemService.class);
		// foodservice.validateAndSave(foodEntity1);
		// foodservice.validateAndSave(foodEntity2);
		foodservice.validateAndSave(foodEntity3);

	}
}
