package Zadaca1;

// importovati Scanner
import java.util.Scanner;

public class Celsius2Fahrenheit {
       
	   public static void main(String[]args){
		  
    	  // deklarisati varijable
		  double celsius;
		  double fahrenheit;
		  
		  // napraviti novi Scanner
		  Scanner unos = new Scanner(System.in);
		  
		  // pitati korisnika da unese temperaturu u C
		  System.out.print("Unesite temperaturu u C: ");
		  
		  // dodijeliti korisnikov unos varijable
		   celsius = unos.nextDouble();
		  
		  // pretvoriti celsius u fahrenheit
		  fahrenheit = (9.0/5) * celsius + 32;
		  
		  // ispisati korisniku rezultat
		  System.out.println(celsius + " Celsiusa je " + fahrenheit + " Fahrenheita.");
		  
		  // zatvoriti Scanner
		  unos.close();
	
	  }
}
