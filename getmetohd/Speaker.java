class Speaker{
	static boolean timerOn = true;
	
	public static void timerOn(){
	System.out.println("Timer Started");
	if (timerOn == false){
		timerOn = true;
	System.out.println("The timer is ON ");
	
	}
	else if(timerOn==true){
		timerOn=false;
		System.out.println("Timer is off");
	}
	System.out.println("onOff Ended");
	return;
}
	public static void getFeature(){
		String name="Noise";
		int price=43500;
		System.out.println("The name of the speaker is "+ name +" and the Price is "+ price);
		}
	

}