package Ejercicio_2;

public class NodoDepartamentos {
	private Departamentos depa;
	private NodoDepartamentos ant;
	private NodoDepartamentos sig;
	
	NodoDepartamentos(){
		this.sig = null;
		this.ant = null;
	}

	public Departamentos getDepa() {
		return depa;
	}

	public void setDepa(Departamentos depa) {
		this.depa = depa;
	}

	public NodoDepartamentos getAnt() {
		return ant;
	}

	public void setAnt(NodoDepartamentos ant) {
		this.ant = ant;
	}

	public NodoDepartamentos getSig() {
		return sig;
	}

	public void setSig(NodoDepartamentos sig) {
		this.sig = sig;
	}
	
}
