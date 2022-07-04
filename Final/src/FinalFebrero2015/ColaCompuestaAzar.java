package FinalFebrero2015;

public class ColaCompuestaAzar extends ColaCompuesta {

	public ColaCompuestaAzar(String nombre) {
		super(nombre);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void agregar(Object o) {
		// TODO Auto-generated method stub
		int posicion = (int)(Math.random()  * this.getListaCola().size());
		this.getListaCola().get(posicion).agregar(o);
	}

	@Override
	public Object recuperar(int posicion) {
		// TODO Auto-generated method stub
		int posAzar = (int)(Math.random()  * this.getListaCola().size());
		return this.getListaCola().get(posAzar).recuperar(posicion);
	}

}
