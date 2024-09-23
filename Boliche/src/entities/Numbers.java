package entities;

public class Numbers {

	public int pins;
	
	public void checagemPinos () {
		
	
	
		switch (pins) {
		case 10: System.out.println("GUTTER!");break;
		case 9: System.out.println("Faltam 9 pinos"); break;
		case 8: System.out.println("Faltam 8 pinos"); break;
		case 7: System.out.println("Faltam 7 pinos"); break;
		case 6: System.out.println("Faltam 6 pinos"); break;
		case 5: System.out.println("Faltam 5 pinos"); break;
		case 4: System.out.println("Faltam 4 pinos"); break;
		case 3: System.out.println("Faltam 3 pinos"); break;
		case 2: System.out.println("Faltam 2 pinos"); break;
		case 1: System.out.println("Faltam 1 pinos");break;
		}
		
	}
	
	public static String getOrdinalSuffix(int number) {
        
        switch (number % 10) {
            case 1:
                return "st";
            case 2:
                return "nd";
            case 3:
                return "rd";
            default:
                return "th";
        }}
	
	
}
