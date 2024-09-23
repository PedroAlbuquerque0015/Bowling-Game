package application;
import java.util.Scanner;
import entities.Game;
public class ProgramBowling {
public static void main(String[]args) {
	
	int qtyPlayers =0;
	
	
	Scanner sc = new Scanner(System.in);
	
	
	System.out.println("Welcome to Bowling!");
	
	System.out.println("How many people will play? Maximum 6 players.");
	
	qtyPlayers = sc.nextInt();
	sc.nextLine();
	
	 if (qtyPlayers > 6 || qtyPlayers < 1) {
         System.out.println("Invalid number of players.");
         System.exit(0);
     }
	 else {
		 System.out.println("Okay, now name the players:");
	 }
	
	String[] players = new String[qtyPlayers];
	int[][] frameAtt1 = new int[qtyPlayers][12];
	int[][] frameAtt2 = new int[qtyPlayers][12];
	int[][] points = new int [qtyPlayers][12];
	int[] totalPoints = new int[qtyPlayers];
	
	Game game = new Game (qtyPlayers, players,frameAtt1,frameAtt2, points, totalPoints);
	
	for (int i =0; i<qtyPlayers;i++) {
		
		System.out.println("Enter player name:");
		game.players[i] = sc.nextLine();
		
		
	}
	System.out.println("Players:");
	
	for (int i =0;i<qtyPlayers;i++) {
		
		System.out.println(game.players[i]);
	}
	
	for (int frame = 1; frame<11;frame++) {
		
		 System.out.println(frame + Game.getOrdinalSuffix(frame));
		
		 game.frame(frame);
		 
		System.out.println(frame + Game.getOrdinalSuffix(frame) + " closed.");
		System.out.println("Interval");
			
		System.out.println(" ");
	}
	System.out.println("game over, points will be displayed below");
	game.showPoints();}}
