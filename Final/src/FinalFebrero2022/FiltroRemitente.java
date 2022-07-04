package FinalFebrero2022;

public class FiltroRemitente extends Filtro {
	
	private String remitente;
	
	public FiltroRemitente(String remitente) {
		super();
		this.remitente = remitente;
	}
	
	public String getRemitente() {
		return remitente;
	}

	public void setRemitente(String remitente) {
		this.remitente = remitente;
	}

	@Override
	public boolean cumple(Elemento e) {
		if(this.remitente.equals(e.getRemitente()))
			return true;
		return false;
	}
	
	
}
