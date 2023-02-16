package s3_02_n2_pablogarciabarros;

public class Debito extends Pago{
	
	@Override
	public void ejecutar() {
		System.out.println("El pago se hizo con tarjeta de debito");
	}

}
