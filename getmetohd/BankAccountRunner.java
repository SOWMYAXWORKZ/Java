class BankAccountRunner{

	public static void main(String[] args){
		System.out.println("Main started");
	
	double amount = BankAccount.credit(10000);
	System.out.println("The balance in my Account is " + amount);
	
	 amount = BankAccount.debit(20000);
	System.out.println("The balance in my Account is " + amount);

	System.out.println("Main ended");
	
	}

}