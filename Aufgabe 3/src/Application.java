
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/**
		 * @param args
		 */
	
			
			Vokalzaehler zaehler = new Vokalzaehler();
			zaehler.zaehleVokale("hallo!");
			zaehler.zaehleVokale("In diesem Satz gibt es nicht besonders viele a's.");
			zaehler.zaehleVokale("aabaabaaaaaaabbbaeiou");
			zaehler.zaehleVokale("AABAABAAAAAAABBBAEIOU");
		}

	}
