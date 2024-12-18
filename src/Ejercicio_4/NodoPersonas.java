package Ejercicio_4;

public class NodoPersonas {
	private Personas per;
	private NodoPersonas ant;
	private NodoPersonas sig;
	
	NodoPersonas(){
		this.sig = null;
		this.ant = null;
	}

	public Personas getPer() {
		return per;
	}

	public void setPer(Personas per) {
		this.per = per;
	}

	public NodoPersonas getAnt() {
		return ant;
	}

	public void setAnt(NodoPersonas ant) {
		this.ant = ant;
	}

	public NodoPersonas getSig() {
		return sig;
	}

	public void setSig(NodoPersonas sig) {
		this.sig = sig;
	}
	
}
