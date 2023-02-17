package s3_02_n2_pablogarciabarros;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pago pago1 = new PayPal();
		Pago pago2 = new TarjetaCredito();
		Pago pago3 = new Debito();
		
		pago1.ejecutarCallback(() -> System.out.println("Vuelve al main\n"));
		pago2.ejecutarCallback(() -> System.out.println("Vuelve al main\n"));
		pago3.ejecutarCallback(() -> System.out.println("Vuelve al main\n"));
	}

}
