package Final_26_02_2016;

import java.util.ArrayList;
import java.util.List;

public class Categoria extends Elemento {
	
	private String  descripcion;
	private String Imagen;
	private List<Elemento> seccion;
	
	public Categoria(String descripcion, String imagen, List<Elemento> seccion) {
		super();
		this.descripcion = descripcion;
		Imagen = imagen;
		this.seccion = seccion;
	}
	
	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getImagen() {
		return Imagen;
	}

	public void setImagen(String imagen) {
		Imagen = imagen;
	}

	public List<Elemento> getSeccion() {
		return seccion;
	}

	public void setSeccion(List<Elemento> seccion) {
		this.seccion = seccion;
	}

	@Override
	public int getCantNoticias() {
		// TODO Auto-generated method stub
		int aux = 0;
		for(Elemento e: this.seccion)
			aux += e.getCantNoticias();
		return aux;
	}
	
	/* Preguntar a mati si sabe como hacerlo
	public int getCantNoticiasSeccion() {
		int aux = 0;
		for(int i = 0; i < this.getSeccion().size(); i++)
			
		return aux;
	}
	*/
	
	@Override
	public Elemento copiaRestringuida(Filtro f) {
		Categoria copia = new Categoria("copiaRestringuida", "imagenCopiaRestringuida", null);
		for(int i = 0; i < this.getSeccion().size(); i++) {
			if(this.seccion.get(i).copiaRestringuida(f) != null) {
				copia.getSeccion().add(this.seccion.get(i).copiaRestringuida(f));
			}
		}
		if(copia.getSeccion().size() > 0)
			return copia;
		return null;
	}
	@Override
	public List<Noticia> buscarYListar(Filtro f) {
		List<Noticia> aux = new ArrayList<Noticia>();
		for(Elemento e: this.seccion)
			aux.addAll(e.buscarYListar(f));
		return aux;
	}
}
