package gui.elements;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;

public class TeamNumber extends JLabel{
	
	private static final long serialVersionUID = -2707494266644131822L;
	private Font defaultFont = new Font("Eras Bold ITC", Font.PLAIN, 60);
	
	public TeamNumber(int num, int x, int y) {
		super(Integer.toString(num));
		setBounds(x, y, 200, 40);
		setFont(defaultFont);
		setForeground(Color.WHITE);
		setVisible(true);
	}

}
