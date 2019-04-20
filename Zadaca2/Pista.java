package Zadaca2;

// importovati Scanner
import java.util.Scanner;

public class Pista {
       
	   public static void main(String[] args) {
	   
	   // deklarisati varijable   
 	   double duzina;
	   double v;
	   double a;
	   
	   // napraviti novi Scanner
	   Scanner unos = new Scanner(System.in);
	   
	   // pitati korisnika da unese brzinu i ubrzanje
	   System.out.print("Unesite brzinu i ubrzanje: ");
	   v = unos.nextDouble();
	   a = unos.nextDouble();
	 
	   // izracunati i ispisati duzinu piste korisniku
	   duzina = Math.pow(v, 2) / (2*a);
	   System.out.println("Minimalna duzina piste za ovaj avion iznosi: " + duzina + " m");
	   
	   // zatvoriti Scanner
	   unos.close();
	
	 }
}
