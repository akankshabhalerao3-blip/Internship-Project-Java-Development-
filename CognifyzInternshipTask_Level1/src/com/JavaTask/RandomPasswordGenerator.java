package com.JavaTask;
	// Code for Random Password Generator

	import java.util.Random;
	import java.util.Scanner;

	public class RandomPasswordGenerator {
	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);
	        Random random = new Random();

	        System.out.print("Enter password length: ");
	        int length = sc.nextInt();

	        System.out.print("Include numbers? (y/n): ");
	        char numChoice = sc.next().charAt(0);

	        System.out.print("Include lowercase letters? (y/n): ");
	        char lowerChoice = sc.next().charAt(0);

	        System.out.print("Include uppercase letters? (y/n): ");
	        char upperChoice = sc.next().charAt(0);

	        System.out.print("Include special characters? (y/n): ");
	        char specialChoice = sc.next().charAt(0);

	        String characters = "";

	        if (numChoice == 'y' || numChoice == 'Y') {
	            characters += "0123456789";
	        }
	        if (lowerChoice == 'y' || lowerChoice == 'Y') {
	            characters += "abcdefghijklmnopqrstuvwxyz";
	        }
	        if (upperChoice == 'y' || upperChoice == 'Y') {
	            characters += "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	        }
	        if (specialChoice == 'y' || specialChoice == 'Y') {
	            characters += "!@#$%^&*()_+";
	        }

	        if (characters.isEmpty()) {
	            System.out.println("No character set selected. Password cannot be generated.");
	        } else {
	            String password = "";

	            for (int i = 0; i < length; i++) {
	                int index = random.nextInt(characters.length());
	                password += characters.charAt(index);
	            }

	            System.out.println("Generated Password: " + password);
	        }

	        sc.close();
	    }
	}


