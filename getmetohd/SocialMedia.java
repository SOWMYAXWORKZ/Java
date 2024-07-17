class SocialMedia{
		
		static String uName;
		static long mN;
		static String eMail;
		static String pwd;
		static int otp;
		static String friends;
		
		
	
		public static boolean login(String userName, long mobileNumber, String email, String password,int otpmsg,
		String friendslist){
			
				boolean isloggin = false;
			
						uName = userName;
						mN = mobileNumber;
						eMail = email;
						pwd = password;
						otp = otpmsg;
						friends = friendslist;
						
			
			
			
			
			
		return isloggin;
			}
		
		public static void getlogin(){
			
				System.out.println("Enter the UserName                :        " + uName);
				System.out.println("Enter the Mobile Number           :        " + mN);
				System.out.println("Enter the e-Mail                  :        " + eMail);
				System.out.println("Enter the Password                :        " + pwd);
				System.out.println("Enter the OTP                     :        " + otp);
				System.out.println("Enter the Friends list            :        " + friends);
			
			
			
		}





}