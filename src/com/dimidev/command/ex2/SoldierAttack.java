package com.dimidev.command.ex2;

public class SoldierAttack implements AttackCommand {
	private final Soldier soldier;

	public SoldierAttack(Soldier soldier) {
		super();
		this.soldier = soldier;
	}

	@Override
	public void fight() {
		soldier.takeRifle();
		soldier.shootRifle();
	}
}
