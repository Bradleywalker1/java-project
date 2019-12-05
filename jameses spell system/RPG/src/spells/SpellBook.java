package spells;

import java.util.ArrayList;

public class SpellBook {
	
	private ArrayList<Spell> spells;
	
	public SpellBook() {
		this.spells = new ArrayList<Spell>();
		//-----------------------------------
		this.addSpell(new Fireball());
		this.addSpell(new Healing());
		this.addSpell(new Repair());
		this.addSpell(new Jamesify());
	}
	
	public void addSpell(Spell spell) {
		this.spells.add(spell);
	}
	
	public ArrayList<Spell> getSpells() {
		return spells;
	}

}
