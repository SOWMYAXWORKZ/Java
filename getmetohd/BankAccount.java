class BankAccount{
	static double balance = 10000;
	
	public static double debit(double amount){
	System.out.println("Debit Started");
	if(amount <= balance)
	balance = balance - amount;
	else
		System.out.println("Insufficient amount");
	System.out.println("Debit ended");
	return balance;
	
	
	
	}
	public static double credit(double amount){
	System.out.println("Credit Started");
	if(amount > 0)
	balance = balance + amount;
	else
			System.out.println("Amount could not be zero");
		System.out.println("Credit ended");
	return balance;
}
}
