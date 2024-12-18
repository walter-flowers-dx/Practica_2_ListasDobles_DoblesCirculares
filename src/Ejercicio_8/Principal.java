package Ejercicio_8;

public class Principal {

	public static void main(String[] args) {
		LD_NormalProfesor ldnp = new LD_NormalProfesor();
		Profesor p1 = new Profesor("Marcelo", 15, 10000);
		Profesor p2 = new Profesor("Carlos", 20, 5000);
		Profesor p3 = new Profesor("Carmen", 25, 4500);
		Profesor p4 = new Profesor("Jhonny", 13, 7500);
		Profesor p5 = new Profesor("Brigida", 7, 2000);
		Profesor p6 = new Profesor("Marisol", 4, 3500);
		Profesor p7 = new Profesor("Marco", 3, 6600);
		Profesor p8 = new Profesor("Moises", 10, 2300);
		ldnp.adiFinal(p1);
		ldnp.adiFinal(p2);
		ldnp.adiFinal(p3);
		ldnp.adiFinal(p4);
		ldnp.adiFinal(p5);
		ldnp.adiFinal(p6);
		ldnp.adiFinal(p7);
		ldnp.adiFinal(p8);
		System.out.println("LISTA DE PROFESORES: ");
		ldnp.mostrar();

		System.out.println("\na) Eliminar a los profesores que ganen mas de Z(sueldo)");
		eliminarProfesoresConSueldoMayor(ldnp, 5000);
		System.out.println("LISTA DESPUÉS DE ELIMINAR:");
		ldnp.mostrar();

		System.out.println("\nb) Ordenar por el número de años de trabajo");
		ordenarPorAnosTrabajo(ldnp);
		System.out.println("LISTA ORDENADA POR AÑOS DE TRABAJO:");
		ldnp.mostrar();

		System.out.println("\nc) Adicionar un nuevo profesor manteniendo el orden establecido");
		Profesor nuevo = new Profesor("Ana", 12, 4000);
		adicionarManteniendoOrden(ldnp, nuevo);
		System.out.println("LISTA DESPUÉS DE ADICIONAR NUEVO PROFESOR:");
		ldnp.mostrar();
	}

	// a.
	static void eliminarProfesoresConSueldoMayor(LD_NormalProfesor lista, double z) {
		NodoProfesor actual = lista.getP();
		while (actual != null) {
			if (actual.getProf().getSueldo() > z) {
				NodoProfesor siguiente = actual.getSig();
				if (actual == lista.getP()) { 
					lista.eliPrimero();
				} else if (actual.getSig() == null) {
					lista.eliFinal();
				} else { 
					actual.getAnt().setSig(actual.getSig());
					actual.getSig().setAnt(actual.getAnt());
				}
				actual = siguiente;
			} else {
				actual = actual.getSig();
			}
		}
	}

	// b.
	static void ordenarPorAnosTrabajo(LD_NormalProfesor lista) {
		boolean huboIntercambio;
		do {
			huboIntercambio = false;
			NodoProfesor actual = lista.getP();
			while (actual != null && actual.getSig() != null) {
				if (actual.getProf().getAnosTrabajo() > actual.getSig().getProf().getAnosTrabajo()) {
					Profesor temp = actual.getProf();
					actual.setProf(actual.getSig().getProf());
					actual.getSig().setProf(temp);
					huboIntercambio = true;
				}
				actual = actual.getSig();
			}
		} while (huboIntercambio);
	}

	// c.
	static void adicionarManteniendoOrden(LD_NormalProfesor lista, Profesor nuevo) {
		NodoProfesor nuevoNodo = new NodoProfesor();
		nuevoNodo.setProf(nuevo);
		if (lista.esVacia() || lista.getP().getProf().getAnosTrabajo() >= nuevo.getAnosTrabajo()) {
			lista.adiPrimero(nuevo);
		} else {
			NodoProfesor actual = lista.getP();
			while (actual.getSig() != null && actual.getSig().getProf().getAnosTrabajo() < nuevo.getAnosTrabajo()) {
				actual = actual.getSig();
			}
			nuevoNodo.setSig(actual.getSig());
			nuevoNodo.setAnt(actual);
			if (actual.getSig() != null) {
				actual.getSig().setAnt(nuevoNodo);
			}
			actual.setSig(nuevoNodo);
		}
	}
}
