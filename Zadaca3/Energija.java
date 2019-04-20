package Zadaca3;

// importovati Scanner
import java.util.Scanner;

public class Energija {
	
	   public static void main(String[] args) {
		
	   // deklarisati varijable
	   double tezinaVode;
	   double pocetnaTemperatura;
	   double zeljenaTemperatura;
	   double energija;
	  
	   // napraviti novi Scanner
	   Scanner unos = new Scanner(System.in);
	   
	   // pitati korisnika da unese tezinu vode u kg
	   System.out.print("Unesite tezinu vode u kg: ");
	   tezinaVode = unos.nextDouble();
	   
	   // pitati korisnika da unese pocetnu temperaturu
	   System.out.print("Unesite pocetnu temperaturu: ");
	   pocetnaTemperatura = unos.nextDouble();
	   
	   // pitati korisnika da unese zeljenu temperaturu
	   System.out.print("Unesite zeljenu temperaturu: ");
	   zeljenaTemperatura = unos.nextDouble();
	   
	   // zatvoriti Scanner
	   unos.close();
	   
	   // izracunati energiju i ispisati rezultat korisniku
	   energija = tezinaVode * (zeljenaTemperatura-pocetnaTemperatura) * 4184;
	   System.out.println("Energije potrebno za zagrijavanje vode: " + energija + " joula.");
	   
	   }

}