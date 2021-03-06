package Decorator;

abstract class ToppingDecorator extends Pizza{
    public abstract String getDescription();
}



class Pepperoni extends ToppingDecorator{
    Pizza pizza;
    public Pepperoni(Pizza p){
        this.pizza = p;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " Pepperoni";
    }

    @Override
    public double cost() {
        return 25.5 + pizza.cost();
    }
}


class Onion extends ToppingDecorator{
    Pizza pizza;
    public Onion(Pizza p){
        this.pizza = p;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " Onion";
    }

    @Override
    public double cost() {
        return 12.5 + pizza.cost();
    }
}



class Bacon extends ToppingDecorator{
    Pizza pizza;
    public Bacon(Pizza p){
        this.pizza = p;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " Bacon";
    }

    @Override
    public double cost() {
        return 18.5 + pizza.cost();
    }
}


class Sausage extends ToppingDecorator{
    Pizza pizza;
    public Sausage(Pizza p){
        this.pizza = p;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " Sausage";
    }

    @Override
    public double cost() {
        return 38.75 + pizza.cost();
    }
}


class Choi extends ToppingDecorator{
    Pizza pizza;
    public Choi(Pizza p){
        this.pizza = p;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " Choi";
    }

    @Override
    public double cost() {
        return 75.5 + pizza.cost();
    }
}



class ExtraChese extends ToppingDecorator{
    Pizza pizza;
    public ExtraChese(Pizza p){
        this.pizza = p;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " ExtraChese";
    }

    @Override
    public double cost() {
        return 81.25 + pizza.cost();
    }
}


class BlackOlives extends ToppingDecorator{
    Pizza pizza;
    public BlackOlives(Pizza p){
        this.pizza = p;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " BlackOlives";
    }

    @Override
    public double cost() {
        return 101.25 + pizza.cost();
    }
}



class GreenPeppers extends ToppingDecorator{
    Pizza pizza;
    public GreenPeppers(Pizza p){
        this.pizza = p;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " GreenPeppers";
    }

    @Override
    public double cost() {
        return 110.25 + pizza.cost();
    }
}