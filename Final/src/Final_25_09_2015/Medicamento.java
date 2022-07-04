package Final_25_09_2015;

import java.util.List;

public class Medicamento {
	
	private String nombre;
	private double precio;
	private List<String> sintomas;
	
	public Medicamento(String nombre, double precio) {
		this.nombre = nombre;
		this.precio = precio;
	}
	
	public List<String> getSintomasMedicamento(){
		return this.sintomas;
	}
	
	public void agregarSintoma(String sintoma) {
		this.sintomas.add(sintoma);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public boolean puedeTratarSintoma(String sintoma) {
		if(this.sintomas.contains(sintoma))
			return true;
		return false;
	}
	
	public boolean puedeTratar(Paciente p) {
		for(int i=0 ; i < p.getSintomasPaciente().size() ; i++)
			if( !this.sintomas.contains(p.getSintomasPaciente().get(i)) )
				return false;
		return true;
	}
}
