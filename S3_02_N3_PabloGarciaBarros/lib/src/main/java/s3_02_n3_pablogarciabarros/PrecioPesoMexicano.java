package s3_02_n3_pablogarciabarros;

public class PrecioPesoMexicano implements Precio{

	//Implemento la clase Precio con el cambio correspondiente
	
	final double TIPO_CAMBIO = 18.63;
	
	@Override
	public void obtenerPrecio(String nombre, double precioDolar) {
		
		System.out.println("El precio de " + nombre + " en pesos mejicanos es: " + precioDolar * TIPO_CAMBIO);
	}

}
