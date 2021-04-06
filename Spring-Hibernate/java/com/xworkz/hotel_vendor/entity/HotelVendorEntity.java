package com.xworkz.hotel_vendor.entity;

import com.xworkz.hotel_vendor.constants.VendorType;

public class HotelVendorEntity {
	private String name;
	private String location;
	private int rating;
	private VendorType type;

	public HotelVendorEntity(String name, String location, int rating, VendorType type) {
		super();
		System.out.println("Created " + this.getClass().getSimpleName());
		this.name = name;
		this.location = location;
		this.rating = rating;
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public String getLocation() {
		return location;
	}

	public int getRating() {
		return rating;
	}

	public VendorType getType() {
		return type;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((location == null) ? 0 : location.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + rating;
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}

	@Override
	public String toString() {
		return "HotelVendorEntity [name=" + name + ", location=" + location + ", rating=" + rating + ", type=" + type
				+ "]";
	}

}
