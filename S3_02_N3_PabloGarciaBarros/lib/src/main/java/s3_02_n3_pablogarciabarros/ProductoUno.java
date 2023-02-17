package s3_02_n3_pablogarciabarros;

public class ProductoUno implements Producto{
	
	//Implemento la clase Producto

	private Precio precio;
	
	public ProductoUno(Precio precio) {
		this.precio = precio;
	}
	
	
	@Override
	public void precioProducto(String nombreProducto, double precioDolar) {
		
		this.precio.obtenerPrecio(nombreProducto, precioDolar);
	}

}
