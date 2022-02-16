package clase;

import java.util.List;

public class pedido
{
	
	 List <ProductoMenu> productosPedidosId;
	 List <combo> combos;
	 List <ingrediente> ingredienteAd;
	 
	 
	 
	
	 String nombreCliente;
	 
	 String direccionCliente ;
	 
	 int numeroDePedidos;
	 
	 int idPedidos;
	 
	
	 public pedido(List<ProductoMenu> productosPedidosId, List<combo> combos, List<ingrediente> ingredienteAd,
			String nombreCliente, String direccionCliente,  int idPedidos)
	 {
		super();
		this.productosPedidosId = productosPedidosId;
		this.combos = combos;
		this.ingredienteAd = ingredienteAd;
		this.nombreCliente = nombreCliente;
		this.direccionCliente = direccionCliente;
		this.idPedidos = idPedidos;
	}
	 

	 
	 public List<ProductoMenu> getProductosPedidosId() {
		return productosPedidosId;
	}

	public void setProductosPedidosId(List<ProductoMenu> productosPedidosId) {
		this.productosPedidosId = productosPedidosId;
	}

	public List<combo> getCombos() {
		return combos;
	}

	public void setCombos(List<combo> combos) {
		this.combos = combos;
	}

	public List<ingrediente> getIngredienteAd() {
		return ingredienteAd;
	}

	public void setIngredienteAd(List<ingrediente> ingredienteAd) {
		this.ingredienteAd = ingredienteAd;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public String getDireccionCliente() {
		return direccionCliente;
	}

	public void setDireccionCliente(String direccionCliente) {
		this.direccionCliente = direccionCliente;
	}

	public int getNumeroDePedidos() {
		return numeroDePedidos;
	}

	public void setNumeroDePedidos(int numeroDePedidos) {
		this.numeroDePedidos = numeroDePedidos;
	}

	public int getIdPedidos() {
		return idPedidos;
	}

	public void setIdPedidos(int idPedidos) {
		this.idPedidos = idPedidos;
	}
	
	


	 
	 

}





