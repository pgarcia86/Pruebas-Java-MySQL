package s3_02_n3_pablogarciabarros;

public class InjectorPrecioPesoArgentino implements InjectorProducto{

	@Override
	public Producto getProductoUno() {
		
		return new ProductoUno(new PrecioPesoArgentino());
	}
}
