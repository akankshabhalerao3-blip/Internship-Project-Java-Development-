package com.JavaTask;

//Converts temperature between Celsius and Fahrenheit

import java.util.Scanner;

public class TemperatureConverter {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter The Temperature Value : ");
	double temp = s.nextDouble();
	System.out.println("Enter Unit (C or F) ");
	char unit = s.next().charAt(0);
	unit = Character.toUpperCase(unit);
	if(unit=='C') {
	double	F = (temp * 9/5) + 32;
	System.out.printf("%.2f Celsius = %.2f Fahrenheit\n", temp, F);
	}else if(unit=='F') {
	 double	C = (temp - 32) * 5/9;
	 System.out.printf("%.2f Fahrenheit = %.2f Celsius\n", temp, C);

	}else {
		System.out.println("Invalid input! Please enter C or F.");
	}
	s.close();
}
}
