package FinalFebrero2022;

public class Direccion {
	
	private String ciudad;
	private String calle;
	private int nro;
	
	public Direccion(String ciudad, String calle, int nro) {
		this.ciudad = ciudad;
		this.calle = calle;
		this.nro = nro;
	}
	
	public String getCiudad() {
		return this.ciudad;
	}
	
	public String getCalle() {
		return this.calle;
	}
	
	public int getNro() {
		return this.nro;
	}
	
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	
	public void setCalle(String calle) {
		this.calle = calle;
	}
	
	public void setNro(int nro) {
		this.nro = nro;
	}
	
}
