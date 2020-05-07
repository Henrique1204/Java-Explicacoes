import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int soma = 0;

		System.out.print("Digite o tanto da repetição: ");
		int limite = sc.nextInt();

		for(int i = 0; i < limite; i++ ) {
			System.out.print("Digite o valor a ser somada: ");
			int num = sc.nextInt();

			soma += num;
			System.out.println("O valor de i: " + i);
		}

		System.out.print("A soma dos valores digitados foi: " + soma);
	}
}