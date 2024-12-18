package Ejercicio_6;

import java.util.Scanner;

public class Estudiantes {
	private String nombre;
	private int ci;
	private double nota;
	
	public Estudiantes(String nombre, int ci, double nota) {
		super();
		this.nombre = nombre;
		this.ci = ci;
		this.nota = nota;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCi() {
		return ci;
	}

	public void setCi(int ci) {
		this.ci = ci;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}
	
	public void leer() {
		Scanner lee = new Scanner(System.in);
		System.out.println("Intr. Datos: nombre, ci, nota");
		nombre = lee.next();
		ci = lee.nextInt();
		nota = lee.nextDouble();
	}

	public String toString() {
		return "Estudiantes [nombre=" + nombre + ", ci=" + ci + ", nota=" + nota + "]";
	}
	
	public void mostrar() {
		System.out.println(toString());
	}
}
