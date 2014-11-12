
public class SchaltjahrBerechner {
	
	public boolean istSchaltjahr(int i){
		return istSchaltjahr1(i) || istSchaltjahr2(i);
	}

	private boolean istSchaltjahr1(int jahr){
	return ((jahr % 4) == 0)&&((jahr % 100)!= 0);	
	}
	
	private boolean istSchaltjahr2(int jahr){
	return (jahr % 400 == 0);
	}
}
