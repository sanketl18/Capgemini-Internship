package io.junit5assign;
class InsufficientFundException extends Exception{
	public InsufficientFundException(String message)
	{
		super(message);
	}
}
public class BankAccount {
	int bal=2000;
void withdraw(int amt) throws InsufficientFundException{
	if(bal<amt)
	{ 
		throw new InsufficientFundException("Enter valid amount");
	}
}
}
