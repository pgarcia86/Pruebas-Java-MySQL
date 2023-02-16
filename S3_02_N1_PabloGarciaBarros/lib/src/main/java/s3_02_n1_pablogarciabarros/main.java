package s3_02_n1_pablogarciabarros;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AgenteBolsa bolsaNueva = new AgenteBolsa();
		
		Agencia agencia1 = new Agencia();
		Agencia agencia2 = new Agencia();
		Agencia agencia3 = new Agencia();
		
		bolsaNueva.addObserver(agencia1);
		bolsaNueva.addObserver(agencia2);
		bolsaNueva.addObserver(agencia3);
		
		bolsaNueva.cambioEstado("Subio");
		
		System.out.println(agencia1.toString());
		System.out.println(agencia2.toString());
		System.out.println(agencia3.toString());
		
		bolsaNueva.cambioEstado("Bajo");
		
		System.out.println(agencia1.toString());
		System.out.println(agencia2.toString());
		System.out.println(agencia3.toString());

	}
}
