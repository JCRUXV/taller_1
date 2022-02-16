package procesamiento;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import clase.ProductoMenu;
import clase.combo;
import clase.ingrediente;
import clase.pedido;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;


public class Aplicacion
{
	

public static void main(String[] args) throws IOException{
	Aplicacion aplicacion= new Aplicacion();
	Restaurante Restaperros = new Restaurante();
	List<ProductoMenu> ProductosDelMenu = new ArrayList<>();
	List<ProductoMenu> productosDelPedido = new ArrayList<>();
	List<ingrediente> ingredientes = new ArrayList<>();
	List<combo> ListaDeCombos = new ArrayList<>();
	List<pedido> ListaDePedidos = new ArrayList<>();
	ProductosDelMenu = Restaperros.cargarMenu();
	ingredientes = Restaperros.cargarIngredientes();
	ListaDeCombos=Restaperros.cargarCombos();
	boolean ciclo=true;
	while (ciclo==true){
	System.out.println("\nOpciones de la aplicación\n");
	System.out.println("1. Mostrar menú");
	System.out.println("2. adicionar elemenos al pedido");
	System.out.println("3. mostrar pedido");
	System.out.println("4. pagar y cerrar pedido");
	System.out.println("5. salir de la aplicacion");
	
	Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Seleccione la opción que desea ver: ");
    String userName = myObj.nextLine();  // Read user input
    if (userName.equals("5")){
    	ciclo=false;
    }else if (userName.equals("1")) {
    	System.out.println("Prductos Disponibles: ");
    	for (int i = 0; i < ProductosDelMenu.size(); i++) 
    	{
    		System.out.println("Nombre del producto: "+ProductosDelMenu.get(i).getNombre());
    		System.out.println("Precio del producto: "+ProductosDelMenu.get(i).getPrecioBase());
    		
    	}
    	System.out.println("Ingredientes disponibles: ");
    	for (int i=0;i<ingredientes.size();i++) {
    		System.out.println("Nombre del ingrediente: "+ingredientes.get(i).getNombre());
    		System.out.println("Precio del ingrediente: "+ingredientes.get(i).getCostoAdicional());
    	}
    	System.out.println("Combos disponibles: ");
    	for (int i = 0; i < ListaDeCombos.size();i++ ) 
    	{
    		System.out.println("Nombre del combo: "+ListaDeCombos.get(i).getNombreCombo());
    		System.out.println("Precio del combo: "+ListaDeCombos.get(i).getDescuento());
    		System.out.println("Ingredientes del combo: "+ListaDeCombos.get(i).getCombos());
    		
    	}
    	
    }
    else if (userName.equals("2"))
    {
    	Scanner myObj1 = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("por favor ingrese su nombre de usuario: ");
	    String nombreUsuario = myObj1.nextLine();
	    System.out.println("por favor ingrese su Direccion: ");
	    String direccion = myObj1.nextLine();
	    ListaDePedidos = Restaperros.iniciarPedido(nombreUsuario, direccion, ProductosDelMenu, ingredientes, ListaDeCombos);
	    
	    System.out.println("su pedido fue un completo exito");
	    System.out.println("el id de su pedido es: "+ ListaDePedidos.get(0).getIdPedidos());
   
}
    else if (userName.equals("3"))
    {
    	Scanner myObj1 = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("por favor ingrese el id de su pedido: ");
	    String nombreUsuario = myObj1.nextLine();
	    int opciones=Integer.parseInt(nombreUsuario);
	    
	    if(opciones==ListaDePedidos.get(0).getIdPedidos()) 
	    {
	    	for( int i=0;i<ListaDePedidos.get(0).getProductosPedidosId().size();i++) {
	   
	    		System.out.println(ListaDePedidos.get(0).getProductosPedidosId().get(i).getNombre());
	    		}
	    	
	    	for( int j=0;j<ListaDePedidos.get(0).getCombos().size();j++) 
	    	{ 
	    		   
	    		System.out.println(ListaDePedidos.get(0).getCombos().get(j).getNombreCombo());
	    				
		    } 
	    	
	    	
	    	for( int j=0;j<ListaDePedidos.get(0).getCombos().size();j++) 
	    	{ 
	    		   
	    		System.out.println(ListaDePedidos.get(0).getCombos().get(j).getNombreCombo());
	    				
		    }
	    	
	    	for( int h=0;h<ListaDePedidos.get(0).getIngredienteAd().size();h++) 
	    	{ 
	    		   
	    		System.out.println(ListaDePedidos.get(0).getIngredienteAd().get(h).getNombre());
	    				
		    }
	    		
	    	}


    	
    	
   
}
    else if (userName.equals("4")) 
    {
    	
    	int precioCombos = Restaperros.combosPrecio(ListaDeCombos, ListaDePedidos.get(0).getCombos(), ProductosDelMenu);
    	int ValorTotal = precioCombos + Restaperros.precioIngredientesyProductos(ListaDePedidos.get(0).getIngredienteAd(), ListaDePedidos.get(0).getProductosPedidosId());
    	System.out.println(ValorTotal);
    	Scanner myObj1 = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("por favor ingrese la cantidad que va a pagar: ");
	    String nombreUsuario = myObj1.nextLine();
	    int opciones=Integer.parseInt(nombreUsuario);
	    
	    if (opciones >= ValorTotal) 
	    {
	    	String currentDirectory = new File("").getAbsolutePath();
	    	FileWriter myWriter = new FileWriter(currentDirectory +"\\data\\"+ListaDePedidos.get(0).getIdPedidos()+".txt");
	    	myWriter.write("ID del pedido: "+ListaDePedidos.get(0).getIdPedidos());
	    	myWriter.write("\n");
	    	myWriter.write("Nombre del cliente: "+ListaDePedidos.get(0).getNombreCliente());
	    	myWriter.write("\n");
	    	myWriter.write("Dirección del cliente: "+ListaDePedidos.get(0).getDireccionCliente());
	    	myWriter.write("\n");
	    	myWriter.write("Precio Total: "+ValorTotal);
	    	myWriter.write("\n");
	    	myWriter.write("su cambio es: "+(opciones-ValorTotal));
	    	myWriter.write("\n");
	    	
	    	
	    	for (int i=0;i<ListaDePedidos.get(0).getProductosPedidosId().size();i++)
	    	{
	    	myWriter.write("Producto: "+ListaDePedidos.get(0).getProductosPedidosId().get(i).getNombre());
	    	myWriter.write("\n");
	    	}
	    	for (int i=0;i<ListaDePedidos.get(0).getIngredienteAd().size();i++)
	    	{
	    	myWriter.write("Producto: "+ListaDePedidos.get(0).getIngredienteAd().get(i).getNombre());
	    	myWriter.write("\n");
	    	}
	    	for (int i=0;i<ListaDePedidos.get(0).getCombos().size();i++)
	    	{
	    	myWriter.write("Producto: "+ListaDePedidos.get(0).getCombos().get(i).getNombreCombo());
	    	myWriter.write("\n");
	    	}
	    	myWriter.close();
	    }
	    else 
	    {
	    	System.out.println("pago insuficiente le faltan: "+ (ValorTotal-opciones)+"$");
	    }
    }
    
}
}
}
