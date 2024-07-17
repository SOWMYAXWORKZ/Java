class SportsMania{

static String iplTeams[] = {"CSK","RCB","MI","PBKS","DC","LSG","SRH","KKR","RR","GT"};
static String top10BatsMen[] = {"MSD","VK","RP","SG","KLR","RS","HP","DW","SS","DJB"};
static String top10Bowlers[] = {"DJB","BK","JB","MSh","MS","TS","N","G","P","AK"};
static String top10ICCTeamsName[] = {"India","Australia","South Africa","Bangladesh","New Zealand","England","West Indies","Ireland","Zimbawe","Sri Lanka"};

	public static void main(String[]sportsInfo){
		System.out.println();
		System.out.println("The No. of IPLTEAMS:");
		for (int i=0; i<iplTeams.length;i++){
		System.out.println(iplTeams[i]);   
		}
			
		System.out.println();	
		System.out.println("The No. of top10BatsMen:");
		for (int i=0; i<top10BatsMen.length;i++){
		System.out.println(top10BatsMen[i]);   
		}
		
		System.out.println();
		System.out.println("The No. of top10Bowlers:");
		for (int i=0; i<top10Bowlers.length;i++){
		System.out.println(top10Bowlers[i]);   
		}
		
		System.out.println();
		System.out.println("The No. of top10ICCTeamsName:");
		for (int i=0; i<top10ICCTeamsName.length;i++){
		System.out.println(top10ICCTeamsName[i]);   
		}


	}
}