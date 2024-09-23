package entities;

public class Numbers {

	public int pins;
	
	public void checagemPinos () {
		
	
	
		switch (pins) {
		case 10: System.out.println("GUTTER!");break;
		case 9: System.out.println("9 pins left"); break;
		case 8: System.out.println("8 pins left"); break;
		case 7: System.out.println("7 pins left"); break;
		case 6: System.out.println("6 pins left"); break;
		case 5: System.out.println("5 pins left"); break;
		case 4: System.out.println("4 pins left"); break;
		case 3: System.out.println("3 pins left"); break;
		case 2: System.out.println("2 pins left"); break;
		case 1: System.out.println("1 pin left");break;
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
