package br.com.segundasemana.set;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ImplementacaoHashSet {
		
	public static void main(String[] args) {
		
		Set<String> conjunto = new HashSet<>();
		
		conjunto.add("Pedro");
		conjunto.add("Ariane");
		conjunto.add("Ane");
		
		for (String nomes : conjunto) {
			System.out.println(nomes);//não ordena o dados
		}
		
		/*System.out.println("\nusando o SortedSet");
		
		SortedSet<String> conjuntoOrdenado = new TreeSet<>(); 
		
		conjuntoOrdenado.add("Pedro");
		conjuntoOrdenado.add("Ariane");
		conjuntoOrdenado.add("Ane");
		
		for (String nomes : conjuntoOrdenado) {
			System.out.println(nomes);//não ordena o dados
			
		}
		*/
	}

}
