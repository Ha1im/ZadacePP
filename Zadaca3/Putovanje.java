package Zadaca3;

// importovati Scanner
import java.util.Scanner;

public class Putovanje {

	   public static void main(String[] args) {
	   
	   // deklarisati varijable
	   double duzina;
	   double potrosnja;
	   double cijenaGoriva;
	   double cijenaPutovanja;
	
	   // napraviti novi Scanner
	   Scanner unos = new Scanner(System.in);
	   
	   // pitati korisnika da unese duzinu puta u km
	   System.out.print("Unesite duzinu puta u kilometrima: ");
	   duzina = unos.nextDouble();
	   
	   // pitati korisnika da unese potrosnju auta
	   System.out.print("Unesite potrosnju auta (koliko kilometara moze preci sa litrom goriva): ");
	   potrosnja = unos.nextDouble();
	   
	   // pitati korisnika da unese cijenu litra goriva u KM
	   System.out.print("Unesite cijenu litre goriva u KM: ");
	   cijenaGoriva = unos.nextDouble();
	   
	   // zatvoriti Scanner
	   unos.close();
	   
	   // izracunati cijenu putovanja i ispisati rezultat korisniku
	   cijenaPutovanja = duzina / potrosnja * cijenaGoriva;
	   System.out.println("Ukupna cijena putovanja iznosi: " + cijenaPutovanja + " KM");
	   
	   }
	   
}
