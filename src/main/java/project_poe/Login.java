package project_poe;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class Login extends JFrame{
    ImageIcon gymIcon = new ImageIcon("./GYMIcon.png");
    //Attributes
    //Panel
    JFrame logFrame = new JFrame("Log Frame");

    //Buttons
    JButton logInButton = new JButton("Log In");
    JButton logCleanButton = new JButton("Clean");

    //Labels
    JLabel logUserLabel = new JLabel("User");
    JLabel logPassLabel = new JLabel("Password");
    JLabel imglabel = new JLabel();


    //Text Fields
    JTextField logUserField = new JTextField();
    JPasswordField logPassField = new JPasswordField();
    

    public Login(){
        this.logUserLabel.setBounds(20,20,100,20);
        this.logUserField.setBounds(20,40,100,20);
        this.logPassLabel.setBounds(20,70,100,20);
        this.logPassField.setBounds(20,90,100,20);
        this.logInButton.setBounds(20,150,80,20);
        this.logCleanButton.setBounds(120,150,80,20);
        imglabel.setBounds(180,20,100,100);
        imglabel.setIcon(gymIcon);

        try {
            logFrame.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("./graybg.jpg")))));
        } catch (IOException e) {
            e.printStackTrace();
        }
        logFrame.pack();

        logFrame.add(logUserLabel);
        logFrame.add(logUserField);
        logFrame.add(logPassLabel);
        logFrame.add(logPassField);
        logFrame.add(logInButton);
        logFrame.add(logCleanButton);
        logFrame.add(imglabel);

        logFrame.setIconImage(gymIcon.getImage());

        logFrame.setSize(350,300);
        logFrame.setLayout(null);
        logFrame.setLocationRelativeTo(null);
        logFrame.setVisible(true);

        
    }

    public void cleanText(){
        this.logUserField.setText("");
        this.logPassField.setText("");
    }
}
