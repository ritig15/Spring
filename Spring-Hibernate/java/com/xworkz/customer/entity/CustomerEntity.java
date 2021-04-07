package com.xworkz.customer.entity;

public class CustomerEntity {
	private String name;
	private String location;
	private int rating;
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

	@Override
	public String toString() {
		return "CustomerEntity [name=" + name + ", location=" + location + ", rating=" + rating + ", phoneNo=" + phoneNo
				+ "]";
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

	public long getPhoneNo() {
		return phoneNo;
	}

}
