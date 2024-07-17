class BusRegister{
		
		static String uName;
		static long mN;
		static String eMail;
		static String pwd;
		static String captch;
		static int otp;
		static String bdate;
		static String time;
		static int pay;
		
	
		public static boolean bookbus(String userName, long mobileNumber, String email, String password, String captcha,
			int loginAndBookOtp,String bookingdate, String timings, int payment){
			
				boolean isBusticketbooked = false;
			
						uName = userName;
						mN = mobileNumber;
						eMail = email;
						pwd = password;
						captch = captcha;
						otp = loginAndBookOtp;
						bdate = bookingdate;
						time = timings;
						pay = payment; 
						
			
				
			
		return isBusticketbooked;
			}
		
		public static void getBooked(){
			
				System.out.println("Enter the UserName                :        " + uName);
				System.out.println("Enter the Mobile Number           :        " + mN);
				System.out.println("Enter the e-Mail                  :        " + eMail);
				System.out.println("Enter the Password                :        " + pwd);
				System.out.println("Enter the Captch                  :        " + captch);
				System.out.println("Enter the Login & book Otp        :        " + otp);
				System.out.println("Enter the Booking date            :        " + bdate);
				System.out.println("Bus timings                       :        " + time);
				System.out.println("Make the payment                  :        " + pay);
			
						
		}





}