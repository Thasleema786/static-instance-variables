public class Player{
	static int totalPlayer=0;
	  String playerName;
public static void main(String[] args){
      totalPlayer++;
      Player p1=new Player();
      p1.playerName="Virat"; 
      Player p2=new Player();
      p2.playerName="Rohith";
      totalPlayer++;
      System.out.println("Total Players:"+totalPlayer);
      System.out.println(" First Player Name:" +p1.playerName);
      System.out.println("Second Player Name:" +p2.playerName);

     
}
}