package spells;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;

public class Fireball extends Spell implements TargetsLocation {

	public Fireball() {
		super("Fireball");
	}

	@Override
	public ActionListener getEventListener(Player player, JLabel mana) {
		return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	if (player.getMana() >= 20) {
        			player.minusMana(20);
        			mana.setText("Mana: " + player.getMana());
        			System.out.println("fireball has been activated");
        		} else {
        			System.out.println("Your too poor");
        		}
            }
		};
	}

}
