package com.startjava.lesson_4.calc;

public class Calculator {
	private String expression;

	public Calculator(String expression) {
		this.expression = expression;
	}

	public void calculate() {
		String[] parts = expression.split(" ");

		int x = Integer.parseInt(parts[0]);
		int y = Integer.parseInt(parts[2]);

		switch(parts[1].charAt(0)) {
			case '+':
				System.out.println("Сумма чисел x + y = " + (x + y));
				break;
			case '-':
				System.out.println("Разность чисел x - y = " + Math.subtractExact(x, y));
				break;
			case '*':
				System.out.println("Умножение чисел x * y = " + Math.multiplyExact(x, y));
				break;
			case '/':
				System.out.println("Деление чесел y / x = " + (y / x));
				break;
			case '%':
				System.out.println("Остаток от деления x % y = " + (x % y));
				break;
			case '^':
				double result;
				result = Math.pow(x, y);
				System.out.println("Возведение в степень x ^ y = " + result);
				break;
			default:
				System.out.println("Введите верный знак математической операции: '+', '-', '*', '/', '%', '^'");			
		}	
	}
}