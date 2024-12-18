package Ejercicio_6;
import java.util.Scanner;

public class LD_CircularEstudiantes extends ListaDobleEstudiantes{

		public LD_CircularEstudiantes() {
			super();
		}
		boolean esVacia() {
			if(this.P == null)
				return true;
			return false;
		}
		int nroNodos() {
			int c = 0;
			NodoEstudiantes R = P;
			if(!esVacia()) {
				while(R.getSig() != P) {
					c++;
					R = R.getSig();
				}
				c++;
			}
			return c;
		}
		void adiPrimero(Estudiantes z){
			NodoEstudiantes nuevo = new NodoEstudiantes();
			nuevo.setQ(z);
			if(esVacia()) {
				P = nuevo;
				P.setSig(P);
				P.setAnt(P);
			}
			else {
				NodoEstudiantes R = P.getAnt();
				nuevo.setSig(P);
				P.setAnt(nuevo);
				P = nuevo;
				P.setAnt(R);
				R.setSig(P);
			}
		}
		void mostrar() {
			NodoEstudiantes R = P;
			if(!esVacia()) {
				while(R.getSig() != P) {
					R.getQ().mostrar();
					System.out.println("------------------");
					R = R.getSig();
				}
				R.getQ().mostrar();
			}
			else
				System.out.println("Lista Vacia");
		}

		void adiFinal(Estudiantes z) {
			NodoEstudiantes nuevo = new NodoEstudiantes();
			nuevo.setQ(z);
			if(esVacia()) {
				P = nuevo;
				P.setSig(P);
				P.setAnt(P);
			}
			else {
				NodoEstudiantes R = P.getAnt();
				R.setSig(nuevo);
				nuevo.setAnt(R);
				nuevo.setSig(P);
				P.setAnt(nuevo);
			}
		}

		NodoEstudiantes eliPrimero() {
			NodoEstudiantes x = new NodoEstudiantes();
			if(!esVacia()) {
				if(nroNodos() == 1) {
					x = P;
					P = null;
				}else {
					x = P;
					NodoEstudiantes R = P.getAnt();
					P = P.getSig();
					P.setAnt(R);
					R.setSig(P);
				}
				x.setSig(null);
				x.setAnt(null);
			}
			return x;
		}

		NodoEstudiantes eliFinal() {
			NodoEstudiantes x = new NodoEstudiantes();
			if(!esVacia()) {
				if(nroNodos() == 1) {
					x = P;
					P = null;
				}else {
					x = P.getAnt();
					NodoEstudiantes R = x.getAnt();
					R.setSig(P);
					P.setAnt(R);
				}
				x.setSig(null);
				x.setAnt(null);
			}
			return x;
		}

		void leer1(int n) {
			Scanner lee =  new Scanner(System.in);
			for (int i = 1; i <= n; i++) {
				Estudiantes z = new Estudiantes("",0,0);
				z.leer();
				adiPrimero(z);
			}
		}

		void leer2(int n) {
			Scanner lee =  new Scanner(System.in);
			for (int i = 1; i <= n; i++) {
				Estudiantes z = new Estudiantes("",0,0);
				z.leer();
				adiFinal(z);
			}
		}
	}