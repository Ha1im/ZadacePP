package Bootcamp_Zadaca20;

public class TablicaMnozenja12x12 {

	public static void main(String[] args) {

		final int maxBrojMnozenja = 12;

		for (int i = 1; i <= maxBrojMnozenja; i++) {
			for (int j = 1; j <= maxBrojMnozenja; j++) {
				System.out.printf("%4d", (i * j));
			}
			System.out.println();
		}
	}
}
