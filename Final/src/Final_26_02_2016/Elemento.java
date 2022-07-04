package Final_26_02_2016;

import java.util.List;

public abstract class Elemento {
	
	public abstract int getCantNoticias();
	public abstract Elemento copiaRestringuida(Filtro f);
	public abstract List<Noticia> buscarYListar(Filtro f);
}
