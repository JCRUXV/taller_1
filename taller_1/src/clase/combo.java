package clase;

import java.util.List;

public class combo 
{
	
	String nombreCombo;
	double descuento;
	List <String> combos;

	public combo(String nombreCombo, double descuento, List<String> combos) {
		super();
		this.nombreCombo = nombreCombo;
		this.descuento = descuento;
		this.combos = combos;
	}



	
	public String getNombreCombo() {
		return nombreCombo;
	}


	public void setNombreCombo(String nombreCombo) {
		this.nombreCombo = nombreCombo;
	}


	public double getDescuento() {
		return descuento;
	}


	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}


	public List<String> getCombos() {
		return combos;
	}


	public void setCombos(List<String> combos) {
		this.combos = combos;
	}


	
	


	
	
}
