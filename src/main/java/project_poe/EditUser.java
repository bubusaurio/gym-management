package project_poe;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class EditUser extends JFrame {
    JFrame addUserFrame = new JFrame();


    //JLabel
    JLabel firstNameLabel = new JLabel("First Name:");
    JLabel lastNameLabel = new JLabel("Last Name:");
    JLabel userLabel = new JLabel("User:");
    JLabel passLabel = new JLabel("Password:");
    JLabel paidLabel = new JLabel("Active?");

    //JTextLabels
    JTextField firstNameField = new JTextField();
    JTextField lastNameField = new JTextField();
    JTextField userField = new JTextField();
    JTextField passField = new JTextField();

    //CheckBox
    JCheckBox paidCheckBox = new JCheckBox();

    //Buttons
    JButton addButton = new JButton("Edit");
    JButton Back = new JButton("Back");

    public EditUser(){
        firstNameLabel.setBounds(20,20,150,30);
        firstNameField.setBounds(20,50,150,30);
        lastNameLabel.setBounds(20,100,150,30);
        lastNameField.setBounds(20,130,150,30);
        userLabel.setBounds(20,180,150,30);
        userField.setBounds(20,210,150,30);
        passLabel.setBounds(20,240,150,30);
        passField.setBounds(20,270,150,30);
        paidLabel.setBounds(20,300,150,30);
        paidCheckBox.setBounds(20,330,150,30);

        addButton.setBounds(120,380,100,30);
        Back.setBounds(230,380,100,30);

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
        addUserFrame.add(paidLabel);
        addUserFrame.add(paidCheckBox);
        addUserFrame.add(addButton);
        addUserFrame.add(Back);

        ImageIcon gymIcon = new ImageIcon("./GYMIcon.png");
        addUserFrame.setIconImage(gymIcon.getImage());

        addUserFrame.setTitle("Edit User");
        addUserFrame.setSize(400,500);
        addUserFrame.setLayout(null);
        addUserFrame.setLocationRelativeTo(null);
        addUserFrame.setVisible(false);
        
    }
}