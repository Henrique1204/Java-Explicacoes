import java.util.Scanner;
import java.util.Locale;

public class Main {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite algo");
		
		// String x;
		// x = sc.next();

		// int x;
		// x = sc.nextInt();
		
		// double x;
		// x = sc.nextDouble();
		
		// char x;
		// x = sc.next().charAt(0);
		
		String x;
		int y;
		double z;
		x = sc.next();
		y = sc.nextInt();
		z = sc.nextDouble();
		
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		sc.close();
	}
}
