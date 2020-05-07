import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o número: ");
		int x = sc.nextInt(); 
		int soma = x;
		
		while( x != 0) {
			System.out.print("Digite o número: ");
			x = sc.nextInt();
			soma += x;
		}

		System.out.print("A soma dos valores digitados foi: " + soma);

		sc.close();
	}
}