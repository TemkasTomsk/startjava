package com.startjava.lesson_4.game;

import java.util.Arrays;
import java.util.Scanner;

public class GuessNumber {

    Scanner scan = new Scanner(System.in);
    private Player firstPlayer, secondPlayer;
    private int uknownNumber;
    private int attempt;
    private boolean isWin;
    private String winPlayer;

    public GuessNumber(Player firstPlayer, Player secondPlayer) {
        this.firstPlayer = firstPlayer;
        this.secondPlayer = secondPlayer;
    }

    private void initGame() {
        uknownNumber = (int) (Math.random() * 100);
        attempt = 1;
        isWin = false;
        winPlayer = null;
    }

    private void enterNumberPlayer(Player player) {
        System.out.println(player.getName() + " введите число:");
        player.setInputNumber(attempt, scan.nextInt());
    }

    public void startGame() {
        initGame();
        while (attempt <= 10 && !isWin) {
            enterNumberPlayer(firstPlayer);
            comparison(firstPlayer);
            if (!isWin) {
                enterNumberPlayer(secondPlayer);
                comparison(secondPlayer);
            }
            attempt++;
        }
        if (!isWin) {
            attempt--;
            finishGame();
        }
    }

    private void comparison(Player player) {
        if (player.getNumber(attempt) > uknownNumber) {
            System.out.println("Введенное вами число больше того, что загадал компьютер, введите снова: ");
        } else if (player.getNumber(attempt) < uknownNumber) {
            System.out.println("Введенное вами число меньше того, что загадал компьютер, введите снова: ");
        } else {
            System.out.println("Игрок " + player.getName() + " угадал число " + uknownNumber + " с " + attempt + " попытки");
            isWin = true;
            winPlayer = player.getName();
            finishGame();
        }
        if (attempt == 10 && !isWin) {
            System.out.println("У игрока " + player.getName() + " закончились попытки!");
        }
    }

    private void finishGame() {
        if (attempt <= 10 && winPlayer == firstPlayer.getName()) {
            System.out.println("Первый игрок ввел числа: " + Arrays.toString(Arrays.copyOf(firstPlayer.getInputNumber(attempt), attempt)));
            System.out.println("Второй игрок ввел числа: " + Arrays.toString(Arrays.copyOf(secondPlayer.getInputNumber(attempt), attempt - 1)));
            if (attempt == 1) {
                firstPlayer.fillInputNumbers(attempt + 1);
            } else {
                firstPlayer.fillInputNumbers(attempt);
                secondPlayer.fillInputNumbers(attempt - 1);
            }
        } else {
            System.out.println("Первый игрок ввел числа: " + Arrays.toString(Arrays.copyOf(firstPlayer.getInputNumber(attempt), attempt)));
            System.out.println("Второй игрок ввел числа: " + Arrays.toString(Arrays.copyOf(secondPlayer.getInputNumber(attempt), attempt)));
            if (attempt == 1) {
                firstPlayer.fillInputNumbers(attempt + 1);
                secondPlayer.fillInputNumbers(attempt + 1);
            } else {
                firstPlayer.fillInputNumbers(attempt);
                secondPlayer.fillInputNumbers(attempt);
            }
        }
    }
}
