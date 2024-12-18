package Ejercicio_8;

public class NodoProfesor {
	private Profesor prof;
	private NodoProfesor ant;
	private NodoProfesor sig;
	
	NodoProfesor(){
		this.sig = null;
		this.ant = null;
	}
	
	public Profesor getProf() {
		return prof;
	}
	
	public void setProf(Profesor prof) {
		this.prof = prof;
	}
	
	public NodoProfesor getAnt() {
		return ant;
	}

	public void setAnt(NodoProfesor ant) {
		this.ant = ant;
	}

	public NodoProfesor getSig() {
		return sig;
	}

	public void setSig(NodoProfesor sig) {
		this.sig = sig;
	}
	
}
