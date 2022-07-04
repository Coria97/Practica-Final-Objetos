package FinalFebrero2022;

public abstract class Elemento {
	
	private int nroTracking;
	
	public Elemento(int nroTracking) {
		this.nroTracking = nroTracking;
	}

	public int getTracking() {
		return this.nroTracking;
	}
	
	public void setTracking(int numero) {
		this.nroTracking = numero;
	}
	
	public abstract Direccion getDireccionDestino();
	
	public abstract Direccion getDireccionRemitente();
	
	public abstract String getRemitente();
	
	public abstract String getDestinatario();
	
	public abstract double getPeso();
	
	public abstract void listar(Filtro f);
}
