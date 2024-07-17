class SportsMania{

static String iplTeams[] = {"CSK","RCB","MI","PBKS","DC","LSG","SRH","KKR","RR","GT"};
static String top10BatsMen[] = {"MSD","VK","RP","SG","KLR","RS","HP","DW","SS","DJB"};
static String top10Bowlers[] = {"DJB","BK","JB","MSh","MS","TS","N","G","P","AK"};
static String top10ICCTeamsName[] = {"India","Australia","South Africa","Bangladesh","New Zealand","England","West Indies","Ireland","Zimbawe","Sri Lanka"};
	public static void main(String[]sportsInfo){
	System.out.println("IPL TEAMS");
	for(String iplTeam: iplTeams){     
		System.out.println(iplTeam);
	}
	System.out.println();
	System.out.println("TOP 10 BATSMAN");
	for(String top10BatsMens: top10BatsMen){
		System.out.println(top10BatsMens);
		}
	System.out.println();
	System.out.println("TOP 10 BOWLERS");	
	for(String top10Bowler: top10Bowlers){
		System.out.println(top10Bowler);
		}
	System.out.println();
	System.out.println("TOP 10 ICC TEAMS");
	for(String top10ICCTeamsNames: top10ICCTeamsName){
		System.out.println(top10ICCTeamsNames);
		}



	}
}