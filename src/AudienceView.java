import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;

public class AudienceView extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public AudienceView() throws IOException {
		
		// variables
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		int height = screenSize.height;
		int width = screenSize.width;
		
		String gender = "/gender/person";
		String emoji = "/default";
		String imageName = "/person.png";
				
		
		// background setup
		this.setSize(screenSize);
		//this.setPreferredSize(new Dimension(1024, 768));
		//getContentPane().setPreferredSize(new Dimension(1024, 768));
		getContentPane().setBackground(Color.WHITE);
		
		// screenshare image
		BufferedImage myPicture = ImageIO.read(new File("./images/background.jpg"));
		JLabel picLabel = new JLabel(new ImageIcon(myPicture));
		getContentPane().add(picLabel);
		
		// top panel
		JPanel Top = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
		Top.setBackground(new Color(102, 204, 255));
		Top.setPreferredSize(new Dimension(width, height/6));
		Top.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		getContentPane().add(Top, BorderLayout.NORTH);
		
		// top images
		// User image
		BufferedImage person1 = ImageIO.read(new File("./images" + gender + emoji + imageName));
		Image scaledPerson1 = person1.getScaledInstance(width/9, height/7, Image.SCALE_SMOOTH);
		ImageIcon person1Icon = new ImageIcon(scaledPerson1);
		JLabel person1Label = new JLabel();
		person1Label.setIcon(person1Icon);
		person1Label.setText("User");
		person1Label.setHorizontalTextPosition(JLabel.CENTER);
		person1Label.setVerticalTextPosition(JLabel.BOTTOM);
		person1Label.setPreferredSize(new Dimension(width/8, height/6));
		Top.add(person1Label);
		
		// Classmate images
		BufferedImage person2 = ImageIO.read(new File("./images" + gender + emoji + imageName));
		Image scaledPerson2 = person2.getScaledInstance(width/9, height/7, Image.SCALE_SMOOTH);
		ImageIcon person2Icon = new ImageIcon(scaledPerson2);
		JLabel person2Label = new JLabel();
		person2Label.setIcon(person2Icon);
		person2Label.setText("User");
		person2Label.setHorizontalTextPosition(JLabel.CENTER);
		person2Label.setVerticalTextPosition(JLabel.BOTTOM);
		person2Label.setPreferredSize(new Dimension(width/8, height/6));
		Top.add(person2Label);
		
		BufferedImage person3 = ImageIO.read(new File("./images" + gender + emoji + imageName));
		Image scaledPerson3 = person3.getScaledInstance(width/9, height/7, Image.SCALE_SMOOTH);
		ImageIcon person3Icon = new ImageIcon(scaledPerson3);
		JLabel person3Label = new JLabel();
		person3Label.setIcon(person3Icon);
		person3Label.setText("User");
		person3Label.setHorizontalTextPosition(JLabel.CENTER);
		person3Label.setVerticalTextPosition(JLabel.BOTTOM);
		person3Label.setPreferredSize(new Dimension(width/8, height/6));
		Top.add(person3Label);
		
		BufferedImage person4 = ImageIO.read(new File("./images" + gender + emoji + imageName));
		Image scaledPerson4 = person4.getScaledInstance(width/9, height/7, Image.SCALE_SMOOTH);
		ImageIcon person4Icon = new ImageIcon(scaledPerson4);
		JLabel person4Label = new JLabel();
		person4Label.setIcon(person4Icon);
		person4Label.setText("User");
		person4Label.setHorizontalTextPosition(JLabel.CENTER);
		person4Label.setVerticalTextPosition(JLabel.BOTTOM);
		person4Label.setPreferredSize(new Dimension(width/8, height/6));
		Top.add(person4Label);
		
		BufferedImage person5 = ImageIO.read(new File("./images" + gender + emoji + imageName));
		Image scaledPerson5 = person5.getScaledInstance(width/9, height/7, Image.SCALE_SMOOTH);
		ImageIcon person5Icon = new ImageIcon(scaledPerson5);
		JLabel person5Label = new JLabel();
		person5Label.setIcon(person5Icon);
		person5Label.setText("User");
		person5Label.setHorizontalTextPosition(JLabel.CENTER);
		person5Label.setVerticalTextPosition(JLabel.BOTTOM);
		person5Label.setPreferredSize(new Dimension(width/8, height/6));
		Top.add(person5Label);
		
