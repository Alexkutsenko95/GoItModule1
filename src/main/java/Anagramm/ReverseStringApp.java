package Anagramm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReverseStringApp {

	public static void main(String[] args) {
		System.out.println("Enter String");
		Scanner sc = new Scanner(System.in);
		String inputString = sc.nextLine();
		sc.close();
		char[] arr = inputString.toCharArray();
		String tempWord ="";
		for (int charIndex = 0 ; charIndex < arr.length ; charIndex++){
			if(' '==arr[charIndex] ){
			String toOut = new StringBuffer(tempWord).reverse().toString();
			tempWord = "";
			System.out.print(toOut + " ");
				
			}else{
			tempWord = tempWord + arr[charIndex];
			}if(charIndex+1 == arr.length){
				String toOut = new StringBuffer(tempWord).reverse().toString();
				System.out.print(toOut + " ");
			}
			
		}
		
		
	}

	
	}

