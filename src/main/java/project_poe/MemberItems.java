package project_poe;

import java.awt.Color;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;

public class MemberItems extends JFrame {
    int total;
    boolean state1=false;
    boolean state2=false;
    boolean state3=false;

    JFrame memberItemsFrame = new JFrame();

    //Items
    JLabel itemsLabel = new JLabel("Items: ",SwingConstants.CENTER);
    JLabel proteinPricelabel = new JLabel("+2000");
    JLabel creatinePricelabel = new JLabel("+3000");
    JLabel prePricelabel = new JLabel("+1000");
    JLabel totalLabel = new  JLabel("Total: ");
    
    JCheckBox proteinCheckBox = new JCheckBox("Protein");
    JCheckBox creatineCheckBox = new JCheckBox("Creatine");
    JCheckBox preCheckBox = new JCheckBox("PreWorkout");

    //Button
    JButton Accept = new JButton("Accept");
    JButton Back = new JButton("Back");

    public MemberItems(){
        this.itemsLabel.setBounds(20,20,100,50);

        this.proteinCheckBox.setBounds(50, 50, 150,50);
        this. proteinPricelabel.setBounds(200,60,50,30);
        this.proteinPricelabel.setVisible(false);
        this.proteinPricelabel.setForeground(Color.GREEN);
        this.proteinPricelabel.setOpaque(true);

        this.creatineCheckBox.setBounds(50, 100, 150,50);
        this.creatinePricelabel.setBounds(200,110,50,30);
        this.creatinePricelabel.setVisible(false);
        this.creatinePricelabel.setForeground(Color.GREEN);
        this.creatinePricelabel.setOpaque(true);

        this.preCheckBox.setBounds(50, 150, 150,50);
        this.prePricelabel.setBounds(200,160,50,30);
        this.prePricelabel.setVisible(false);
        this.prePricelabel.setForeground(Color.GREEN);
        this.prePricelabel.setOpaque(true);

        this.totalLabel.setBounds(190,210,100,30);
        this.totalLabel.setForeground(Color.GREEN);
        this.totalLabel.setBackground(Color.gray);
        this.totalLabel.setOpaque(true);

        this.Accept.setBounds(100,250,80,30);
        this.Back.setBounds(190,250,70,30);


        proteinCheckBox.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e){
                state1 = !state1;
                if(state1){
                    proteinPricelabel.setVisible(true);
                    total = total + 2000;
                }
                else{
                    proteinPricelabel.setVisible(false);
                    total = total - 2000;
                }
                totalLabel.setText("Total = " + String.valueOf(total));
            }
        });

        creatineCheckBox.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e){
                state2 = !state2;
                if(state2){
                    creatinePricelabel.setVisible(true);
                    total = total + 3000;
                }
                else{
                    creatinePricelabel.setVisible(false);
                    total = total - 3000;
                }
                totalLabel.setText("Total = " + String.valueOf(total));
            }
        });

        preCheckBox.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e){
                state3 = !state3;
                if(state3){
                    prePricelabel.setVisible(true);
                    total = total + 1000;
                }
                else{
                    prePricelabel.setVisible(false);
                    total = total - 1000;
                }
                totalLabel.setText("Total = " + String.valueOf(total));
            }
        });

        try {
            memberItemsFrame.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("./graybg.jpg")))));
        } catch (IOException e) {
            e.printStackTrace();
        }
        memberItemsFrame.pack();

        memberItemsFrame.add(itemsLabel);
        memberItemsFrame.add(proteinPricelabel);
        memberItemsFrame.add(proteinCheckBox);
        memberItemsFrame.add(creatinePricelabel);
        memberItemsFrame.add(creatineCheckBox);
        memberItemsFrame.add(prePricelabel);
        memberItemsFrame.add(preCheckBox);
        memberItemsFrame.add(totalLabel);
        memberItemsFrame.add(Accept);
        memberItemsFrame.add(Back);

        ImageIcon gymIcon = new ImageIcon("./GYMIcon.png");
        memberItemsFrame.setIconImage(gymIcon.getImage());

        memberItemsFrame.setTitle("Items");
        memberItemsFrame.setSize(300,400);
        memberItemsFrame.setLayout(null);
        memberItemsFrame.setLocationRelativeTo(null);
        memberItemsFrame.setVisible(false);

    }

}
