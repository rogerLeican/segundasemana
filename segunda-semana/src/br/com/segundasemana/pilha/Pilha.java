package br.com.segundasemana.pilha;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
	
	public static void main(String[] args) {
		
		Deque<String> linguagens = new ArrayDeque<String>();
		
		linguagens.add("Java0");
		linguagens.push("php");
		linguagens.push("sql");
		
		System.out.println(linguagens.peek());
		System.out.println(linguagens.element());
		System.out.println(linguagens.poll());//remover da pilha
		System.out.println(linguagens.peek());
		
	}

}
