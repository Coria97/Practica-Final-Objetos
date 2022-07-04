package Final_26_02_2016;

import java.util.List;
import java.util.ArrayList;

public class Noticia extends Elemento {
	
	private String titulo;
	private Persona autor;
	private String introduccion;
	private String texto;
	private String linkAsociado;
	private List<String> palabrasClaves = new ArrayList<String>();
	
	public Noticia(String titulo, Persona autor, String introduccion, String texto, String linkAsociado, List<String> palabrasClaves) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.introduccion = introduccion;
		this.texto = texto;
		this.linkAsociado = linkAsociado;
		this.palabrasClaves = palabrasClaves;
	}
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Persona getAutor() {
		return autor;
	}

	public void setAutor(Persona autor) {
		this.autor = autor;
	}

	public String getIntroduccion() {
		return introduccion;
	}

	public void setIntroduccion(String introduccion) {
		this.introduccion = introduccion;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public String getLinkAsociado() {
		return linkAsociado;
	}

	public void setLinkAsociado(String linkAsociado) {
		this.linkAsociado = linkAsociado;
	}

	public List<String> getPalabrasClaves() {
		return palabrasClaves;
	}

	public void setPalabrasClaves(List<String> palabrasClaves) {
		this.palabrasClaves = palabrasClaves;
	}

	@Override
	public int getCantNoticias() {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public Elemento copiaRestringuida(Filtro f) {
		// TODO Auto-generated method stub
		if(f.cumple(this))
			return this;
		return null;
	}

	@Override
	public List<Noticia> buscarYListar(Filtro f) {
		// TODO Auto-generated method stub
		if(f.cumple(this)){
			List<Noticia> aux = new ArrayList<Noticia>();
			aux.add(this);
			return aux;
		}
		return null;
		
	}

}
