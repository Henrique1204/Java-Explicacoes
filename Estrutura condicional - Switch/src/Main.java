import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o número da semana: ");
		int x = sc.nextInt();
		String dia = "O dia da semana é: ";
		
		switch (x) {
			case 1:
				dia += "Domingo";
			break;
			case 2:
				dia += "Segunda";
			break;
			case 3:
				dia += "Terça";
			break;
			case 4:
				dia += "Quarta";
			break;
			case 5:
				dia += "Quinta";
			break;
			case 6:
				dia += "Sexta";
			break;
			case 7:
				dia += "Sábado";
			break;
			default:
				dia = "Dia inválido";
			break;
		}

		System.out.print(dia);
		
		sc.close();
	}

}
