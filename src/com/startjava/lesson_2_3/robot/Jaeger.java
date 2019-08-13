package com.startjava.lesson_2_3.robot;

public class Jaeger {

	private String modelName;
	private String mark;
	private String country;
	private float height;
	private float weight;
	private int speed;
	private int armor;

	public Jaeger(String modelName, String mark, String country, float height, float weight, int speed, int armor){
		this.modelName = modelName;
		this.mark = mark;
		this.country = country;
		this.height = height;
		this.weight = weight;
		this.speed = speed;
		this.armor = armor;
	}	

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public String getMark() {
		return mark;
	}
	public void setMark(String mark) {
		this.mark = mark;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getArmor() {
		return armor;
	}

	public void setArmor(int armor) {
		this.armor = armor;
	}

	public boolean drift() {
		System.out.println("Use drift");
		return true;
	}

	public void move() {
		System.out.println("Move jaeger");
	}

	public void scanKaiju() {
		System.out.println("Scaning kaiju");
	}

	public void useVortexCannon() {
		System.out.println("Use vortex tech");
	}
}