public class Main {
	public static void main(String[] args) {
		String original = "paulo HENRIQUE silva SOUZA";

		//Troca o caractere passado no primeiro argumento pelo do segundo argumento
		String modificada1 = original.replace(" ", "_");

		//Também funciona com sequencia de string
		String modificada2 = original.replace("paulo", "pedro");

		System.out.println("Original: '" + original + "'.");
		System.out.println("Primeira modificada: '" + modificada1 + "'.");
		System.out.print("Segunda modificada: '" + modificada2 + "'.");
	}
}