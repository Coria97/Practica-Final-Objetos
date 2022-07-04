package FinalFebrero2015;

public abstract class Cola {
	
	private String nombre;
	
	public Cola(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return this.nombre ;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public abstract int longitud();
	public abstract void agregar(Object o);
	public abstract Object recuperar(int posicion);
	public abstract ColaSimple getColaConMayorElementos();
	public abstract int getCantColasTerminales();
}

