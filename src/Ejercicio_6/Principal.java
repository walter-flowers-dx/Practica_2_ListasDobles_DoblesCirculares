package Ejercicio_6;

public class Principal {

    public static void main(String[] args) {
        LD_CircularEstudiantes ldce = new LD_CircularEstudiantes();
        Estudiantes e1 = new Estudiantes("Juan", 8876513, 75.5);
        Estudiantes e2 = new Estudiantes("Danna", 9980754, 30);
        Estudiantes e3 = new Estudiantes("Marco", 107345379, 51);
        Estudiantes e4 = new Estudiantes("Maria", 77625332, 100);
        Estudiantes e5 = new Estudiantes("Karla", 10928646, 20);
        Estudiantes e6 = new Estudiantes("Alicia", 88653283, 56);
        Estudiantes e7 = new Estudiantes("Daniel", 98873299, 55.6);
        Estudiantes e8 = new Estudiantes("Pedro", 29871622, 21);
        Estudiantes e9 = new Estudiantes("Diana", 98217328, 2);
        Estudiantes e10 = new Estudiantes("Eliana", 12653271, 93);
        ldce.adiFinal(e1);
        ldce.adiFinal(e2);
        ldce.adiFinal(e3);
        ldce.adiFinal(e4);
        ldce.adiFinal(e5);
        ldce.adiFinal(e6);
        ldce.adiFinal(e7);
        ldce.adiFinal(e8);
        ldce.adiFinal(e9);
        ldce.adiFinal(e10);
        
        System.out.println("NOTAS DE LOS ESTUDIANTES DEL 1er Parcial de INF-121");
        ldce.mostrar();
        
        System.out.println("\na) Mostrar al(los) estudiante(s) que tienen la maximo nota");
        mostrarEstudiantesConMaxNota(ldce);
        
        System.out.println("\nb) Verificar si el estudiante con nombre X aprobo el examen");
        verificarEstudianteAprobado(ldce, "Diana");
        
        System.out.println("\nc) Eliminar a los estudiantes que tengan una nota de reprobacion n (nota<51%)");
        eliminarEstudiantesReprobados(ldce);
        ldce.mostrar();
    }

    // a.
    public static void mostrarEstudiantesConMaxNota(LD_CircularEstudiantes lista) {
        NodoEstudiantes aux = lista.getP();
        if (aux == null) {
            System.out.println("La lista está vacía.");
            return;
        }
        double maxNota = aux.getQ().getNota();
        NodoEstudiantes temp = aux;
        do {
            if (temp.getQ().getNota() > maxNota) {
                maxNota = temp.getQ().getNota();
            }
            temp = temp.getSig();
        } while (temp != aux);
        temp = aux;
        System.out.println("Estudiantes con la nota máxima (" + maxNota + "):");
        do {
            if (temp.getQ().getNota() == maxNota) {
                temp.getQ().mostrar();
            }
            temp = temp.getSig();
        } while (temp != aux);
    }

    // b.
    public static void verificarEstudianteAprobado(LD_CircularEstudiantes lista, String nombre) {
        NodoEstudiantes aux = lista.getP();
        boolean encontrado = false;
        
        if (aux != null) {
            do {
                if (aux.getQ().getNombre().equalsIgnoreCase(nombre)) {
                    encontrado = true;
                    if (aux.getQ().getNota() >= 51) {
                        System.out.println(nombre + " aprobó el examen con una nota de " + aux.getQ().getNota() + ".");
                    } else {
                        System.out.println(nombre + " reprobó el examen con una nota de " + aux.getQ().getNota() + ".");
                    }
                    break;
                }
                aux = aux.getSig();
            } while (aux != lista.getP());
        }
        if (!encontrado) {
            System.out.println("El estudiante con nombre " + nombre + " no fue encontrado en la lista.");
        }
    }

    // c.
    public static void eliminarEstudiantesReprobados(LD_CircularEstudiantes lista) {
        NodoEstudiantes aux = lista.getP();
        
        if (aux == null) return;
        
        do {
            NodoEstudiantes siguiente = aux.getSig();
            if (aux.getQ().getNota() < 51) {
                if (aux == lista.getP()) {
                    lista.eliPrimero();
                } else if (aux == lista.getP().getAnt()) {
                    lista.eliFinal();
                } else {
                    aux.getAnt().setSig(aux.getSig());
                    aux.getSig().setAnt(aux.getAnt());
                }
            }
            aux = siguiente;
        } while (aux != lista.getP());
        
        System.out.println("Lista de estudiantes sin Reprobados: ");
    }
}
