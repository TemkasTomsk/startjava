public class GuessNumber {
	public static void main(String[] args) {
		int unknownNumber = 22;
		System.out.println("Загадано число от 0 до 100. Начинайте угадывать");
		int inputNumber = 25;
		while(true) {
			if(inputNumber == unknownNumber) {
				System.out.println("Число отгадано!");
				break;
			} else if(inputNumber > unknownNumber) {
				System.out.println("Введенное вами число больше того, что загадал компьютер");
				inputNumber--;
			} else {
				System.out.println("Введенное вами число меньше того, что загадал компьютер");
				inputNumber++;
			}	
		}
	}
}

// компьютер "загадывает" целое число от 0 до 100, которое вам необходимо угадать
//после каждой неудачной попытки выводите подсказки:
// System.out.println("Введенное вами число больше (меньше) того, что загадал компьютер")
// сли число угадано — System.out.println("Вы угадали!")
// игра продолжается до тех пор, пока число не будет угадано 
