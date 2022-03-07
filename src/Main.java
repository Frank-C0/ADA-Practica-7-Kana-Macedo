import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
		for (int i = 0; i < 20; i++) {
			int[] l = casoPeor(100);
			System.out.println(algoritmoDeContratacionAleatorio(l));
		}

	}
	static int algoritmoDeContratacionAleatorio(int[] calidadDeCandidatos) {
		ArrayList<Integer> lista = new ArrayList<Integer>();
		addToList(lista, calidadDeCandidatos);
		
	    Collections.shuffle(lista);
	    
	    
	    int calidadActual = lista.get(0);
	    int contratos = 1;
	    
	    for (int i = 0; i < calidadDeCandidatos.length; i++) {
			if(lista.get(i)>calidadActual) {
				calidadActual = lista.get(i);
				contratos++;
			}
		}
		return contratos;
	}
	
	static int[] casoAleatorio(int n) {
		Random random = new Random();
		int[] s = new int[n];
		for (int i = 0; i < s.length; i++) {
			s[i]=random.nextInt();
		}
		return s;
	}
	static int[] casoMejor(int n) {
		int[] s = new int[n];
		for (int i = 0; i < s.length; i++) {
			s[i]=i;
		}
		return s;
	}
	static int[] casoPeor(int n) {
		int[] s = new int[n];
		for (int i = s.length-1; i >= 0; i--) {
			s[i]=i;
		}
		return s;
	}
	static void addToList(ArrayList<Integer> a, int[] b) {
		for (int i = 0; i < b.length; i++) {
			a.add(b[i]);
		}
		
	}
}
