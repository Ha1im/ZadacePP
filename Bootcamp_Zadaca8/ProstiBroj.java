package Bootcamp_Zadaca8;

public class ProstiBroj {

	public static boolean isProstiBroj(int broj) {
		boolean prosti = true;
		if (broj == 2) {
			return true;
		} else {
			for (int i = 2; i < broj - 1; i++) {
				if (broj % i == 0) {
					prosti = false;
					break;
				}
			}
			if (prosti == true) {
				return true;
			} else
				return false;
		}
	}

	public static void main(String[] args) {

		for (int i = 2; i <= 10000; i++) {
			if (i % 100 == 0) {
				System.out.println("\n");
			}

			if (isProstiBroj(i)) {
				System.out.print(i + "  ");

			} else {
				continue;

			}

		}

	}
}
