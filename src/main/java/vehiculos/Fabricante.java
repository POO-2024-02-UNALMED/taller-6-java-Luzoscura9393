package Vehiculos;

public class Fabricante {
	private String nombre;
	private Pais pais;
	
	Fabricante(String nombre, Pais pais){
		this.nombre =nombre;
		this.pais = pais;
	}
	
	String getNombre() {
		return this.nombre;
	}
	
	Pais getPais() {
		return this.pais;
	}
	
}
