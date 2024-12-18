package Ejercicio_2;

public class Principal {

	public static void main(String[] args) {
		// DEPARTAMENTOS
		Departamentos d1 = new Departamentos("01", "La Paz", 2800000, "Manuel", 1500);
        Departamentos d2 = new Departamentos("02", "Cochabamba", 1900000, "Juan", 1200);
        Departamentos d3 = new Departamentos("03", "Santa Cruz", 3200000, "Carlos", 300);
        Departamentos d4 = new Departamentos("04", "Oruro", 500000, "Ana", 600);
        Departamentos d5 = new Departamentos("05", "Potosí", 700000, "Luis", 700);
        Departamentos d6 = new Departamentos("06", "Chuquisaca", 620000, "Maria", 800);
        Departamentos d7 = new Departamentos("07", "Tarija", 510000, "Jose", 950);
        Departamentos d8 = new Departamentos("08", "Beni", 480000, "Carmen", 400);
        Departamentos d9 = new Departamentos("09", "Pando", 110000, "Fernando", 200);
        
        // LISTA DE DEPARTAMENTOS
        LD_NormalDepartamentos ldnd = new LD_NormalDepartamentos();
        ldnd.adiFinal(d1);
        ldnd.adiFinal(d2);
        ldnd.adiFinal(d3);
        ldnd.adiFinal(d4);
        ldnd.adiFinal(d5);
        ldnd.adiFinal(d6);
        ldnd.adiFinal(d7);
        ldnd.adiFinal(d8);
        ldnd.adiFinal(d9);
        ldnd.mostrar();
		
        System.out.println("\na) Mostrar los nombres de los departamentos que tienen un mayor PIB que el departamento "
        		+ "\ncon nombre 'Santa Cruz'");
        mostrarDepartamentosMayorPIB(ldnd);

        System.out.println("\nb) Mostrar los nombres del departamento con la menor población");
        mostrarDepartamentoMenorPoblacion(ldnd);

        System.out.println("\nc) Mostrar los nombres y gobernadores de los departamentos que tienen una población menor "
        		+ "\nal promedio de todos los departamentos");
        mostrarDepartamentosPoblacionMenorAlPromedio(ldnd);
    }
    
	// a.
    public static void mostrarDepartamentosMayorPIB(LD_NormalDepartamentos ldnd) {
        NodoDepartamentos aux = ldnd.getP();
        double pibSantaCruz = 0;
        while (aux != null) {
            if (aux.getDepa().getNombre().equals("Santa Cruz")) {
                pibSantaCruz = aux.getDepa().getPIB();
                break;
            }
            aux = aux.getSig();
        }
        aux = ldnd.getP();
        while (aux != null) {
            if (aux.getDepa().getPIB() > pibSantaCruz) {
                System.out.println(aux.getDepa().getNombre());
            }
            aux = aux.getSig();
        }
    }
    
    // b.
    public static void mostrarDepartamentoMenorPoblacion(LD_NormalDepartamentos ldnd) {
        NodoDepartamentos aux = ldnd.getP();
        int menorPoblacion = aux.getDepa().getPoblacion();
        String nombreDepartamento = aux.getDepa().getNombre();
        while (aux != null) {
            if (aux.getDepa().getPoblacion() < menorPoblacion) {
                menorPoblacion = aux.getDepa().getPoblacion();
                nombreDepartamento = aux.getDepa().getNombre();
            }
            aux = aux.getSig();
        }
        
        System.out.println(nombreDepartamento);
    }
    
    // c.
    public static void mostrarDepartamentosPoblacionMenorAlPromedio(LD_NormalDepartamentos ldnd) {
        NodoDepartamentos aux = ldnd.getP();
        int sumaPoblacion = 0;
        int contador = 0;
        while (aux != null) {
            sumaPoblacion += aux.getDepa().getPoblacion();
            contador++;
            aux = aux.getSig();
        }
        
        double promedioPoblacion = (double) sumaPoblacion / contador;
        aux = ldnd.getP();
        while (aux != null) {
            if (aux.getDepa().getPoblacion() < promedioPoblacion) {
                System.out.println(aux.getDepa().getNombre() + " - " + aux.getDepa().getGobernador());
            }
            aux = aux.getSig();
        }
    }
}