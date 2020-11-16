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
import javax.swing.SwingConstants;

public class AudienceView extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	// variables
	Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	int height = screenSize.height;
	int width = screenSize.width;
	
	String gender = "./images/emoji/person";
	String emotion = "/default/person";
	String skinToneNum = "0.png";
	
	Boolean emojiVis = false;
	Boolean questionVis = false;

	public AudienceView() throws IOException {
		
		
				
		
		// background setup
		this.setSize(screenSize);
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
		BufferedImage person1 = ImageIO.read(new File(gender + emotion + skinToneNum));
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
		BufferedImage person2 = ImageIO.read(new File("./images/emoji/man/default/person0.png"));
		Image scaledPerson2 = person2.getScaledInstance(width/9, height/7, Image.SCALE_SMOOTH);
		ImageIcon person2Icon = new ImageIcon(scaledPerson2);
		JLabel person2Label = new JLabel();
		person2Label.setIcon(person2Icon);
		person2Label.setText("John");
		person2Label.setHorizontalTextPosition(JLabel.CENTER);
		person2Label.setVerticalTextPosition(JLabel.BOTTOM);
		person2Label.setPreferredSize(new Dimension(width/8, height/6));
		Top.add(person2Label);
		
		BufferedImage person3 = ImageIO.read(new File("./images/emoji/person/default/person3.png"));
		Image scaledPerson3 = person3.getScaledInstance(width/9, height/7, Image.SCALE_SMOOTH);
		ImageIcon person3Icon = new ImageIcon(scaledPerson3);
		JLabel person3Label = new JLabel();
		person3Label.setIcon(person3Icon);
		person3Label.setText("Sam");
		person3Label.setHorizontalTextPosition(JLabel.CENTER);
		person3Label.setVerticalTextPosition(JLabel.BOTTOM);
		person3Label.setPreferredSize(new Dimension(width/8, height/6));
		Top.add(person3Label);
		
		BufferedImage person4 = ImageIO.read(new File("./images/emoji/woman/bored/bored1.png"));
		Image scaledPerson4 = person4.getScaledInstance(width/9, height/7, Image.SCALE_SMOOTH);
		ImageIcon person4Icon = new ImageIcon(scaledPerson4);
		JLabel person4Label = new JLabel();
		person4Label.setIcon(person4Icon);
		person4Label.setText("Robin");
		person4Label.setHorizontalTextPosition(JLabel.CENTER);
		person4Label.setVerticalTextPosition(JLabel.BOTTOM);
		person4Label.setPreferredSize(new Dimension(width/8, height/6));
		Top.add(person4Label);
		
		BufferedImage person5 = ImageIO.read(new File("./images/emoji/woman/question/question5.png"));
		Image scaledPerson5 = person5.getScaledInstance(width/9, height/7, Image.SCALE_SMOOTH);
		ImageIcon person5Icon = new ImageIcon(scaledPerson5);
		JLabel person5Label = new JLabel();
		person5Label.setIcon(person5Icon);
		person5Label.setText("Jennifer");
		person5Label.setHorizontalTextPosition(JLabel.CENTER);
		person5Label.setVerticalTextPosition(JLabel.BOTTOM);
		person5Label.setPreferredSize(new Dimension(width/8, height/6));
		Top.add(person5Label);
		
		BufferedImage person6 = ImageIO.read(new File("./images/emoji/woman/louder/louder1.png"));
		Image scaledPerson6 = person6.getScaledInstance(width/9, height/7, Image.SCALE_SMOOTH);
		ImageIcon person6Icon = new ImageIcon(scaledPerson6);
		JLabel person6Label = new JLabel();
		person6Label.setIcon(person6Icon);
		person6Label.setText("Samantha");
		person6Label.setHorizontalTextPosition(JLabel.CENTER);
		person6Label.setVerticalTextPosition(JLabel.BOTTOM);
		person6Label.setPreferredSize(new Dimension(width/8, height/6));
		Top.add(person6Label);
		
		BufferedImage person7 = ImageIO.read(new File("./images/emoji/man/stressed/stressed2.png"));
		Image scaledPerson7 = person7.getScaledInstance(width/9, height/7, Image.SCALE_SMOOTH);
		ImageIcon person7Icon = new ImageIcon(scaledPerson7);
		JLabel person7Label = new JLabel();
		person7Label.setIcon(person7Icon);
		person7Label.setText("Tom");
		person7Label.setHorizontalTextPosition(JLabel.CENTER);
		person7Label.setVerticalTextPosition(JLabel.BOTTOM);
		person7Label.setPreferredSize(new Dimension(width/8, height/6));
		Top.add(person7Label);
		
		BufferedImage person8 = ImageIO.read(new File("./images/emoji/man/confused/shrugging4.png"));
		Image scaledPerson8 = person8.getScaledInstance(width/9, height/7, Image.SCALE_SMOOTH);
		ImageIcon person8Icon = new ImageIcon(scaledPerson8);
		JLabel person8Label = new JLabel();
		person8Label.setIcon(person8Icon);
		person8Label.setText("Bob");
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
		emojiPane.setBackground(new Color(102, 204, 255, 255));
		emojiPane.setPreferredSize(new Dimension(width, height/6));
		Bottom.add(emojiPane);
		emojiPane.setLayout(new CardLayout(0, 0));
		CardLayout emojiPaneCardLayout = (CardLayout)emojiPane.getLayout();
		
		
		// gender selection pane
		JPanel genderPane = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
		genderPane.setBackground(new Color(102, 204, 255, 255));
		genderPane.setPreferredSize(new Dimension(width, height/6));
		emojiPane.add(genderPane, "genderPane");
		genderPane.setVisible(emojiVis);
		
		BufferedImage gender1 = ImageIO.read(new File("./images/emoji/person" + emotion + skinToneNum));
		Image scaledGender1 = gender1.getScaledInstance(width/9, height/7, Image.SCALE_SMOOTH);
		ImageIcon gender1Icon = new ImageIcon(scaledGender1);
		JLabel gender1Label = new JLabel();
		gender1Label.setIcon(gender1Icon);
		gender1Label.setHorizontalTextPosition(JLabel.CENTER);
		gender1Label.setVerticalTextPosition(JLabel.BOTTOM);
		gender1Label.setPreferredSize(new Dimension(width/9, height/6));
		gender1Label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				gender = "./images/emoji/person";
				((JLabel) Top.getComponent(0)).setIcon(updateUserIcon());
			}
		});
		genderPane.add(gender1Label);
		
		BufferedImage gender2 = ImageIO.read(new File("./images/emoji/man" + emotion + skinToneNum));
		Image scaledGender2 = gender2.getScaledInstance(width/9, height/7, Image.SCALE_SMOOTH);
		ImageIcon gender2Icon = new ImageIcon(scaledGender2);
		JLabel gender2Label = new JLabel();
		gender2Label.setIcon(gender2Icon);
		gender2Label.setHorizontalTextPosition(JLabel.CENTER);
		gender2Label.setVerticalTextPosition(JLabel.BOTTOM);
		gender2Label.setPreferredSize(new Dimension(width/9, height/6));
		gender2Label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				gender = "./images/emoji/man";
				((JLabel) Top.getComponent(0)).setIcon(updateUserIcon());
			}
		});
		genderPane.add(gender2Label);
		
		BufferedImage gender3 = ImageIO.read(new File("./images/emoji/woman" + emotion + skinToneNum));
		Image scaledGender3 = gender3.getScaledInstance(width/9, height/7, Image.SCALE_SMOOTH);
		ImageIcon gender3Icon = new ImageIcon(scaledGender3);
		JLabel gender3Label = new JLabel();
		gender3Label.setIcon(gender3Icon);
		gender3Label.setHorizontalTextPosition(JLabel.CENTER);
		gender3Label.setVerticalTextPosition(JLabel.BOTTOM);
		gender3Label.setPreferredSize(new Dimension(width/9, height/6));
		gender3Label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				gender = "./images/emoji/woman";
				((JLabel) Top.getComponent(0)).setIcon(updateUserIcon());
			}
		});
		genderPane.add(gender3Label);
		
		
		// skin tone selection pane
		JPanel skinTonePane = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
		skinTonePane.setBackground(new Color(102, 204, 255, 255));
		skinTonePane.setPreferredSize(new Dimension(width, height/6));
		emojiPane.add(skinTonePane, "skinTonePane");
		skinTonePane.setVisible(emojiVis);
		
		BufferedImage skinTone0 = ImageIO.read(new File(gender + emotion + "0.png"));
		Image scaledSkinTone0 = skinTone0.getScaledInstance(width/9, height/7, Image.SCALE_SMOOTH);
		ImageIcon skinTone0Icon = new ImageIcon(scaledSkinTone0);
		JLabel skinTone0Label = new JLabel();
		skinTone0Label.setIcon(skinTone0Icon);
		skinTone0Label.setHorizontalTextPosition(JLabel.CENTER);
		skinTone0Label.setVerticalTextPosition(JLabel.BOTTOM);
		skinTone0Label.setPreferredSize(new Dimension(width/9, height/6));
		skinTone0Label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				skinToneNum = "0.png";
				((JLabel) Top.getComponent(0)).setIcon(updateUserIcon());
			}
		});
		skinTonePane.add(skinTone0Label);
		
		BufferedImage skinTone1 = ImageIO.read(new File(gender + emotion + "1.png"));
		Image scaledSkinTone1 = skinTone1.getScaledInstance(width/9, height/7, Image.SCALE_SMOOTH);
		ImageIcon skinTone1Icon = new ImageIcon(scaledSkinTone1);
		JLabel skinTone1Label = new JLabel();
		skinTone1Label.setIcon(skinTone1Icon);
		skinTone1Label.setHorizontalTextPosition(JLabel.CENTER);
		skinTone1Label.setVerticalTextPosition(JLabel.BOTTOM);
		skinTone1Label.setPreferredSize(new Dimension(width/9, height/6));
		skinTone1Label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				skinToneNum = "1.png";
				((JLabel) Top.getComponent(0)).setIcon(updateUserIcon());
			}
		});
		skinTonePane.add(skinTone1Label);
		
		BufferedImage skinTone2 = ImageIO.read(new File(gender + emotion + "2.png"));
		Image scaledSkinTone2 = skinTone2.getScaledInstance(width/9, height/7, Image.SCALE_SMOOTH);
		ImageIcon skinTone2Icon = new ImageIcon(scaledSkinTone2);
		JLabel skinTone2Label = new JLabel();
		skinTone2Label.setIcon(skinTone2Icon);
		skinTone2Label.setHorizontalTextPosition(JLabel.CENTER);
		skinTone2Label.setVerticalTextPosition(JLabel.BOTTOM);
		skinTone2Label.setPreferredSize(new Dimension(width/9, height/6));
		skinTone2Label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				skinToneNum = "2.png";
				((JLabel) Top.getComponent(0)).setIcon(updateUserIcon());
			}
		});
		skinTonePane.add(skinTone2Label);
		
		BufferedImage skinTone3 = ImageIO.read(new File(gender + emotion + "3.png"));
		Image scaledSkinTone3 = skinTone3.getScaledInstance(width/9, height/7, Image.SCALE_SMOOTH);
		ImageIcon skinTone3Icon = new ImageIcon(scaledSkinTone3);
		JLabel skinTone3Label = new JLabel();
		skinTone3Label.setIcon(skinTone3Icon);
		skinTone3Label.setHorizontalTextPosition(JLabel.CENTER);
		skinTone3Label.setVerticalTextPosition(JLabel.BOTTOM);
		skinTone3Label.setPreferredSize(new Dimension(width/9, height/6));
		skinTone3Label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				skinToneNum = "3.png";
				((JLabel) Top.getComponent(0)).setIcon(updateUserIcon());
			}
		});
		skinTonePane.add(skinTone3Label);
		
		BufferedImage skinTone4 = ImageIO.read(new File(gender + emotion + "4.png"));
		Image scaledSkinTone4 = skinTone4.getScaledInstance(width/9, height/7, Image.SCALE_SMOOTH);
		ImageIcon skinTone4Icon = new ImageIcon(scaledSkinTone4);
		JLabel skinTone4Label = new JLabel();
		skinTone4Label.setIcon(skinTone4Icon);
		skinTone4Label.setHorizontalTextPosition(JLabel.CENTER);
		skinTone4Label.setVerticalTextPosition(JLabel.BOTTOM);
		skinTone4Label.setPreferredSize(new Dimension(width/9, height/6));
		skinTone4Label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				skinToneNum = "4.png";
				((JLabel) Top.getComponent(0)).setIcon(updateUserIcon());
			}
		});
		skinTonePane.add(skinTone4Label);
		
		BufferedImage skinTone5 = ImageIO.read(new File(gender + emotion + "5.png"));
		Image scaledSkinTone5 = skinTone5.getScaledInstance(width/9, height/7, Image.SCALE_SMOOTH);
		ImageIcon skinTone5Icon = new ImageIcon(scaledSkinTone5);
		JLabel skinTone5Label = new JLabel();
		skinTone5Label.setIcon(skinTone5Icon);
		skinTone5Label.setHorizontalTextPosition(JLabel.CENTER);
		skinTone5Label.setVerticalTextPosition(JLabel.BOTTOM);
		skinTone5Label.setPreferredSize(new Dimension(width/9, height/6));
		skinTone5Label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				skinToneNum = "5.png";
				((JLabel) Top.getComponent(0)).setIcon(updateUserIcon());
			}
		});
		skinTonePane.add(skinTone5Label);
				
		
		// emotion selection pane
		JPanel emotionPane = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
		emotionPane.setBackground(new Color(102, 204, 255, 255));
		emotionPane.setPreferredSize(new Dimension(width, height/6));
		emojiPane.add(emotionPane, "emotionPane");
		//emojiPane.moveToFront(emotionPane);
		emotionPane.setVisible(emojiVis);
		
		BufferedImage emotion1 = ImageIO.read(new File(gender + "/default/person" + skinToneNum));
		Image scaledEmotion1 = emotion1.getScaledInstance(width/9, height/7, Image.SCALE_SMOOTH);
		ImageIcon emotion1Icon = new ImageIcon(scaledEmotion1);
		JLabel emotion1Label = new JLabel();
		emotion1Label.setIcon(emotion1Icon);
		emotion1Label.setHorizontalTextPosition(JLabel.CENTER);
		emotion1Label.setVerticalTextPosition(JLabel.BOTTOM);
		emotion1Label.setPreferredSize(new Dimension(width/9, height/6));
		emotion1Label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				emotion = "/default/person";
				((JLabel) Top.getComponent(0)).setIcon(updateUserIcon());
			}
		});
		emotionPane.add(emotion1Label);
		
		BufferedImage emotion2 = ImageIO.read(new File(gender + "/confused/shrugging" + skinToneNum));
		Image scaledEmotion2 = emotion2.getScaledInstance(width/9, height/7, Image.SCALE_SMOOTH);
		ImageIcon emotion2Icon = new ImageIcon(scaledEmotion2);
		JLabel emotion2Label = new JLabel();
		emotion2Label.setIcon(emotion2Icon);
		emotion2Label.setHorizontalTextPosition(JLabel.CENTER);
		emotion2Label.setVerticalTextPosition(JLabel.BOTTOM);
		emotion2Label.setPreferredSize(new Dimension(width/9, height/6));
		emotion2Label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				emotion = "/confused/shrugging";
				((JLabel) Top.getComponent(0)).setIcon(updateUserIcon());
			}
		});
		emotionPane.add(emotion2Label);
		
		BufferedImage emotion3 = ImageIO.read(new File(gender + "/bored/bored" + skinToneNum));
		Image scaledEmotion3 = emotion3.getScaledInstance(width/9, height/7, Image.SCALE_SMOOTH);
		ImageIcon emotion3Icon = new ImageIcon(scaledEmotion3);
		JLabel emotion3Label = new JLabel();
		emotion3Label.setIcon(emotion3Icon);
		emotion3Label.setHorizontalTextPosition(JLabel.CENTER);
		emotion3Label.setVerticalTextPosition(JLabel.BOTTOM);
		emotion3Label.setPreferredSize(new Dimension(width/9, height/6));
		emotion3Label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				emotion = "/bored/bored";
				((JLabel) Top.getComponent(0)).setIcon(updateUserIcon());
			}
		});
		emotionPane.add(emotion3Label);
		
		BufferedImage emotion4 = ImageIO.read(new File(gender + "/question/question" + skinToneNum));
		Image scaledEmotion4 = emotion4.getScaledInstance(width/9, height/7, Image.SCALE_SMOOTH);
		ImageIcon emotion4Icon = new ImageIcon(scaledEmotion4);
		JLabel emotion4Label = new JLabel();
		emotion4Label.setIcon(emotion4Icon);
		emotion4Label.setHorizontalTextPosition(JLabel.CENTER);
		emotion4Label.setVerticalTextPosition(JLabel.BOTTOM);
		emotion4Label.setPreferredSize(new Dimension(width/9, height/6));
		emotion4Label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				emotion = "/question/question";
				((JLabel) Top.getComponent(0)).setIcon(updateUserIcon());
			}
		});
		emotionPane.add(emotion4Label);
		
		BufferedImage emotion5 = ImageIO.read(new File(gender + "/louder/louder" + skinToneNum));
		Image scaledEmotion5 = emotion5.getScaledInstance(width/9, height/7, Image.SCALE_SMOOTH);
		ImageIcon emotion5Icon = new ImageIcon(scaledEmotion5);
		JLabel emotion5Label = new JLabel();
		emotion5Label.setIcon(emotion5Icon);
		emotion5Label.setHorizontalTextPosition(JLabel.CENTER);
		emotion5Label.setVerticalTextPosition(JLabel.BOTTOM);
		emotion5Label.setPreferredSize(new Dimension(width/9, height/6));
		emotion5Label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				emotion = "/louder/louder";
				((JLabel) Top.getComponent(0)).setIcon(updateUserIcon());
			}
		});
		emotionPane.add(emotion5Label);
		
		BufferedImage emotion6 = ImageIO.read(new File(gender + "/stressed/stressed" + skinToneNum));
		Image scaledEmotion6 = emotion6.getScaledInstance(width/9, height/7, Image.SCALE_SMOOTH);
		ImageIcon emotion6Icon = new ImageIcon(scaledEmotion6);
		JLabel emotion6Label = new JLabel();
		emotion6Label.setIcon(emotion6Icon);
		emotion6Label.setHorizontalTextPosition(JLabel.CENTER);
		emotion6Label.setVerticalTextPosition(JLabel.BOTTOM);
		emotion6Label.setPreferredSize(new Dimension(width/9, height/6));
		emotion6Label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				emotion = "/stressed/stressed";
				((JLabel) Top.getComponent(0)).setIcon(updateUserIcon());
			}
		});
		emotionPane.add(emotion6Label);
		
		// cheating white pane
		JPanel whitePane = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
		whitePane.setBackground(new Color(255, 255, 255, 255));
		whitePane.setPreferredSize(new Dimension(width, height/6));
		emojiPane.add(whitePane, "whitePane");
		emojiPane.moveToFront(whitePane);
		whitePane.setVisible(!emojiVis);
		
		
		// emoji Selection Buttons
		JPanel emojiSelectionButtons = new JPanel();
		emojiSelectionButtons.setBackground(Color.WHITE);
		emojiSelectionButtons.setOpaque(false);
		emojiSelectionButtons.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		emojiSelectionButtons.setSize(width/12,height/12);
		emojiSelectionButtons.setLayout(new GridLayout(3, 1, 0, 0));
		emojiSelectionButtons.setVisible(emojiVis);
		getContentPane().add(emojiSelectionButtons, BorderLayout.WEST);
		
				
		JButton btnNewButton = new JButton("Emotion");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				emojiPaneCardLayout.show(emojiPane, "emotionPane");
			}
		});
		emojiSelectionButtons.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Skin Tone");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				emojiPaneCardLayout.show(emojiPane, "skinTonePane");
			}
		});
		emojiSelectionButtons.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Gender");
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				emojiPaneCardLayout.show(emojiPane, "genderPane");
			}
		});
		emojiSelectionButtons.add(btnNewButton_2);
		
		// Question Pending Notification
		BufferedImage buffQuestion = ImageIO.read(new File("./images/questionPending.png"));
		Image scaledQuestion = buffQuestion.getScaledInstance(width/10, height/6, Image.SCALE_SMOOTH);
		ImageIcon questionIcon = new ImageIcon(scaledQuestion);
		JLabel questionLabel = new JLabel(questionIcon);
		JPanel questionPendingPanel = new JPanel();
		questionPendingPanel.setBackground(Color.WHITE);
		questionPendingPanel.add(questionLabel);
		questionPendingPanel.setVisible(questionVis);
		getContentPane().add(questionPendingPanel, BorderLayout.EAST);
		
		// bottom toolbar
		BufferedImage bottomBar = ImageIO.read(new File("./images/bottomBar.png"));
		Image scaledBottom = bottomBar.getScaledInstance(width, height/10, Image.SCALE_SMOOTH);
		ImageIcon imageIcon = new ImageIcon(scaledBottom);
		BufferedImage bottomBarQuestion = ImageIO.read(new File("./images/bottomBarQuestion.png"));
		Image scaledBottomQuestion = bottomBarQuestion.getScaledInstance(width, height/10, Image.SCALE_SMOOTH);
		ImageIcon imageIconQuestion = new ImageIcon(scaledBottomQuestion);
		JLabel bottomBarLabel = new JLabel(imageIcon);
		bottomBarLabel.setVerticalAlignment(SwingConstants.BOTTOM);
		bottomBarLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int x=e.getX();
				if (x >= 2.5*width/11 && x <= 3*width/11) {
					// TODO: Toggle the emotion selection panes
					if(emojiVis) {
						emojiPaneCardLayout.show(emojiPane, "whitePane");
						btnNewButton.setVisible(false);
						btnNewButton_1.setVisible(false);
						btnNewButton_2.setVisible(false);
						emojiSelectionButtons.setVisible(false);
						
					} else {
						emojiPaneCardLayout.show(emojiPane, "genderPane");
						emojiPaneCardLayout.show(emojiPane, "skinTonePane");
						emojiPaneCardLayout.show(emojiPane, "emotionPane");
						btnNewButton.setVisible(true);
						btnNewButton_1.setVisible(true);
						btnNewButton_2.setVisible(true);
						emojiSelectionButtons.setVisible(true);
						
					}
					emojiVis = !emojiVis;
				}
				if (x >= 3.45*width/11 && x <= 4*width/11) {
					if(questionVis) {
						questionPendingPanel.setVisible(false);
						bottomBarLabel.setIcon(imageIcon);
					} else {
						questionPendingPanel.setVisible(true);
						bottomBarLabel.setIcon(imageIconQuestion);
					}
					questionVis = !questionVis;
				}
			}
		});
		//bottomBarLabel.setSize(200, 80);
		Bottom.add(bottomBarLabel);	
			
	}
	
	public ImageIcon updateUserIcon() {
		
		BufferedImage newBuffImage;
		try {
			newBuffImage = ImageIO.read(new File(gender + emotion + skinToneNum));
			Image scaledImage = newBuffImage.getScaledInstance(width/9, height/7, Image.SCALE_SMOOTH);
			ImageIcon newIcon = new ImageIcon(scaledImage);
			return newIcon;
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
				
	}
	
	
}
