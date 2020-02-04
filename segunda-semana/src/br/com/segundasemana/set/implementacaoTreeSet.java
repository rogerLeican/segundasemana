package br.com.segundasemana.set;

import java.util.TreeSet;

public class implementacaoTreeSet {
	public static void main(String[] args) {
		
		TreeSet<Integer> numeros = new TreeSet<>();
		
		numeros.add(3);
		numeros.add(7);
		numeros.add(8);
		numeros.add(5);
		numeros.add(1);
		
		System.out.println("primeiro elemento --> " + numeros.first());
		System.out.println("ultimo elemento --> " + numeros.last());
		
		for (int nomes : numeros) {
			System.out.println(nomes);//ordena os dados
		}
		
	}
}
