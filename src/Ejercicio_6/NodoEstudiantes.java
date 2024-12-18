package Ejercicio_6;


public class NodoEstudiantes {
	Estudiantes q;
	private NodoEstudiantes sig; //definiendo el campo enlace sig
	private NodoEstudiantes ant;
	
	public NodoEstudiantes() {  //constructor
		sig = null;
		ant = null;
	}

	public Estudiantes getQ() {
		return q;
	}

	public void setQ(Estudiantes q) {
		this.q = q;
	}

	public NodoEstudiantes getSig() {
		return sig;
	}

	public void setSig(NodoEstudiantes sig) {
		this.sig = sig;
	}

	public NodoEstudiantes getAnt() {
		return ant;
	}

	public void setAnt(NodoEstudiantes ant) {
		this.ant = ant;
	}


	
}
