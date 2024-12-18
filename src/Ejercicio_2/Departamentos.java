package Ejercicio_2;

import java.util.Scanner;

public class Departamentos {
	private String id;
	private String nombre;
	private int poblacion;
	private String gobernador;
	private double PIB;
	
	public Departamentos(String id, String nombre, int poblacion, String gobernador, double pIB) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.poblacion = poblacion;
		this.gobernador = gobernador;
		PIB = pIB;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPoblacion() {
		return poblacion;
	}

	public void setPoblacion(int poblacion) {
		this.poblacion = poblacion;
	}

	public String getGobernador() {
		return gobernador;
	}

	public void setGobernador(String gobernador) {
		this.gobernador = gobernador;
	}

	public double getPIB() {
		return PIB;
	}

	public void setPIB(double pIB) {
		PIB = pIB;
	}
	
	public void leer() {
		Scanner lee = new Scanner(System.in);
		System.out.println("Intr. Datos: id, nombre, poblacion, gobernador, PIB");
		id = lee.next();
		nombre = lee.next();
		poblacion = lee.nextInt();
		gobernador = lee.next();
		PIB = lee.nextDouble();
	}

	public String toString() {
		return "Departamentos [id=" + id + ", nombre=" + nombre + ", poblacion=" + poblacion + ", gobernador="
				+ gobernador + ", PIB=" + PIB + "]";
	}
	
	public void mostrar() {
		System.out.println(toString());
	}
}
