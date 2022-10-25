package br.com.fuctura.aula01.assunto03_operadores;

public class OperadoresRelacionais {

	public static void main(String[] args) {
		int n1 = 1, n2 = 2, n3 = 2;
		boolean resp;
		resp = n1 > n2;
		System.out.println(resp);
		resp = n3 == n2;
		System.out.println(resp);
		resp = n3 != n2;
		System.out.println(resp);
		String nome0 = "nildson";
		String nome1 = "kleyton";
		String nome2 = "Nildson";
		String nome3 = "kelyton";
		resp = nome0 == nome2;
		System.out.println(resp);
		resp = nome1.equalsIgnoreCase(nome3);
		System.out.println(resp);
	}

}
