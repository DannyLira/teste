package br.com.fuctura.aula03;

public class matriz {

	public static void main(String[] args) {
		//matriz [limha] [coluna]
		int[][] matriz = new int[3][3];
		
		//linha 0
		matriz[0][0] = 1;
		matriz[0][1] = 2;
		matriz[0][2] = 3;
		//linha 1
		matriz[1][0] = 4;
		matriz[1][0] = 5;
		matriz[1][0] = 6;
		//linha 2
		matriz[2][0] = 7;
		matriz[2][0] = 8;
		matriz[2][0] = 9;
		
		for(int linha = 0; linha < matriz.length; linha++) {
			for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
				if(coluna != 0) {//matriz[i][j]-> quando a posição j
					System.out.print(",");	
				}
				System.out.print(matriz[linha][coluna]);
			}
			System.out.println();
		}
		System.out.println("\n#=== foreach ===#\n");
		
		for (int[]linha: matriz) {
			int cont = 0;
			for (int coluna : linha) {
				if (cont != 0) {
					
				}
			}
		}
	}
	
	

}
