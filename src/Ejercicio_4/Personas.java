package Ejercicio_4;

import java.util.Scanner;

public class Personas {
	private int ci;
	private String nombre;
	private int nroCelular;
	
	public Personas(int ci, String nombre, int nroCelular) {
		super();
		this.ci = ci;
		this.nombre = nombre;
		this.nroCelular = nroCelular;
	}

	public int getCi() {
		return ci;
	}

	public void setCi(int ci) {
		this.ci = ci;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNroCelular() {
		return nroCelular;
	}

	public void setNroCelular(int nroCelular) {
		this.nroCelular = nroCelular;
	}
	
	public void leer() {
		Scanner lee = new Scanner(System.in);
		System.out.println("Intr. Datos: ci, nombre, nroCelular");
		ci = lee.nextInt();
		nombre = lee.next();
		nroCelular = lee.nextInt();
	}

	public String toString() {
		return "Personas [ci=" + ci + ", nombre=" + nombre + ", nroCelular=" + nroCelular + "]";
	}
	
	public void mostrar() {
		System.out.println(toString());
	}
}
