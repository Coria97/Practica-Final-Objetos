package Final_26_02_2016;

public class FiltroPalabraClave implements Filtro{
	
	private String pc;

	@Override
	public boolean cumple(Noticia n) {
		// TODO Auto-generated method stub
		for (String aux : n.getPalabrasClaves()) {
			if(aux.equals(pc))
				return true;
		}
		return false;
	}
	
	
}
