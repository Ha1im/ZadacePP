package Bootcamp_Zadaca12;

public class Nasumicnih10 {

	public static int[] generateArray() {

		int[] nasumicniArray = new int[10];

		for (int i = 0; i < 10; i++) {
			nasumicniArray[i] = (int) (Math.random() * 10);
		}

		return nasumicniArray;
	}

	public static void main(String[] args) {

		int[] nasumicniArray = generateArray();

		for (int i = 0; i < 10; i++)
			System.out.print(nasumicniArray[i] + " ");
	}
}
