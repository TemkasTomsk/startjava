package com.startjava.lesson_1.cycle;

public class Cycle {
	public static void main(String[] args) {
		for(int i = 0; i <= 20; i++) {
			System.out.println(i);
		}

		int counter = 6;
		while(counter >= -6) {
			System.out.println(counter);
			counter -= 2;
		}

		counter = 10;
		int sum = 0;
		do {
			if(counter % 2 != 0) {
				sum += counter;
			}
			counter++;
		} while(counter < 20);
		System.out.println("Сумма нечетных чисел от [10,20] = " + sum);
	}
}