// class ChatShopRun{

	public static void main(String[] args){
	
	boolean isAdded = ChatShop.createChatName("DahiPuri");
	System.out.println("The Chat added is :  " + isAdded);
	boolean priceAdded =ChatShop.addChatPrice(40.0);
	System.out.println("The Price of Dahi Puri is : "+priceAdded );
	
	isAdded = ChatShop.createChatName("SevPuri");
	System.out.println("The Chat added is :  " + isAdded);
	 priceAdded =ChatShop.addChatPrice(40.0);
	System.out.println("The Price of SevPuri  is : "+priceAdded );
	
	
	isAdded = ChatShop.createChatName("Masala Puri");
	ystem.out.println("The Chat added is :  " + isAdded);
	priceAdded =ChatShop.addChatPrice(40.0);
	System.out.println("The Price of Masala Puri is : "+priceAdded );
	
	
	isAdded = ChatShop.createChatName("Pani Puri");
	System.out.println("The Chat added is :  " + isAdded);
	priceAdded =ChatShop.addChatPrice(40.0);
	System.out.println("The Price of Pani Puri is : "+priceAdded );
	
	
	isAdded = ChatShop.createChatName("Bhel Puri");
	System.out.println("The Chat added is :  " + isAdded);
	priceAdded =ChatShop.addChatPrice(40.0);
	System.out.println("The Price of Bhel Puri is : "+priceAdded );
	
	
	isAdded = ChatShop.createChatName("Aloo tikki Puri");
	System.out.println("The Chat added is :  " + isAdded);
	priceAdded =ChatShop.addChatPrice(40.0);
	System.out.println("The Price of Aloo tikki Puri is : "+priceAdded );
	
	
	ChatShop.getChatNames();
	
	
	boolean chatUpdate = ChatShop.updateChatName( "Masala Puri","Raj Kachori" );
	System.out.println(chatUpdate);
	ChatShop.getChatNames();
	
	}


}