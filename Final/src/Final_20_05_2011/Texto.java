package Final_20_05_2011;

public abstract class Texto {
	
	private Modificador m;
	
	public Texto(Modificador m) {
		this.m = m;
	}
	
	public Modificador getModificador() {
		return this.m;
	}
	
	public void setModificador(Modificador m) {
		this.m = m;
	}
	
	public abstract int getCantPalabras();
	public abstract String getTextoSimple();
	public abstract String getTextoEstructurado();
	public abstract String getTextoFormateado();
	public abstract Texto getCopia();
	
}
