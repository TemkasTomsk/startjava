package com.startjava.lesson_2_3.wolf;

public class Wolf {
	
	private String gender;
	private String nickName;
	private int age;
	private String color;

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if(age > 8) {
			System.out.println("Не корректный возраст");
		} else {
		this.age = age;	
		}
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void go () {
		System.out.println("Волк умеет ходить!");
	}

	public void sit () {
		System.out.println("Волк умеет сидеть!");
	}

	public void run () {
		System.out.println("Волк умеет бегать!");
	}

	public void howl () {
		System.out.println("Волк умеет выть!");
	}

	public void hunt () {
		System.out.println("Волк умеет охотиться!");
	}
}



