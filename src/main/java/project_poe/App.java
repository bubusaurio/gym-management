package project_poe;

import javax.swing.*;

import java.awt.event.*;

public class App 
{
    public static void main( String[] args ){

        final Login LogFrame = new Login();
        final MemberMenu MemberFrame =  new MemberMenu();
        final CoachMenu CoachMenuFrame = new CoachMenu();
        final MemberStatus MemberStatusFrame = new MemberStatus();
        final MemberItems MemberItemsFrame = new MemberItems();
        final MemberCoach MemberCoachFrame = new MemberCoach();
        final AddUser AddUserFrame = new AddUser();
        final AllUsers AllUsersFrame = new AllUsers();
        final EditUser EditUserFrame = new EditUser();
        final CoachSessions CoachSessionsFrame = new CoachSessions();
        final JOptionPane searchUser = new JOptionPane();
        final User[] users = new User[10];
        final UserCounter uc = new UserCounter();

        users[0] = new User();
        users[0].setUser("Pedro");
        users[0].setPass("admin");
        users[0].setType(true);
        users[0].setfirstName("Pedro");
        users[0].setlastName("Mercado");
        users[0].setPaid(true);
        uc.addCounter();

        users[1] = new User();
        users[1].setUser("Joaquin");
        users[1].setPass("123");
        users[1].setType(true);
        users[1].setfirstName("Joaquin");
        users[1].setlastName("Ledezma");
        users[1].setPaid(true);
        uc.addCounter();

        users[2] = new User();
        users[2].setUser("Jonathan");
        users[2].setPass("2002");
        users[2].setType(true);
        users[2].setfirstName("Jonathan");
        users[2].setlastName("Medina");
        users[2].setPaid(true);
        uc.addCounter();

        users[3] = new User();
        users[3].setUser("Juan");
        users[3].setPass("321");
        users[3].setType(false);
        users[3].setfirstName("Juan");
        users[3].setlastName("Castorena");
        users[3].setPaid(true);
        uc.addCounter();

        /****************
        * Login Actions
        ****************/
        LogFrame.logCleanButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                LogFrame.cleanText();
            }
        });

        LogFrame.logInButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                uc.err = true;
                for(int i = 0; i<uc.counter; i++){
                    if(users[i].getUser().equals(LogFrame.logUserField.getText())){
                        if(users[i].getPass().equals(String.valueOf(LogFrame.logPassField.getPassword()))){
                            if(users[i].getPaid()){
                                if(!users[i].getType()){
                                    LogFrame.cleanText();
                                    MemberFrame.memberMenuFrame.setVisible(true);
                                    LogFrame.logFrame.setVisible(false);
                                    uc.setAux(i);
                                }
                                else{
                                    LogFrame.cleanText();
                                    CoachMenuFrame.coachMenuFrame.setVisible(true);
                                    LogFrame.logFrame.setVisible(false);
                                    uc.setAux(i);
                                }
                            }
                            else{
                                JOptionPane.showMessageDialog(LogFrame.logFrame, "Subscription Ended or not paid","Login Error", JOptionPane.WARNING_MESSAGE);
                            }
                        }
                        else{
                            JOptionPane.showMessageDialog(LogFrame.logFrame, "Incorrect User or Password","Login Error", JOptionPane.WARNING_MESSAGE);
                        }
                        uc.err = false;
                    }
                }
                if(uc.err){
                    JOptionPane.showMessageDialog(LogFrame.logFrame, "Incorrect User or Password","Login Error", JOptionPane.WARNING_MESSAGE);
                }
            }
        });

        /*********************
         * Member Menu Actions
         *********************/

        MemberFrame.statusButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                MemberStatusFrame.memberStatusFrame.setVisible(true);
                MemberStatusFrame.fNLabel.setText("First Name: " + users[uc.getAux()].getfirstName());
                MemberStatusFrame.lNLabel.setText("Last Name: " + users[uc.getAux()].getlastName());
                MemberStatusFrame.cLabel.setText("Coach Name: " + users[uc.getAux()].getCoach());
                if(users[uc.getAux()].getPaid()){
                    MemberStatusFrame.pLabel.setText("Active: Yes");
                }
                else{
                    MemberStatusFrame.pLabel.setText("Active: No");
                }
                MemberStatusFrame.paymentLabel.setText("Payment: " + users[uc.getAux()].getStringPayment());
            }
         });

        MemberStatusFrame.Back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                MemberStatusFrame.memberStatusFrame.setVisible(false);
            }
         });

        MemberFrame.itemButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                MemberItemsFrame.memberItemsFrame.setVisible(true);
            }
         });

        MemberItemsFrame.Accept.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(LogFrame.logFrame, "The total will be added in your next payment","Payment", JOptionPane.INFORMATION_MESSAGE);
                users[uc.getAux()].setPayment(users[uc.getAux()].getPayment() + MemberItemsFrame.total);
                MemberItemsFrame.proteinCheckBox.setSelected(false);
                MemberItemsFrame.creatineCheckBox.setSelected(false);
                MemberItemsFrame.preCheckBox.setSelected(false);
                MemberItemsFrame.memberItemsFrame.setVisible(false);
                MemberItemsFrame.total=0;

            }
        });

        MemberItemsFrame.Back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                MemberItemsFrame.proteinCheckBox.setSelected(false);
                MemberItemsFrame.creatineCheckBox.setSelected(false);
                MemberItemsFrame.preCheckBox.setSelected(false);
                MemberItemsFrame.memberItemsFrame.setVisible(false);
                MemberItemsFrame.total=0;
            }
        });

        MemberFrame.coachButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                MemberCoachFrame.membercoachFrame.setVisible(true);
            }
        });

        MemberCoachFrame.checkButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                if(MemberCoachFrame.coach1Button.isSelected()){
                    users[uc.aux].setCoach(MemberCoachFrame.coach1Button.getText());
                    users[uc.aux].setIdCouch(0);
                }
                if(MemberCoachFrame.coach2Button.isSelected()){
                    users[uc.aux].setCoach(MemberCoachFrame.coach2Button.getText());
                    users[uc.aux].setIdCouch(1);
                }
                if(MemberCoachFrame.coach3Button.isSelected()){
                    users[uc.aux].setCoach(MemberCoachFrame.coach3Button.getText());
                    users[uc.aux].setIdCouch(2);
                }
                MemberCoachFrame.showSessionArea.setText(users[users[uc.aux].getIdCouch()].getSchedule());
            }
        });

        MemberCoachFrame.Accept.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(LogFrame.logFrame, "Coach Updated","Coaches", JOptionPane.INFORMATION_MESSAGE);
                MemberCoachFrame.membercoachFrame.setVisible(false);

            }
        });

        MemberCoachFrame.Back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                MemberCoachFrame.membercoachFrame.setVisible(false);
            }
        });


        MemberFrame.exitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                MemberFrame.memberMenuFrame.setVisible(false);
                LogFrame.logFrame.setVisible(true);
            }
         });

         /*********************
         * Coach Menu Actions
         *********************/

        CoachMenuFrame.addUser.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                AddUserFrame.addUserFrame.setVisible(true);
            }
        });

        AddUserFrame.addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                users[uc.counter] = new User();
                users[uc.counter].setfirstName(AddUserFrame.firstNameField.getText());
                users[uc.counter].setlastName(AddUserFrame.lastNameField.getText());
                users[uc.counter].setUser(AddUserFrame.userField.getText());
                users[uc.counter].setPass(AddUserFrame.passField.getText());
                users[uc.counter].setPaid(true);
                users[uc.counter].setType(false);
                users[uc.counter].setPayment(600);
                uc.counter++;
                JOptionPane.showMessageDialog(LogFrame.logFrame, "The user has been added","Add User", JOptionPane.INFORMATION_MESSAGE);
                AddUserFrame.addUserFrame.setVisible(false);
                AddUserFrame.firstNameField.setText("");
                AddUserFrame.lastNameField.setText("");
                AddUserFrame.userField.setText("");
                AddUserFrame.passField.setText("");
            }
        });

        AddUserFrame.Back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                AddUserFrame.addUserFrame.setVisible(false);
                AddUserFrame.firstNameField.setText("");
                AddUserFrame.lastNameField.setText("");
                AddUserFrame.userField.setText("");
                AddUserFrame.passField.setText("");
            }
        });

        CoachMenuFrame.editUser.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                String input;
                input = searchUser.showInputDialog("Whats the user first name?");
                for(int i = 0; i<uc.counter; i++){
                    if(users[i].getfirstName().equals(input)){
                        uc.selected = i;
                        EditUserFrame.addUserFrame.setVisible(true);
                        EditUserFrame.firstNameField.setText(users[uc.selected].getfirstName());
                        EditUserFrame.lastNameField.setText(users[uc.selected].getlastName());
                        EditUserFrame.userField.setText(users[uc.selected].getUser());
                        EditUserFrame.passField.setText(users[uc.selected].getPass());
                        EditUserFrame.paidCheckBox.setSelected(users[uc.selected].getPaid());
                    }
                }
            }
        });

        EditUserFrame.addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                users[uc.selected].setfirstName(EditUserFrame.firstNameField.getText());
                users[uc.selected].setlastName(EditUserFrame.lastNameField.getText());
                users[uc.selected].setUser(EditUserFrame.userField.getText());
                users[uc.selected].setPass(EditUserFrame.passField.getText());
                users[uc.selected].setPaid(EditUserFrame.paidCheckBox.isSelected());
                JOptionPane.showMessageDialog(LogFrame.logFrame, "The user has been edited","Edit User", JOptionPane.INFORMATION_MESSAGE);
                EditUserFrame.addUserFrame.setVisible(false);
                EditUserFrame.firstNameField.setText("");
                EditUserFrame.lastNameField.setText("");
                EditUserFrame.userField.setText("");
                EditUserFrame.passField.setText("");
            }
        });

        EditUserFrame.Back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                EditUserFrame.addUserFrame.setVisible(false);
                EditUserFrame.firstNameField.setText("");
                EditUserFrame.lastNameField.setText("");
                EditUserFrame.userField.setText("");
                EditUserFrame.passField.setText("");
            }
        });

        CoachMenuFrame.allUsers.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                String userString = "";
                for(int i = 0; i<uc.counter; i++){
                    if(!users[i].getType()){
                        userString = userString + "First Name: "+ users[i].getfirstName()+"\n"+
                        "Last Name: " + users[i].getlastName()+"\n" +
                        "User: " + users[i].getUser()+"\n"+
                        "Pass: " + users[i].getPass()+"\n"+
                        "Coach: " + users[i].getCoach()+"\n"+
                        "Payment: " + users[i].getStringPayment()+"\n"+
                        "Active: " + users[i].getPaid()+"\n\n";
                    }
                }
                AllUsersFrame.showTextArea.setText(userString);
                AllUsersFrame.showFrame.setVisible(true);
            }
        });

        AllUsersFrame.showFormButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                AllUsersFrame.showFrame.setVisible(false);
                AllUsersFrame.showTextArea.setText("");
            }
        });

        CoachMenuFrame.delUser.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                String input;
                Boolean found = false;
                input = searchUser.showInputDialog("Whats the user first name?");
                for(int i = 0; i<uc.counter; i++){
                    if(users[i].getfirstName().equals(input)){
                        uc.selected = i;
                        found = true;
                        JOptionPane.showMessageDialog(LogFrame.logFrame, "The user has been deleted","Delete User", JOptionPane.INFORMATION_MESSAGE);
                    }
                    if(i+1<uc.counter && found){
                            users[i].setfirstName(users[i+1].getfirstName());
                            users[i].setlastName(users[i+1].getlastName());
                            users[i].setUser(users[i+1].getUser());
                            users[i].setPass(users[i+1].getPass());
                            users[i].setType(users[i+1].getType());
                            users[i].setSchedule(users[i+1].getSchedule());
                            users[i].setPayment(users[i+1].getPayment());
                            users[i].setPaid(users[i+1].getPaid());
                            users[i].setCoach(users[i+1].getCoach());
                            users[i].setIdCouch(users[i+1].getIdCouch());
                        }
                }
                if(found){
                    uc.counter--;
                }
            }
        });

        CoachMenuFrame.sessionButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                CoachSessionsFrame.coachSessionsFrame.setVisible(true);
            }
        });

        CoachSessionsFrame.Accept.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                users[uc.aux].setSchedule(CoachSessionsFrame.schedule);
                JOptionPane.showMessageDialog(LogFrame.logFrame, "Schedule Updated","Sessions", JOptionPane.INFORMATION_MESSAGE);
                CoachSessionsFrame.checkBox1.setSelected(false);
                CoachSessionsFrame.checkBox2.setSelected(false);
                CoachSessionsFrame.checkBox3.setSelected(false);
                CoachSessionsFrame.checkBox4.setSelected(false);
                CoachSessionsFrame.checkBox5.setSelected(false);
                CoachSessionsFrame.checkBox6.setSelected(false);
                CoachSessionsFrame.checkBox7.setSelected(false);
                CoachSessionsFrame.checkBox8.setSelected(false);
                CoachSessionsFrame.coachSessionsFrame.setVisible(false);
                CoachSessionsFrame.schedule = "";
            }
        });

        CoachSessionsFrame.Back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                CoachSessionsFrame.checkBox1.setSelected(false);
                CoachSessionsFrame.checkBox2.setSelected(false);
                CoachSessionsFrame.checkBox3.setSelected(false);
                CoachSessionsFrame.checkBox4.setSelected(false);
                CoachSessionsFrame.checkBox5.setSelected(false);
                CoachSessionsFrame.checkBox6.setSelected(false);
                CoachSessionsFrame.checkBox7.setSelected(false);
                CoachSessionsFrame.checkBox8.setSelected(false);
                CoachSessionsFrame.coachSessionsFrame.setVisible(false);
                CoachSessionsFrame.schedule = "";
            }
        });

        CoachMenuFrame.exitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                CoachMenuFrame.coachMenuFrame.setVisible(false);
                LogFrame.logFrame.setVisible(true);
            }
         });
    }
}
