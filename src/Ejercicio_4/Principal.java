package Ejercicio_4;

public class Principal {

    public static void main(String[] args) {
        // LISTA DE PERSONAS
        LD_NormalPersonas ldnp = new LD_NormalPersonas();
        Personas p1 = new Personas(7762514, "Juan", 75272931);
        Personas p2 = new Personas(6672413, "Danna", 76531213);
        Personas p3 = new Personas(1021219, "Maria", 68754231);
        Personas p4 = new Personas(3921729, "Alicia", 73141321);
        Personas p5 = new Personas(3728193, "Elba", 64325172);
        Personas p6 = new Personas(9865485, "Karla", 69852431);
        Personas p7 = new Personas(2152165, "Rodrigo", 72577458);
        Personas p8 = new Personas(1948889, "Ariana", 69987098);
        Personas p9 = new Personas(4374309, "Pedro", 70104010);
        Personas p10 = new Personas(7847548, "Daniel", 65676261);
        ldnp.adiFinal(p1);
        ldnp.adiFinal(p2);
        ldnp.adiFinal(p3);
        ldnp.adiFinal(p4);
        ldnp.adiFinal(p5);
        ldnp.adiFinal(p6);
        ldnp.adiFinal(p7);
        ldnp.adiFinal(p8);
        ldnp.adiFinal(p9);
        ldnp.adiFinal(p10);
        System.out.println("LISTA DE PERSONAS: ");
        ldnp.mostrar();
        
        // LISTA DE MATERIAS
        LD_NormalMaterias ldnm = new LD_NormalMaterias();
        Materias m1 = new Materias("INF-121", "Programacion 2", "Martes - Jueves");
        Materias m2 = new Materias("INF-131", "Programacion 3", "Lunes - Miercoles");
        Materias m3 = new Materias("INF-255", "Marketing", "Martes - Jueves");
        Materias m4 = new Materias("INF-254", "Metodos Numericos", "Viernes - Sabado");
        Materias m5 = new Materias("INF-134", "Estadistica 2", "Jueves - Viernes");
        ldnm.adiFinal(m1);
        ldnm.adiFinal(m2);
        ldnm.adiFinal(m3);
        ldnm.adiFinal(m4);
        ldnm.adiFinal(m5);
        System.out.println("\nLISTA DE MATERIAS:");
        ldnm.mostrar();
        
        // LISTA DE INSCRIPCIONES
        LD_NormalInscripciones ldni = new LD_NormalInscripciones();
        Inscripciones i1 = new Inscripciones(6672413, "INF-121");
        Inscripciones i2 = new Inscripciones(7762514, "INF-134");
        Inscripciones i3 = new Inscripciones(3921729, "INF-254");
        Inscripciones i4 = new Inscripciones(9865485, "INF-255");
        Inscripciones i5 = new Inscripciones(1948889, "INF-131");
        Inscripciones i6 = new Inscripciones(4374309, "INF-134");
        Inscripciones i7 = new Inscripciones(2152165, "INF-121");
        Inscripciones i8 = new Inscripciones(3728193, "INF-131");
        Inscripciones i9 = new Inscripciones(1021219, "INF-255");
        Inscripciones i10 = new Inscripciones(7847548, "INF-254");
        Inscripciones i11 = new Inscripciones(7762514, "INF-121");
        Inscripciones i12 = new Inscripciones(9865485, "INF-131");
        Inscripciones i13 = new Inscripciones(4374309, "INF-254");
        Inscripciones i14 = new Inscripciones(7847548, "INF-255");
        Inscripciones i15 = new Inscripciones(1021219, "INF-121");
        ldni.adiFinal(i1);
        ldni.adiFinal(i2);
        ldni.adiFinal(i3);
        ldni.adiFinal(i4);
        ldni.adiFinal(i5);
        ldni.adiFinal(i6);
        ldni.adiFinal(i7);
        ldni.adiFinal(i8);
        ldni.adiFinal(i9);
        ldni.adiFinal(i10);
        ldni.adiFinal(i11);
        ldni.adiFinal(i12);
        ldni.adiFinal(i13);
        ldni.adiFinal(i14);
        ldni.adiFinal(i15);
        System.out.println("\nLISTA DE INSCRIPCIONES: ");
        ldni.mostrar();

        System.out.println("\na) Mostrar a todas las personas que estudian la materia con la sigla 'INF-131'");
        mostrarPersonasPorMateria(ldnp, ldni, "INF-131");
        
        System.out.println("\nb) Inscribir al estudiante en la posicion X de la primera lista, en la materia con "
        		+ "\nsigla Y (si es que existe materia con esa sigla)");
        inscribirEstudianteEnMateria(ldnp, ldni, ldnm, 1, "INF-254");
        System.out.println("Con el estudiante nuevo: ");
        ldni.mostrar();
        
        System.out.println("\nc) Para el estudiante en la posicion X de la primera lista, mostrar las materias "
        		+ "\nen las que tiene choque");
        verificarChoqueHorarios(ldnp, ldni, ldnm, 2);  
    }

