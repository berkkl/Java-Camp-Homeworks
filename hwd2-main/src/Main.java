public class Main {

	public static void main(String[] args) {
		
		
		Branch branch1 = new Branch(1,"Football");
		Branch branch2 = new Branch(2,"Basketball");
		Branch branch3 = new Branch(3,"Volleyball");

		//Fenerbahce winter 20/21 signings for football
		
		Player player1 = new Player();
        player1.setNo(67);
        player1.setName("Mesut Ozil");
        player1.setOldValue(5000000);
        player1.setOldTeam("Arsenall");
        player1.setCurrentTeam("Fenerbahçe");
        player1.setValueIncrease(0);
        player1.setValueDecrease(0);
        player1.getLastValue();
        player1.getValueChange();

        Player player2 = new Player();
        player2.setNo(17);
        player2.setName("Irfan Can Kahveci");
        player2.setOldValue(10000000);
        player2.setOldTeam("Istanbul Basaksehir");
        player2.setCurrentTeam("Fenerbahce");
        player2.setValueIncrease(1500000);
        player2.setValueDecrease(0);
        player2.getLastValue();
        player2.getValueChange();

        Player player3 = new Player();
        player3.setNo(41);
        player3.setName("Attila Szalai");
        player3.setOldValue(800000);
        player3.setOldTeam("Apollon Limasol");
        player3.setCurrentTeam("Fenerbahce");
        player3.setValueIncrease(2900000);
        player3.setValueDecrease(0);
        player3.getLastValue();
        player3.getValueChange();

        Player[] players = {player1,player2,player3};
        for (Player player : players){
            System.out.println("Value change of "+player.getName()+"is %"+player.getValueChange());
            System.out.println("Last value of "+player.getName()+"is: "+player.getLastValue());
		
		
		Branch[] branches = {branch1,branch2,branch3};
		
		
        }
	}	

}
