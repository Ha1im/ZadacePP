package Zadaca3;

// importovati Scanner
import java.util.Scanner;

public class PovrsinaKocke {
	
	   public static void main(String[] args) {
		 
	   // deklarisati varijable
	   double duzinaIvice;
	   double obim;
	   double povrsina;
	   
	   // napraviti novi Scanner
	   Scanner unos = new Scanner(System.in);
	   
	   // pitati korisnika da unese duzinu ivice kocke u cm
	   System.out.print("Unesite duzinu ivice kocke u cm: ");
	   duzinaIvice = unos.nextDouble();
	   
	   // zatvoriti Scanner
	   unos.close();
	   
	   // izracunati obim kocke i ispisati rezultat korisniku
	   obim = 12*duzinaIvice;
	   System.out.println("Obim kocke cija je ivica " + duzinaIvice + " cm iznosi: " + obim + " cm");
	   
	   // izracunati povrsinu i ispisati rezultat korisniku
	   povrsina = 6 * Math.pow(duzinaIvice, 2);
	   System.out.print("Povrsina kocke cija je ivica " + duzinaIvice + " cm iznosi: " + povrsina + " cm^2");
	   
	   }

}
