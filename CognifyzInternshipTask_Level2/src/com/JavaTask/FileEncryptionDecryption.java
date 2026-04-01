package com.JavaTask;
//code for File Encryption and Decryption
import java.io.*;
import java.util.Scanner;

public class FileEncryptionDecryption {

 public static void main(String[] args) {

Scanner sc = new Scanner(System.in);

System.out.print("Enter file path (with extension): ");
String filePath = sc.nextLine();

System.out.print("Do you want to Encrypt or Decrypt? (E/D): ");
  char choice = sc.next().charAt(0);
	 choice = Character.toUpperCase(choice);

System.out.print("Enter key (number): ");
 int key = sc.nextInt();  // simple shift key

	File inputFile = new File(filePath);

	if(!inputFile.exists()) {
	  System.out.println("File does not exist!");
	     sc.close();
	      return;
	      }

  String outputFilePath;
	 if(choice == 'E') {
  outputFilePath = "encrypted_" + inputFile.getName();
 } else if (choice == 'D') {
    outputFilePath = "decrypted_" + inputFile.getName();
	} else {
   System.out.println("Invalid choice!");
	 sc.close();
	    return;
	  	}

	  try {
  BufferedReader reader = new BufferedReader(new FileReader(inputFile));
	     BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath));

	      String line;
	        while ((line = reader.readLine()) != null) {
	           String resultLine = "";
	           for (char ch : line.toCharArray()) {
	               if(choice == 'E') {
	                 resultLine += (char)(ch + key);  
	                 } else {
	               resultLine += (char)(ch - key); 
	     }
	       }
	       writer.write(resultLine);
	         writer.newLine();
	     }

	     reader.close();
	    writer.close();

	     System.out.println("Operation completed. Result saved in: " + outputFilePath);

	    } catch (IOException e) {
	      System.out.println("An error occurred: " + e.getMessage());
	      }

	    sc.close();
	 }
	

}
