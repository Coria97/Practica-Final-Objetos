package Final_20_05_2011;

public class Palabra extends Texto {
	
	private String p;
	
	public Palabra(String p) {
		super(null);
		this.p = p;
	}
	
	public String getPalabra() {
		return this.p;
	}
	
	public void setPalabra(String p) {
		this.p = p;
	}
	
	@Override
	public int getCantPalabras() {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public Texto getCopia() {
		// TODO Auto-generated method stub
		return new Palabra(this.getPalabra());
	}

	@Override
	public String getTextoSimple() {
		// TODO Auto-generated method stub
		return this.getPalabra();
	}

	@Override
	public String getTextoEstructurado() {
		// TODO Auto-generated method stub
		if (this.getModificador() != null)
			return this.getModificador().getInicio() + this.getTextoSimple() + this.getModificador().getFinal();
		return this.getPalabra();
	}

	@Override
	public String getTextoFormateado() {
		// TODO Auto-generated method stub
		if (this.getModificador() != null)
			return this.getModificador().aplicarModificacion(this.getCopia());
		return this.getPalabra();
	}
	
}
