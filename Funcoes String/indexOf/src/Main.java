public class Main {
	public static void main(String[] args) {
		String original = "paulo HENRIQUE silva SOUZA";

		//Pega o indice da primeira apari��o do argumento passado
		int i = original.indexOf("il");

		//Pega o indice da �ltima apari��o do argumento passado
		int j = original.lastIndexOf("a");
		
		System.out.println("Original: '" + original + "'.");
		System.out.println("Indice I: '" + i + "'.");
		System.out.print("Indice J: '" + j + "'.");
	}
}