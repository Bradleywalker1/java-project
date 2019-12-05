package spells;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;

public class Repair extends Spell implements TargetsItems {

	public Repair() {
		super("Repair");
	}

	@Override
	public ActionListener getEventListener(Player player, JLabel mana) {
		return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	if (player.getMana() >= 10) {
        			player.minusMana(10);
        			mana.setText("Mana: " + player.getMana());
        			System.out.println("All items have been repaired");
        		} else {
        			System.out.println("Your too poor");
        		}
            }
		};
	}

}
