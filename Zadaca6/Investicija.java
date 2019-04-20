package Zadaca6;

import java.util.Scanner;

public class Investicija {
	public static void main(String[] args) {

		Scanner unos = new Scanner(System.in);

		System.out.println("Unesite iznos investicije: ");
		double iznosInvesticije = unos.nextDouble();

		System.out.println("Unesite godisnju interesnu stopu: ");
		double godisnjaInteresnaStopa = unos.nextDouble();

		System.out.println("Unesite broj godina: ");
		int brojGodina = unos.nextInt();

		
		double buducaVrijednostInvesticije = iznosInvesticije * Math.pow(1 + godisnjaInteresnaStopa, brojGodina);

		System.out.println("Buduca vrijednost investicije je: " + buducaVrijednostInvesticije);
	
		unos.close();
	
	}
	

}

