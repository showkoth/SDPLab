package Memento;


class Orginator{
    private String _state;

    public String getState() {
        return _state;
    }

    public void setState(String _state) {
        this._state = _state;
    }

    public Memento SaveToMemento(){
        return (new Memento(_state));
    }

    public void restoreFromMemento(Memento m){
        _state = m.getState();
        System.out.println(_state);
    }
}
