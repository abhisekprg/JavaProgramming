package com.springcore.autowired;

import org.springframework.beans.factory.annotation.Autowired;

public class Emp {
	// at property
	@Autowired
	private Address address;

	public Address getAddress() {
		return address;
	}

	// at setter @Autowired
	public void setAddress(Address address) {
		System.out.println("using setter");
		this.address = address;

	}
	

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
// at consturctor @Autowired
	public Emp(Address address) {
		super();
		System.out.println("using constructor");
		this.address = address;
	}

	@Override
	public String toString() {
		return "Emp [address=" + address + "]";
	}

}
