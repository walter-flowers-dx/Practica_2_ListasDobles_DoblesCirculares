package Ejercicio_10;

import java.util.Scanner;

public class Automoviles {
	private String color;
	private String marca;
	private String modelo;
	private double kilometraje;
	
	public Automoviles(String color, String marca, String modelo, double kilometraje) {
		super();
		this.color = color;
		this.marca = marca;
		this.modelo = modelo;
		this.kilometraje = kilometraje;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getKilometraje() {
		return kilometraje;
	}

	public void setKilometraje(double kilometraje) {
		this.kilometraje = kilometraje;
	}
	
	public void leer() {
		Scanner lee = new Scanner(System.in);
		System.out.println("Intr. Datos: color, marca, modelo, kilometraje");
		color = lee.next();
		marca = lee.next();
		modelo = lee.next();
		kilometraje = lee.nextDouble();
	}

	public String toString() {
		return "Automoviles [color=" + color + ", marca=" + marca + ", modelo=" + modelo + ", kilometraje="
				+ kilometraje + "]";
	}
	
	public void mostrar() {
		System.out.println(toString());
	}
}
