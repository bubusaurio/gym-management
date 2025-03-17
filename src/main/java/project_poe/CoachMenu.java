package project_poe;

import java.awt.Color;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;


public class CoachMenu {

    ImageIcon coachIcon = new ImageIcon("./mancuernaIcon.png");
    ImageIcon sessionsIcon = new ImageIcon("./sessionsIcon.png");
    ImageIcon exitIcon = new ImageIcon("./exitIcon.png");
    ImageIcon memberIcon = new ImageIcon("./memberIcon.png");

    JFrame coachMenuFrame = new JFrame("Coach Menu");
    //MenuBar
    JMenuBar menuBar = new JMenuBar();

    //Menu
    JMenu memberMenu = new JMenu();
    JButton sessionButton = new JButton();
    JButton exitButton = new JButton();

    JLabel imgLabel = new JLabel();

    //MenuItems
    JMenuItem addUser =  new JMenuItem("Add");
    JMenuItem editUser = new JMenuItem("Edit");
    JMenuItem allUsers = new JMenuItem("All");
    JMenuItem delUser =  new JMenuItem("Delete");

    public CoachMenu(){
        coachMenuFrame.setJMenuBar(menuBar);

        imgLabel.setIcon(coachIcon);
        imgLabel.setBounds(70,50,150,150);

        memberMenu.setIcon(memberIcon);
        memberMenu.setBackground(Color.gray);
        memberMenu.setOpaque(true);

        sessionButton.setIcon(sessionsIcon);
        sessionButton.setBackground(Color.gray);

        exitButton.setIcon(exitIcon);
        exitButton.setBackground(Color.gray);
        
        try {
            coachMenuFrame.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("./darkredbg.jpg")))));
        } catch (IOException e) {
            e.printStackTrace();
        }
        coachMenuFrame.pack();

        //MenuBar
        menuBar.add(memberMenu);
        menuBar.add(sessionButton);
        menuBar.add(exitButton);

        //CoachMenu
        memberMenu.add(addUser);
        memberMenu.add(editUser);
        memberMenu.add(allUsers);
        memberMenu.add(delUser);
        coachMenuFrame.add(imgLabel);

        

        ImageIcon gymIcon = new ImageIcon("./GYMIcon.png");
        coachMenuFrame.setIconImage(gymIcon.getImage());

        coachMenuFrame.setLayout(null);
        coachMenuFrame.setTitle("Coach Menu"); 
        coachMenuFrame.setSize(320, 350); 
        coachMenuFrame.setResizable(false);
        coachMenuFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        coachMenuFrame.setVisible(false);
        coachMenuFrame.setLocationRelativeTo(null);

    }
}
