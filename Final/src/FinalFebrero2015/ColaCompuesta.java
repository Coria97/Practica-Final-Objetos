package FinalFebrero2015;

import java.util.List;
import java.util.ArrayList;

public abstract class ColaCompuesta extends Cola {
	
	private List<Cola> cc = new ArrayList<Cola>();
	
	public ColaCompuesta(String nombre) {
		super(nombre);
	}
	
	public List<Cola> getListaCola() {
		List<Cola> retorno = new ArrayList<Cola>();
		for(int i = 0; i < this.cc.size(); i++) {
			retorno.add(this.cc.get(i));
		}
		return retorno;
	}
	
	@Override
	public int longitud() {
		// TODO Auto-generated method stub
		int retorno = 0;
		for(int i = 0; i < this.cc.size() ; i++)
			retorno += this.cc.get(i).longitud();
		return retorno;
	}

	@Override
	public ColaSimple getColaConMayorElementos() {
		ColaSimple retorno = this.cc.get(0).getColaConMayorElementos();
		int cantElementos = this.cc.get(0).longitud();
		for (int i = 0; i < this.cc.size(); i++)
			if(cantElementos < this.cc.get(i).longitud()){
				cantElementos = this.cc.get(i).longitud();
				retorno = this.cc.get(i).getColaConMayorElementos();
			}
		return retorno;
	}

	@Override
	public int getCantColasTerminales() {
		int retorno = 0;
		for (int i = 0; i < this.cc.size(); i++)
			retorno += this.cc.get(i).getCantColasTerminales();
		return retorno;
	}
	
	public abstract void agregar(Object o);
	public abstract Object recuperar(int posicion);

}
