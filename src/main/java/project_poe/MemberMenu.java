package project_poe;

import java.awt.Color;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;


public class MemberMenu extends JFrame{
    ImageIcon userIcon = new ImageIcon("./userIcon.png");
    ImageIcon statusIcon = new ImageIcon("./statusIcon.png");
    ImageIcon itemsIcon = new ImageIcon("./itemsIcon.png");
    ImageIcon coachIcon = new ImageIcon("./coachesIcon.png");
    ImageIcon exitIcon = new ImageIcon("./exitIcon.png");

    JFrame memberMenuFrame = new JFrame("Member Menu");
    //MenuBar
    JMenuBar menuBar = new JMenuBar();

    //Menu
    JButton statusButton = new JButton("");
    JButton itemButton = new JButton("");
    JButton coachButton = new JButton("");
    JButton exitButton = new JButton("");

    JLabel imgLabel = new JLabel();

    public MemberMenu(){
        memberMenuFrame.setJMenuBar(menuBar);

        imgLabel.setIcon(userIcon);
        imgLabel.setBounds(135,70,150,150);

        statusButton.setIcon(statusIcon);
        statusButton.setBackground(Color.gray);

        itemButton.setIcon(itemsIcon);
        itemButton.setBackground(Color.gray);

        coachButton.setIcon(coachIcon);
        coachButton.setBackground(Color.gray);

        exitButton.setIcon(exitIcon);
        exitButton.setBackground(Color.gray);

        //MenuBar
        menuBar.add(statusButton);
        menuBar.add(itemButton);
        menuBar.add(coachButton);
        menuBar.add(exitButton);
        

        ImageIcon gymIcon = new ImageIcon("./GYMIcon.png");
        memberMenuFrame.setIconImage(gymIcon.getImage());

        try {
            memberMenuFrame.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("./blackbg.jpg")))));
        } catch (IOException e) {
            e.printStackTrace();
        }
        memberMenuFrame.pack();

        memberMenuFrame.add(imgLabel);

        memberMenuFrame.setLayout(null);
        memberMenuFrame.setTitle("Member Menu"); 
        memberMenuFrame.setSize(450, 400); 
        memberMenuFrame.setResizable(false);
        memberMenuFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        memberMenuFrame.setVisible(false);
        memberMenuFrame.setLocationRelativeTo(null);

    }
}
