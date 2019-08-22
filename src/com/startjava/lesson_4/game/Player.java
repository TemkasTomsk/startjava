package com.startjava.lesson_4.game;

import java.util.Arrays;

public class Player {

	private String name;
	private int[] num = new int[10];
	private int counts;

	public Player(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int[] getNum() {
		return num;
	}

	public void setNum(int number, int index) {
		this.num[index] = number;
	}

    public int getCounts() {
        return counts;
    }

    public void setCounts(int counts) {
        this.counts = counts;
    }

    public void fillInputNumbers() {
        Arrays.fill(num, 0, counts+1, 0 );
    }
}