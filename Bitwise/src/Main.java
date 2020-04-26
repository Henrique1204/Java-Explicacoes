import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int mask = 0b100000;
		
		System.out.print("Digite o núemro: ");
		int n = sc.nextInt();

		if((n & mask) != 0)
		{
			System.out.println("É verdadeiro");
		}
		else
		{
			System.out.println("É falso");
		}

		sc.close();
	}
}