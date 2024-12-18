package Ejercicio_2;

public class LD_NormalDepartamentos extends ListaDobleDepartamentos{
	public LD_NormalDepartamentos() {
		super();
	}
	boolean esVacia() {
		if(this.P == null)
			return true;
		return false;
	}
	int nroNodos() {
		int c = 0;
		NodoDepartamentos R = this.P;
		while(R != null) {
			c++;
			R = R.getSig();
		}
		return c;
	}
	void adiPrimero(Departamentos z){
		NodoDepartamentos nuevo = new NodoDepartamentos();
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
		NodoDepartamentos R = P;
		while(R != null) {
			R.getDepa().mostrar();
			R = R.getSig();
		}
	}
	void adiFinal(Departamentos z) {
		NodoDepartamentos nuevo =  new NodoDepartamentos();
		nuevo.setDepa(z);
		if(esVacia())
			P = nuevo;
		else {
			NodoDepartamentos R = P;
			while(R.getSig() != null) {
				R = R.getSig();
			}
			R.setSig(nuevo);
			nuevo.setAnt(R);
		}
	}
	
	NodoDepartamentos eliPrimero() {
		NodoDepartamentos x = new NodoDepartamentos();
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
	
	NodoDepartamentos eliFinal() {
		NodoDepartamentos x = new NodoDepartamentos();
		if(!esVacia()) {
			if(nroNodos() == 1) {
				x = P;
				P = null;
			}else {
				NodoDepartamentos R = P;
				while(R.getSig() != null) {
					R = R.getSig();
				}
				x = R;
				NodoDepartamentos aux = R.getAnt();
				aux.setSig(null);
				x.setAnt(null);
			}
		}
		return x;
	}
	
	void leer1(int n) {
		for (int i = 1; i <= n; i++) {
			Departamentos z = new Departamentos("","",0,"",0);
			z.leer();
			adiPrimero(z);
		}
	}
	
	void leer2(int n) {
		for (int i = 1; i <= n; i++) {
			Departamentos z = new Departamentos("","",0,"",0);
			z.leer();
			adiFinal(z);
		}
	}
}
