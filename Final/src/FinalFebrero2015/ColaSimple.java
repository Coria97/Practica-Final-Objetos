package FinalFebrero2015;

import java.util.List;
import java.util.ArrayList;

public class ColaSimple extends Cola {
	
	private List<Object> c = new ArrayList<Object>();
	
	public ColaSimple(String nombre, List<Object> c) {
		super(nombre);
		this.c= c;
	}
	
	@Override
	public int longitud() {
		// TODO Auto-generated method stub
		return this.c.size();
	}

	@Override
	public void agregar(Object o) {
		// TODO Auto-generated method stub
		this.c.add(o);
	}

	@Override
	public Object recuperar(int posicion) {
		// TODO Auto-generated method stub
		return this.c.get(posicion);
	}

	@Override
	public ColaSimple getColaConMayorElementos() {
		// TODO Auto-generated method stub
		return new ColaSimple("ColaConMayorElementos", this.c);
	}

	@Override
	public int getCantColasTerminales() {
		// TODO Auto-generated method stub
		return 1;
	}

}
