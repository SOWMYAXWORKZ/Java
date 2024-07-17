class Passports{
	
		
	
	static String cprloc;
	static int dcdrloc;
	static String sName;
	static String gName;
	static String dateofbirth;
	static String eMail;
	static boolean eMailSame;
	static String logId;
	static String passWord;
	static String cpassWord;
	static String hQue;
	static String hAns;
	static String captch;	
	
	
	
	
	public static boolean createPassport(String cprlocation,int dcdrlocation, String surName,String givenName,   //validation
	String dob,String email,boolean isEmaiLoginSame,String loginId,String pwd, String conformPwd,
	String hintQuen,String hintAns,String captcha){
		
	

		boolean isPassportDataCreated=false;    //
		
		
		
		variable declartion and intialization
		
		if(cprlocation!= null && dcdrlocation > 0 && surName!= null && givenName!=null && dob!=null && email!=null && 
		isEmaiLoginSame == false && loginId!=null && pwd!=null && conformPwd!= null && hintQuen!=null && hintAns!=null && captcha!=null){
			cprloc = cprlocation   ;
			dcdrloc =  dcdrlocation   ;
			sName = surName;
			gName = givenName;
			dateofbirth = dob;
			eMail = email ;
			eMailSame =  isEmaiLoginSame;
			logId = loginId;
			passWord = pwd;
			cpassWord =  conformPwd;
			hQue = hintQuen ;
			hAns = hintAns;
			captch = captcha;
			isPassportDataCreated=true;
		}
		else{
			System.out.println("Name/email");
		}
	
	
	//System.out.println("The CPR Location is             : " + cprlocation );
		//System.out.println("The dcd Location is             : " + dcdrlocation );
		//System.out.println("SurName                         : " + surName );
		//System.out.println("GiveName                        : " + givenName );
		//System.out.println("Date of birth                   : " + dob );
		//System.out.println("email                           : " + email );                    first create a passportdatacreated
		//System.out.println("conform email                   : " + isEmaiLoginSame);
		//System.out.println("LoginID                         : " + loginId );
		//System.out.println("Password                        : " + pwd );
		//System.out.println("Conform Password                : " + conformPwd );
		//System.out.println("Hint Question                   : " + hintQuen );
		//System.out.println("Hint Answer                     : " + hintAns );
		//System.out.println("Enter Captcha                   : " + captcha );

		
	
	
	return isPassportDataCreated;
	}
	
	
		public static void getPassportDetails(){
				
		System.out.println("The CPR Location is             : " + cprloc );
		System.out.println("The dcd Location is             : " + dcdrloc );
		System.out.println("SurName                         : " + sName );
		System.out.println("GiveName                        : " + gName );
		System.out.println("Date of birth                   : " + dateofbirth );
		System.out.println("email                           : " + eMail );                 //   first create a passportdatacreated
		System.out.println("conform email                   : " + eMailSame);
		System.out.println("LoginID                         : " + logId );
		System.out.println("Password                        : " + passWord );
		System.out.println("Conform Password                : " + cpassWord );
		System.out.println("Hint Question                   : " + hQue );
		System.out.println("Hint Answer                     : " + hAns );
		System.out.println("Enter Captcha                   : " + captch );
				
			}
	
	
	
	
	
}

