package com.startjava.lesson_4.game;

import java.util.Arrays;
import java.util.Scanner;

public class GuessNumber {
	Scanner scan = new Scanner(System.in);
	private Player firstPlayer, secondPlayer;

	public GuessNumber(Player firstPlayer, Player secondPlayer) {
		this.firstPlayer = firstPlayer;
		this.secondPlayer = secondPlayer;
	}
		
	public void startGame() {
		int[] playerFirst = new int[10];
		int[] playerSecond = new int[10];
		int countFirst = 0, countSecond = 0, i = 0, j = 0;
		int uknownNumber = (int) (Math.random() * 101);
		System.out.println("У вас 10 попыток!\nЗагадано число от 0 до 100. Начинайте угадывать.");

		do {
			System.out.println(firstPlayer.getName() + " введите число:");
			playerFirst[i] = scan.nextInt();
			countFirst++;
			if (playerFirst[i] > uknownNumber) {
				System.out.println("Введенное вами число больше того, что загадал компьютер, введите снова: ");
			} else if (playerFirst[i] < uknownNumber) {
				System.out.println("Введенное вами число меньше того, что загадал компьютер, введите снова: ");
			} else {
				System.out.println("Игрок " + firstPlayer.getName() + " угадал число " + uknownNumber + " с " + countFirst + " попытки" );
				break;
			}
			i++;
			if (countFirst == 10)
				System.out.println("У " + firstPlayer.getName() + " закончились попытки!");

			System.out.println(secondPlayer.getName() + " Введите число:");
			playerSecond[j] = scan.nextInt();
			countSecond++;
			if (playerSecond[j] < uknownNumber) {
				System.out.println("Введенное вами число меньше того, что загадал компьютер, введите снова: ");
			} else if (playerSecond[j] > uknownNumber) {
				System.out.println("Введенное вами число больше того, что загадал компьютер, введите снова: ");
			} else {
				System.out.println("Игрок " + secondPlayer.getName() + " угадал число " + uknownNumber + " с " + countSecond + " попытки" );
				break;
			}
			j++;
			if (countSecond == 10)
				System.out.println("У " + secondPlayer.getName() + " закончились попытки!");

		} while (countFirst < 10 || countSecond < 10);

		System.out.println("Первый игрок ввел числа: " + Arrays.toString(Arrays.copyOf(playerFirst, countFirst)));
		System.out.println("Второй игрок ввел числа: " + Arrays.toString(Arrays.copyOf(playerSecond, countSecond)));
	}
}
