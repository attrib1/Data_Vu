package lab9;

import java.util.Scanner;

public class InheritLab9 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		MathCalculator Mcal = new MathCalculator();
		int num1, num2;
		System.out.print("Enter number1 : ");
		num1 = scan.nextInt();
		System.out.print("Enter number2 : ");
		num2 = scan.nextInt();

		Mcal.add(num1, num2);
		System.out.println("Add  : " + Mcal.lastAnswer);
		Mcal.sub(num1, num2);
		System.out.println("Sub  : " + Mcal.lastAnswer);

		
		Mcal.mult(num1, num2);
		System.out.println("Mult  : " + Mcal.lastAnswer);
		Mcal.div(num1, num2);
		System.out.println("div : " + Mcal.lastAnswer);

	}

}// End main

class Calculator {

	public int lastAnswer;

	public int add(int num1, int num2) {
		lastAnswer = num1 + num2;
		return lastAnswer;

	}

	public int sub(int num1, int num2) {
		lastAnswer = num1 - num2;
		return lastAnswer;

	}

}// End Calculator

class MathCalculator extends Calculator {
	public int mult(int num1, int num2) {
		lastAnswer = num1 * num2;
		return lastAnswer;
	}

	public int div(int num1, int num2) {
		lastAnswer = num1 / num2;
		return lastAnswer;
	}

}// End MathCalculator
