package com.dimidev.command.ex2;

public class SniperAttack implements AttackCommand{
	private final Sniper sniper;

	public SniperAttack(Sniper sniper) {
		this.sniper = sniper;
	}

	@Override
	public void fight() {
		sniper.aim();
		sniper.shoot(); 	
	}
	
}
