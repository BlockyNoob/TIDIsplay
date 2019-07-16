package gui;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;

import gui.elements.CompleteAnchorIcon;
import gui.elements.CompleteBridgeIcon;
import gui.elements.CompleteCannonIcon;
import gui.elements.ScoreLabel;
import gui.elements.TeamNumber;

public class Display extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1461500059364328660L;

	private final int PANEL_WIDTH = 1920;
	private final int PANEL_HEIGHT = 1080;

	private final int BACKGROUND_LAYER = 100;
	private final int ICON_LAYER = 0;

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

		// red team numbers
		TeamNumber redTeam1 = new TeamNumber(9999, 530, 130);
		redTeam1.setVisible(true);
		p.add(redTeam1, 99);

		TeamNumber redTeam2 = new TeamNumber(9999, 530, 195);
		redTeam2.setVisible(true);
		p.add(redTeam2, 98);

		// blue team numbers
		TeamNumber blueTeam1 = new TeamNumber(9999, 1430, 130);
		blueTeam1.setVisible(true);
		p.add(blueTeam1, 97);

		TeamNumber blueTeam2 = new TeamNumber(9999, 1430, 195);
		blueTeam2.setVisible(true);
		p.add(blueTeam2, 96);

		// red score labels
		ScoreLabel redAllianceCargo = new ScoreLabel(10, 210, 440);
		redAllianceCargo.setVisible(true);
		p.add(redAllianceCargo, 95);

		ScoreLabel redCrates = new ScoreLabel(10, 210, 600);
		redCrates.setVisible(true);
		p.add(redCrates, 94);

		ScoreLabel redBarrels = new ScoreLabel(10, 490, 440);
		redBarrels.setVisible(true);
		p.add(redBarrels, 93);

		ScoreLabel redTreasures = new ScoreLabel(10, 490, 600);
		redTreasures.setVisible(true);
		p.add(redTreasures, 92);

		ScoreLabel redBoxes = new ScoreLabel(10, 780, 440);
		redBoxes.setVisible(true);
		p.add(redBoxes, 91);

		// red score labels
		ScoreLabel blueAllianceCargo = new ScoreLabel(10, 1160, 440);
		blueAllianceCargo.setVisible(true);
		p.add(blueAllianceCargo, 90);

		ScoreLabel blueCrates = new ScoreLabel(10, 1160, 600);
		blueCrates.setVisible(true);
		p.add(blueCrates, 89);

		ScoreLabel blueBarrels = new ScoreLabel(10, 1430, 440);
		blueBarrels.setVisible(true);
		p.add(blueBarrels, 88);

		ScoreLabel blueTreasures = new ScoreLabel(10, 1430, 600);
		blueTreasures.setVisible(true);
		p.add(blueTreasures, 87);

		ScoreLabel blueBoxes = new ScoreLabel(10, 1710, 440);
		blueBoxes.setVisible(true);
		p.add(blueBoxes, 86);

		// background icon
		ImageIcon background = new ImageIcon("./resources/backgroundFinal.png");
		JLabel backgroundImage = new JLabel(background);
		backgroundImage.setBounds(0, 0, 1920, 1080);
		p.add(backgroundImage, BACKGROUND_LAYER);

		// red anchors
		CompleteAnchorIcon redAnchorLeft = new CompleteAnchorIcon(82, 802);
		redAnchorLeft.setVisible(true);
		p.add(redAnchorLeft, ICON_LAYER);

		CompleteAnchorIcon redAnchorRight = new CompleteAnchorIcon(201, 802);
		redAnchorRight.setVisible(true);
		p.add(redAnchorRight, ICON_LAYER);

		// blue anchors
		CompleteAnchorIcon blueAnchorLeft = new CompleteAnchorIcon(1031, 802);
		blueAnchorLeft.setVisible(true);
		p.add(blueAnchorLeft, ICON_LAYER);

		CompleteAnchorIcon blueAnchorRight = new CompleteAnchorIcon(1149, 802);
		blueAnchorRight.setVisible(true);
		p.add(blueAnchorRight, ICON_LAYER);

		// red cannons
		CompleteCannonIcon redCannonLeft = new CompleteCannonIcon(360, 802);
		redCannonLeft.setVisible(true);
		p.add(redCannonLeft, ICON_LAYER);

		CompleteCannonIcon redCannonRight = new CompleteCannonIcon(477, 802);
		redCannonRight.setVisible(true);
		p.add(redCannonRight, ICON_LAYER);

		// blue cannons
		CompleteCannonIcon blueCannonLeft = new CompleteCannonIcon(1307, 802);
		blueCannonLeft.setVisible(true);
		p.add(blueCannonLeft, ICON_LAYER);

		CompleteCannonIcon blueCannonRight = new CompleteCannonIcon(1426, 802);
		blueCannonRight.setVisible(true);
		p.add(blueCannonRight, ICON_LAYER);

		// red bridge
		CompleteBridgeIcon redBridge = new CompleteBridgeIcon(715, 762);
		redBridge.setVisible(true);
		p.add(redBridge, ICON_LAYER);

		// blue bridge
		CompleteBridgeIcon blueBridge = new CompleteBridgeIcon(1663, 762);
		blueBridge.setVisible(true);
		p.add(blueBridge, ICON_LAYER);

		setVisible(true);
	}

}
