package application;

import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;

public class Program
{
	public static void main(String[] args)
	{
		List<String> lista = new ArrayList<>();

		lista.add("Maria");
		lista.add("Alex");
		lista.add("Bob");
		lista.add("Anna");
		lista.add(2, "Marco");

		System.out.println(lista.size());

		for(String item : lista)
		{
			System.out.println(item);
		}

		System.out.println("--------------------------------------------");
		lista.removeIf(x -> x.charAt(0) == 'M');

		System.out.println(lista.size());

		for(String item : lista)
		{
			System.out.println(item);
		}

		System.out.println("--------------------------------------------");

		System.out.println("Index of Bob: " + lista.indexOf("Bob"));
		System.out.println("Index of Marco: " + lista.indexOf("Marco"));

		System.out.println("--------------------------------------------");

		List<String> filtro = lista.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());

		for(String item : filtro)
		{
			System.out.println(item);
		}

		System.out.println("--------------------------------------------");

		String nome = lista.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
		System.out.println(nome);
	}
}