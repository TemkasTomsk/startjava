public class Calculator {
	public static void main(String[] args) {

		//Реализуйте Калькулятор, который должен уметь выполнять математические операции
		// (+, -, *, /, ^, %) над целыми положительными числами:
 		// для проверки знака математической операции воспользуйтесь оператором if else
    	// выведите на экран результат работы калькулятора с помощью System.out.println()

		double x, y;
		char op;
		x = 2;
		y = -3;
		op = '^';

		if(op == '+') {
			System.out.println("Сумма чисел x + y = " + (x + y));
		} else if(op == '-') {
			System.out.println("Разность чисел x - y = " + (x - y));
		} else if(op == '*') {
			System.out.println("Умножение чисел x * y = " + (x * y));
		} else if(op == '/') {
			System.out.println("Деление чесел y / x = " + (y / x));
		} else if(op == '%') {
			System.out.println("Остаток от деления y % x = " + (y % x));
		} else if(op == '^') {

			double result = 1;
			if (y>0) {
				for (int i=1; i<=y; i++) {
					result = result*x;
				}				
			} else if (y==0) {
				result = 1;
			} else if (y<0) {
				for (int i=-1; i>=y; i--) {
					result = result*x;				
				}
				result = 1 / result;
			}	
			
			System.out.println("возведение в степень x ^ y = " + result);	 
		}
	}
}