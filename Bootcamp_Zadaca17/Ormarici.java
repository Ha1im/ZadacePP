package Bootcamp_Zadaca17;

public class Ormarici {

	public static void main(String[] args) {

		int ucenici = 100;
		boolean[] ormarici = new boolean[100];

		for (int i = 0; i < ormarici.length; i++)
			ormarici[i] = true;

		for (int i = 2; i <= ucenici; i++) {
			for (int j = (i - 1); j < ormarici.length; j += (i)) {
				if (ormarici[j])
					ormarici[j] = false;
				else
					ormarici[j] = true;
			}
		}

		System.out.println("Ormarici koji su otvoreni nakon 100 ucenika su:");
		for (int i = 0; i < ormarici.length; i++) {
			if (ormarici[i])
				System.out.print((i + 1) + " ");
		}

	}
}
