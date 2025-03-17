package project_poe;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class MemberCoach extends JFrame{
    JFrame membercoachFrame = new JFrame();

    JLabel coachLabel = new JLabel("Coaches");
    JLabel coachSessionLabel = new JLabel("Sessions");

    ButtonGroup coachGroup = new ButtonGroup();

    JRadioButton coach1Button = new JRadioButton("Pedro Mercado");
    JRadioButton coach2Button = new JRadioButton("Joaquin Ledezma");
    JRadioButton coach3Button = new JRadioButton("Jonathan Medina");

    JButton checkButton = new JButton("Check Sessions");
    JButton Accept = new JButton("Accept");
    JButton Back = new JButton("Back");

    JTextArea showSessionArea = new JTextArea();
    JScrollPane showScrollPane = new JScrollPane(showSessionArea);

    public MemberCoach(){
        coachLabel.setBounds(20,20,50,30);
        coach1Button.setBounds(20,60,150,30);
        coach2Button.setBounds(170,60,150,30);
        coach3Button.setBounds(330,60,150,30);
        checkButton.setBounds(170,90,150,30);
        coachSessionLabel.setBounds(20,120,100,30);
        showScrollPane.setBounds(20,150,300,200);
        Accept.setBounds(80,360,80,50);
        Back.setBounds(170,360,80,50);

        try {
            membercoachFrame.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("./graybg.jpg")))));
        } catch (IOException e) {
            e.printStackTrace();
        }
        membercoachFrame.pack();

        coachGroup.add(coach1Button);
        coachGroup.add(coach2Button);
        coachGroup.add(coach3Button);

        membercoachFrame.add(coachLabel);
        membercoachFrame.add(coach1Button);
        membercoachFrame.add(coach2Button);
        membercoachFrame.add(coach3Button);
        membercoachFrame.add(checkButton);
        membercoachFrame.add(coachSessionLabel);
        membercoachFrame.add(Accept);
        membercoachFrame.add(Back);

        membercoachFrame.getContentPane().add(showScrollPane);

        ImageIcon gymIcon = new ImageIcon("./GYMIcon.png");
        membercoachFrame.setIconImage(gymIcon.getImage());

        membercoachFrame.setTitle("Coaches");
        membercoachFrame.setSize(500,500);
        membercoachFrame.setLayout(null);
        membercoachFrame.setLocationRelativeTo(null);
        membercoachFrame.setVisible(false);
    }
}
