package com.voter;

public class AgeValidater {
	public void checkAge(int age) throws ValidAgeException, InvalidAgeException {
		if(age>=18) {
			ValidAgeException ve = new ValidAgeException("elligible");
			throw(ve);
		}
		else {
			InvalidAgeException inve = new InvalidAgeException("not elligible");
			throw(inve);
		}
	}
}
