class ZomatoApp{

	
	public static double takeOrder(String foodName ){
	   double price = 0.0;
	   
		
		if(foodName == "Margherita Pizza"){
			System.out.println("The price of "+foodName);	
			price = 199.0;
			//quantity = 2;
			return price ;	
		}
		
		if(foodName == "Penne Chicken Arrabbiata"){
			System.out.println("The price of "+foodName);
			return 545.00;
		}
		
		if(foodName == "Baked Chicken Pesto & Penne"){	
			System.out.println("The price of "+foodName);
		return 545.55;
		}
		
		
		if(foodName == "Mushroom Artichokes"){	
			System.out.println("The price of "+foodName);		
		return 399.00;
		}	
		
		
		
		else{
			System.out.println(foodName + "is not found");
			
		}
		
		return 0.0;
		
	}	
		
		
		public static double takeOrder(String foodName, int quantity){
				double price = 0.0;
				
		if(foodName == "Margherita Pizza"){
			System.out.println("The price of "+foodName);	
			price = 199.0;
			quantity = 2;
			return price*quantity ;	
			}
			
		if(foodName == "Penne Chicken Arrabbiata"){
			System.out.println("The price of "+foodName);
			return 545.00;
		}
		
		if(foodName == "Baked Chicken Pesto & Penne"){	
			System.out.println("The price of "+foodName);
		return 545.55;
		}
		
		
		if(foodName == "Mushroom Artichokes"){	
			System.out.println("The price of "+foodName);		
		return 399.00;
		}	
		
		
		
		else{
			System.out.println(foodName + "is not found");
			
		}
		
		return 0.0;
		
			
	}
	
	
	
	

}


