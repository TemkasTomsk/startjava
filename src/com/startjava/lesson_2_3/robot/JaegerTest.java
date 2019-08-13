package com.startjava.lesson_2_3.robot;

public class JaegerTest {

	public static void main(String[] args) {
		Jaeger gispyDanger = new Jaeger("Gispy Danger", "Mark-6", "USA", 79.25f, 1.980f, 7, 6);

		System.out.println(gispyDanger.getModelName());
		System.out.println(gispyDanger.getMark());
		System.out.println(gispyDanger.getCountry());
		System.out.println(gispyDanger.getHeight());
		System.out.println(gispyDanger.getWeight());
		System.out.println(gispyDanger.getSpeed());
		System.out.println(gispyDanger.getArmor());

		gispyDanger.move();
		gispyDanger.drift();
		gispyDanger.scanKaiju();
		gispyDanger.useVortexCannon();
		System.out.println("");

		Jaeger chernoAlpha = new Jaeger("Cherno Alpha", "Mark-1", "RUSSIA", 85.34f, 2.412f, 3, 10);

		System.out.println(chernoAlpha.getModelName());
		System.out.println(chernoAlpha.getMark());
		System.out.println(chernoAlpha.getCountry());
		System.out.println(chernoAlpha.getHeight());
		System.out.println(chernoAlpha.getWeight());
		System.out.println(chernoAlpha.getSpeed());
		System.out.println(chernoAlpha.getArmor());

		chernoAlpha.move();
		chernoAlpha.drift();
		chernoAlpha.scanKaiju();
		chernoAlpha.useVortexCannon();
	}
}