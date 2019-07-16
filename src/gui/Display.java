package gui;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;

import gui.icons.CompleteCannonIcon;

public class Display extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1461500059364328660L;

	private final int PANEL_WIDTH = 1920;
	private final int PANEL_HEIGHT = 1080;
	
	private final int BACKGROUND_LAYER = 1;
	private final int CONTENT_LAYER = 0;

	private JLayeredPane p;

	public Display() {

		setSize(PANEL_WIDTH, PANEL_HEIGHT);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Treasure Island Display");
		setUndecorated(true);
		setResizable(false);
		setFocusable(true);

		// create panel
		p = new JLayeredPane();
		p.setBounds(0, 0, PANEL_WIDTH, PANEL_HEIGHT);
		p.setLayout(null);
		add(p);

		// background icon
		ImageIcon background = new ImageIcon("./resources/backgroundFinal.png");
		JLabel backgroundImage = new JLabel(background);
		backgroundImage.setBounds(0, 0, 1920, 1080);
		p.add(backgroundImage, BACKGROUND_LAYER);

		//red cannons
		CompleteCannonIcon redCannonLeft = new CompleteCannonIcon(360, 802);
		redCannonLeft.setVisible(true);
		p.add(redCannonLeft, CONTENT_LAYER);
		
		
		
		
		
		setVisible(true);
	}

}
