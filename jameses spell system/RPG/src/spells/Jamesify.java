package spells;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;

public class Jamesify extends Spell implements TargetsPlayer {

	public Jamesify() {
		super("Jamesify");
	}

	@Override
	public ActionListener getEventListener(Player player, JLabel mana) {
		return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	if (player.getIntel() < 100) {
            		player.Inteladd(10);
        			mana.setText("Intel " + player.getIntel());
        			System.out.println("Winning, Now you can study a accounting degree");
        		} if (player.getIntel() > 100) {
        			System.out.println("You'll never be like me, there's only one and only James! Suck it Mother");
        		}
            	else {
        			System.out.println("You're not smart enough retard");
        		}
            }
		};
	}


}