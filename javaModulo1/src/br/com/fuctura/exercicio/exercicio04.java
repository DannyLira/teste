package br.com.fuctura.exercicio;

import java.util.Scanner;

public class exercicio04 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		
		String nome;  
		int numero, i; 
		 
		
		
		
		System.out.print("Digite seu nome: ");
		nome = entrada.next();
		
		
		System.out.print("Digite um número: ");
		numero = entrada . nextInt();
		
		
//		for (int contador = 0;  contador < nome.length(); contador++ ) {
//			System.out.println(contador + " " + nome);
//			
//		}
		i = 0;
		while (i < nome.length() * 2) {
			System.out.println(i + " " + nome);
			i++;
		}
	}

}
