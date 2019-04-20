package Bootcamp_Zadaca14;

public class Piramida {

	public static void main(String[] args) {

		int pyramidHeight = 11;
		int praznaMjesta = pyramidHeight;

		for (int i = 1; i <= pyramidHeight; i++) {
			for (int j = 0; j < praznaMjesta; j++) {
				System.out.print("   ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.printf("%2d ", k);
			}
			for (int k = (i - 1); k > 0; k--) {
				System.out.printf("%2d ", k);
			}
			System.out.println();
			praznaMjesta--;

		}
	}

}
