package com.dimidev.command.ex2;

public class Farmer {
	private int speed;
	private int power;

	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int getPower() {
		return power;
	}
	public void setPower(int power) {
		this.power = power;
	}
	public void gettingDressed() {
		System.out.println("gettingDressed");
	}
	public void undress() {
		System.out.println("undress");
	}
	public void takeStick() {
		System.out.println("takeStick");
	}

	public void beatWithStick() {
		System.out.println("beatWithStick");
	}
}
