package Zadaca7;

import java.util.Scanner;

public class Stednja {
	public static void main(String[] args) {

		int mjesecniIznosStednje;
		double mjesecnaInteresnaStopa = 0.00417;

		Scanner unos = new Scanner(System.in);

		System.out.println("Unesite mjesecni iznos stednje: ");
		mjesecniIznosStednje = unos.nextInt();

		double mjesec1 = mjesecniIznosStednje * (1 + mjesecnaInteresnaStopa);
		double mjesec2 = (mjesecniIznosStednje + mjesec1) * (1 + mjesecnaInteresnaStopa);
		double mjesec3 = (mjesecniIznosStednje + mjesec2) * (1 + mjesecnaInteresnaStopa);
		double mjesec4 = (mjesecniIznosStednje + mjesec3) * (1 + mjesecnaInteresnaStopa);
		double mjesec5 = (mjesecniIznosStednje + mjesec4) * (1 + mjesecnaInteresnaStopa);
		double mjesec6 = (mjesecniIznosStednje + mjesec5) * (1 + mjesecnaInteresnaStopa);
		double mjesec7 = (mjesecniIznosStednje + mjesec6) * (1 + mjesecnaInteresnaStopa);
		double mjesec8 = (mjesecniIznosStednje + mjesec7) * (1 + mjesecnaInteresnaStopa);
		double mjesec9 = (mjesecniIznosStednje + mjesec8) * (1 + mjesecnaInteresnaStopa);
		double mjesec10 = (mjesecniIznosStednje + mjesec9) * (1 + mjesecnaInteresnaStopa);
		double mjesec11 = (mjesecniIznosStednje + mjesec10) * (1 + mjesecnaInteresnaStopa);
		double mjesec12 = (mjesecniIznosStednje + mjesec11) * (1 + mjesecnaInteresnaStopa);

		System.out.println("Vrijednost na racunu za 12 mjeseci je: " + mjesec12);

		unos.close();

	}
}
