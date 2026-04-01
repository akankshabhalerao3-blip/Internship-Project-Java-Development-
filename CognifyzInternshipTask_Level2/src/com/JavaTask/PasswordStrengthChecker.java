package com.JavaTask;

// code for  Password Strength Checker

import java.util.Scanner;

public class PasswordStrengthChecker {
 public static void main(String[] args) {

Scanner sc = new Scanner(System.in);
System.out.print("Enter a password to check its strength: ");
	  String password = sc.nextLine();

	    int strengthScore = 0;
  //check for length
	        if (password.length() >= 8) {
	            strengthScore++;
	        }
//check for lowerCase
	        if (password.matches(".*[a-z].*")) {
	            strengthScore++;
	        }
//check for upperCase
	        if (password.matches(".*[A-Z].*")) {
	            strengthScore++;
	        }
//check for digit
	        if (password.matches(".*[0-9].*")) {
	            strengthScore++;
	        }
//check for specialCharacter
	        if(password.matches(".*[!@#$%^&*()_+\\-\\=\\[\\]{};':\"\\\\|,.<>/?].*")) {
	            strengthScore++;
	        }

	   
	        System.out.println("Password Strength Report:");
	        switch (strengthScore) {
	            case 5:
	                System.out.println("Very Strong Password");
	                break;
	            case 4:
	                System.out.println("Strong Password");
	                break;
	            case 3:
	                System.out.println("Moderate Password");
	                break;
	            case 2:
	                System.out.println("Weak Password");
	                break;
	            default:
	                System.out.println("Very Weak Password");
	                break;
	        }

	        sc.close();
	    }
	}


