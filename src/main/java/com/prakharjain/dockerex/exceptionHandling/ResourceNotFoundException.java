package com.prakharjain.dockerex.exceptionHandling;

public class ResourceNotFoundException extends Exception {
		
	public ResourceNotFoundException()
	{}
	
	public ResourceNotFoundException(final String message)
	{
		super(message);
	}
}