		BufferedImage person6 = ImageIO.read(new File("./images" + gender + emoji + imageName));
		Image scaledPerson6 = person6.getScaledInstance(width/9, height/7, Image.SCALE_SMOOTH);
		ImageIcon person6Icon = new ImageIcon(scaledPerson6);
		JLabel person6Label = new JLabel();
		person6Label.setIcon(person6Icon);
		person6Label.setText("User");
		person6Label.setHorizontalTextPosition(JLabel.CENTER);
		person6Label.setVerticalTextPosition(JLabel.BOTTOM);
		person6Label.setPreferredSize(new Dimension(width/8, height/6));
		Top.add(person6Label);
		
		BufferedImage person7 = ImageIO.read(new File("./images" + gender + emoji + imageName));
		Image scaledPerson7 = person7.getScaledInstance(width/9, height/7, Image.SCALE_SMOOTH);
		ImageIcon person7Icon = new ImageIcon(scaledPerson7);
		JLabel person7Label = new JLabel();
		person7Label.setIcon(person7Icon);
		person7Label.setText("User");
		person7Label.setHorizontalTextPosition(JLabel.CENTER);
		person7Label.setVerticalTextPosition(JLabel.BOTTOM);
		person7Label.setPreferredSize(new Dimension(width/8, height/6));
		Top.add(person7Label);
		
		BufferedImage person8 = ImageIO.read(new File("./images" + gender + emoji + imageName));
		Image scaledPerson8 = person8.getScaledInstance(width/9, height/7, Image.SCALE_SMOOTH);
		ImageIcon person8Icon = new ImageIcon(scaledPerson8);
		JLabel person8Label = new JLabel();
		person8Label.setIcon(person8Icon);
		person8Label.setText("User");
		person8Label.setHorizontalTextPosition(JLabel.CENTER);
		person8Label.setVerticalTextPosition(JLabel.BOTTOM);
		person8Label.setPreferredSize(new Dimension(width/9, height/6));
		Top.add(person8Label);
		
		
		
		// bottom panel
		JPanel Bottom = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
		Bottom.setBackground(new Color(0, 0, 0, 255));
		Bottom.setPreferredSize(new Dimension(width, height/10 + height/6));
		getContentPane().add(Bottom, BorderLayout.SOUTH);
		
		// emoji selection pane
		JLayeredPane emojiPane = new JLayeredPane();
		emojiPane.setOpaque(true);
		emojiPane.setBackground(new Color(102, 255, 0, 255));
		emojiPane.setPreferredSize(new Dimension(width, height/6));
		Bottom.add(emojiPane);	
		emojiPane.setLayout(new CardLayout(0, 0));
		
		
		// gender selection pane
		JPanel genderPane = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
		genderPane.setOpaque(true);
		genderPane.setBackground(new Color(255, 0, 255, 255));
		genderPane.setPreferredSize(new Dimension(width, height/6));
		emojiPane.add(genderPane, "name_114328545154100");
		emojiPane.moveToFront(genderPane);
		
		BufferedImage gender1 = ImageIO.read(new File("./images" + "/gender/person" + emoji + imageName));
		Image scaledGender1 = gender1.getScaledInstance(width/9, height/7, Image.SCALE_SMOOTH);
		ImageIcon gender1Icon = new ImageIcon(scaledGender1);
		JLabel gender1Label = new JLabel();
		gender1Label.setIcon(gender1Icon);
		gender1Label.setText("User");
		gender1Label.setHorizontalTextPosition(JLabel.CENTER);
		gender1Label.setVerticalTextPosition(JLabel.BOTTOM);
		gender1Label.setPreferredSize(new Dimension(width/9, height/6));
		genderPane.add(gender1Label);
		
