package s3_02_n3_pablogarciabarros;

public class main {

	public static void main(String[] args) {
	
		String prod1 = "Zapatillas";
		double precio1 = 55.28;
		
		String prod2 = "Zapatos";
		double precio2 = 105.28;
		
		InjectorProducto injector = null;
		
		Producto producto = null;
		
		injector = new InjectorPrecioEuros();
		producto = injector.getProductoUno();
		producto.precioProducto(prod1, precio1);
		
		injector = new InjectorPrecioPesosMexicanos();
		producto = injector.getProductoUno();
		producto.precioProducto(prod1, precio1);
		
		injector = new InjectorPrecioPesoArgentino();
		producto = injector.getProductoUno();
		producto.precioProducto(prod1, precio1);

		System.out.println("\n");
		
		injector = new InjectorPrecioEuros();
		producto = injector.getProductoUno();
		producto.precioProducto(prod2, precio2);
		
		injector = new InjectorPrecioPesosMexicanos();
		producto = injector.getProductoUno();
		producto.precioProducto(prod2, precio2);
		
		injector = new InjectorPrecioPesoArgentino();
		producto = injector.getProductoUno();
		producto.precioProducto(prod2, precio2);
		
	}

}
