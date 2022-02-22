package io.junit5assign;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BankAccountTest {
	
	BankAccount account;
	@BeforeEach

	void init() {
		account=new BankAccount();
	}
	@Test
	void test1() {
		assertThrows(InsufficientFundException.class,()->account.withdraw(3000));
	}
	@Test
	void test2() {
		assertThrows(InsufficientFundException.class,()->account.withdraw(5000));
	}
	@Test
	void test3() {
		assertThrows(InsufficientFundException.class,()->account.withdraw(4000));
	}

}
