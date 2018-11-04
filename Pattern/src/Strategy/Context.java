package Strategy;

import java.util.HashMap;

public class Context {

    public static HashMap<String, IStrategy> _map = new HashMap<String, IStrategy>();

    public Context(){
        _map.put("A",new ClassA());
        _map.put("B",new ClassB());
        _map.put("C",new ClassC());
    }

    public static void doThing(String s){
        _map.get(s).doSomething();
    }
}
