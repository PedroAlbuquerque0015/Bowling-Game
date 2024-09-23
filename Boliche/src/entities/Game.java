package entities;
import java.util.Scanner;
public class Game extends Numbers {

	Scanner sc = new Scanner(System.in);
	
	
	public int qtyPlayers;
	public String[] players;
	int[][] frameAtt1;
	int[][] frameAtt2;
	int[][] points;
	int[] totalPoints;

	
	public Game(int qtyPlayers, String[] players,int[][] frameAtt1, int[][] frameAtt2, int[][] points, int[] strike) {
		this.qtyPlayers = qtyPlayers;
		 this.players = players;
		 this.frameAtt1 = frameAtt1;
			this.frameAtt2 = frameAtt2;
			this.points = points;
			this.totalPoints = strike;
	}
	
	
	
	public void frame(int frame) {
		
		
		for (int i=0;i<qtyPlayers;i++) {
			
			
			System.out.println(players[i] + " turn.");
				//chamado do jogador
				
				
			System.out.println("How many pins did " +players[i]+ " knock down?");
				//pergunta dos pinos
				
			frameAtt1[i][frame] = sc.nextInt();
				//lendo a quantidade
		
			pins = 10 - frameAtt1[i][frame];
			if (frameAtt1[i][frame] > 10) {
				System.out.println("Incompatible number");
				System.exit(0);
			}
				//testando erro
				
			if (pins == 0) {
				System.out.println("STRIKE!");
			}
				//imprimindo Strike
			
			if (frameAtt1[i][frame] != 10) {
				checagemPinos();}
				//imprimindo pinos faltando
			
			if (frameAtt1[i][frame] != 10) {
				System.out.println("How many pins did " +players[i]+ " knock down, on the second try?");
				frameAtt2[i][frame] = sc.nextInt();
				//lendo segunda tentativa
				
				if (frameAtt2[i][frame] > 10) {
					System.out.println("Incompatible number");
					System.exit(0);
			}//testando erro
				else if (frameAtt2[i][frame] > pins) {
					System.out.println("Incompatible number");
					System.exit(0);
				}
				//testando erro
				
		pins = 10 - frameAtt1[i][frame] - frameAtt2[i][frame];
		//calculando pinos faltando
		
		if (frameAtt1[i][frame] != 10) {
			checagemPinos();}
			//imprimindo pinos faltando
		
		if (frameAtt1[i][frame] + frameAtt2[i][frame] == 10) {
			System.out.println("SPARE");
		}
		
		
			}//chave da ocasião da segunda tentativa
	
	if (frame == 1 || frameAtt1[i][frame-1] + frameAtt2[i][frame-1] != 10) {
		points[i][frame] = frameAtt1[i][frame] + frameAtt2[i][frame];
		//calculo obrigatório da rodada 1
	}
	
	if(frameAtt1[i][frame-1] + frameAtt2[i][frame-1] == 10 && frame != 1) {
		
		points[i][frame] = ((frameAtt1[i][frame] * 2) + frameAtt2[i][frame]);
		//calculo SPARE rodada apartir da 2
	}
	if (frame > 1) {
	if(frameAtt1[i][frame-1] == 10 && frame > 1) {
		points[i][frame] = (frameAtt1[i][frame] + frameAtt2[i][frame]) * 2;
		//calculo Strike rodada apartir da 2
	}}
	if (frame > 2) {
	if(frameAtt1[i][frame-2] == 10 && frame > 2) {
		points[i][frame] = (frameAtt1[i][frame] + frameAtt2[i][frame]) * 2;
		//calculo Strike rodada apartir da 3
	}}
	
	
	if (frameAtt1[i][10] == 10) {
		System.out.println(players[i] +" received two extra moves thanks to Strike in frame 10:");
		System.out.println("How many pins did " +players[i]+ " knock down?");
		frameAtt1[i][11] = sc.nextInt();
		pins = 10 - frameAtt1[i][11];
		checagemPinos();
		System.out.println("How many pins did " +players[i]+ " knock down, on the second try?");
		frameAtt2[i][11] = sc.nextInt();
		pins = 10 - frameAtt1[i][11] - frameAtt2[i][11];
		checagemPinos();
		points[i][frame] = frameAtt1[i][11] + frameAtt2[i][11] + frameAtt1[i][frame] + frameAtt2[i][frame];
	}else if (frameAtt1[i][10] + frameAtt2[i][10] == 10 && frameAtt1[i][10] != 10) {
		System.out.println(players[i] + " received one extra moves thanks to Spare in frame 10:");
		System.out.println("How many pins did " +players[i]+ " knock down?");
		frameAtt1[i][11] = sc.nextInt();
		points[i][frame] = frameAtt1[i][11] + frameAtt1[i][frame] + frameAtt2[i][frame];
	}
	
	System.out.println(points[i][frame]);
	
}}
	

	public void showPoints() {
		int morePoints =0;
		String winner = null;
		for (int i =0;i<qtyPlayers;i++) {
		
		
		for (int j=0;j<11;j++) {
		totalPoints[i] += points[i][j];
		
		
		}
		System.out.println(players[i] +" | " +points[i][1]+" | " +points[i][2]+" | " +points[i][3]+" | " +points[i][4]+" | " +points[i][5]+" | " +points[i][6]+" | " +points[i][7]+" | " +points[i][8]+" | " +points[i][9]+" | " +points[i][10]+" | "+totalPoints[i]);
		
		
		if (totalPoints[i] > morePoints) {
			morePoints = totalPoints[i];
			winner = players[i];
		}}
	
	System.out.println("The winner is: "+ winner);
	}






}

