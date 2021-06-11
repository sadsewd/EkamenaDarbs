package Eksamens;

import java.util.Scanner;

public class ViendimesijuMasTests {

	public static void tests() {
		
		
	}
	
	public static void main(String[] args) {
		Scanner dati = new Scanner(System.in);
		String pagString;
		char atbilde;
		
		System.out.println("Labdien! Šī programma testēs jūsu zināšanas par viendimensiju masīviem!");

		System.out.print("\nVai esat gatavs uzsākt testu (j - jā; n - nē): ");
		pagString = dati.next();
		atbilde = pagString.charAt(0);
		dati.close();
		
		switch(atbilde) {	
		case 'j' : tests(); break;
		case 'n' : break;
		default : System.out.println("Tika nepareizi ievadīta atbilde!");
			}
	}

}
