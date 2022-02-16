package clase;

public class ProductoMenu 
{
	
	int PrecioBase;
	String nombre;
	
	
	public ProductoMenu(int precioBase, String nombre) {
		super();
		PrecioBase = precioBase;
		this.nombre = nombre;
	}

	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getPrecioBase() {
		return PrecioBase;
	}
	public void setPrecioBase(int precioBase) {
		PrecioBase = precioBase;
	}
	
	

}
