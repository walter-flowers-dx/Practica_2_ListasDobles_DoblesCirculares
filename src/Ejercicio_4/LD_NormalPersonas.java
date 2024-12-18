package Ejercicio_4;

public class LD_NormalPersonas extends ListaDoblePersonas{
	public LD_NormalPersonas() {
		super();
	}
	boolean esVacia() {
		if(this.P == null)
			return true;
		return false;
	}
	int nroNodos() {
		int c = 0;
		NodoPersonas R = this.P;
		while(R != null) {
			c++;
			R = R.getSig();
		}
		return c;
	}
	void adiPrimero(Personas z){
		NodoPersonas nuevo = new NodoPersonas();
		nuevo.setPer(z);
		if(esVacia())
			P = nuevo;
		else {
			nuevo.setSig(P);
			P.setAnt(nuevo);
			P = nuevo;
		}
	}
	void mostrar() {
		NodoPersonas R = P;
		while(R != null) {
			R.getPer().mostrar();
			R = R.getSig();
		}
	}
	void adiFinal(Personas z) {
		NodoPersonas nuevo =  new NodoPersonas();
		nuevo.setPer(z);
		if(esVacia())
			P = nuevo;
		else {
			NodoPersonas R = P;
			while(R.getSig() != null) {
				R = R.getSig();
			}
			R.setSig(nuevo);
			nuevo.setAnt(R);
		}
	}
	
	NodoPersonas eliPrimero() {
		NodoPersonas x = new NodoPersonas();
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
	
	NodoPersonas eliFinal() {
		NodoPersonas x = new NodoPersonas();
		if(!esVacia()) {
			if(nroNodos() == 1) {
				x = P;
				P = null;
			}else {
				NodoPersonas R = P;
				while(R.getSig() != null) {
					R = R.getSig();
				}
				x = R;
				NodoPersonas aux = R.getAnt();
				aux.setSig(null);
				x.setAnt(null);
			}
		}
		return x;
	}
	
	void leer1(int n) {
		for (int i = 1; i <= n; i++) {
			Personas z = new Personas(0,"",0);
			z.leer();
			adiPrimero(z);
		}
	}
	
	void leer2(int n) {
		for (int i = 1; i <= n; i++) {
			Personas z = new Personas(0,"",0);
			z.leer();
			adiFinal(z);
		}
	}
}
