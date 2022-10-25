package br.com.fuctura.exercicio;

import java.util.Scanner;

public class exercicio02 {

	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		
	System.out.println("Digite seu nome: ");
	String nome = entrada.nextLine();
	System.out.println("Digite primeira nota: ");
	double nota1 = entrada.nextDouble();
	System.out.println("Digite a segunda nota: ");
	double nota2 = entrada.nextDouble();
	
	 double media =( nota1 + nota2 )/ 2;
	 
	 if (media >=7 && media <=10) {
			 System.out.println("Você foi APROVADO");
		 
	 } else if (media >=3 && media <7) {
			 System.out.println("Você foi REPROVADO");
		 	
		
		
}
		


	}

}
