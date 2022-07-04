package FinalFebrero2022;

public class FiltroCalle extends Filtro {
	
	private String calle;
	
	public FiltroCalle(String calle) {
		super();
		this.calle = calle;
	}
	
	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	@Override
	public boolean cumple(Elemento e) {
		if(this.calle.equals(e.getDireccionDestino().getCalle()))
			return true;
		return false;
	}
	
	
}
