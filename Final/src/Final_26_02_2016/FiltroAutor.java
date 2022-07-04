package Final_26_02_2016;

public class FiltroAutor implements Filtro {
	private Persona autor;

	@Override
	public boolean cumple(Noticia n) {
		if(n.getAutor().getNombre() == this.autor.getNombre())
			if(n.getAutor().getApellido() == this.autor.getApellido())
				if(n.getAutor().getDocumento() == this.autor.getDocumento())
					return true;
		return false;
	}
	
}
