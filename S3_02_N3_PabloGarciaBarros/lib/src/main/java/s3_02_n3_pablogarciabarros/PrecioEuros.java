package s3_02_n3_pablogarciabarros;

public class PrecioEuros implements Precio{
	
	//Implemento la clase Precio con el cambio correspondiente

	final double TIPO_CAMBIO = 0.94;
	
	@Override
	public void obtenerPrecio(String nombre, double precioDolar) {
		System.out.println("El precio de " + nombre + " en Euros es: " + precioDolar * TIPO_CAMBIO);
		
	}

}
