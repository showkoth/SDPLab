package Singleton;

class Thread1 extends Thread{
    public void run(){
        Singleton s;
        s = Singleton.getUniqueObject();
    }
}

public class SingletonDriver {
    public static void main(String[] args){
        Thread1 t1 = new Thread1();
        t1.start();
        Thread1 t2 = new Thread1();
        t2.start();
        Thread1 t3 = new Thread1();
        t3.start();
    }
}
