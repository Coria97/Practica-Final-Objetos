package FinalFebrero2022;

import java.util.*;

public class Combo extends Elemento {
	
	private List<Elemento> pack = new ArrayList<Elemento>();
	private Filtro requerimiento;
	
	public Combo(int nroTracking, Filtro requerimiento) {
		super(nroTracking);
		this.requerimiento = requerimiento;
		// TODO Auto-generated constructor stub
	}
	
	public void addPaquete(Elemento e) {
		if (this.requerimiento.cumple(e)) {
			e.setTracking(this.getTracking());
			this.pack.add(e);
		}
	}
	
	@Override
	public Direccion getDireccionDestino() {
		return this.pack.get(0).getDireccionDestino();
	}

	@Override
	public double getPeso() {
		double aux = 0.0;
		for(Elemento e : this.pack)
			aux += e.getPeso();
		return aux;
	}
	
	@Override
	public void listar(Filtro f) {
		for(Elemento e: this.pack) {
			e.listar(f);
		}
	}

	@Override
	public Direccion getDireccionRemitente() {
		return this.pack.get(0).getDireccionRemitente();
	}

	@Override
	public String getRemitente() {
		return this.pack.get(0).getRemitente();
	}

	@Override
	public String getDestinatario() {
		return this.pack.get(0).getDestinatario();
	}
}
