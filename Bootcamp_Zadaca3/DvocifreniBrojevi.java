package Bootcamp_Zadaca3;

public class DvocifreniBrojevi {
	public static void main(String[] args) {

		for (int i = 1; i <= 100; i++) {
			int dvocifreniBrojevi = (int) (Math.random() * 90 + 10);
			System.out.print(dvocifreniBrojevi + " ");

			if (i % 10 == 0) {
				System.out.println();
			}

		}
	}

}
