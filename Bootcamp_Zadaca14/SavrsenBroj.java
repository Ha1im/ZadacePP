package Bootcamp_Zadaca14;

public class SavrsenBroj {

	public static boolean isSavrsenBroj(int broj) {

		int sum = 0;

		for (int i = 1; i <= (broj / 2); i++) {
			if (broj % i == 0)
				sum += i;
		}

		if (sum == broj)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {

		System.out.print("Savrseni brojevi od 0 do 10.000 su: ");

		for (int i = 1; i < 10000; i++) {

			if (isSavrsenBroj(i))
				System.out.print(i + " ");
		}
	}
}
