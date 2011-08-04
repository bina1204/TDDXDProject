package com.tddxd;

public class Dollar extends Money {

	public Dollar(int amount, String currency) {
		super(amount, currency);
	}

	public Money times(int multiplifier) {
		return Money.dollar(multiplifier * amount);
	}

}
