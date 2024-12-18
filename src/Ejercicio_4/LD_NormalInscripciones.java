package Ejercicio_4;

public class LD_NormalInscripciones extends ListaDobleInscripciones{
	public LD_NormalInscripciones() {
		super();
	}
	boolean esVacia() {
		if(this.P == null)
			return true;
		return false;
	}
	int nroNodos() {
		int c = 0;
		NodoInscripciones R = this.P;
		while(R != null) {
			c++;
			R = R.getSig();
		}
		return c;
	}
	void adiPrimero(Inscripciones z){
		NodoInscripciones nuevo = new NodoInscripciones();
		nuevo.setDepa(z);
		if(esVacia())
			P = nuevo;
		else {
			nuevo.setSig(P);
			P.setAnt(nuevo);
			P = nuevo;
		}
	}
	void mostrar() {
		NodoInscripciones R = P;
		while(R != null) {
			R.getInscrip().mostrar();
			R = R.getSig();
		}
	}
	void adiFinal(Inscripciones z) {
		NodoInscripciones nuevo =  new NodoInscripciones();
		nuevo.setDepa(z);
		if(esVacia())
			P = nuevo;
		else {
			NodoInscripciones R = P;
			while(R.getSig() != null) {
				R = R.getSig();
			}
			R.setSig(nuevo);
			nuevo.setAnt(R);
		}
	}
	
	NodoInscripciones eliPrimero() {
		NodoInscripciones x = new NodoInscripciones();
		if(!esVacia()) {
			if(nroNodos() == 1) {
				x = P;
				P = null;
			}else {
				x = P;
				P = P.getSig();
				P.setAnt(null);
				x.setSig(null);
			}
		}
		return x;
	}
	
	NodoInscripciones eliFinal() {
		NodoInscripciones x = new NodoInscripciones();
		if(!esVacia()) {
			if(nroNodos() == 1) {
				x = P;
				P = null;
			}else {
				NodoInscripciones R = P;
				while(R.getSig() != null) {
					R = R.getSig();
				}
				x = R;
				NodoInscripciones aux = R.getAnt();
				aux.setSig(null);
				x.setAnt(null);
			}
		}
		return x;
	}
	
	void leer1(int n) {
		for (int i = 1; i <= n; i++) {
			Inscripciones z = new Inscripciones(0,"");
			z.leer();
			adiPrimero(z);
		}
	}
	
	void leer2(int n) {
		for (int i = 1; i <= n; i++) {
			Inscripciones z = new Inscripciones(0,"");
			z.leer();
			adiFinal(z);
		}
	}
}
