package gui.icons;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class CompleteAnchorIcon extends JLabel {
	
	public static final long serialVersionUID = 1102803509004623795L;
	private static ImageIcon image = new ImageIcon("./resources/icons/completeAnchor.png");

	public CompleteAnchorIcon(int x, int y) {
		super(image);
		setBounds(x, y, 120, 120);
	}

}
