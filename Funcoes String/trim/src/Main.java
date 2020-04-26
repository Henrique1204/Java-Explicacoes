public class Main {
	public static void main(String[] args) {
		String original = "	paulo HENRIQUE silva SOUZA	";

		//Remove espaços no fim e no começo
		String modificada = original.trim();

		System.out.println("Original: '" + original + "'.");
		System.out.print("Modificada: '" + modificada + "'.");
	}
}