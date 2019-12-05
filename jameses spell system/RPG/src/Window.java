import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import spells.Player;
import spells.Spell;
import spells.SpellBook;
import spells.Utilities;

public class Window extends JPanel {
	public JFrame frame;
	public Player player;
	public JLabel mana;
	public JLabel health;
	
	public Window(int width, int height) {
		if (!(width > 0 && width <= 1920) && !(height > 0 && height <= 1080)) throw new Error("No");
		this.player = new Player();
		this.frame = new JFrame("Player Actions");
		this.frame.setPreferredSize(new Dimension(width, height));
		this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.frame.setLocationRelativeTo(null);
		this.frame.pack();
		this.showSpells();	
		this.frame.setVisible(true);
		
		System.out.println(Utilities.pair(0, 2));
	}
	
	public void showSpells() {
		Box box = Box.createVerticalBox();
		mana = new JLabel("Mana: " + player.getMana());
	    mana.setFont(mana.getFont().deriveFont(20.0F));
	    mana.setForeground(Color.black);
	    box.add(mana);
	    
		this.player.getSpellBook().getSpells().forEach(spell -> {
			this.addLabel(spell, box);
		});
		
		this.frame.add(box);
		
		health = new JLabel("Health: " + player.getHealth());
		health.setFont(health.getFont().deriveFont(20.0F));
		health.setForeground(Color.black);
		box.add(health);
		
	}
	
	public void addLabel(Spell spell, Box box) {
		JButton label = new JButton(spell.name);
	    label.setFont(label.getFont().deriveFont(20.0F));
	    label.setForeground(Color.black);
	    label.addActionListener(spell.getEventListener(player, mana));
	    box.add(label);
	}
 

}
