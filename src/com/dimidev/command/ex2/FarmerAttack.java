package com.dimidev.command.ex2;

public class FarmerAttack implements AttackCommand {
	private final Farmer farmer;
	
	public FarmerAttack(Farmer farmer) {
		super();
		this.farmer = farmer;
	}

	@Override
	public void fight() {
		farmer.gettingDressed();
		farmer.takeStick();
		farmer.beatWithStick();
	}

}
