public class Main {
	public static void main(String[] args) {
		String original = "paulo HENRIQUE silva SOUZA";

		//Exibi a string apartir do caractere passado no m�todo
		//No exemplo abaixo ir� come�ar do U
		String modificada1 = original.substring(2);

		//Mostra a string apartir do caracter passado no primeiro argumento do m�todo e vai at� o segundo argumento
		//No exemplo abaixo ir� come�ar no H e terminar� no E
		String modificada2 = original.substring(6, 14);

		System.out.println("Original: '" + original + "'.");
		System.out.println("Primeira modificada: '" + modificada1 + "'.");
		System.out.print("Segunda modificada: '" + modificada2 + "'.");
	}
}