package project_poe;

public class User{
    private String user;
    private String pass;
    private String firstName;
    private String lastName;
    private boolean type;
    private boolean paid = true;
    private String coach;
    private int payment = 600;
    private int idcouch;
    private String schedule;

    public User() {
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getfirstName() {
        return firstName;
    }

    public void setfirstName(String name) {
        this.firstName = name;
    }

    public String getlastName() {
        return lastName;
    }

    public void setlastName(String name) {
        this.lastName = name;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public boolean getPaid(){
        return paid;
    }

    public void setPaid(boolean paid){
        this.paid = paid;
    }

    public boolean getType(){
        return type;
    }

    public void setType(boolean type){
        this.type = type;
    }

    public void setCoach(String coach){
        this.coach = coach;
    }

    public String getCoach(){
        return coach;
    }

    public void setPayment(int payment){
        this.payment = payment;
    }

    public int getPayment(){
        return payment;
    }

    public String getStringPayment(){
        return String.valueOf(payment);
    }

    public void setSchedule(String sc){
        this.schedule = sc;
    }

    public String getSchedule(){
        return schedule;
    }

    public void setIdCouch(int id){
        this.idcouch = id;
    }

    public int getIdCouch(){
        return idcouch;
    }

}