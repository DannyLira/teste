package br.com.fuctura.exercicio;

import java.util.Scanner;

public class exercicio03 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner( System.in);
		
		int dia;
		System.out.println("Digite um número para o dia da semana: ");
		dia = entrada.nextInt();
		
		switch (dia) {
		case 1:
			System.out.println("Domingo");
			break;
		case 2:
			System.out.println("Segunda-Feira");
			break;
		case 3:
			System.out.println("Terça-Feira");
			break;
		case 4:
			System.out.println("Quarta-Feira");
			break;
		case 5:
			System.out.println("Quinta-Feira");
			break;
		case 6:
			System.out.println("Hoje é Sexta-Feira");
			break;
		case 7:
			System.out.println("Sábado");
			break;

				default:
					System.out.println("Dia inválido");
			break;
		}
			
		
	}

}
