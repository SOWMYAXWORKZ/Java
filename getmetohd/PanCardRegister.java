class PanCardRegister{
   
		static String gName;
		static String  dateofbirth;
		static String aadhar;
		static String voter;
		static String certi;
		static String eMail;
		static String phone;
		
	public static boolean createPancarddetails(String givenName,String dob,String aadharnumber,String voterID,
												String certificate, String email,String phonenumber){
        boolean isPancardDatecreated=false;

           gName = givenName;
		   dateofbirth = dob;
		   aadhar = aadharnumber;
		   voter = voterID;
		   certi = certificate;
		   eMail = email;
		   phone = phonenumber;
		   
		   return isPancardDatecreated;
		}
		
			public static void getPanCardCreated(){

					System.out.println("The givenName is                :       " + gName);
					System.out.println("The date of birth is            :       " + dateofbirth);
					System.out.println("The aadharnumber is             :       " + aadhar);
					System.out.println("The voterID is                  :       " + voter);
					System.out.println("The certificate is              :       " + certi);
					System.out.println("The email is                    :       " + eMail);
					System.out.println("The phonenumber is              :       " + phone);

	}
}