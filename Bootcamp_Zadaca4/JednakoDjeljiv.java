package Bootcamp_Zadaca4;

public class JednakoDjeljiv {
	public static void main(String[] args) {

		int NZS = 1;

		for (int i = 2; i <= 20; i++) {

			int veciBroj = Math.max(i, NZS);

			for (int j = veciBroj;; j++) {

				if (j % NZS == 0 && j % i == 0) {
					NZS = j;
					break;
				}
			}

		}

		System.out.println("Najmanji pozitivan broj koji je jednako djeljiv sa svim brojevima od 1 do 20 je: " + NZS);

		System.out.println("Dokaz: ");
		for (int k = 1; k <= 20; k++) {
			int rez = NZS / k;

			System.out.println("\t" + NZS + " / " + k + " = " + rez);
		}

	}
}