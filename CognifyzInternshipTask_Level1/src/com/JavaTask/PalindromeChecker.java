package com.JavaTask;
//code for Palindrome checker
import java.util.Scanner;

public class PalindromeChecker {
public static void main(String[] args) {
	Scanner s= new Scanner(System.in);
	System.out.println("Enter a word or phrase for palindrome");
	String str = s.nextLine();
	str = str.toLowerCase().replaceAll("[^a-z0-9]", "");
	String reversed = new StringBuilder(str).reverse().toString();
	
	if(str.equals(reversed)) {
		System.out.println("given word is a palindrome ");
	}else {
		System.out.println("given word is not palindrome ");
	}
	s.close();
}
}
