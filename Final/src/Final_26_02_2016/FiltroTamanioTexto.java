package Final_26_02_2016;

public class FiltroTamanioTexto implements Filtro{
	
	private int tamanio;

	@Override
	public boolean cumple(Noticia n) {
		// TODO Auto-generated method stub
		if(n.getTexto().length() > this.tamanio)
			return true;
		return false;
	}
	
}
