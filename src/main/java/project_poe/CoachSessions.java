package project_poe;


import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.File;
import java.io.IOException;

public class CoachSessions extends JFrame{
    String schedule="";
    JFrame coachSessionsFrame = new JFrame();

    JLabel sessionsLabel = new JLabel("Sessions Available");

    //Checkbox
    JCheckBox checkBox1 = new JCheckBox("5:00-7:00");
    JCheckBox checkBox2 = new JCheckBox("7:00-9:00");
    JCheckBox checkBox3 = new JCheckBox("9:00-11:00");
    JCheckBox checkBox4 = new JCheckBox("11:00-13:00");
    JCheckBox checkBox5 = new JCheckBox("13:00-15:00");
    JCheckBox checkBox6 = new JCheckBox("15:00-18:00");
    JCheckBox checkBox7 = new JCheckBox("18:00-20:00");
    JCheckBox checkBox8 = new JCheckBox("20:00-22:00");

    //Buttons
    JButton Accept = new JButton("Accept");
    JButton Back = new JButton("Back");

    public CoachSessions(){
        sessionsLabel.setBounds(20,20,150,30);
        checkBox1.setBounds(20,50,150,30);
        checkBox2.setBounds(20,80,150,30);
        checkBox3.setBounds(20,110,150,30);
        checkBox4.setBounds(20,140,150,30);

        checkBox5.setBounds(200,50,150,30);
        checkBox6.setBounds(200,80,150,30);
        checkBox7.setBounds(200,110,150,30);
        checkBox8.setBounds(200,140,150,30);

        Accept.setBounds(100,180,100,30);
        Back.setBounds(200,180,100,30);

        checkBox1.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e){
                schedule = schedule + checkBox1.getText()+"\n";
            }
        });

        checkBox2.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e){
                schedule = schedule + checkBox2.getText()+"\n";
            }
        });

        checkBox3.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e){
                schedule = schedule + checkBox3.getText()+"\n";
            }
        });

        checkBox4.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e){
                schedule = schedule + checkBox4.getText()+"\n";
            }
        });

        checkBox5.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e){
                schedule = schedule + checkBox5.getText()+"\n";
            }
        });

        checkBox6.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e){
                schedule = schedule + checkBox6.getText()+"\n";
            }
        });

        checkBox7.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e){
                schedule = schedule + checkBox7.getText()+"\n";
            }
        });

        checkBox8.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e){
                schedule = schedule + checkBox8.getText()+"\n";
            }
        });

        try {
            coachSessionsFrame.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("./darkredbg.jpg")))));
        } catch (IOException e) {
            e.printStackTrace();
        }
        coachSessionsFrame.pack();

        coachSessionsFrame.add(sessionsLabel);
        coachSessionsFrame.add(checkBox1);
        coachSessionsFrame.add(checkBox2);
        coachSessionsFrame.add(checkBox3);
        coachSessionsFrame.add(checkBox4);
        coachSessionsFrame.add(checkBox5);
        coachSessionsFrame.add(checkBox6);
        coachSessionsFrame.add(checkBox7);
        coachSessionsFrame.add(checkBox8);
        coachSessionsFrame.add(Accept);
        coachSessionsFrame.add(Back);

        ImageIcon gymIcon = new ImageIcon("./GYMIcon.png");
        coachSessionsFrame.setIconImage(gymIcon.getImage());

        coachSessionsFrame.setTitle("Sessions");
        coachSessionsFrame.setSize(350,300);
        coachSessionsFrame.setLayout(null);
        coachSessionsFrame.setLocationRelativeTo(null);
        coachSessionsFrame.setVisible(false);
    }
    
}
