package com.startjava.lesson_1.variable;

public class Variable {
	public static void main(String[] args) {
		byte cpuCores = 4;
		short cpuFrequency = 3000;
		int ssdDisk = 256000;
		long hardDisk = 1048576;
		float monitorDiagonal  = 23.5f;
		double tempCpu = 41.01;
		char firstLetterNameOwner = 'A';
		boolean isSoundOn = true;
		
		System.out.println("Колличество ядер процессора = " + cpuCores);
		System.out.println("Частота процессора = " + cpuFrequency + " MHz");
		System.out.println("Объем SSD диска = " + ssdDisk + " MB");
		System.out.println("Объем HDD диска = " + hardDisk + " MB");
		System.out.println("Диагональ монитора = " + monitorDiagonal + " inch");
		System.out.println("Температура процессора = " + tempCpu + "\u00b0C");
		System.out.println("Первая буква имени владельца = " + firstLetterNameOwner);
		System.out.println("Звук включен? " + isSoundOn);
	}
}
