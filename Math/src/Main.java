import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		double z = sc.nextDouble();
		double a, b, c;
		
		a = Math.sqrt(x);
		b = Math.sqrt(y);
		c = Math.sqrt(z);
		
		System.out.println("Raiz quadrada de " + x + " � " + a);
		System.out.println("Raiz quadrada de " + y + " � " + b);
		System.out.println("Raiz quadrada de " + z + " � " + c);
		
		a = Math.pow(x, 2);
		b = Math.pow(y, x);
		c = Math.pow(z, 2);
		
		System.out.println("O quadrado de " + x + " � " + a);
		System.out.println( y + " elevado a " + x + " � " + b);
		System.out.println("O quadrado de " + z + " � " + c);
		
		a =  Math.abs(x);
		b =  Math.abs(y);
		
		System.out.println("O valor absoluto de " + x + " � " + a);
		System.out.println("O valor absoluto de " + y + " � " + b);
		
		sc.close();
	}
}
