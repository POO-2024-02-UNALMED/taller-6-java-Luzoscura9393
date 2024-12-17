package Vehiculos;

public class Automovil extends Vehiculo{


	private int asientos;
	private final int CantidadPuertas = 4;
	private final int velocidadMaxima = 100;
	private final String traccion = "FWD";
	private static int cantidadAutos;
	
	public Automovil(String placa, String nombre, int precio, int peso, Fabricante fabricante,int cantidadpuertas) {
		super(placa, nombre, precio, peso, fabricante);
		Automovil.cantidadAutos+=1;
	}

	
	int getAsientos() {
		return this.asientos;
	}
	
	public int getPuertas() {
		return this.CantidadPuertas;
	}
	
	public int  getVelocidadMaxima() {
		return this.velocidadMaxima;
	}
	
	public String getTraccion() {
		return this.traccion;
	}
	public static int getCantidadAutos() {
		return cantidadAutos;
	}
	
}