    // a.
    public static void mostrarPersonasPorMateria(LD_NormalPersonas personas, LD_NormalInscripciones inscripciones,
    		String sigla) {
        NodoInscripciones ins = inscripciones.getP();
        while (ins != null) {
            if (ins.getInscrip().getSigla().equals(sigla)) {
                NodoPersonas perNodo = personas.getP();
                while (perNodo != null) {
                    if (perNodo.getPer().getCi() == ins.getInscrip().getCi()) {
                        perNodo.getPer().mostrar();
                        break;
                    }
                    perNodo = perNodo.getSig();
                }
            }
            ins = ins.getSig();
        }
    }

    // b.
    public static void inscribirEstudianteEnMateria(LD_NormalPersonas personas, LD_NormalInscripciones inscripciones, 
    		LD_NormalMaterias materias, int posicion, String sigla) {
        NodoPersonas perNodo = personas.getP();
        for (int i = 1; i < posicion && perNodo != null; i++) {
            perNodo = perNodo.getSig();
        }
        if (perNodo != null) {
            NodoMaterias matNodo = materias.getP();
            while (matNodo != null) {
                if (matNodo.getMat().getSigla().equals(sigla)) {
                    Inscripciones nuevaInscripcion = new Inscripciones(perNodo.getPer().getCi(), sigla);
                    inscripciones.adiFinal(nuevaInscripcion);
                    System.out.println("****************************************");
                    System.out.println("Estudiante inscrito en la materia: ");
                    nuevaInscripcion.mostrar();
                    System.out.println("****************************************");
                    return;
                }
                matNodo = matNodo.getSig();
            }
            System.out.println("No se encontró la materia con la sigla especificada.");
        } else {
            System.out.println("La posición no es válida.");
        }
    }

    // c.
    public static void verificarChoqueHorarios(LD_NormalPersonas personas, LD_NormalInscripciones inscripciones, 
    		LD_NormalMaterias materias, int posicion) {
        NodoPersonas perNodo = personas.getP();
        for (int i = 1; i < posicion && perNodo != null; i++) {
            perNodo = perNodo.getSig();
        }
        if (perNodo == null) {
            System.out.println("La posición no es válida.");
            return;
        }
        
        int ciEstudiante = perNodo.getPer().getCi();
        NodoInscripciones insNodo = inscripciones.getP();
        boolean tieneChoque = false;

        while (insNodo != null) {
            if (insNodo.getInscrip().getCi() == ciEstudiante) {
                String horarioActual = obtenerHorarioPorSigla(materias, insNodo.getInscrip().getSigla());
                NodoInscripciones otroinsNodo = insNodo.getSig();
                
                while (otroinsNodo != null) {
                    if (otroinsNodo.getInscrip().getCi() == ciEstudiante) {
                        String otroHorario = obtenerHorarioPorSigla(materias, otroinsNodo.getInscrip().getSigla());
                        if (horarioActual.equals(otroHorario)) {
                            System.out.println("Choque de materias: " + insNodo.getInscrip().getSigla() + " y " + 
                        otroinsNodo.getInscrip().getSigla());
                            tieneChoque = true;
                        }
                    }
                    otroinsNodo = otroinsNodo.getSig();
                }
            }
            insNodo = insNodo.getSig();
        }
        if (!tieneChoque) {
            System.out.println("¡¡¡¡¡¡¡¡ESTE ESTUDIANTE TIENE UN BUEN HORARIO!!!!!!!!!!!!!!!");
        }
    }
    
    public static String obtenerHorarioPorSigla(LD_NormalMaterias materias, String sigla) {
        NodoMaterias matNodo = materias.getP();
        while (matNodo != null) {
            if (matNodo.getMat().getSigla().equals(sigla)) {
                return matNodo.getMat().getHorario();
            }
            matNodo = matNodo.getSig();
        }
        return "";
    }
}
