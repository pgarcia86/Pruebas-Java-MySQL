package s3_02_n3_pablogarciabarros;

public class InjectorPrecioEuros implements InjectorProducto {

	//Desde aqui creo un objeto del tipo ProductoUno que depende de PrecioEuros
	
	@Override
	public Producto getProductoUno() {
		
		return new ProductoUno(new PrecioEuros());
		
	}
}
