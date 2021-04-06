package com.xworkz.spring_hibernate.service;

import com.xworkz.spring_hibernate.entity.FoodItemEntity;
import com.xworkz.spring_hibernate.repository.FoodItemRepository;
import com.xworkz.spring_hibernate.repository.FoodItemRepositoryImpl;

public class FoodItemServiceImpl implements FoodItemService {

	private FoodItemRepository itemRepository;

	public FoodItemServiceImpl(FoodItemRepository itemRepository) {
		System.out.println("Created " + this.getClass().getSimpleName());
		this.itemRepository = itemRepository;
	}

	//private FoodItemRepository repo = new FoodItemRepositoryImpl(); // If not initialized then Null Pointer Exception &
																	// if initialized here then, 2 problems:
																	// 1.Objects created more than once if service is
																	// created &
																	// 2.Tightly coupled

	@Override
	public boolean validateAndSave(FoodItemEntity entity) {
		boolean valid = false;
		System.out.println("Invoked validateAndSave method");
		if (entity != null) {
			System.out.println("Entity is valid");
			valid = true;
		} else {
			System.out.println("Entity is invalid");
		}
		return valid;
	}

}
