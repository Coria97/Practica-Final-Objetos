package FinalFebrero2022;

public class FiltroCiudad extends Filtro {
	
	private String ciudad;

	public FiltroCiudad(String ciudad) {
		super();
		this.ciudad = ciudad;
	}
	
	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	@Override
	public boolean cumple(Elemento e) {
		if(this.ciudad.equals(e.getDireccionDestino().getCiudad()))
			return true;
		return false;
	}
	
}
