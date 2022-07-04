package Final_25_09_2015;

public class ObraComun extends Obra {
	
	private double descuento;
	
	public ObraComun(String nombre, double descuento) {
		super(nombre);
		this.descuento = descuento;
	}
	
	@Override
	public double getDescuento(Medicamento m) {
		// TODO Auto-generated method stub
		return this.descuento;
	}
	
}
