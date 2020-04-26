package application;

import java.util.Locale;
import java.util.Scanner;
import entidades.Produto;

public class Program
{
	public static void main(String[] args)
	{
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double soma = 0, media;

		System.out.print("Digite o número de valores: ");
		int numeroValores = sc.nextInt();

		/* Exemplo 1
		double[] valores = new double[numeroValores];

		for(int i = 0; i < numeroValores; i++) {
			System.out.printf("Digite o %dº valor: ", (i + 1));
			valores[i] = sc.nextDouble();

			soma += valores[i];
		}

		media = soma / numeroValores;

		System.out.printf("Média dos valores: %.2f", media);
		 */

		Produto[] produtos = new Produto[numeroValores];

		for(int i = 0; i < numeroValores; i++) {
			System.out.print("Digite o nome do produto: ");
			sc.nextLine();
			String nome = sc.nextLine();

			System.out.print("Digite o preço do produto: ");
			double preco = sc.nextDouble();

			produtos[i] = new Produto(nome, preco);
			soma += produtos[i].getPreco();
		}

		media = soma / numeroValores;
		System.out.printf("Média dos preços: %.2f", media);

		sc.close();
	}
}