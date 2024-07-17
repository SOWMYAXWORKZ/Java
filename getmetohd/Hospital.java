class Hospital{
		
		static String fName;
		static long cN;
		static String eMail;
		static String select;
		static String write;
		
	
		public static boolean tokendetails(String fullName, long contactNumber, String emailId, 
										   String services, String message){
			
				boolean istokencreated = false;
			
						fName = fullName;
						cN = contactNumber;
						eMail = emailId;
						select= services;
						write = message; 
						
			
				
			
		return istokencreated;
			}
		
		public static void gettoken(){
			
				System.out.println("Enter the Full Name               :        " + fName);
				System.out.println("Enter the Mobile Number           :        " + cN);          
				System.out.println("Enter the e-Mail                  :        " + eMail);
				System.out.println("Select the services               :        " + select);
				System.out.println("A few sentences about your problem for contacting us :        " + write);
			
						
		}

}