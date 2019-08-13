package com.startjava.lesson_1.calculator;

public class Calculator {
	public static void main(String[] args) {		
		int x = 2;
		int y = 1;
		char operation = '^' ;

		if(operation == '+') {
			System.out.println("Сумма чисел x + y = " + (x + y));
		} else if(operation == '-') {
			System.out.println("Разность чисел x - y = " + (x - y));
		} else if(operation == '*') {
			System.out.println("Умножение чисел x * y = " + (x * y));
		} else if(operation == '/') {
			System.out.println("Деление чесел y / x = " + (y / x));
		} else if(operation == '%') {
			System.out.println("Остаток от деления y % x = " + (y % x));
		} else if(operation == '^') {
			int result = 1;
			for (int i = 1; i <= y; i++) {
				result *= x;
			}				
			System.out.println("Возведение в степень x ^ y = " + result);	 
		}
	}
}