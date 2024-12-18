package Ejercicio_4;

public class NodoMaterias {
	private Materias mat;
	private NodoMaterias ant;
	private NodoMaterias sig;
	
	NodoMaterias(){
		this.sig = null;
		this.ant = null;
	}

	public Materias getMat() {
		return mat;
	}

	public void setDepa(Materias mat) {
		this.mat = mat;
	}

	public NodoMaterias getAnt() {
		return ant;
	}

	public void setAnt(NodoMaterias ant) {
		this.ant = ant;
	}

	public NodoMaterias getSig() {
		return sig;
	}

	public void setSig(NodoMaterias sig) {
		this.sig = sig;
	}
	
}
