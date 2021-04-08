package com.xworkz.customer.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "customer")
@Getter
@NoArgsConstructor
@ToString

public class CustomerEntity {
	@Id
	@Column(name = "ID")
	private int id;
	@Column(name = "NAME")
	private String name;
	@Column(name = "LOCATION")
	private String location;
	@Column(name = "RATING")
	private int rating;
	@Column(name = "PHONE_NO")
	private long phoneNo;

	public CustomerEntity(String name, String location, int rating, long phoneNo) {
		super();
		System.out.println("Created " + this.getClass().getSimpleName());
		this.name = name;
		this.location = location;
		this.rating = rating;
		this.phoneNo = phoneNo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((location == null) ? 0 : location.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + (int) (phoneNo ^ (phoneNo >>> 32));
		result = prime * result + rating;
		return result;
	}

}
