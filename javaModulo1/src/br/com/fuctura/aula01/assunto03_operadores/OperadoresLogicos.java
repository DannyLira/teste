package br.com.fuctura.aula01.assunto03_operadores;

public class OperadoresLogicos {

	public static void main(String[] args) {
		int n1 = 1, n2 = 2, n3 = 2;
		
		int valor1 = 10;
		int valor2 = 20;
		
		System.out.println(valor1 == 10 && valor2 == 20 );
		System.out.println(valor2 == 10 && valor1 == 10 );
		System.out.println(valor1 == 10 || valor2 == 10 );
		System.out.println(valor1 == 20 || valor2 == 20 );
		System.out.println(valor1 == 20 || valor2 == 10 );
		
		boolean usandoAnd = n1 > n2 && n2 == n3;
		boolean usandoOr = n1  > n2 && n2 == n3;
		
		System.out.println(usandoAnd);
		System.out.println(usandoOr);
		
	}

}
