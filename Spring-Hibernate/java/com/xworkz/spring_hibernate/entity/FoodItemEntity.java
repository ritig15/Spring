package com.xworkz.spring_hibernate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.xworkz.spring_hibernate.constants.FoodType;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@NoArgsConstructor
@ToString
@Entity
@Table(name = "food_item")

public class FoodItemEntity {
	@Id
	@Column(name = "ID")
	private int id;
	@Column(name = "NAME")
	private String name;
	@Column(name = "PRICE")
	private double price;
	@Column(name = "FOOD_TYPE")
	private FoodType foodType;
	@Column(name = "QUANTITY")
	private int quantity;
	@Column(name = "DISCOUNT")
	private double discount;
	@Column(name = "PREFERENCE")
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
}
