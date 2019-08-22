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
        firstPlayer.setCounts(countFirst);
        secondPlayer.setCounts(countSecond);
		uknownNumber = (int) (Math.random() * 101);
		System.out.println("У вас 10 попыток!\nЗагадано число от 0 до 100. Начинайте угадывать.");

        // Выводим массивы после рестарта (очистки)
        System.out.println("Первый игрок ввел числа: " + Arrays.toString(Arrays.copyOf(firstPlayer.getNum(), firstPlayer.getCounts()+1)));
        System.out.println("Первый игрок весь массив: " + Arrays.toString(Arrays.copyOf(firstPlayer.getNum(), 10)));
        System.out.println("Второй игрок ввел числа: " + Arrays.toString(Arrays.copyOf(secondPlayer.getNum(), secondPlayer.getCounts()+1)));
        System.out.println("Второй игрок весь массив: " + Arrays.toString(Arrays.copyOf(secondPlayer.getNum(), 10)));

		do {
            System.out.println(firstPlayer.getName() + " введите число:");
            firstPlayer.setNum(scan.nextInt(), i);
            firstPlayer.setCounts(countFirst++);
            if (firstPlayer.getNum()[i] > uknownNumber) {
                System.out.println("Введенное вами число больше того, что загадал компьютер, введите снова: ");
            } else if (firstPlayer.getNum()[i] < uknownNumber) {
                System.out.println("Введенное вами число меньше того, что загадал компьютер, введите снова: ");
            } else {
                System.out.println("Игрок " + firstPlayer.getName() + " угадал число " + uknownNumber + " с " + firstPlayer.getCounts() + " попытки");
                break;
            }
            i++;
            if (countFirst == 10) {
                System.out.println("У " + firstPlayer.getName() + " закончились попытки!");
            }
			System.out.println(secondPlayer.getName() + " Введите число:");
            secondPlayer.setNum(scan.nextInt(), j);
            secondPlayer.setCounts(countSecond++);
			if (secondPlayer.getNum()[j] < uknownNumber) {
				System.out.println("Введенное вами число меньше того, что загадал компьютер, введите снова: ");
			} else if (secondPlayer.getNum()[j] > uknownNumber) {
				System.out.println("Введенное вами число больше того, что загадал компьютер, введите снова: ");
			} else {
				System.out.println("Игрок " + secondPlayer.getName() + " угадал число " + uknownNumber + " с " + secondPlayer.getCounts() + " попытки" );
				break;
			}
			j++;
			if (countSecond == 10) {
                System.out.println("У " + secondPlayer.getName() + " закончились попытки!");
            }
		} while (countFirst < 10 || countSecond < 10);

        System.out.println("Первый игрок ввел числа: " + Arrays.toString(Arrays.copyOf(firstPlayer.getNum(), firstPlayer.getCounts()+1)));
        System.out.println("Первый игрок весь массив: " + Arrays.toString(Arrays.copyOf(firstPlayer.getNum(), 10)));
        System.out.println("Второй игрок ввел числа: " + Arrays.toString(Arrays.copyOf(secondPlayer.getNum(), secondPlayer.getCounts()+1)));
        System.out.println("Второй игрок весь массив: " + Arrays.toString(Arrays.copyOf(secondPlayer.getNum(), 10)));
	}
}
