package Final_26_02_2016;

public class FiltroAnd implements Filtro{
	
	private Filtro f1,f2;

	@Override
	public boolean cumple(Noticia n) {
		// TODO Auto-generated method stub
		if (f1.cumple(n) && f2.cumple(n))
			return true;
		return false;
	}
}
