package clase;

public class ingrediente 
{
	
	
	String nombre;
	int CostoAdicional;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getCostoAdicional() {
		return CostoAdicional;
	}
	public void setCostoAdicional(int costoAdicional) {
		CostoAdicional = costoAdicional;
	}
	public ingrediente(String nombre, int costoAdicional) {
		super();
		this.nombre = nombre;
		CostoAdicional = costoAdicional;
	}
	
	
	
}