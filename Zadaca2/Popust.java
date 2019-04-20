package Zadaca2;

// importovati Scanner
import java.util.Scanner;

public class Popust {
	
	   public static void main(String[] args) {
		
	   // deklarisati varijable
	   double vrijednostrobe;
	   double procenat;
	   double popust;
	   double rezultat;
		
	   // napraviti novi Scanner
	   Scanner unos = new Scanner(System.in);
		
	   // pitati korisnika da unese vrijednost robe u KM
	   System.out.print("Unesite vrijednost robe u KM: ");
	   vrijednostrobe = unos.nextDouble();
		
	   // pitati korisnika da unese popust u procentima
	   System.out.print("Unesite popust na gotovinsko placanje u procentima: ");
	   procenat = unos.nextDouble();
		 
	   // izracunati vrijednost popusta i ispisati rezultat korisniku
	   rezultat = vrijednostrobe * procenat / 100;
       System.out.println("Vrijednst popusta je: " + rezultat);
        
       // izracunati vrijednost robe sa popustom i ispisati rezultat korisniku
       popust = vrijednostrobe - rezultat;
	   System.out.println("Vrijednost robe sa popustom je: " + popust);
		
	   // zatvoriti Scanner
	   unos.close();
		
	 }
}



