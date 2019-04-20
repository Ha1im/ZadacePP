package Bootcamp_Zadaca1;

public class DijeljenjeSa9 {
	public static void main(String[] args) {

		System.out.println("Brojevi djeljivi sa 9 u rasponu od 1 do 100:");
		int i = 1;
		for (i = 1; i <= 100; i++) {
			if (i % 9 == 0) {

				System.out.print(i + " ");

			}
		}

	}

}
