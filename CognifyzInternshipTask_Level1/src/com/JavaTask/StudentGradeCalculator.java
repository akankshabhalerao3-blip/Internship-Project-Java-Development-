package com.JavaTask;
//code for Student Grade Calculator
import java.util.Scanner;

public class StudentGradeCalculator {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the number of grade ");
	int num = s.nextInt();
	double grade[] = new double[num];
	double sum=0;
	
	for(int i=0;i<grade.length;i++) {
		System.out.println("Enter grade ");
		grade[i] = s.nextDouble();
		sum= sum+grade[i];
	}
	System.out.println("sum of total grade : "+ sum);
	double avg = sum/num;
	System.out.printf("Average of %d grades : %.2f",num, avg);
s.close();
}

}
