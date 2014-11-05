
public class Vokalzaehler {
	public Integer zaehleVokale(String zaehler) {
		
		Integer aktuellePosition = 0;
		Integer letztePosition = zaehler.length()-1;
		Integer anzahlVonA = 0;
	
		while(aktuellePosition <= letztePosition) {
			
			Character buchstabe = zaehler.charAt(aktuellePosition);

			if(buchstabe == 'a') {
				anzahlVonA++;
			}
			
			if(buchstabe == 'e') {
				anzahlVonA++;
			}
			
			if(buchstabe == 'i') {
				anzahlVonA++;
			}
			
			if(buchstabe == 'o') {
				anzahlVonA++;
			}
			
			if(buchstabe == 'u') {
				anzahlVonA++;
			}
			
			if(buchstabe == 'A') {
				anzahlVonA++;
			}
			
			if(buchstabe == 'E') {
				anzahlVonA++;
			}
			
			if(buchstabe == 'I') {
				anzahlVonA++;
			}
			
			if(buchstabe == 'O') {
				anzahlVonA++;
			}
			
			if(buchstabe == 'U') {
				anzahlVonA++;
			}
			
			aktuellePosition++;
		}
		
		System.out.println("Anzahl aller Vokale in '" + zaehler + "': " + anzahlVonA);
		
		return 0;
	}

}

