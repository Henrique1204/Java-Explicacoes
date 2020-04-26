package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Program
{
	public static void main(String[] args) throws ParseException
	{
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

		Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));

		System.out.println(sdf.format(d));

		Calendar cal = Calendar.getInstance();
		cal.setTime(d);

		//Adicionar valor ao tempo
		//cal.add(Calendar.HOUR_OF_DAY, 4);
		//d = cal.getTime();
		//System.out.println(sdf.format(d));

		int minutos = cal.get(Calendar.MINUTE);
		int mes = 1 + cal.get(Calendar.MONTH);

		System.out.println("Minutos: " + minutos);
		System.out.print("Mês: " + mes);
	}
}