class Swiggy{

	//static String foodName  ;
 
	//ClassName.methodName
	
	public static double takeOrder(String foodName ){
	
		if(foodName == "Pizza"){
			System.out.println("The price of "+foodName);	
			return 99.0;		
		}
		
		if(foodName == "Melts Meal for 1 with Fries - Veg"){
			System.out.println("The price of "+foodName);
			return 259.00;
		}
		
		if(foodName == "Cheezy Cheese Veg & Loaded BBQ Veg Combo"){	
			System.out.println("The price of "+foodName);
		return 399.55;
		}
		
		
		if(foodName == "Butter Dosa 2 PC"){	
			System.out.println("The price of "+foodName);		
		return 119.00;
		}	
		
		if(foodName == "Plain Dosa"){
			System.out.println("The price of "+foodName);
		return 59.00;
		}
		
		if(foodName == "Benne Masala Dosa 1 Pcs") {
			System.out.println("The price of "+foodName);
		return 69.00;
		}
		
		if(foodName == "Special Choco Vanilla - 500Gms") {
			System.out.println("The price of "+foodName);
		return 225.00;
		}
		
		if(foodName == "Special Chocolate Truffle- 500Gms") {
			System.out.println("The price of "+foodName);
		return 260.00;
		}
		
		if(foodName == "Special Blackforest") {
			System.out.println("The price of "+foodName);
		return 270.00;
		}
		
		if(foodName == "Hara bhara kebab") {
			System.out.println("The price of "+foodName);
		return 160.00;
		}
		
		if(foodName == "Crispy corn chilli pepper") {
			System.out.println("The price of "+foodName);
		return 160.00;
		}
		
		if(foodName == "Crispy corn chilli pepper") {
			System.out.println("The price of "+foodName);
		return 150.00;
		}
		
		if(foodName == "Corn capsicum burger") {
			System.out.println("The price of "+foodName);
		return 110.00;
		}
		
	    if(foodName == "Paneer Spicy Rice Feast") {
			System.out.println("The price of "+foodName);
		return 259.00;
		}
		
		if(foodName == "Spicy Paneer Burger Salad Wrap") {
			System.out.println("The price of "+foodName);
		return 225.00;
		}
		
		if(foodName == "Chilli Sweet Paneer Burger Wrap") {
			System.out.println("The price of "+foodName);
		return 225.00;
		}
		
		
		
		else{
			System.out.println(foodName + "is not found");
			
		}
		
		return 0.0;
	}

}


