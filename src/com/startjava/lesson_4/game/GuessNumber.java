package com.startjava.lesson_4.game;

import java.util.Arrays;
import java.util.Scanner;

public class GuessNumber {

    Scanner scan = new Scanner(System.in);
    private Player firstPlayer, secondPlayer;
    private int uknownNumber;
    private int attempt;
    private boolean isWin;

    public GuessNumber(Player firstPlayer, Player secondPlayer) {
        this.firstPlayer = firstPlayer;
        this.secondPlayer = secondPlayer;
    }

    public void startGame() {
        initGame();
        while (attempt <= 10 && !isWin) {
            enterNumber(firstPlayer);
            compareNumber(firstPlayer);
            outLastAttempt(firstPlayer);
            if (!isWin) {
                enterNumber(secondPlayer);
                compareNumber(secondPlayer);
                outLastAttempt(secondPlayer);
            }
            attempt++;
        }
        if (!isWin) {
            attempt--;
            outInput();
            fillInputNumber();
        }
    }

    public void outLastAttempt(Player player) {
        if (attempt == 10 && !isWin) {
            System.out.println("У игрока " + player.getName() + " закончились попытки!");
        }
    }

    private void initGame() {
        uknownNumber = (int) (Math.random() * 101);
        attempt = 1;
        isWin = false;
        System.out.println("Number = " + uknownNumber);
    }

    private void enterNumber(Player player) {
        System.out.println(player.getName() + " введите число:");
        player.setInputNumbers(attempt, scan.nextInt());
    }
    
    private void compareNumber(Player player) {
        if (player.getInputNumbers(attempt) > uknownNumber) {
            System.out.println("Введенное вами число больше того, что загадал компьютер, введите снова: ");
        } else if (player.getInputNumbers(attempt) < uknownNumber) {
            System.out.println("Введенное вами число меньше того, что загадал компьютер, введите снова: ");
        } else {
            System.out.println("Игрок " + player.getName() + " угадал число " + uknownNumber + " с " + attempt + " попытки");
            isWin = true;
            completeGame(player);
        }
    }

    private void completeGame(Player player) {
        if (attempt <= 5 && player == firstPlayer) {
            System.out.println("Первый игрок ввел числа: " + Arrays.toString(Arrays.copyOf(firstPlayer.getCopyInputNumbers(attempt), attempt)));
            System.out.println("Второй игрок ввел числа: " + Arrays.toString(Arrays.copyOf(secondPlayer.getCopyInputNumbers(attempt), attempt - 1)));
        } else {
            outInput();
        }
        fillInputNumber();
    }

    public void outInput() {
        System.out.println("Первый игрок ввел числа: " + Arrays.toString(Arrays.copyOf(firstPlayer.getCopyInputNumbers(attempt), attempt)));
        System.out.println("Второй игрок ввел числа: " + Arrays.toString(Arrays.copyOf(secondPlayer.getCopyInputNumbers(attempt), attempt)));
    }

    public void fillInputNumber() {
        firstPlayer.fillInputNumbers(attempt);
        secondPlayer.fillInputNumbers(attempt);
    }
}
