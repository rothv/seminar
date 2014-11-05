
public class App {

	public static void main(String[] args) {
		
		Integer zahl1 = 0;
		Integer zahl2 = 1;
		
		
		if(zahl1 == zahl2){
			// Doppelklick auf der linken blauen Spalte erstellt ein Breakpoint
			//Code; wird ausgeführt wenn wahr
			System.out.println("Zahlen sind gleich");
		}else{
			// else ist optional und kann auch durch ein weiteres if ersetzt werden
			// man kann auch }else if{ verwenden um die nächste Unterscheidung darzustellen
			//Code wird ausgeführt wenn erste bedingung nicht zutrifft
			System.out.println("Zahlen sind ungleich");
		}
		
		
		
		Boolean equal = (zahl1 == zahl2);	
		
		// das == kann man durch die unten aufgeführten Befehle ersetzen
		//überprügt ob der linke wert dem rechten Operator entspricht
	    // = Zuweisungsoperatur ==Vergleichsoperator Boolean Wahrheitswert
		
		System.out.println(equal);
		
		//	+ ; alleine Verbindung von String und Ausdruck; in Klammern mit zwei operatoren links und rechts dient er zur Addition
		
		Integer x= 2 + 3; //5
		System.out.println(x);
		
		//	-
		
		x= 2 - 3;//-1
		System.out.println(x);
		
		//	*
		
		x= 2 * 3;//6
		System.out.println(x);
		
		// 	/
		
		x= 5 / 3;//1
		System.out.println(x);
		
		//	% Modulo
		
	    x= 5 % 3;//2
		System.out.println(x);
		
		
		//	Vergleichsoperatoren
		//	<  kleiner
		//	>  größer
		// 	>= größer gleich
		// 	<= kleiner gleich
		//	!= ungleich
		// 	== gleich
	}

}
