package com.xworkz.itcproduct;



public class ITCProduct {

	private String name;
	private String type;
	private String expiryDate;

	public ITCProduct(String name) {
		super();
		System.out.println("Created ITCProduct");
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}
  public void displayDetails() {
	  System.out.println("Details:");
	  System.out.println(this.name);
	  System.out.println(this.type);
	  System.out.println(this.expiryDate);
	  
  }
}
