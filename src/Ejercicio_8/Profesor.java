package Ejercicio_8;

import java.util.Scanner;

public class Profesor {
	private String nombre;
	private int anosTrabajo;
	private double sueldo;
	
	public Profesor(String nombre, int anosTrabajo, double sueldo) {
		super();
		this.nombre = nombre;
		this.anosTrabajo = anosTrabajo;
		this.sueldo = sueldo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getAnosTrabajo() {
		return anosTrabajo;
	}

	public void setAnosTrabajo(int anosTrabajo) {
		this.anosTrabajo = anosTrabajo;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	
	public void leer() {
		Scanner lee = new Scanner(System.in);
		System.out.println("Intr. Datos: nombre, anosTrabajo, sueldo");
		nombre = lee.next();
		anosTrabajo = lee.nextInt();
		sueldo = lee.nextDouble();
	}

	public String toString() {
		return "Profesor [nombre=" + nombre + ", anosTrabajo=" + anosTrabajo + ", sueldo=" + sueldo + "]";
	}
	
	public void mostrar() {
		System.out.println(toString());
	}
}
