package project_poe;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;

public class AllUsers extends JFrame{
        //Panel
        JFrame showFrame = new JFrame("Show Frame");

        //JTextArea
        JTextArea showTextArea = new JTextArea();
        JScrollPane showScrollPane = new JScrollPane(showTextArea);
        
        //Buttons
        JButton showFormButton = new JButton("Go Back");
    
        //Labels

    
        public AllUsers(){
            showScrollPane.setBounds(20,20,300,300);
    
            this.showFormButton.setBounds(20,350,100,20);

            try {
            showFrame.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("./darkredbg.jpg")))));
        } catch (IOException e) {
            e.printStackTrace();
        }
        showFrame.pack();
            
            showFrame.getContentPane().add(showScrollPane);
            showFrame.add(showFormButton);

            ImageIcon gymIcon = new ImageIcon("./GYMIcon.png");
            showFrame.setIconImage(gymIcon.getImage());
    
            showFrame.setSize(400,500);
            showFrame.setLayout(null);
            showFrame.setLocationRelativeTo(null);
            showFrame.setVisible(false);
        } 
}
