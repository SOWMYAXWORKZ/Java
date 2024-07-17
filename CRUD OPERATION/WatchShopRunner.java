class WatchShopRunner{

	public static void main(String watch[]){
	
	boolean	 isWatch   = WatchShop.addWatchBrandsNames("Guess");
		System.out.println("the watch name is added: " + isWatch);
		
		 isWatch   = WatchShop.addWatchBrandsNames("Titans");
		System.out.println("the watch name is added: " + isWatch);
	
		 isWatch   = WatchShop.addWatchBrandsNames("Sony");
		System.out.println("the watch name is added: " + isWatch);
		
		 isWatch   = WatchShop.addWatchBrandsNames("Citize");
		System.out.println("the watch name is added: " + isWatch);
		
		 isWatch   = WatchShop.addWatchBrandsNames("Casio");
		System.out.println("the watch name is added: " + isWatch);

		 isWatch   = WatchShop.addWatchBrandsNames("FastTrack");
		System.out.println("the watch name is added: " + isWatch);
		
		 isWatch   = WatchShop.addWatchBrandsNames("Fossil");
		System.out.println("the watch name is added: " + isWatch);

		 isWatch   = WatchShop.addWatchBrandsNames("Timex");
		System.out.println("the watch name is added: " + isWatch);
		
		 isWatch   = WatchShop.addWatchBrandsNames("Pumma");
		System.out.println("the watch name is added: " + isWatch);

		 isWatch   = WatchShop.addWatchBrandsNames("Seiko");
		System.out.println("the watch name is added: " + isWatch);
		
	
	
	WatchShop.getAllWatchBrands();
	
	boolean Update = WatchShop.updateWatchBrands("Seiko","Bulova");
	System.out.println(Update);

	WatchShop.getAllWatchBrands();
	
	
	boolean Delete = WatchShop.deleteWatchName("Timex");
	System.out.println(Delete);
	
	WatchShop.getAllWatchBrands();
	}
}