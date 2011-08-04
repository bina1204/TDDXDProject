package com.tddxd.test;


import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.tddxd.Money;

public class MoneyTest {

	@Test
	public void testMultiplication(){
		Money five = Money.dollar(5);
		assertThat(five.times(2), is(Money.dollar(10)));
		assertThat(five.times(3), is(Money.dollar(15)));
	}
	
	@Test
	public void testEquals(){
		assertTrue(Money.dollar(5).equals(Money.dollar(5)));
		assertFalse(Money.dollar(5).equals(Money.dollar(6)));
		assertTrue(Money.franc(5).equals(Money.franc(5)));
		assertFalse(Money.franc(5).equals(Money.franc(6)));
		assertFalse(Money.dollar(5).equals(Money.franc(5)));
	}

	@Test
	public void testFrancMultiplication(){
		Money cinq = Money.franc(5);
		assertThat(cinq.times(2), is(Money.franc(10)));
	}

	@Test
	public void testCurrency() {
		assertThat(Money.dollar(1).currency(), is("USD"));
		assertThat(Money.franc(1).currency(), is("CHF"));
	}
}

