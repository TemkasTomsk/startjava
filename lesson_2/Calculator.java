public class Calculator {

	private int x;
	private int y;
	private char operation;

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void setOperation(char operation) {
		this.operation = operation;
	}

	public void calculate() {
		switch(operation) {
			case '+':
				System.out.println("Сумма чисел x + y = " + (x + y));
				break;
			case '-':
				System.out.println("Разность чисел x - y = " + (x - y));
				break;
			case '*':
				System.out.println("Умножение чисел x * y = " + (x * y));
				break;
			case '/':
				System.out.println("Деление чесел y / x = " + (y / x));
				break;
			case '%':
				System.out.println("Остаток от деления y % x = " + (y % x));
				break;
			case '^':
				int result = 1;
				for (int i = 1; i <= y; i++) {
					result *= x;
				}
				System.out.println("Возведение в степень x ^ y = " + result);
				break;
			default:
				System.out.println("Введите верный знак математической операции: '+', '-', '*', '/', '%', '^'");			
		}	
	}
}	

	// if(operation == '+') {
	// 	System.out.println("Сумма чисел x + y = " + (x + y));
	// } else if(operation == '-') {
	// 	System.out.println("Разность чисел x - y = " + (x - y));
	// } else if(operation == '*') {
	// 	System.out.println("Умножение чисел x * y = " + (x * y));
	// } else if(operation == '/') {
	// 	System.out.println("Деление чесел y / x = " + (y / x));
	// } else if(operation == '%') {
	// 	System.out.println("Остаток от деления y % x = " + (y % x));
	// } else if(operation == '^') {
	// 	int result = 1;
	// 	for (int i = 1; i <= y; i++) {
	// 		result *= x;
	// 	}				
	// 	System.out.println("Возведение в степень x ^ y = " + result);	 
	// }