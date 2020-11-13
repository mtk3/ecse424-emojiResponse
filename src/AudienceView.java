import java.awt.Color;
import java.awt.Component;
import java.awt.ComponentOrientation;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Time;
import java.text.ParseException;

import javax.imageio.ImageIO;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.SwingConstants;

public class AudienceView extends JFrame {
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
		JPanel Bottom = new JPanel();
		Bottom.setBackground(new Color(0, 0, 0));
		Bottom.setPreferredSize(new Dimension(width, height/10));
		getContentPane().add(Bottom, BorderLayout.SOUTH);
		
		// bottom toolbar
		BufferedImage bottomBar = ImageIO.read(new File("./images/bottomBar.png"));
		Image scaledBottom = bottomBar.getScaledInstance(width, height/10, Image.SCALE_SMOOTH);
		ImageIcon imageIcon = new ImageIcon(scaledBottom);
		JLabel bottomBarLabel = new JLabel(imageIcon);
		bottomBarLabel.setSize(200, 80);
		Bottom.add(bottomBarLabel);
		
		
	}
	
		
}
