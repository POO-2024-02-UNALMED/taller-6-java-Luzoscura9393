package vehiculos;

public class Camioneta extends Vehiculo {




	private boolean volco;
	private int velocidadMaxima = 90;
	private String traccion = "4X4";
	private static int cantidadCamioneta;
	
	public Camioneta(String placa, int CantidadPuertas, String nombre, int precio, int peso, Fabricante fabricante,boolean volco) {
		super(placa, CantidadPuertas, nombre, precio, peso, fabricante);
		this.volco=volco;
		Camioneta.cantidadCamioneta+=1;
	}
	
	public int getVelocidadMaxima() {
		return this.velocidadMaxima;
	}
	
	public String getTraccion() {
		return this.traccion;
	}
	
	public boolean isVolco() {
		return this.volco;
	}
	
	public static int getCantidadCamioneta() {
		return Camioneta.cantidadCamioneta;
	}
	
	
}
