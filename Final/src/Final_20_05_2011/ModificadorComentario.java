package Final_20_05_2011;

public class ModificadorComentario extends Modificador {
	
	private String comentario;
	
	@Override
	public String getInicio() {
		// TODO Auto-generated method stub
		return "<Comentario> ";
	}

	@Override
	public String getFinal() {
		// TODO Auto-generated method stub
		return " </Comentario> ";
	}
	
	public String getComentario() {
		return this.comentario;
	}
	
	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
	
	@Override
	public String aplicarModificacion(Texto t) {
		// TODO Auto-generated method stub
		return t.getTextoSimple() + " <" + this.getComentario() + ">";
	}

}
