package com.startjava.lesson_4.calc;

public class Calculator {

	private String expression = "2 * 2";

	public void setExpression(String expression) {
		this.expression = expression;
	}

	String[] parts = expression.split(" ");
	private String part1 = parts[0];
	private String part2 = parts[1];
	private String part3 = parts[2];

	private int x = Integer.parseInt(part1);
	private int y = Integer.parseInt(part3);
	private char operation = part2.charAt(0);

	public void calculate() {
//		for (int i = 0; i < parts.length; i++ ) {
//			System.out.println(parts[i]);
//		}
//		System.out.print("x = " + x);
//		System.out.print(" y = " + y);
//		System.out.println(" operation = " + operation);
//		System.out.println("выражение равно = " + expression);

		switch(operation) {
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
				System.out.println("Остаток от деления x % y = " + Math.IEEEremainder(x, y));
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