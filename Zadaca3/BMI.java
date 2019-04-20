package Zadaca3;

// importovati Scanner
import java.util.Scanner;

public class BMI {
	
	   public static void main(String[] args) {
		   
	   // deklarisati varijable	   
	   double tezina;
	   double visina;
	   double BMI;
	   
	   // napraviti novi Scanner
	   Scanner unos = new Scanner(System.in);
	   
	   // pitati korisnika da unese svoju tezinu u kg
	   System.out.print("Unesite svoju tezinu u kg: ");
	   tezina = unos.nextDouble();
	   
	   // pitati korisnika da unese svoju visinu u metrima
	   System.out.print("Unesite svoju visinu u metrima: ");
	   visina = unos.nextDouble();
	   
	   // zatvoriti Scanner
	   unos.close();
	   
	   // izracunati BMI i ispisati rezultat korisniku
	   BMI = tezina / Math.pow(visina, 2);
	   System.out.println("Vas BMI iznosi: " + BMI);
	   
	   }

}
