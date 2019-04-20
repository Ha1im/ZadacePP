package Bootcamp_Zadaca2;

public class BrojeviDjeljivi4 {

	public static void main(String[] args) {
		System.out.print("Brojeve u rangu od 1 do 1000 koji su djeljivi sa 4 a nisu sa 5 su: \n");

		for (int i = 1; i <= 1000; i++) {
			if (i % 4 == 0 && i % 5 != 0) {

				System.out.print(i + " ");
			}
		}

	}

}
