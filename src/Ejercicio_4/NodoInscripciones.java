package Ejercicio_4;

public class NodoInscripciones {
	private Inscripciones inscrip;
	private NodoInscripciones ant;
	private NodoInscripciones sig;
	
	NodoInscripciones(){
		this.sig = null;
		this.ant = null;
	}

	public Inscripciones getInscrip() {
		return inscrip;
	}

	public void setDepa(Inscripciones inscrip) {
		this.inscrip = inscrip;
	}

	public NodoInscripciones getAnt() {
		return ant;
	}

	public void setAnt(NodoInscripciones ant) {
		this.ant = ant;
	}

	public NodoInscripciones getSig() {
		return sig;
	}

	public void setSig(NodoInscripciones sig) {
		this.sig = sig;
	}
	
}
