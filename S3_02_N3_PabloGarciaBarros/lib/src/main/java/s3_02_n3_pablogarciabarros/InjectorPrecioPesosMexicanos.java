package s3_02_n3_pablogarciabarros;

public class InjectorPrecioPesosMexicanos implements InjectorProducto{

	@Override
	public Producto getProductoUno() {
		return new ProductoUno(new PrecioPesoMexicano());
	}
}
