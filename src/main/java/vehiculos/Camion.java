package vehiculos;

public class Camion extends Vehiculo{

	private int ejes;
	private final int CantidadPuertas =2;
	private final int velocidadMaxima = 80;
	private final String traccion = "4X2";
	private static int cantidadCamion;
	
	public Camion(String placa, String nombre, int precio, int peso, Fabricante fabricante,int ejes) {
		super(placa, nombre, precio, peso, fabricante);
		this.ejes=ejes;
		Camion.cantidadCamion+=1;
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
	
	public int getEjes() {
		return this.ejes;
	}
	
	public void setEjes(int ejes) {
		this.ejes=ejes;
	}
	
	public static int getCantidadCamion() {
		return Camion.cantidadCamion;
	}
}
