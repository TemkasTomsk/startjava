import java.util.Scanner;

public class CalculatorTest {	
	public static void main(String[] args) {			
		Calculator calculator = new Calculator();
		Scanner scan = new Scanner(System.in);
		String next;

		do {	
			System.out.println("Введите число x:");
			calculator.setX(scan.nextInt());

			System.out.println("Введите число y:");
			calculator.setY(scan.nextInt());

			System.out.println("Введите знак математического действия:");
			calculator.setOperation(scan.next().charAt(0));

			calculator.calculate();

			do {
				System.out.println("Хотите продолжить? [yes/no]: ");
				next = scan.next();
			} while (!next.equals ("yes") && !next.equals ("no"));
		} while (next.equals ("yes"));
	}	
}
