package spells;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;

public class Healing extends Spell implements Creature {

	public Healing() {
		super("Healing");
	}

	@Override
	public ActionListener getEventListener(Player player, JLabel mana) {
		return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	if (player.getHealth() < 100) {
        			player.healthadd(50);
        			mana.setText("Health " + player.getHealth());
        			System.out.println("+50 health has been added");
        		} else {
        			System.out.println("Looks like your gonna die");
        		}
            }
		};
	}


}
