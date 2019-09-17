package com.startjava.lesson_4.game;

import java.util.Arrays;

public class Player {

    private String name;
    private int[] inputNumber = new int[10];

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setInputNumber(int index, int number) {
        this.inputNumber[index - 1] = number;
    }

    public int getNumber(int attempt) {
        return inputNumber[attempt -1];
    }

    public int[] getInputNumber(int attempt) {
        return Arrays.copyOf(inputNumber, attempt);
    }

    public void fillInputNumbers(int attempt) {
        Arrays.fill(inputNumber, 0, attempt - 1, 0);
    }
}