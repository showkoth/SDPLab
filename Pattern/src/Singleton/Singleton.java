package Singleton;



public class Singleton {
    public static volatile Singleton uniqueObject;

    public Singleton(){
        if(uniqueObject != null) throw new IllegalStateException();
        //other variables
    }

    public static Singleton getUniqueObject(){
        if(uniqueObject==null){
            System.out.println("Before synchronized");
            synchronized (Singleton.class){
                if(uniqueObject == null){
                    uniqueObject = new Singleton();
                    System.out.println("Object is created");
                }
            }
        }
        return uniqueObject;
    }
}
