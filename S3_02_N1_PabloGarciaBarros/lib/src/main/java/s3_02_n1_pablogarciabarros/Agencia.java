package s3_02_n1_pablogarciabarros;

import java.util.Observable;
import java.util.Observer;

@SuppressWarnings("deprecation")
public class Agencia implements Observer{
	
	private String estadoBolsa;
	

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		
		this.estadoBolsa = (String) arg;
		
	}
	
	@Override
	public String toString() {
		return "El estado de la bolsa es: " + this.estadoBolsa;
	} 

}
