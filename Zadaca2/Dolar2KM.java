package Zadaca2;

// importovati Scanner
import java.util.Scanner;

public class Dolar2KM {

	   public static void main(String[] args) {
		
	   // deklarisati varijable
	   double KM;
       int dolar;
       
       // napraviti novi Scanner
	   Scanner unos = new Scanner(System.in);
	   
	   // pitati korisnika da unese iznos u dolarima
	   System.out.print("Unesite iznos u dolarima: ");
	   dolar = unos.nextInt();
	 
	   // pretvoriti dolare u KM i ispisati rezultat korisniku
	   KM = dolar * 1.77;
	   System.out.print(dolar + " dolara iznosi " + KM + " KM ");
	 
	   // zatvoriti Scanner
	   unos.close();
	
    }
}