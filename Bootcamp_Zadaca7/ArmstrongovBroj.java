package Bootcamp_Zadaca7;

public class ArmstrongovBroj {

	public static int vratiArmstrongovBroj(int x) {
		int armstrongovBroj = 0;
		int zadnjaCifra;
		int brojCifara = 0;

		if (x > 0 && x < 100) {
			brojCifara = 2;

		} else if (x >= 100 && x < 1000) {
			brojCifara = 3;
		}
		while (x != 0) {
			zadnjaCifra = x % 10;
			armstrongovBroj += Math.pow(zadnjaCifra, brojCifara);
			x = x / 10;
		}
		return armstrongovBroj;
	}

	public static void main(String[] args) {

		System.out.println("Armstrongovi brojevi od 0-1000 su: ");
		for (int i = 0; i <= 1000; i++) {

			if (i == vratiArmstrongovBroj(i)) {
				System.out.printf(i + "  ");
			}

		}
	}
}
