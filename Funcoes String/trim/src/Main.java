public class Main {
	public static void main(String[] args) {
		String original = "	paulo HENRIQUE silva SOUZA	";

		//Remove espa�os no fim e no come�o
		String modificada = original.trim();

		System.out.println("Original: '" + original + "'.");
		System.out.print("Modificada: '" + modificada + "'.");
	}
}