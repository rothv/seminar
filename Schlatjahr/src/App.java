
public class App {

	public static void main(String[] args) {
		
		SchaltjahrBerechner sjb = new SchaltjahrBerechner();
		
		for(int i =0; i < 2100; i++){
			if(sjb.istSchaltjahr(i)){
				System.out.println("Ist Schaltjahr... "+ i);
			}
		}

	}

}
