package com.test.exceptions;

public class ProductNotFoundExcepton extends RuntimeException
{

	private static final long serialVersionUID = 1L;
	
	public ProductNotFoundExcepton(String msg)
	{
		super(msg);
	}
}
