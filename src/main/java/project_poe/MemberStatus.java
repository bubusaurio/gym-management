package project_poe;

import java.awt.Font;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;

public class MemberStatus extends JFrame{
    JFrame memberStatusFrame = new JFrame("Member Frame");

    //Labels
    JLabel fNLabel = new JLabel("First Name: "); 
    JLabel lNLabel = new JLabel("Last Name: ");
    JLabel pLabel = new JLabel("Active: ");
    JLabel cLabel = new JLabel("Coach: ");
    JLabel paymentLabel = new JLabel("Payment: ");

    //Button
    JButton Back = new JButton("Back");

    public MemberStatus(){
        this.fNLabel.setBounds(50,50,200,50);
        this.fNLabel.setFont(new Font("Arial", Font.PLAIN,15));
        this.lNLabel.setBounds(50,70,200,50);
        this.lNLabel.setFont(new Font("Arial", Font.PLAIN,15));
        this.cLabel.setBounds(50,90,200,50);
        this.cLabel.setFont(new Font("Arial", Font.PLAIN,15));
        this.pLabel.setBounds(50,110,200,50);
        this.pLabel.setFont(new Font("Arial", Font.PLAIN,15));
        this.paymentLabel.setBounds(50,130,200,50);
        this.paymentLabel.setFont(new Font("Arial", Font.PLAIN,15));

        this.Back.setBounds(150,270,70,30);
        this.Back.setFont(new Font("Arial", Font.PLAIN,15));

        try {
            memberStatusFrame.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("./graybg.jpg")))));
        } catch (IOException e) {
            e.printStackTrace();
        }
        memberStatusFrame.pack();

        memberStatusFrame.add(fNLabel);
        memberStatusFrame.add(lNLabel);
        memberStatusFrame.add(pLabel);
        memberStatusFrame.add(cLabel);
        memberStatusFrame.add(paymentLabel);
        memberStatusFrame.add(Back);

        ImageIcon gymIcon = new ImageIcon("./GYMIcon.png");
        memberStatusFrame.setIconImage(gymIcon.getImage());

        memberStatusFrame.setTitle("Status");
        memberStatusFrame.setSize(300,350);
        memberStatusFrame.setLayout(null);
        memberStatusFrame.setLocationRelativeTo(null);
        memberStatusFrame.setVisible(false);
    }
}
