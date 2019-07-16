package gui.elements;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class CompleteCannonIcon extends JLabel{

	private static final long serialVersionUID = -3168587402330556947L;
	
	public CompleteCannonIcon(int x, int y) {
		super(new ImageIcon("./resources/completeCannon.png"));
		setBounds(x, y, 120, 120);
	}
}
