public class Main {
	public static void main(String[] args) {
		String original = "paulo HENRIQUE silva SOUZA";

		//Separa palavras em itens de um array considerando o argumento como ponto de divis�o da frase
		String[] modificada = original.split(" ");

		System.out.println("Original: " + original);
		for(int i = 0; i < modificada.length; i++)
		{
			System.out.println((i + 1) + "� palavra: " + modificada[i]);
		}
	}
}