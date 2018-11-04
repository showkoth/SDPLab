package Memento;


public class MementoDriver{

    public static void main(String[] args){
        CareTaker ct = new CareTaker();
        Orginator or = new Orginator();
        or.setState("state1");
        ct.addMemento(or.SaveToMemento());
        or.setState("state2");
        ct.addMemento(or.SaveToMemento());

        or.restoreFromMemento(ct.getMemento(1));

    }
}