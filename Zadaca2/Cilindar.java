package Zadaca2;

// importovati Scanner
import java.util.Scanner;

public class Cilindar {

	   public static void main(String[] args) {
		   
		      // deklarisati varijable
		      double r;
		      double H;
		      double povrsina;
		      double zapremina;
		      
		      // napraviti novi Scanner
		      Scanner unos = new Scanner(System.in);
		       
		      // pitati korisnika da unese radius i visinu cilindra
 	          System.out.print("Unesite radius i visinu cilindra: ");
	          r = unos.nextDouble();
	          H = unos.nextDouble();
	          
	          // izracunati i ispisati povrsinu cilindra korisniku
	          povrsina = (2 * Math.pow(r, 2)* Math.PI) + (H * 2 * r * Math.PI);
	          System.out.println("Povrsina cilindra iznosi: " + povrsina);
	          
	          // izracunati i ispisati zapreminu cilindra korisniku
	          zapremina = Math.pow(r, 2)* Math.PI*H;
	          System.out.print("Zapremina cilindra iznosi: " + zapremina);
	          
	          // zatvoriti Scanner
	          unos.close();
	 
	 
	  }
}