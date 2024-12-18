package Ejercicio_10;
import java.util.Scanner;

public class LD_CircularAutomoviles extends ListaDobleAutomoviles{

		public LD_CircularAutomoviles() {
			super();
		}
		boolean esVacia() {
			if(this.P == null)
				return true;
			return false;
		}
		int nroNodos() {
			int c = 0;
			NodoAutomoviles R = P;
			if(!esVacia()) {
				while(R.getSig() != P) {
					c++;
					R = R.getSig();
				}
				c++;
			}
			return c;
		}
		void adiPrimero(Automoviles z){
			NodoAutomoviles nuevo = new NodoAutomoviles();
			nuevo.setQ(z);
			if(esVacia()) {
				P = nuevo;
				P.setSig(P);
				P.setAnt(P);
			}
			else {
				NodoAutomoviles R = P.getAnt();
				nuevo.setSig(P);
				P.setAnt(nuevo);
				P = nuevo;
				P.setAnt(R);
				R.setSig(P);
			}
		}
		void mostrar() {
			NodoAutomoviles R = P;
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

		void adiFinal(Automoviles z) {
			NodoAutomoviles nuevo = new NodoAutomoviles();
			nuevo.setQ(z);
			if(esVacia()) {
				P = nuevo;
				P.setSig(P);
				P.setAnt(P);
			}
			else {
				NodoAutomoviles R = P.getAnt();
				R.setSig(nuevo);
				nuevo.setAnt(R);
				nuevo.setSig(P);
				P.setAnt(nuevo);
			}
		}

		NodoAutomoviles eliPrimero() {
			NodoAutomoviles x = new NodoAutomoviles();
			if(!esVacia()) {
				if(nroNodos() == 1) {
					x = P;
					P = null;
				}else {
					x = P;
					NodoAutomoviles R = P.getAnt();
					P = P.getSig();
					P.setAnt(R);
					R.setSig(P);
				}
				x.setSig(null);
				x.setAnt(null);
			}
			return x;
		}

		NodoAutomoviles eliFinal() {
			NodoAutomoviles x = new NodoAutomoviles();
			if(!esVacia()) {
				if(nroNodos() == 1) {
					x = P;
					P = null;
				}else {
					x = P.getAnt();
					NodoAutomoviles R = x.getAnt();
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
				Automoviles z = new Automoviles("","","",0);
				z.leer();
				adiPrimero(z);
			}
		}

		void leer2(int n) {
			Scanner lee =  new Scanner(System.in);
			for (int i = 1; i <= n; i++) {
				Automoviles z = new Automoviles("","","",0);
				z.leer();
				adiFinal(z);
			}
		}
	}