package com.xworkz.spring_hibernate.service;

import com.xworkz.spring_hibernate.entity.FoodItemEntity;

public interface FoodItemService {

	public boolean validateAndSave(FoodItemEntity entity);
}
