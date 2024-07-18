class BillssRunner{


		public static void main(String[] args){
			
			
			Billss bill = new Billss();
			boolean payment = bill.createBills(-1,null,null );
			System.out.println(payment);
			bill.display();
		}



}

