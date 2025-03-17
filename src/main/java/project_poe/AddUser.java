package project_poe;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class AddUser extends JFrame {
    JFrame addUserFrame = new JFrame();


    //JLabel
    JLabel firstNameLabel = new JLabel("First Name:");
    JLabel lastNameLabel = new JLabel("Last Name:");
    JLabel userLabel = new JLabel("User:");
    JLabel passLabel = new JLabel("Password:");

    //JTextLabels
    JTextField firstNameField = new JTextField();
    JTextField lastNameField = new JTextField();
    JTextField userField = new JTextField();
    JTextField passField = new JTextField();

    //Buttons
    JButton addButton = new JButton("Add");
    JButton Back = new JButton("Back");

    public AddUser(){
        firstNameLabel.setBounds(20,20,150,30);
        firstNameField.setBounds(20,50,150,30);
        lastNameLabel.setBounds(20,100,150,30);
        lastNameField.setBounds(20,130,150,30);
        userLabel.setBounds(20,180,150,30);
        userField.setBounds(20,210,150,30);
        passLabel.setBounds(20,240,150,30);
        passField.setBounds(20,270,150,30);

        addButton.setBounds(120,320,100,30);
        Back.setBounds(230,320,100,30);

        try {
            addUserFrame.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("./darkredbg.jpg")))));
        } catch (IOException e) {
            e.printStackTrace();
        }
        addUserFrame.pack();

        addUserFrame.add(firstNameLabel);
        addUserFrame.add(firstNameField);
        addUserFrame.add(lastNameLabel);
        addUserFrame.add(lastNameField);
        addUserFrame.add(userLabel);
        addUserFrame.add(userField);
        addUserFrame.add(passLabel);
        addUserFrame.add(passField);
        addUserFrame.add(addButton);
        addUserFrame.add(Back);
        
        ImageIcon gymIcon = new ImageIcon("./GYMIcon.png");
        addUserFrame.setIconImage(gymIcon.getImage());

        addUserFrame.setTitle("Add User");
        addUserFrame.setSize(350,400);
        addUserFrame.setLayout(null);
        addUserFrame.setLocationRelativeTo(null);
        addUserFrame.setVisible(false);

        
    }
}
