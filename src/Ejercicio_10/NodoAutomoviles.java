package Ejercicio_10;


public class NodoAutomoviles {
	Automoviles q;
	private NodoAutomoviles sig; //definiendo el campo enlace sig
	private NodoAutomoviles ant;
	
	public NodoAutomoviles() {  //constructor
		sig = null;
		ant = null;
	}

	public Automoviles getQ() {
		return q;
	}

	public void setQ(Automoviles q) {
		this.q = q;
	}

	public NodoAutomoviles getSig() {
		return sig;
	}

	public void setSig(NodoAutomoviles sig) {
		this.sig = sig;
	}

	public NodoAutomoviles getAnt() {
		return ant;
	}

	public void setAnt(NodoAutomoviles ant) {
		this.ant = ant;
	}


	
}
