import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int mask = 0b100000;
		
		System.out.print("Digite o n�emro: ");
		int n = sc.nextInt();

		if((n & mask) != 0)
		{
			System.out.println("� verdadeiro");
		}
		else
		{
			System.out.println("� falso");
		}

		sc.close();
	}
}