import java.util.Locale;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		char cond;

		do
		{
			System.out.print("Digite a temperatura em Cº: ");
			double c = sc.nextDouble();

			double conver = 9 * c / 5 + 32;

			System.out.printf("O Equivalente em Fº é: %.1f%n", conver);

			System.out.print("Deseja calcular outra temperatura?[s/n] ");
			cond = sc.next().charAt(0);

		}while(cond == 's');

		sc.close();
	}
}