		BufferedImage gender2 = ImageIO.read(new File("./images" + "/gender/man" + emoji + imageName));
		Image scaledGender2 = gender2.getScaledInstance(width/9, height/7, Image.SCALE_SMOOTH);
		ImageIcon gender2Icon = new ImageIcon(scaledGender2);
		JLabel gender2Label = new JLabel();
		gender2Label.setIcon(gender2Icon);
		gender2Label.setText("User");
		gender2Label.setHorizontalTextPosition(JLabel.CENTER);
		gender2Label.setVerticalTextPosition(JLabel.BOTTOM);
		gender2Label.setPreferredSize(new Dimension(width/9, height/6));
		genderPane.add(gender2Label);
		
		BufferedImage gender3 = ImageIO.read(new File("./images" + "/gender/woman" + emoji + imageName));
		Image scaledGender3 = gender3.getScaledInstance(width/9, height/7, Image.SCALE_SMOOTH);
		ImageIcon gender3Icon = new ImageIcon(scaledGender3);
		JLabel gender3Label = new JLabel();
		gender3Label.setIcon(gender3Icon);
		gender3Label.setText("User");
		gender3Label.setHorizontalTextPosition(JLabel.CENTER);
		gender3Label.setVerticalTextPosition(JLabel.BOTTOM);
		gender3Label.setPreferredSize(new Dimension(width/9, height/6));
		genderPane.add(gender3Label);
		
				
		
		// skin tone selection pane
		JPanel skinTonePane = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
		skinTonePane.setOpaque(true);
		skinTonePane.setBackground(new Color(0, 255, 255, 255));
		skinTonePane.setPreferredSize(new Dimension(width, height/6));
		emojiPane.add(skinTonePane, "name_114328557103100");
		emojiPane.moveToFront(skinTonePane);
		
		BufferedImage skinTone1 = ImageIO.read(new File("./images" + gender + emoji + imageName));
		Image scaledSkinTone1 = skinTone1.getScaledInstance(width/9, height/7, Image.SCALE_SMOOTH);
		ImageIcon skinTone1Icon = new ImageIcon(scaledSkinTone1);
		JLabel skinTone1Label = new JLabel();
		skinTone1Label.setIcon(skinTone1Icon);
		skinTone1Label.setText("User");
		skinTone1Label.setHorizontalTextPosition(JLabel.CENTER);
		skinTone1Label.setVerticalTextPosition(JLabel.BOTTOM);
		skinTone1Label.setPreferredSize(new Dimension(width/9, height/6));
		skinTonePane.add(skinTone1Label);
		
		
		// bottom toolbar
		BufferedImage bottomBar = ImageIO.read(new File("./images/bottomBar.png"));
		Image scaledBottom = bottomBar.getScaledInstance(width, height/10, Image.SCALE_SMOOTH);
		ImageIcon imageIcon = new ImageIcon(scaledBottom);
		JLabel bottomBarLabel = new JLabel(imageIcon);
		bottomBarLabel.setSize(200, 80);
		Bottom.add(bottomBarLabel);
		

		
		// emoji Selection Buttons
		JPanel emojiSelectionButtons = new JPanel();
		emojiSelectionButtons.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		emojiSelectionButtons.setSize(width/12,height/12);
		getContentPane().add(emojiSelectionButtons, BorderLayout.WEST);
		emojiSelectionButtons.setLayout(new GridLayout(3, 1, 0, 0));
				
		JButton btnNewButton = new JButton("Emoji");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//emojiPane.moveToFront(emotionPane);
				getContentPane().repaint();
			}
		});
		emojiSelectionButtons.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Skin Tone");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				emojiPane.moveToFront(skinTonePane);
				genderPane.setVisible(false);
				skinTonePane.setVisible(true);
				Bottom.repaint();
				emojiPane.repaint();
			}
		});
		emojiSelectionButtons.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Gender");
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				emojiPane.moveToFront(genderPane);
				skinTonePane.setVisible(false);
				genderPane.setVisible(true);
				Bottom.repaint();
				emojiPane.repaint();
			}
		});
		emojiSelectionButtons.add(btnNewButton_2);
		
		
		
		// gender selection pane
		/*JLayeredPane genderPane = new JLayeredPane();
		genderPane.setBackground(new Color(102, 255, 0));
		genderPane.setPreferredSize(new Dimension(width, height/10));
		getContentPane().add(genderPane);*/
		
		// skin tone selection
		
		// emoji selection
		
		
		
		
		
	}
	
}
