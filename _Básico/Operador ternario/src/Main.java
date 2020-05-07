import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double preco = 34.5;
		double desconto;

		desconto = ( preco < 20 ) ? preco * 0.1 : preco * 0.05 ;

		System.out.print(desconto);

		sc.close();
	}
}