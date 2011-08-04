package com.tddxd;

public class Franc extends Money {
	
	public Franc(int amount, String currency) {
		super(amount, currency);
	}

	public Money times(int multiplifier) {
		return Money.franc(multiplifier * amount);
	}
}
