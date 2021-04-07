package com.xworkz.spring_hibernate.entity;

import com.xworkz.spring_hibernate.constants.FoodType;

public class FoodItemEntity {
	private String name;
	private double price;
	private FoodType foodType;
	private int quantity;
	private double discount;
	private String preference; // Veg or Non-Veg

	public FoodItemEntity(String name, double price, FoodType foodType, int quantity, double discount,
			String preference) {
		super();
		System.out.println("Created FoodItemEntity");
		this.name = name;
		this.price = price;
		this.foodType = foodType;
		this.quantity = quantity;
		this.discount = discount;
		this.preference = preference;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public FoodType getFoodType() {
		return foodType;
	}

	public int getQuantity() {
		return quantity;
	}

	public double getDiscount() {
		return discount;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(discount);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((foodType == null) ? 0 : foodType.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((preference == null) ? 0 : preference.hashCode());
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + quantity;
		return result;
	}

	@Override
	public String toString() {
		return "FoodItemEntity [name=" + name + ", price=" + price + ", foodType=" + foodType + ", quantity=" + quantity
				+ ", discount=" + discount + ", preference=" + preference + "]";
	}

	public String getPreference() {
		return preference;
	}
}
