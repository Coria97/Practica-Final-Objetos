package FinalFebrero2022;

public class FiltroAnd extends Filtro {
	
	private Filtro f1, f2;
	
	public FiltroAnd(Filtro f1, Filtro f2) {
		super();
		this.f1 = f1;
		this.f2 = f2;
	}
	
	public Filtro getF1() {
		return f1;
	}

	public void setF1(Filtro f1) {
		this.f1 = f1;
	}

	public Filtro getF2() {
		return f2;
	}

	public void setF2(Filtro f2) {
		this.f2 = f2;
	}

	@Override
	public boolean cumple(Elemento e) {
		// TODO Auto-generated method stub
		if(f1.cumple(e) && f2.cumple(e))
			return true;
		return false;
	}
	
}
