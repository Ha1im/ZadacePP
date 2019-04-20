package Bootcamp_Zadaca20;

public class ProstiPalindrom {

	public static boolean isProstiBroj(int broj) {
		boolean indikator = false;
		if (broj == 0 || broj == 1) {
			return indikator;
		}
		for (int i = 2; i < broj; i++) {
			if (broj % i == 0) {
				indikator = false;
				break;
			} else {
				indikator = true;
			}
		}
		return indikator;
	}

	public static boolean isPalindrom(int broj) {
		int brojCifara = 0;
		int temp = broj;

		while (temp != 0) {

			temp /= 10;
			brojCifara++;
		}

		int[] cifreBroja = new int[brojCifara];

		for (int i = 0; i < cifreBroja.length; i++) {
			cifreBroja[i] = broj % 10;
			broj /= 10;
		}

		for (int i = 0; i < cifreBroja.length / 2; i++) {
			if (cifreBroja[i] == cifreBroja[cifreBroja.length - 1 - i]) {
				continue;
			} else {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		int max = 0;
		for (int i = 1; i < 1000; i++) {
			if (isProstiBroj(i) && isPalindrom(i)) {
				System.out.println(i + " : " + isProstiBroj(i));
				if (i > max) {
					max = i;
				}
			}
		}
		System.out.println("Najveci prime palindrom je broj: " + max);
	}
}
