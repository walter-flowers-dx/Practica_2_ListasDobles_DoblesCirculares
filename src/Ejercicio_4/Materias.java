package Ejercicio_4;

import java.util.Scanner;

public class Materias {
	private String sigla;
	private String nombreMateria;
	private String horario;
	
	public Materias(String sigla, String nombreMateria, String horario) {
		super();
		this.sigla = sigla;
		this.nombreMateria = nombreMateria;
		this.horario = horario;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public String getNombreMateria() {
		return nombreMateria;
	}

	public void setNombreMateria(String nombreMateria) {
		this.nombreMateria = nombreMateria;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}
	
	public void leer() {
		Scanner lee = new Scanner(System.in);
		sigla = lee.next();
		nombreMateria = lee.next();
		horario = lee.next();
	}

	public String toString() {
		return "Materias [sigla=" + sigla + ", nombreMateria=" + nombreMateria + ", horario=" + horario + "]";
	}
	
	public void mostrar() {
		System.out.println(toString());
	}
}
