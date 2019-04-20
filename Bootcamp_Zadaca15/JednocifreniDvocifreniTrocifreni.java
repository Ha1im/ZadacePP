package Bootcamp_Zadaca15;

public class JednocifreniDvocifreniTrocifreni {

	public static void main(String[] args) {

		int[] cijeliBrojevi = new int[20];
		int jednocifreniBrojevi = 0, dvocifreniBrojevi = 0, trocifreniBrojevi = 0;

		for (int i = 0; i < cijeliBrojevi.length; i++) {

			cijeliBrojevi[i] = (int) (Math.random() * 1000);

			if (cijeliBrojevi[i] > 100)
				trocifreniBrojevi++;
			else if (cijeliBrojevi[i] > 10)
				dvocifreniBrojevi++;
			else
				jednocifreniBrojevi++;
		}

		int[] jednocifreniBrojeviArr = new int[jednocifreniBrojevi];
		int[] dvocifreniBrojeviArr = new int[dvocifreniBrojevi];
		int[] trocifreniBrojeviArr = new int[trocifreniBrojevi];
		int jednocifreniIndex = 0;
		int dvocifreniIndex = 0;
		int trocifreniIndex = 0;

		for (int i = 0; i < cijeliBrojevi.length; i++) {

			if (cijeliBrojevi[i] > 100) {
				trocifreniBrojeviArr[trocifreniIndex] = cijeliBrojevi[i];
				trocifreniIndex++;
			} else if (cijeliBrojevi[i] > 10) {
				dvocifreniBrojeviArr[dvocifreniIndex] = cijeliBrojevi[i];
				dvocifreniIndex++;
			} else {
				jednocifreniBrojeviArr[jednocifreniIndex] = cijeliBrojevi[i];
				jednocifreniIndex++;
			}
		}

		System.out.print("Niz jednocifrenih brojeva: ");
		for (int i = 0; i < jednocifreniBrojeviArr.length; i++)
			System.out.print(jednocifreniBrojeviArr[i] + " ");

		System.out.print("\nNiz dvocifrenih brojeva: ");
		for (int i = 0; i < dvocifreniBrojeviArr.length; i++)
			System.out.print(dvocifreniBrojeviArr[i] + " ");

		System.out.print("\nNiz trocifrenih brojeva: ");
		for (int i = 0; i < trocifreniBrojeviArr.length; i++)
			System.out.print(trocifreniBrojeviArr[i] + " ");

	}

}

