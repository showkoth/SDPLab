package Memento;


import java.util.ArrayList;
import java.util.List;

class CareTaker{
    private List<Memento> _savedList = new ArrayList<Memento>();

    public void addMemento(Memento m){
        _savedList.add(m);
    }

    public Memento getMemento(int indx){
        return _savedList.get(indx);
    }
}