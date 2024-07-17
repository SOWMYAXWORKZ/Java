class Grocery{
	static String fruit[] = {"Apples","Pears","Bananas","Grapes","Oranges"};
	static String pasta[] ={"Spaghetti","Macaroni","Rice"};
	static String sauce[] = {"BBQ Sauce","Oil","Vinegar","Soy Sause"};
	
	public static void main(String items[]){
		
		System.out.println("LIST OF FRUITS: ");
	for(String fruits: fruit){     
		System.out.println(fruits);
	}
	
	System.out.println();
	System.out.println("LIST OF PASTA/RICE: ");
	for(String pastas: pasta){
		System.out.println(pastas);
		}
		
	System.out.println();	
	System.out.println("LIST OF SAUCES: ");
	for(String sauces: sauce){
		System.out.println(sauces);
		}
	
	
	}
}