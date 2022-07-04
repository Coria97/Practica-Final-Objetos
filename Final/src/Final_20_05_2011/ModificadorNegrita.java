package Final_20_05_2011;

public class ModificadorNegrita extends Modificador {

	@Override
	public String getInicio() {
		// TODO Auto-generated method stub
		return "<Negrita> ";
	}

	@Override
	public String getFinal() {
		// TODO Auto-generated method stub
		return "</Negrita> ";
	}

	@Override
	public String aplicarModificacion(Texto t) {
		// TODO Auto-generated method stub
		return t.getTextoSimple().toUpperCase();
	}

}
