import java.awt.Color;
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

public class AudienceView extends JFrame {
	public AudienceView() throws IOException {
		
		// variables
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		int height = screenSize.height;
		int width = screenSize.width;
		
		
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
		JPanel Top = new JPanel();
		Top.setBackground(new Color(102, 204, 255));
		Top.setPreferredSize(new Dimension(width, height/6));
		getContentPane().add(Top, BorderLayout.NORTH);
		
		// top images
		
		
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
