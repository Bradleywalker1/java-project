package spells;

import spells.SpellBook;

public class Player implements Creature {
	
	private SpellBook spellBook;
	private int mana;
	private int health;
	private int Intel;
	
	public Player() {
		this.spellBook = new SpellBook();
		this.mana = 100;
		this.health = 100;
		this.Intel = 0;
		}
	
	public SpellBook getSpellBook() {
		return this.spellBook;
	}
	
	public int getMana() {
		return this.mana;
	}
	public int getHealth() {
		return this.health;
	}
	public int getIntel() {
		return this.Intel;
		}
	public void minusMana(int a) {
		this.mana -= a;
	}
	
	public void healthadd(int b) {
		this.health += 50;
	}
	
	public void Inteladd(int c) {
		this.Intel +=10;
	}
}