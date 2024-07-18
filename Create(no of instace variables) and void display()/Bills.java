class Bills{
			
			int billId;
			String billIssueDate;
			String billDueDate;
			boolean isBillPaid;
			boolean isLatestBill;
			


		public boolean createBills(int billId , String billIssueDate ,
				  String billDueDate , boolean isBillPaid , boolean isLatestBill){
      		
			 boolean isBillCreated = false;
			  // if(billId > 0 && billIssueDate != null && billDueDate != null){
			    this.billId = billId;
				this.billIssueDate = billIssueDate;
				this.billDueDate = billDueDate;
				this.isBillPaid = isBillPaid;
				this.isLatestBill = isLatestBill;
				isBillCreated = true ;
             /*}
			   else{
				    System.out.println("Invalid Bill details provided.");
			   }*/
			  
				
		return isBillCreated ; 
	 }
			   
				
		
	 
	 public void display(){
			
		  System.out.println("The Bill Id is            : "+ this.billId);
		  System.out.println("The Bill Issue Date is    : "+ this.billIssueDate);
		  System.out.println("The Bill Due Date is      :"+ this.billDueDate);
		  System.out.println("Is Bill Paid              :"+ this.isBillPaid);
		  System.out.println("Is Bill Latest            : "+ this.isLatestBill);
	 }



}






	 
	 