package appiclation;

import java.util.Scanner;

public class Program
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int totalNegativos = 0;

		System.out.print("Qual o ordem da Matriz: ");
		int n = sc.nextInt();

		int[][] matriz = new int[n][n];

		for(int i = 0; i < matriz.length; i++)
		{
			System.out.println("Linha #" + (i+1));
			for(int j = 0; j < matriz[i].length; j++)
			{
				System.out.println("  Coluna #" + (j+1));
				System.out.print("    Valor: ");
				matriz[i][j] = sc.nextInt();

				totalNegativos += matriz[i][j] < 0 ? 1 : 0;
			}
		}

		System.out.println("Diagonal principal:");
		for(int i = 0; i < matriz.length; i++)
		{
			System.out.print(matriz[i][i] + " ");
		}
		System.out.println("\nNúmeros negativos: " + totalNegativos);

		sc.close();
	}
}
