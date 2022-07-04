package FinalFebrero2022;

public class Envio extends Elemento {
	
	private String destinatario;
	private String remitente;
	private Direccion direccionDes;
	private Direccion direccionRem;
	private boolean retiro;
	private double peso;
	
	public Envio(int nrotracking,String destinatario, String remitente, Direccion direccionDes, Direccion direccionRem, boolean retiro,
			double peso) {
		super(nrotracking);
		this.destinatario = destinatario;
		this.remitente = remitente;
		this.direccionDes = direccionDes;
		this.direccionRem = direccionRem;
		this.retiro = retiro;
		this.peso = peso;
	}
	
	@Override
	public String getDestinatario() {
		return destinatario;
	}
	
	public void setDestinatario(String destinatario) {
		this.destinatario = destinatario;
	}
	
	@Override
	public String getRemitente() {
		return remitente;
	}
	
	public void setRemitente(String remitente) {
		this.remitente = remitente;
	}
	
	public void setDireccionDes(Direccion direccionDes) {
		this.direccionDes = direccionDes;
	}
	
	public void setDireccionRem(Direccion direccionRem) {
		this.direccionRem = direccionRem;
	}
	
	public boolean isRetiro() {
		return retiro;
	}
	
	public void setRetiro(boolean retiro) {
		this.retiro = retiro;
	}
	
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	@Override
	public Direccion getDireccionDestino() {
		return this.direccionDes;
	}
	
	@Override
	public double getPeso() {
		return this.peso;
	}
	
	@Override
	public void listar(Filtro f) {
		if(f.cumple(this))
			System.out.print("Envio de " + this.getRemitente() + " con destino a : " + this.getDireccionDestino().getCiudad());
	}

	@Override
	public Direccion getDireccionRemitente() {
		return this.direccionRem;	}
	
	
}
