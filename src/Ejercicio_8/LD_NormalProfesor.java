package Ejercicio_8;

public class LD_NormalProfesor extends ListaDobleProfesor{
	public LD_NormalProfesor() {
		super();
	}
	boolean esVacia() {
		if(this.P == null)
			return true;
		return false;
	}
	int nroNodos() {
		int c = 0;
		NodoProfesor R = this.P;
		while(R != null) {
			c++;
			R = R.getSig();
		}
		return c;
	}
	void adiPrimero(Profesor z){
		NodoProfesor nuevo = new NodoProfesor();
		nuevo.setProf(z);
		if(esVacia())
			P = nuevo;
		else {
			nuevo.setSig(P);
			P.setAnt(nuevo);
			P = nuevo;
		}
	}
	void mostrar() {
		NodoProfesor R = P;
		while(R != null) {
			R.getProf().mostrar();
			R = R.getSig();
		}
	}
	void adiFinal(Profesor z) {
		NodoProfesor nuevo =  new NodoProfesor();
		nuevo.setProf(z);
		if(esVacia())
			P = nuevo;
		else {
			NodoProfesor R = P;
			while(R.getSig() != null) {
				R = R.getSig();
			}
			R.setSig(nuevo);
			nuevo.setAnt(R);
		}
	}
	
	NodoProfesor eliPrimero() {
		NodoProfesor x = new NodoProfesor();
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
	
	NodoProfesor eliFinal() {
		NodoProfesor x = new NodoProfesor();
		if(!esVacia()) {
			if(nroNodos() == 1) {
				x = P;
				P = null;
			}else {
				NodoProfesor R = P;
				while(R.getSig() != null) {
					R = R.getSig();
				}
				x = R;
				NodoProfesor aux = R.getAnt();
				aux.setSig(null);
				x.setAnt(null);
			}
		}
		return x;
	}
	
	void leer1(int n) {
		for (int i = 1; i <= n; i++) {
			Profesor z = new Profesor("",0,0);
			z.leer();
			adiPrimero(z);
		}
	}
	
	void leer2(int n) {
		for (int i = 1; i <= n; i++) {
			Profesor z = new Profesor("",0,0);
			z.leer();
			adiFinal(z);
		}
	}
}
