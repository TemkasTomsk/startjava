package com.startjava.lesson_4.game;

import java.util.Arrays;
import java.util.Scanner;

public class GuessNumber {
	Scanner scan = new Scanner(System.in);
	private Player firstPlayer, secondPlayer;
	private int uknownNumber;

	public GuessNumber(Player firstPlayer, Player secondPlayer) {
		this.firstPlayer = firstPlayer;
		this.secondPlayer = secondPlayer;
	}
		
	public void startGame() {
        int countFirst = 0, countSecond = 0, i = 0, j = 0;
//	    Arrays.fill(firstPlayer.setNumber(),0, countFirst, 0);
//	    Arrays.fill(secondPlayer.setNumber(),0, countSecond, 0);
		uknownNumber = (int) (Math.random() * 101);
		System.out.println("У вас 10 попыток!\nЗагадано число от 0 до 100. Начинайте угадывать.");

		do {
            System.out.println(firstPlayer.getName() + " введите число:");
            firstPlayer.setNum(scan.nextInt(), i);
            countFirst++;
            if (firstPlayer.getNum()[i] > uknownNumber) {
                System.out.println("Введенное вами число больше того, что загадал компьютер, введите снова: ");
            } else if (firstPlayer.getNum()[i] < uknownNumber) {
                System.out.println("Введенное вами число меньше того, что загадал компьютер, введите снова: ");
            } else {
                System.out.println("Игрок " + firstPlayer.getName() + " угадал число " + uknownNumber + " с " + countFirst + " попытки");
                break;
            }
            i++;
            if (countFirst == 10) {
                System.out.println("У " + firstPlayer.getName() + " закончились попытки!");
            }
			System.out.println(secondPlayer.getName() + " Введите число:");
            secondPlayer.setNum(scan.nextInt(), j);
			countSecond++;
			if (secondPlayer.getNum()[j] < uknownNumber) {
				System.out.println("Введенное вами число меньше того, что загадал компьютер, введите снова: ");
			} else if (secondPlayer.getNum()[j] > uknownNumber) {
				System.out.println("Введенное вами число больше того, что загадал компьютер, введите снова: ");
			} else {
				System.out.println("Игрок " + secondPlayer.getName() + " угадал число " + uknownNumber + " с " + countSecond + " попытки" );
				break;
			}
			j++;
			if (countSecond == 10) {
                System.out.println("У " + secondPlayer.getName() + " закончились попытки!");
            }
		} while (countFirst < 10 || countSecond < 10);

		System.out.println("Первый игрок ввел числа: " + Arrays.toString(Arrays.copyOf(firstPlayer.getNum(), countFirst)));
		System.out.println("Первый игрок ввел числа: " + Arrays.toString(Arrays.copyOf(firstPlayer.getNum(), 10)));
		System.out.println("Второй игрок ввел числа: " + Arrays.toString(Arrays.copyOf(secondPlayer.getNum(), countSecond)));
		System.out.println("Второй игрок ввел числа: " + Arrays.toString(Arrays.copyOf(secondPlayer.getNum(), 10)));
	}
}
