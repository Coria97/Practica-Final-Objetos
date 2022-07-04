package Final_25_09_2015;

import java.util.HashMap;

public class ObraSocial extends Obra {
	
	private static final double DESCUENTO_POR_DEFECTO = 10.0;
	private HashMap<String,Double> descuento;
	
	public ObraSocial(String nombre) {
		super(nombre);
	}
	
	
	//investigar como funcion hashmap bien
	@Override
	public double getDescuento(Medicamento m) {
		// TODO Auto-generated method stub
		if(descuento.containsKey(m.getNombre()))
			return descuento.get(m.getNombre());
		return this.DESCUENTO_POR_DEFECTO;
	}
	
	
}
