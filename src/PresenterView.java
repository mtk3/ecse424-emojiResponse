import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;


public class PresenterView extends JFrame implements ActionListener{
	
	private static final long serialVersionUID = 1L;
	public int notificationCount; 
	// variables
	

	Random rand = new Random();
	
	Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	int height = screenSize.height;
	int width = screenSize.width;
	public JLabel bottomBar;
	String gender = "./images/emoji/person";
	String emotion = "/default/person";
	String skinToneNum = "0.png";
	String[] notifications= {"Sam just changed their emoji to Happy","Robin just changed their emoji to Confused","Jennifer just changed their emoji to Unhappy","Sam just changed their emoji to Unhappy","Tom just changed their emoji to Happy","Bob just changed their emoji to Confused"}; 
	Boolean notificationToggle = false;
	Boolean statsToggle = true;

	public PresenterView() throws IOException {
		
		// background setup
		this.setSize(screenSize);
		getContentPane().setBackground(Color.WHITE);
		
		// screenshare image
		BufferedImage myPicture = null;
	    try {
	    	 myPicture = ImageIO.read(new File("./images/background.jpg"));
	    } catch (IOException e) {
	        // TODO Auto-generated catch block
	        e.printStackTrace();
	    }
		
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
		
		
		//Stats Panel
		BufferedImage buffStats = ImageIO.read(new File("./images/statsPanel.png"));
		Image scaledStats = buffStats.getScaledInstance(width/8, height/4, Image.SCALE_SMOOTH);
		ImageIcon questionIcon = new ImageIcon(scaledStats);
		JLabel questionLabel = new JLabel(questionIcon);
		JPanel statsPanel = new JPanel();
		statsPanel.setBackground(Color.WHITE);
		statsPanel.add(questionLabel);
		statsPanel.setVisible(true);
		getContentPane().add(statsPanel, BorderLayout.EAST);
		
		
		// bottom panel
		//initialize pngs into buffer images
		BufferedImage bottomBarPresenter = ImageIO.read(new File("./images/bottomBarPresenter.png"));
		BufferedImage bottomBarHideBoth = ImageIO.read(new File("./images/bottomBarHideBoth.png"));
		BufferedImage bottomBarHideNotifications = ImageIO.read(new File("./images/bottomBarHideNotifications.png"));
		BufferedImage bottomBarHideStats = ImageIO.read(new File("./images/bottomBarHideStats.png"));
		
		//convert bufferImages to imageIcons
		ImageIcon presenterIcon = new ImageIcon(bottomBarPresenter);
		ImageIcon hideBothIcon = new ImageIcon(bottomBarHideBoth);
		ImageIcon hideNotificationsIcon = new ImageIcon(bottomBarHideNotifications);
		ImageIcon hideStatsIcon = new ImageIcon(bottomBarHideStats);
		
		JLabel bottomBar = new JLabel(hideNotificationsIcon);
		
		bottomBar.setPreferredSize(new Dimension(1920, 144));
		getContentPane().add(bottomBar, BorderLayout.SOUTH);
		
				
		bottomBar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int x=e.getX();
				if (x >= 2.3*width/11 && x <= 3.5*width/11) {
					// Toggle notification button
					if(notificationToggle == true &  statsToggle == true) {
						
						bottomBar.setIcon(hideNotificationsIcon);
						
						notificationToggle = false;
						
					} 
					else if (notificationToggle == false &  statsToggle == true) {
						
						bottomBar.setIcon(presenterIcon);
						notificationToggle = true;
						
						
					}
					else if (notificationToggle == true &  statsToggle == false) {
						
						bottomBar.setIcon(hideBothIcon);
						notificationToggle = false;
						
					}
					else{
						bottomBar.setIcon(hideStatsIcon);
						notificationToggle = true;
					}
					
				}
				if (x >= 3.55*width/11 && x <= 4.8*width/11) {
					//Toggle Stats button
					if(notificationToggle == true &  statsToggle == true) {
						
						bottomBar.setIcon(hideStatsIcon);
						statsPanel.setVisible(false);
						statsToggle = false;
						
					} 
					else if (notificationToggle == true &  statsToggle == false) {
						
						bottomBar.setIcon(presenterIcon);
						statsPanel.setVisible(true);
						statsToggle = true;
						
					}
					else if (notificationToggle == false &  statsToggle == true) {
						
						bottomBar.setIcon(hideBothIcon);
						statsPanel.setVisible(false);
						statsToggle = false;
						
					}
					else{
						bottomBar.setIcon(hideNotificationsIcon);
						statsPanel.setVisible(true);
						statsToggle = true;
					}
					
				}
			}
		});
		Timer timer = new Timer(1000, this);
        timer.setInitialDelay(5000);
        timer.start(); 
		
	}
	
	        public void actionPerformed(ActionEvent e) {
	        	int notificationDelay = 4;
	            if (notificationToggle) {

	                notificationCount +=1;

	                if (notificationCount > notificationDelay) {
	                	int random_integer = rand.nextInt(5);
	                	JOptionPane.showMessageDialog(getContentPane(),notifications[random_integer]);
	                    notificationCount = 0;
	                }
	            }
	        }
		 }