package Ejercicio_4;

import java.util.Scanner;

public class Inscripciones {
	private int ci;
	private String sigla;
	
	public Inscripciones(int ci, String sigla) {
		super();
		this.ci = ci;
		this.sigla = sigla;
	}

	public int getCi() {
		return ci;
	}

	public void setCi(int ci) {
		this.ci = ci;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	
	public void leer() {
		Scanner lee = new Scanner(System.in);
		System.out.println("Intr. Datos: ci, sigla");
		ci = lee.nextInt();
		sigla = lee.next();
	}

	public String toString() {
		return "Inscripciones [ci=" + ci + ", sigla=" + sigla + "]";
	}
	
	public void mostrar() {
		System.out.println(toString());
	}
}
