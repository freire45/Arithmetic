package br.com.erickfreire.arithmetic;

import java.util.Scanner;

public class Arithmetic {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int number1;
		int number2;
		
		System.out.println("Java program that calculates the four basic operations: ");
		System.out.print("Enter the first value: ");
		number1 = input.nextInt();
		
		System.out.print("Enter the second value: ");
		number2 = input.nextInt();
		
		System.out.printf("The sum of values: %d + %d = %d%n", number1, number2, number1 + number2);
		System.out.printf("The subtraction of values: %d - %d = %d%n", number1, number2, number1 - number2);
		System.out.printf("The division of values: %d / %d = %d%n", number1, number2, number1 / number2);
		System.out.printf("The multiplication of values: %d * %d = %d%n", number1, number2, number1 * number2);
	}

}
