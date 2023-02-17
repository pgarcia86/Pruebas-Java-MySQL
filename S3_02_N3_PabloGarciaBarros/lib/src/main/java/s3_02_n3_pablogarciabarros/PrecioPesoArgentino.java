package s3_02_n3_pablogarciabarros;

public class PrecioPesoArgentino implements Precio{
	
	//Implemento la clase Precio con el cambio correspondiente

	final double TIPO_CAMBIO = 192.85;
	
	@Override
	public void obtenerPrecio(String nombre, double precioDolar) {
		System.out.println("El precio de " + nombre + " en pesos argentinos es: " + precioDolar * TIPO_CAMBIO);
		
	}

}
