import java.util.Arrays;
class Blinkit{
	static String  ShopName = "Blinkit";
	
	static String itemNames[] = {null,null,null,null,null,null,null,null,null,null,null,null,null,null,null};
	static int itemNameindex;
	
	public static boolean createIteam(String itemName){
	
		boolean isCreateItemName = false;
		System.out.println("brand name list is started");
		if(itemNameindex < itemNames.length){
			if(itemName != null){
				itemNames[itemNameindex] = itemName;
				itemNameindex++;
				isCreateitemName = true;	
			}
			else System.out.println("item length is full");
		}
		else System.out.println("item name is not found");
		
		System.out.println("itemname list is ended");
		return isCreateItemName;
		
	}
	
	public static void displayAllItems(){
		for(String itemName:itemNames)
			System.out.println(itemName);
	}



	public static boolean updateItem(String oldItemName, String newItemName){
		boolean isUpdateItem = false;
		System.out.println("update list is started");
		for(int index = 0; index < itemNames.length; index++){
			if(oldItemName == ItemNames[index]){
				itemNames[index] = newItemName;
			isUpdateItem = true;
			}
			
		}
		if (isUpdateItem == false)
			System.out.println("The item is not found");
		System.out.println("update list is ended");
		return isUpdateItem;
	}
	
	public static boolean deleteItemName(String itemNameTobeDeleted)
	{
		System.out.println("Delete method started");
		boolean isItemNameDeleted = false;
		int newIndex, oldIndex;
		for(newIndex = 0,oldIndex = 0; oldIndex < itemNames.length;oldIndex++)
		{
			if(itemNames[oldIndex] != itemNameTobeDeleted)
			{
				itemNames[newIndex] = itemNames[oldIndex];
				newIndex++;
			
				
			}else{
				isItemNameDeleted = true;
			}
		}
		
			itemNames = Arrays.copyOf(itemNames, newIndex);
			

			if(isItemNameDeleted == false)
			{
				System.out.println(itemNameTobeDeleted + " not found");
			}
			System.out.println("Delete method ended");
			return isitemNameDeleted;
	}
	
	
}