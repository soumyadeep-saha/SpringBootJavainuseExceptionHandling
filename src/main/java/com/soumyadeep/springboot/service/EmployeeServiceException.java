package com.soumyadeep.springboot.service;

public class EmployeeServiceException extends Exception{

	private static final long serialVersionUID = -461878456094225731L;

	public EmployeeServiceException() {
		super();
	}
	
	public EmployeeServiceException(final String message) {
		super(message);
	}
}
