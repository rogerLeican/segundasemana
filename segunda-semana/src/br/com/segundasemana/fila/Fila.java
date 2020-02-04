package br.com.segundasemana.fila;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	public static void main(String[] args) {
			
		Queue<String> fila = new LinkedList();
		
		
		fila.add("Roger");
		fila.offer("Pedro");
		fila.offer("Maria");
		
		System.out.println(fila.peek());//pegar o ultimo elemento da fila
		
		
		
		
		
	}
}
