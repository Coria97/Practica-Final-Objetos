package Final_20_05_2011;

public class ModificadorCompuesto extends Modificador{
	
	private Modificador m1, m2;
	
	@Override
	public String getInicio() {
		// TODO Auto-generated method stub
		return m1.getInicio() + " " + m2.getInicio();
	}

	@Override
	public String getFinal() {
		// TODO Auto-generated method stub
		return m2.getFinal() + " " + m1.getFinal();
	}

	@Override
	public String aplicarModificacion(Texto t) {
		// TODO Auto-generated method stub
		return m1.aplicarModificacion(t) + m2.aplicarModificacion(t);
	}
	
}
