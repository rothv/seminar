
public class App {

	public static void main(String[] args) {
		
		Integer zahl1 = 0;
		Integer zahl2 = 1;
		
		//k�nnte auch den Zwischenschritt Boolean b = zahl1 == zahl2
		
		//Beispiel while Schleife
		// while (zahl1<zahl2){ System.out.println("loop.."); zahl1 =zahl1 + 1; (gleiches wie zahl1++)
		// zahl1 =zahl1+1 <- hier kann ich die Zahl ver�ndern also folglich +2, +3, usw.
		// zahl++ hier ist dies nicht gegeben. er geht automatisch weiter
		
		// while (true) endlosschleife man braucht bedingungen um diese zu beenden
		// while(true) { if (zahl1 == zahl2){ break;} zahl1= zahl1+1; } break 
		//ist das schl�sselwort um die schleife zu unterbrechen
	
		
		// do while schleife
		// do{
		//zahl1++;
		//sytsem.out.println("loop")
		//}while(zahl1<zahl2);
		
		
		//for schleife
		//for(Integer i =0; i<10; i++){}
		//meist genutzt da wenig aufwand und gleiches ergebnis
		// i gilt nur innerhalb der schleife nicht au�erhalb
		// man kann auch die parameter weg lassen aber dann kommen wir wiedermal in eine 
		//endlos schleife (HAHAHAH ! :-P)
		
		//boolean a = true;
		//boolean b =false;
		//if(a || b){    die zwei striche hei�en "logisches oder" man braucht aber zwei 
		//optionale zust�nde (operanden)
		//if(a&&b){      "logisches und" beide m�ssen den gleichen wert 
		//haben(bsp true) ansonsten wird false angezeigt
		//if(a&&b||c){ w�rde nicht vergleichen wenn bedingung mit dem linken operator erf�llt ist
		//if(a&&b|c){  w�rde trotzdem beide vergleichen
		// if (!a){ negiert den ausdruck (kehrt ihn um bsp: true -> false)
		//system.out.println("...");
		
		
		if(zahl1 == zahl2){
			
			// Doppelklick auf der linken blauen Spalte erstellt ein Breakpoint f�r Debug
			
			//Code; wird ausgef�hrt wenn wahr
			
			System.out.println("Zahlen sind gleich");
		}else{
			// else ist optional und kann auch durch ein weiteres if ersetzt werden
			// man kann auch }else if{ verwenden um die n�chste Unterscheidung darzustellen
			//Code wird ausgef�hrt wenn erste bedingung nicht zutrifft
			// {} innerhalb dieses Bereichs wird etwas ausgef�hrt
			
			System.out.println("Zahlen sind ungleich");
		}
		
		//return um den wert an die anderen abzugeben
		// integer unsigned kann zahlen representieren 2 hoch 16 (da 16 bit) wenn die letzte zahl 
		//erreicht wird dann springt man automatisch auf den h�chsten negativen wert dadurch kann eine 
		//while schleife durch if(naechstezahl<0){break;} funktionieren
		
		// dies kann man auch verk�rzt durch MAW_VALUE oder MIN_VALUE erreichen (Integer)
		// wenn man den Wert ver�ndert also statt integer long verwendet muss dies bei allen anderen 
		// auch ver�ndert werden
		
		Boolean equal = (zahl1 == zahl2);	
		
		// das == kann man durch die unten aufgef�hrten Befehle ersetzen
		//�berpr�gt ob der linke wert dem rechten Operator entspricht
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
		
	    x= 5 % 3;//2 ganzzahliger Wert
		System.out.println(x);
		
		
		//	Vergleichsoperatoren
		//	<  kleiner
		//	>  gr��er
		// 	>= gr��er gleich
		// 	<= kleiner gleich
		//	!= ungleich
		// 	== gleich
	}

}

// public integer addiere(integer first, integer second){ first und second sind platzhalter, die 
//sagen, dass an dieser stelle der integer wert eingef�gt muss
//dieser ist meist in der klasse definiert
// integer ergebnis = first  + second; 
//return ergebnis;
// es ist total egal was ich bei ergebnis, first, second verwende denn diese sind nur platzhalter
// wichtig ist nur, dass ich am ende einen integer wert ausgebe damit die methode diese dann 
//zwischenspeichern kann und somit die arbeit fortsetzt
//parameter sind nur innerhlab des methodenblocks verf�gbar und nicht �ber das ganze programm

