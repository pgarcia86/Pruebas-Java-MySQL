package s3_02_n2_pablogarciabarros;

public abstract class Pago {

	public void ejecutarCallback(Callback callback) {
		ejecutar();	
		if(callback != null) {
			callback.call();
		}
		else {
			System.out.println("No se inicio una instancia de callback");
		}
	}	
	
	public abstract void ejecutar();
}
