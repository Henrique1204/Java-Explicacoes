package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program
{
	public static void main(String[] args)
	{
		String[] linhas = new String[] {"Bom dia", "Boa tarde", "Boa noite"};

		String caminho = "c:\\temp\\novo.txt";

		//Cria/recria try (BufferedWriter bw = new BufferedWriter(new FileWriter(caminho)))
		/* Adiciona */try (BufferedWriter bw = new BufferedWriter(new FileWriter(caminho, true)))
		{
			for(String linha : linhas)
			{
				bw.write(linha);
				bw.newLine();
			}
		}
		catch (IOException e)
		{
			System.out.println(e.getMessage());
		}
	}
}