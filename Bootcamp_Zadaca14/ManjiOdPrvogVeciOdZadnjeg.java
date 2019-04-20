package Bootcamp_Zadaca14;

import java.util.Scanner;

public class ManjiOdPrvogVeciOdZadnjeg {

	public static void main(String[] args) {

		Scanner unos = new Scanner(System.in);
		int[] nizBrojeva = new int[10];
		int brojeviManjiOdPrvogClana = 0;
		int brojeviVeciOdPosljednjegClana = 0;

		System.out.print("Unesite 10 cijelih brojeva: ");

		for (int i = 0; i < nizBrojeva.length; i++) {
			nizBrojeva[i] = unos.nextInt();
		}
		unos.close();

		int posljednjiClan = nizBrojeva[(nizBrojeva.length - 1)];
		int prviClan = nizBrojeva[0];

		for (int i = 0; i < nizBrojeva.length; i++) {

			if (nizBrojeva[i] < prviClan)
				brojeviManjiOdPrvogClana++;

			if (nizBrojeva[i] > posljednjiClan)
				brojeviVeciOdPosljednjegClana++;
		}

		System.out.println(brojeviManjiOdPrvogClana + " je brojeva koji su manji od prvog " + "clana.");
		System.out.println(brojeviVeciOdPosljednjegClana + " je brojeva koji su veci " + "od posljednjeg clana.");
	}
}
