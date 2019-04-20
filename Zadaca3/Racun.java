package Zadaca3;

// importovati Scanner
import java.util.Scanner;

public class Racun {
	
	   public static void main(String[] args) {
	  
	   // deklarisati varijable   
	   double iznos;
	   double procenat;
	   double napojnica;
	   double ukupanIznos;
	   
	   // napraviti novi Scanner
	   Scanner unos = new Scanner(System.in);
	   
	   // pitati korisnika da unese iznos racuna u KM
	   System.out.print("Unesite iznos racuna u KM: ");
	   iznos = unos.nextDouble();
	   
	   // pitati korisnika da unese napojnicu u procentima
	   System.out.print("Unesite napojnicu u procentima: ");
	   procenat = unos.nextDouble();
	   
	   // zatvoriti Scanner
	   unos.close();
	   
	   // izracunati iznos napojnice i ispisati rezultat korisniku
	   napojnica = iznos * procenat / 100;
	   System.out.println("Iznos napojnice: " + napojnica + " KM");
	   
	   // izracunati ukupan iznos racuna i ispisati rezultat korisniku
	   ukupanIznos = iznos + napojnica;
	   System.out.println("Ukupan iznos racuna: " + ukupanIznos + " KM");
	   
	   }

}

