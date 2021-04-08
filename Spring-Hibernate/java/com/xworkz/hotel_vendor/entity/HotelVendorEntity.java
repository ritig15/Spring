package com.xworkz.hotel_vendor.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.xworkz.hotel_vendor.constants.VendorType;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Getter
@NoArgsConstructor
@ToString
@Table(name = "hotelVendor")
public class HotelVendorEntity {
	@Id
	@Column(name = "ID")
	private int id;
	@Column(name = "NAME")
	private String name;
	@Column(name = "LOCATION")
	private String location;
	@Column(name = "RATING")
	private int rating;
	@Column(name = "VENDOR_TYPE")
	private VendorType type;

	public HotelVendorEntity(String name, String location, int rating, VendorType type) {
		super();
		System.out.println("Created " + this.getClass().getSimpleName());
		this.name = name;
		this.location = location;
		this.rating = rating;
		this.type = type;
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
}
