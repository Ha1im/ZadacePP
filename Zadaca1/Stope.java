package Zadaca1;

// importovati Scanner
import java.util.Scanner;

public class Stope {
      
	   public static void main(String[]args){
		  
    	  // deklarisati varijable
		  int stopa;
		  double metar;
		  
		  // napraviti novi Scanner
		  Scanner unos = new Scanner(System.in);
		  
		  // pitati korisnika da unese broj stopa
		  System.out.print("Unesite stope: ");
		  
		  // dodijeliti korisnikov unos varijable
		   stopa = unos.nextInt();
		  
		  // pretvoriti stope u metre
		   metar = stopa * 0.305;
		  
		  // ispisati korisniku rezultat
		  System.out.println(stopa + " stopa/e je " + metar + " metara.");
		  
		  // zatvoriti Scanner
		  unos.close();
       
       }
}
	