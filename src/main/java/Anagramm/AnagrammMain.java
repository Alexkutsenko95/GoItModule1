package Anagramm;

import java.util.Scanner;

public class AnagrammMain {

	public static void main(String[] args) {
		System.out.print("Enter string:");
		Scanner sc = new Scanner(System.in);		
		String inputString = sc.nextLine();
		sc.close();
		Anagramm anagramm = new Anagramm(inputString);
		anagramm.showString();
		anagramm.showAnagramm();

	}

}
