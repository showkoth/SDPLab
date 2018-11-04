package Strategy;

public class Driver {
    public static void main(String[] args){
        String s = "C";
        Context ob = new Context();
        Context.doThing(s);
    }
}
