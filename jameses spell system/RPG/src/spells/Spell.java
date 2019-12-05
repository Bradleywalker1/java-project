package spells;

import java.awt.event.ActionListener;

import javax.swing.JLabel;

public abstract class Spell {
	public String name;
	
	public Spell(String n) {
		this.name = n;
	}
	
	public abstract ActionListener getEventListener(Player player, JLabel mana);
	
}
