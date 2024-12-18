package Ejercicio_10;

public class Principal {

	public static void main(String[] args) {
		LD_CircularAutomoviles lsca = new LD_CircularAutomoviles();
		Automoviles a1 = new Automoviles("Verde", "Toyota", "Audi", 10000);
		Automoviles a2 = new Automoviles("Rojo", "Honda", "Civic", 15000);
		Automoviles a3 = new Automoviles("Azul", "Ford", "Mustang", 25000);
		Automoviles a4 = new Automoviles("Negro", "Chevrolet", "Camaro", 30000);
		Automoviles a5 = new Automoviles("Blanco", "Nissan", "Altima", 12000);
		Automoviles a6 = new Automoviles("Gris", "BMW", "X5", 5000);
		Automoviles a7 = new Automoviles("Amarillo", "Ferrari", "488", 2000);
		Automoviles a8 = new Automoviles("Naranja", "Lamborghini", "Huracan", 4000);
		Automoviles a9 = new Automoviles("Azul", "Audi", "A4", 22000);
		Automoviles a10 = new Automoviles("Plateado", "Mercedes-Benz", "C-Class", 18000);
		lsca.adiFinal(a1);
		lsca.adiFinal(a2);
		lsca.adiFinal(a3);
		lsca.adiFinal(a4);
		lsca.adiFinal(a5);
		lsca.adiFinal(a6);
		lsca.adiFinal(a7);
		lsca.adiFinal(a8);
		lsca.adiFinal(a9); 
		lsca.adiFinal(a10);
		System.out.println("LISTA DE AUTOMOVILES: ");
		lsca.mostrar();
		
		System.out.println("\na) Mostrar los vehiculos con mayor kilometraje del color X");
		mostrarMayorKilometrajeColor(lsca, "Azul"); 
		
		System.out.println("\nb) Eliminar los vehiculos de la marca Y con modelo Z");
		eliminarMarcaModelo(lsca, "Ford", "Mustang"); 
		System.out.println("LISTA DE VEHICULOS SIN LOS AUTOMOVILES ELIMINADOS: ");
		lsca.mostrar();
		
		System.out.println("\nc) Agregar un nuevo vehiculo despues del i-esimo vehiculo");
		Automoviles nuevoAuto = new Automoviles("Dorado", "Tesla", "Model S", 5000);
		agregarDespuesDeIesimo(lsca, nuevoAuto, 5); 
		lsca.mostrar();
	}
	
	// a.
	public static void mostrarMayorKilometrajeColor(LD_CircularAutomoviles lista, String color) {
		NodoAutomoviles actual = lista.getP();
		Automoviles maxKilometrajeAuto = null;
		if (!lista.esVacia()) {
			do {
				if (actual.getQ().getColor().equalsIgnoreCase(color)) {
					if (maxKilometrajeAuto == null || actual.getQ().getKilometraje() > maxKilometrajeAuto.getKilometraje()) {
						maxKilometrajeAuto = actual.getQ();
					}
				}
				actual = actual.getSig();
			} while (actual != lista.getP());
			
			if (maxKilometrajeAuto != null) {
				System.out.println("Vehiculo con mayor kilometraje de color " + color + ":");
				maxKilometrajeAuto.mostrar();
			} else {
				System.out.println("No se encontraron vehiculos del color " + color);
			}
		}
	}

	// b.
	public static void eliminarMarcaModelo(LD_CircularAutomoviles lista, String marca, String modelo) {
		NodoAutomoviles actual = lista.getP();
		if (!lista.esVacia()) {
			do {
				if (actual.getQ().getMarca().equalsIgnoreCase(marca) && actual.getQ().getModelo().equalsIgnoreCase(modelo)) {
					NodoAutomoviles siguiente = actual.getSig();
					if (actual == lista.getP()) {
						lista.eliPrimero();
					} else if (actual.getSig() == lista.getP()) {
						lista.eliFinal();
					} else {
						actual.getAnt().setSig(actual.getSig());
						actual.getSig().setAnt(actual.getAnt());
					}
					actual = siguiente;
				} else {
					actual = actual.getSig();
				}
			} while (actual != lista.getP());
		}
	}
	
	// c.
	public static void agregarDespuesDeIesimo(LD_CircularAutomoviles lista, Automoviles nuevo, int posicion) {
		NodoAutomoviles actual = lista.getP();
		NodoAutomoviles nuevoNodo = new NodoAutomoviles();
		nuevoNodo.setQ(nuevo);
		int contador = 1;
		
		if (!lista.esVacia()) {
			do {
				if (contador == posicion) {
					nuevoNodo.setSig(actual.getSig());
					nuevoNodo.setAnt(actual);
					actual.getSig().setAnt(nuevoNodo);
					actual.setSig(nuevoNodo);
					break;
				}
				actual = actual.getSig();
				contador++;
			} while (actual != lista.getP());
		}
	}
}
