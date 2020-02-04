package br.com.segundasemana.exceções;

import java.util.Scanner;

public class TratamentoDeExceções {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um numero");
		double n1 = entrada.nextDouble();
		
		System.out.println("Digite outro numero");
		double n2 = entrada.nextDouble();
		
		
		System.out.println("Digite um operador valido +,-,*,/ ");
		String operador = entrada.next();
		
		double resultado = "+".equals(operador) ? n1 + n2 : 0; 
		resultado = "-".equals(operador) ? n1 - n2 : resultado; 
		resultado = "*".equals(operador) ? n1 * n2 : resultado; 
		resultado = "/".equals(operador) ? n1 / n2 : resultado; 
		
		try {
			
			"Infinity".equals(resultado);
			System.out.println("o resultado é " + resultado);
			
		} catch (Exception e) {
			
			
		}
		
		entrada.close();
		
		
	}

}
