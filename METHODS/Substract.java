class Substract{

	static int n[] = {23,12,3};
	static int n1[] = {12,24,52};
	static int n2[] = {34,67,0};
	public static void main(String sub[]){
	
	

	for(int i=0;i < n.length; i++){   		 
		sub(n[i],n[i+1],n[i+2]);
		//sub(n1[i],n1[i+1],n1[i+2]);
		//sub(n2[i],n2[i+1],n2[i+2]);
		break;
	}
	
	for(int i=0; i<n1.length; i++){
		sub(n1[i],n1[i+1],n1[i+2]);
		break;
	}
	
	
	
		}





	 public static void sub(float num1, float num2, int num3){
	 System.out.println(num1 - num2 - num3);
	 }




}