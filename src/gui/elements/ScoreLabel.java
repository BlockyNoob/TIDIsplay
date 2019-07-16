package gui.elements;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;

public class ScoreLabel extends JLabel{

	private static final long serialVersionUID = 9166297863426974344L;
	private Font defaultFont = new Font("Eras Bold ITC", Font.PLAIN, 60);

	public ScoreLabel(int num, int x, int y) {
		super(Integer.toString(num));
		setBounds(x, y, 100, 60);
		setFont(defaultFont);
		setForeground(Color.BLACK);
		setVisible(true);
	}
	
}
