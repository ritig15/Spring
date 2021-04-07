package com.xworkz.spring_hibernate.testers;

import com.xworkz.spring_hibernate.constants.FoodType;
import com.xworkz.spring_hibernate.entity.FoodItemEntity;
import com.xworkz.spring_hibernate.repository.FoodItemRepository;
import com.xworkz.spring_hibernate.repository.FoodItemRepositoryImpl;
import com.xworkz.spring_hibernate.service.FoodItemService;
import com.xworkz.spring_hibernate.service.FoodItemServiceImpl;

public class SaveTester {

	public static void main(String[] args) {
		FoodItemEntity foodEntity=new FoodItemEntity("Masala Dosa", 40, FoodType.SOUTH_INDIAN, 1, 10, "Veg");
		FoodItemRepository repo=new FoodItemRepositoryImpl();
		FoodItemService foodservice=new FoodItemServiceImpl(repo);
		boolean getValid=foodservice.validateAndSave(foodEntity);
		if(getValid) {
			System.out.println("Can save entity");
			repo.save(foodEntity);
		}
		else {
			System.out.println("Cannot save!");
		}

	}

}
