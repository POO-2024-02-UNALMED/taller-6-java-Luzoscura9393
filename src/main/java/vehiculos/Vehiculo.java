package Vehiculos;

public class Vehiculo {

	private String placa;
	private int CantidadPuertas;
	private int velocidadMaxima;
	private String nombre;
	private int precio;
	private int peso;
	private String traccion;
	private Fabricante fabricante;
	private static int cantidadVehiculos = 0;
	
	public Vehiculo(String placa,int CantidadPuertas,int velocidadMaxima,String nombre,int precio,int peso,String traccion,Fabricante fabricante){
		this.placa=placa;
		this.CantidadPuertas=CantidadPuertas;
		this.velocidadMaxima =velocidadMaxima;
		this.nombre=nombre;
		this.precio=precio;
		this.peso=peso;
		this.traccion=traccion;
		this.fabricante=fabricante;
		cantidadVehiculos+=1;
	}
	
	public Vehiculo(String placa,String nombre,int precio,int peso,Fabricante fabricante){
		this.placa=placa;
		this.nombre=nombre;
		this.precio=precio;
		this.peso=peso;
		this.fabricante=fabricante;
		cantidadVehiculos+=1;
	}
	
	public Vehiculo(String placa,int CantidadPuertas,String nombre,int precio,int peso,Fabricante fabricante){
		this.placa=placa;
		this.CantidadPuertas=CantidadPuertas;
		this.nombre=nombre;
		this.precio=precio;
		this.peso=peso;
		this.fabricante=fabricante;
		cantidadVehiculos+=1;
	}
	
	public int getPuertas() {
		return this.CantidadPuertas;
	}
	
	public void setCantidadVehiculos(int cantidad) {
		cantidadVehiculos = cantidad;
	}
	
	public int  getVelocidadMaxima() {
		return this.velocidadMaxima;
	}
	
	public String getTraccion() {
		return this.traccion;
	}
	
	public String getPlaca() {
		return this.placa;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public int getPrecio() {
		return this.precio;
	}
	
	public int getPeso() {
		return this.peso;
	}
	
	public Fabricante getFabricante() {
		return this.fabricante;
	}
	
	public int GetCantidadVehiculos() {
		return cantidadVehiculos;
	}
	
	
	public void setPlaca(String placa) {
		this.placa=placa;
	}
	
	public void setNombre(String Nombre) {
		this.nombre=Nombre;
	}
	
	public void setPrecio(int precio) {
		this.precio=precio;
	}
	
	public void setFabricante(Fabricante fabricante) {
		this.fabricante=fabricante;
	}
	
	public void setPeso(int peso) {
		this.peso=peso;
	}
	
	
	public String vehiculosPorTipo() {
		int p=Automovil.getCantidadAutos();
		int p2=Camion.getCantidadCamion();
		int p3=Camioneta.getCantidadCamioneta();
		String resultado = "Automoviles:"+String.valueOf(p)+"Camionetas:"+String.valueOf(p3)+"Camion:"+String.valueOf(p2);
		
		return resultado;
		
		
	}

	
	
}

	
