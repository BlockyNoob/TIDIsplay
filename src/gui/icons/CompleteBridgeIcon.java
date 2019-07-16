package gui.icons;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class CompleteBridgeIcon extends JLabel{

	private static final long serialVersionUID = -4438357777874230397L;
	private static ImageIcon image = new ImageIcon("./resources/icons/completeBridge.png");
	
	public CompleteBridgeIcon(int x, int y) {
		super(image);
		setBounds(x, y, 200, 200);
	}	
	
}
