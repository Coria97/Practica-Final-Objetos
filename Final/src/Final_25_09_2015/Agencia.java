package Final_25_09_2015;

import java.util.List;
import java.util.ArrayList;

public class Agencia {
	
	private String nombre;
	private List<Paciente> pacientes;
	private List<Medicamento> medicamentos;
	
	public Agencia(String nombre) {
		this.nombre = nombre;
	}
	
	public void agregarPaciente(Paciente p) {
		this.pacientes.add(p);
	}
	
	public void agregarMedicamento(Medicamento m) {
		this.medicamentos.add(m);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public Medicamento getMedicamento(int pos) {
		return this.medicamentos.get(pos); 
	}
	
	public Paciente getPaciente(int pos) {
		return this.pacientes.get(pos);
	}
	
	public double precioACobrar(Paciente p, Medicamento m) {
		if(p.getObra() == null)
			return m.getPrecio();
		else
			return m.getPrecio() * p.getObra().getDescuento(m);
	}
	
	public List<Medicamento> puedeTratarSintoma(String sintoma){
		List<Medicamento> aux = new ArrayList<Medicamento>();
		for(int i=0 ; i < this.medicamentos.size() ; i++)
			if(medicamentos.get(i).puedeTratarSintoma(sintoma))
				aux.add(this.medicamentos.get(i));
		return aux;
	}
	
	public List<Medicamento> puedeTratarPaciente(Paciente p){
		List<Medicamento> aux = new ArrayList<Medicamento>();
		for(int i=0 ; i < this.medicamentos.size() ; i++)
			if(medicamentos.get(i).puedeTratar(p))
				aux.add(this.medicamentos.get(i));
		return aux;
	}
	
}
