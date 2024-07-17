class MiccrowaveOff {
	static boolean timerOff = true;
	
	public static void  timerOff(){
	System.out.println("Timer ended");
	if (timerOff == false){
		timerOff = true;
	System.out.println("The timer is OFF ");
	
	}
	else 
		System.out.println("The Timer is On");
	}
	
}