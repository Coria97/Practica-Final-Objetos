package Final_20_05_2011;

public class Parrafo extends Texto {
	
	private Texto t1,t2;
	
	public Parrafo(Texto t1, Texto t2) {
		super(null);
		this.t1 = t1;
		this.t2 = t2;
	}
	
	public Texto getTextoT1() {
		return this.t1;
	}
	
	public Texto getTextoT2() {
		return this.t2;
	}
	
	public void setTextoT1(Texto t) {
		this.t1 = t;
	}
	
	public void setTextoT2(Texto t) {
		this.t2 = t;
	}
	
	@Override
	public int getCantPalabras() {
		// TODO Auto-generated method stub
		int contador = 0;
		contador = t1.getCantPalabras() + t2.getCantPalabras();
		return contador;
	}
	
	@Override
	public Texto getCopia() {
		return new Parrafo(this.t1.getCopia(),this.t2.getCopia());
	}
	
	public String getTextoSimple() {
		return this.t1.getTextoSimple() + " " + this.t2.getTextoSimple();
	}

	@Override
	public String getTextoEstructurado() {
		// TODO Auto-generated method stub
		return this.t1.getTextoEstructurado() + " " + this.t2.getTextoEstructurado();
	}

	@Override
	public String getTextoFormateado() {
		// TODO Auto-generated method stub
		return this.t1.getTextoFormateado() + " " + this.t2.getTextoFormateado();
	}
	
	
}
