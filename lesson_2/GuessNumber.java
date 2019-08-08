import java.lang.Math;
import java.util.Scanner;

public class GuessNumber {
	Scanner scan = new Scanner(System.in);	
		
	public void startGame() {
		System.out.println("Введите имя первого игрока: ");
		Player firstPlayer = new Player(scan.next());
		System.out.println("Введите имя второго игрока: ");
		Player secondPlayer = new Player(scan.next());
		int uknownNumber = (int) (Math.random() * 101);
		System.out.println("Загадано число от 0 до 100. Начинайте угадывать ");

		while (firstPlayer.getNumber() != uknownNumber && secondPlayer.getNumber() != uknownNumber ) {
			System.out.println(firstPlayer.getName() + " Введите число:");
			firstPlayer.setNumber(scan.nextInt());
			if (firstPlayer.getNumber() > uknownNumber) {
				System.out.println("Введенное вами число больше того, что загадал компьютер, введите снова: ");
			} else if (firstPlayer.getNumber() < uknownNumber) {
				System.out.println("Введенное вами число меньше того, что загадал компьютер, введите снова: ");
			} else {
				System.out.println(firstPlayer.getName() + " " + "Вы выиграли!");
				break;
			}
			System.out.println(secondPlayer.getName() + " Введите число:");
			secondPlayer.setNumber(scan.nextInt());
			if (secondPlayer.getNumber() < uknownNumber) {
				System.out.println("Введенное вами число меньше того, что загадал компьютер, введите снова: ");
			} else if (secondPlayer.getNumber() > uknownNumber) {
				System.out.println("Введенное вами число больше того, что загадал компьютер, введите снова: ");
			} else {
				System.out.println(firstPlayer.getName() + "Вы выиграли!");
				break;
			}
		}
	}
}
