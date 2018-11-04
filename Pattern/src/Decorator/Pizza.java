package Decorator;

public abstract class Pizza{
    String description = "Unknown";
    public String getDescription(){
        return description;
    }

    public abstract double cost();
}


class Mozarella extends Pizza{
    public Mozarella(){
        description = "Mozarella";
    }

    @Override
    public double cost() {
        return 180.5;
    }
}


class Mushroom extends Pizza{
    public Mushroom(){
        description = "Mushroom";
    }

    @Override
    public double cost() {
        return 210.25;
    }
}


class Crudo extends Pizza{
    public Crudo(){
        description = "Crudo";
    }

    @Override
    public double cost() {
        return 350.75;
    }
}


class Napoli extends Pizza{
    public Napoli(){
        description = "Napoli";
    }

    @Override
    public double cost() {
        return 510.5;
    }
}
