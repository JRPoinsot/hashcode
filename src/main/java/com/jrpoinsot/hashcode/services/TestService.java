package com.jrpoinsot.hashcode.services;

public class TestService {

	private static TestService instance;
	
	
	// attributes here
	//
	//
	//
	private Integer attribute;
	
	private TestService () {};
	
	public static TestService getInstance() {
		if (instance == null) {
			instance = new TestService();
		}
		return instance;
	}
	

	// Service Public Methods here
	public void setAttribute(Integer attribute ) {
		this.attribute = attribute;
	}
}
