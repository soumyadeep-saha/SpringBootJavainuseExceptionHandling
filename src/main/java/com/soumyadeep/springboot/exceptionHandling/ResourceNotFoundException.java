package com.soumyadeep.springboot.exceptionHandling;

public class ResourceNotFoundException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3881503707077901586L;
	
	public ResourceNotFoundException() {
		super();
	}
	
	public ResourceNotFoundException(final String message) {
		super(message);
	}
}
