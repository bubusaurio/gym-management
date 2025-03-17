package project_poe;

public class UserCounter {
    public int counter;
    public int aux;
    public boolean err;
    public int selected = 999;

    public UserCounter(){
        this.counter = 0;
        this.err = false;
    }

    public void addCounter(){
        counter++;
    }

    public void setAux(int aux){
        this.aux = aux;
    }

    public int getAux(){
        return aux;
    }
}
