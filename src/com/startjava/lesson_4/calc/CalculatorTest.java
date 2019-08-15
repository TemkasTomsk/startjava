package com.startjava.lesson_4.calc;

import java.util.Scanner;

public class CalculatorTest {	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Calculator calculator = new Calculator();
		String next;

		do {
			System.out.println("Введите математическое выражение: ");
			calculator.setExpression(scan.nextLine());

			calculator.calculate();

			do {
				System.out.println("Хотите продолжить? [yes/no]: ");
				next = scan.next();
			} while (!next.equals("yes") && !next.equals("no"));
		} while (next.equals("yes"));
	}	
}
