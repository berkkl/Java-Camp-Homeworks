public class PlayerInfo {
	
	public void teamChanges(Player players) {

		System.out.println(players.getName() +" is now transferred to "+ players.getCurrentTeam() );
	}
	
	public void playerValue(Player players) {
		
		System.out.println(players.getName() + "'s current value is: "+ players.getLastValue());
	}
	
	public void jerseyNo(Player players) {
		System.out.println(players.getName() + "'s current Jersey number is: "+players.getNo());
	}

}
