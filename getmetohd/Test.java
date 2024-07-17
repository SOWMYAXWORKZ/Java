class Test{

			static String nm;
			static int ag;
			static short un;
			static long pNum;
			static float fee;
			static double dfee;
			






			public static boolean createAllDatatypes(String name, int age,  long phoneNumber, float fees, double donasionFee, char branch){
			
				boolean isCreatedDatatypes =false;
				
					nm = name;
					ag = age;
				//	un = usn;
					pNum = phoneNumber;
					fee = fees;
					dfee = donasionFee;
			
			
			
			
			
			
					return isCreatedDatatypes;
			}

					public static void getDatatypes(){
						
							System.out.println("enter the name:   " + nm );
							System.out.println("enter the age:    "  + ag);
						//
						System.out.println("Enter the usn:    "  + un);
							System.out.println("Enter the phone NUmber: " + pNum);
							
							System.out.println("enter the fees structure : " + fee);
							System.out.println("enter the  donastion fees: " + dfee);
					}
					
				






}