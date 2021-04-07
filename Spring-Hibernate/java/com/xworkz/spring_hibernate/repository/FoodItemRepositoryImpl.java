package com.xworkz.spring_hibernate.repository;

import com.xworkz.spring_hibernate.entity.FoodItemEntity;

public class FoodItemRepositoryImpl implements FoodItemRepository {
	public FoodItemRepositoryImpl() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}

	@Override
	public void save(FoodItemEntity entity) {
		System.out.println("Invoked save in FoodItemRepositoryImpl");
		System.out.println("Need to write JPA code to save entity in DB");
		System.out.println(entity);
	}
}
