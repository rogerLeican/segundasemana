package br.com.segundasemana.Mapa;

import java.util.HashMap;
import java.util.Map;

public class HashMapa {
	
	public static void main(String[] args) {
		
		Map<Integer, String> nomes = new HashMap<>();
		
		nomes.put(1, "Bernardo");
		nomes.put(2, "Ane");
		nomes.put(3, "Tamara");
		nomes.put(4, "Ariane");
		
		System.out.println(nomes.keySet());// so a chave
		System.out.println(nomes.values());// so o valor
		System.out.println(nomes.entrySet());//chave valor
		
		System.out.println(nomes.containsKey(3));
		System.out.println(nomes.containsValue("tamara"));
		
		System.out.println(nomes.get(3));
		
		
		
	}
	
	
}
