import java.util.*;
class RedChilliesEntertainment {

	static String movieNames[] = {null, null, null, null, null, null, null, null, null,null};
	static int movieNameindex = 0;

	public static boolean addMovieActors(String movieName){

		boolean isActorAdded = false;
		if(movieNameindex < movieNames.length){
		if(movieName != null){
			movienames[index] = movieName;
			index++;
			isActorAdded = true;
		}
		else {
			System.out.println("Invalid actor name Added");
		}
		else System.out.println("The item is not found ");
				System.out.println("Create chart name ended ");
	
		
	return isActorAdded;
	}

	public static void getMovieActors(){
		System.out.println("The movie actors available are:");
		for(String actor : movieNames){
			if(actor != null){
				System.out.println(actor);
			}
		} 
}
public static boolean deleteMovieActors(String actorToBeDeleted){
	System.out.println("delete actor started");
	boolean isMovieActorDeleted=false;
	int oldIndex,newSize;
	for(oldIndex=0,newSize=0;oldIndex<movieActors.length;oldIndex++){
		if(movieActors[oldIndex]!=actorToBeDeleted){
			movieActors[newSize]=movieActors[oldIndex];
			newSize++;
		}
	}
		movieActors=Arrays.copyOf(movieActors,newSize);
		if(movieActors!=null)
		{
			isMovieActorDeleted=true;
		}
		if(isMovieActorDeleted==false)
		{
			System.out.println(actorToBeDeleted + "not found");
		}
		System.out.println("delete actor name ended");
		return isMovieActorDeleted;
	}
		
		


}
