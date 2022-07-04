package Final_25_09_2015;

import java.util.List;
public class Paciente {
	
	private String nombre;
	private List<String> sintomas;
	private List<String> alergias;
	private Obra obra;
	
	public Paciente(String nombre, Obra obra) {
		this.nombre = nombre;
		this.obra = obra;
	}
	
	public Obra getObra() {
		return this.obra;
	}
	
	public List<String> getSintomasPaciente() {
		return this.sintomas;
	}
	
	public void agregarSintoma(String sintoma) {
		this.sintomas.add(sintoma);
	}
	
	public void agregarAlergia(String alergia) {
		this.alergias.add(alergia);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public boolean puedeTratar(Medicamento m) {
		return m.puedeTratar(this);
	}
}
