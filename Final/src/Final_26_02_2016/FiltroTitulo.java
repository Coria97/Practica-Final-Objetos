package Final_26_02_2016;

public class FiltroTitulo implements Filtro {
	
	private String titulo;
	
	@Override
	public boolean cumple(Noticia n) {
		if(n.getTitulo() == this.titulo)
			return true;
		return false;
	}

}
