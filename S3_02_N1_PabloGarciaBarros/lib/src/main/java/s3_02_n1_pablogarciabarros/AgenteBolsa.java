package s3_02_n1_pablogarciabarros;

import java.util.Observable;

@SuppressWarnings("deprecation")
public class AgenteBolsa extends Observable{
	
	private String estado;
	
	public void cambioEstado(String nuevoEstado) {
		this.estado = nuevoEstado;
		setChanged();
		notifyObservers(nuevoEstado);
	}
	
	public String getEstado() {
		return this.estado;
	}
}
