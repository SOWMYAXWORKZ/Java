class SwiggyRunner{
//static String foodName;
		public static void main(String foodName[]){
			System.out.println("Swiggy takeOrder Started");
			//ClassName.methodname
			//Swiggy.takeOrder("Pizza"); 
			 double price = Swiggy.takeOrder("Melts Meal for 1 with Fries - Veg");
        System.out.println(price);
			
			System.out.println("Swiggy takeOrder ended");
			
			
		}
		
	
}