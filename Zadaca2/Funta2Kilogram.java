package Zadaca2;

// importovati Scanner
import java.util.Scanner;

public class Funta2Kilogram {

	   public static void main(String[] args) {
		   
	   // deklarisati varijable
	   double funta;
	   double kilogram;
	   
	   // napraviti novi Scanner 
	   Scanner unos = new Scanner(System.in);
	 
	   // pitati korisnika da unese vrijednost u funtama
	   System.out.print("Unesite vrijednost u funtama: ");
	   funta = unos.nextDouble();
	 
	   // pretvoriti funte u kilograme i ispisati rezultat korisniku
	   kilogram = funta * 0.454;
	   System.out.print(funta + " funti iznosi " + kilogram + " kilograma.");
	 
	 
	   // zatvoriti Scanner
	   unos.close();
	
     }
}