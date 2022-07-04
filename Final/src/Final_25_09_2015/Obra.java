package Final_25_09_2015;

public abstract class Obra {
	
	private String nombre;
	
	public Obra(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public abstract double getDescuento(Medicamento m);
	
}
