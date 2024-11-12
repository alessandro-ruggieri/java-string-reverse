package org.lessons.java.stringreverse;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		
		String stringaInvertita = "";
		Scanner scan = new Scanner(System.in);
		System.out.println("Inserisci una stringa");
		String stringa = scan.nextLine();
		int lunghezzaStringa = stringa.length();
		
		for (int i = lunghezzaStringa - 1; i >= 0; i--) {
			
			stringaInvertita = stringaInvertita + stringa.charAt(i);
			
		}
		
		System.out.println(stringaInvertita);
		
	}

}
