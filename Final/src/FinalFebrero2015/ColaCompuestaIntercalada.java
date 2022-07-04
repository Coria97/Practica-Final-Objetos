package FinalFebrero2015;

public class ColaCompuestaIntercalada extends ColaCompuesta {

	private int posicion;
	
	public ColaCompuestaIntercalada(String nombre,int pos) {
		// TODO Auto-generated constructor stub
		super(nombre);
		this.posicion = pos;
	}
	
	public int getPosicion() {
		return this.posicion;
	}
	
	public void setPosicion(int posicion) {
		this.posicion = posicion;
	}
	
	public void aumentarPosicion() {
		if(this.getPosicion() > this.getListaCola().size())
			this.posicion = 0;
		else
			this.posicion+= 2;
	}
	
	@Override
	public void agregar(Object o) {
		this.getListaCola().get(posicion).agregar(o);
	}

	@Override
	public Object recuperar(int posicion) {
		return this.getListaCola().get(posicion).recuperar(posicion);
	}
}
