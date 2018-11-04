package Memento;

public class Memento {

    public String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    private void setState(String state) {
        this.state = state;
    }


}