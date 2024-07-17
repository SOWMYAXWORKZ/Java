class WatchShop{

	static String WatchShopName = "NYKEE";
	
	
	
		static String watchNames[]={null,null,null,null,null,null,null,null,null,null};
		static int watchNameindex;
		
		public static boolean addWatchBrandsNames(String watchName){
			System.out.println("Watch Name List is started");
			boolean isCreateWatchBrandsNames = false;
				if(watchNameindex < watchNames.length){
					if(watchName != null){
					watchNames[watchNameindex] = watchName;
					watchNameindex++;
					isCreateWatchBrandsNames = true	;				
					}
					else System.out.println("the watchname list is full");
				}
				else System.out.println("the watchname is not found");
		
				
			System.out.println("Watch Name List is ended");
			return isCreateWatchBrandsNames;
		}
		
		public static void getAllWatchBrands(){
			for(String watchName: watchNames)
				System.out.println(watchName);

		}
		
		public static boolean updateWatchBrands(String oldWatchName, String newWatchName){
			System.out.println("update list is started");
			boolean isUpdateWatchBrands = false;
			for(int index = 0; index < watchNames.length; index++){
				if(oldWatchName == watchNames[index]){
					watchNames[index] = newWatchName;
				isUpdateWatchBrands = true;
				}
				
			
			}
		
			if (isUpdateWatchBrands == false)
			System.out.println("The watch is not found");
			System.out.println("update list is ended");
			return isUpdateWatchBrands;
			
	
		}

}