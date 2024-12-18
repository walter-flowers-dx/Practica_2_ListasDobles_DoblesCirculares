package Ejercicio_4;

public class LD_NormalMaterias extends ListaDobleMaterias{
	public LD_NormalMaterias() {
		super();
	}
	boolean esVacia() {
		if(this.P == null)
			return true;
		return false;
	}
	int nroNodos() {
		int c = 0;
		NodoMaterias R = this.P;
		while(R != null) {
			c++;
			R = R.getSig();
		}
		return c;
	}
	void adiPrimero(Materias z){
		NodoMaterias nuevo = new NodoMaterias();
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
		NodoMaterias R = P;
		while(R != null) {
			R.getMat().mostrar();
			R = R.getSig();
		}
	}
	void adiFinal(Materias z) {
		NodoMaterias nuevo =  new NodoMaterias();
		nuevo.setDepa(z);
		if(esVacia())
			P = nuevo;
		else {
			NodoMaterias R = P;
			while(R.getSig() != null) {
				R = R.getSig();
			}
			R.setSig(nuevo);
			nuevo.setAnt(R);
		}
	}
	
	NodoMaterias eliPrimero() {
		NodoMaterias x = new NodoMaterias();
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
	
	NodoMaterias eliFinal() {
		NodoMaterias x = new NodoMaterias();
		if(!esVacia()) {
			if(nroNodos() == 1) {
				x = P;
				P = null;
			}else {
				NodoMaterias R = P;
				while(R.getSig() != null) {
					R = R.getSig();
				}
				x = R;
				NodoMaterias aux = R.getAnt();
				aux.setSig(null);
				x.setAnt(null);
			}
		}
		return x;
	}
	
	void leer1(int n) {
		for (int i = 1; i <= n; i++) {
			Materias z = new Materias("","","");
			z.leer();
			adiPrimero(z);
		}
	}
	
	void leer2(int n) {
		for (int i = 1; i <= n; i++) {
			Materias z = new Materias("","","");
			z.leer();
			adiFinal(z);
		}
	}
}
