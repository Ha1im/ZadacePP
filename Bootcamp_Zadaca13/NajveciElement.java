package Bootcamp_Zadaca13;

public class NajveciElement {

	public static void main(String[] args) {

		int[] generisaniNiz = new int[100];
		int najveciIndex = 0, najveciElement = 0;

		for (int i = 0; i < generisaniNiz.length; i++) {
			generisaniNiz[i] = (int) (Math.random() * 100);

			if (generisaniNiz[i] > najveciElement) {
				najveciElement = generisaniNiz[i];
				najveciIndex = i;
			}
		}
		System.out.println("Najveci element u nizu je " + najveciElement + ", a njegov index je " + najveciIndex);
	}
}
