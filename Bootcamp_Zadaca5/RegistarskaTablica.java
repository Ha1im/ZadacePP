package Bootcamp_Zadaca5;

public class RegistarskaTablica {

	public static void main(String[] args) {

		String tablice = "";

		for (int i = 0; i < 8; i++) {

			if (i < 3) {

				Character c1 = (char) ((Math.random() * 26) + 65);

				tablice += c1;

			}

			else if (i == 3) {

				tablice += '-';

			}

			else {

				int broj = (int) (Math.random() * 10);

				tablice += broj;

			}

		}

		System.out.println("Vase registarske oznake su: " + tablice);

	}

}
