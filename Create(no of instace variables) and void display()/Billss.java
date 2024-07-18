class Billss{
			
			int billId;
			String billIssueDate;
			String billDueDate;
			


		public  boolean createBills(int billId , String billIssueDate ,
				  String billDueDate ){
      		
			  boolean isBillCreated = false;
			   if(billId > 0 && billIssueDate != null && billDueDate != null ){
			    this.billId = billId;
				this.billIssueDate = billIssueDate;
				this.billDueDate = billDueDate;
				
				isBillCreated = true ;
			   }
			   else{
				    System.out.println("Invalid Bill details provided.");
			   }
			  
				
		return isBillCreated ;
	 }
			   
				
		
	 
	 public void display(){
			
		  System.out.println("The Bill Id is            : "+ this.billId);
		  System.out.println("The Bill Issue Date is    : "+ this.billIssueDate);
		  System.out.println("The Bill Due Date is      :"+ this.billDueDate);
		 
	 }



}






	 
	 