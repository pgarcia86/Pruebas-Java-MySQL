package s3_02_n2_pablogarciabarros;

public class PayPal extends Pago{

	@Override
	public void ejecutar() {
		System.out.println("El pago se hizo por PayPal");
	}

}
