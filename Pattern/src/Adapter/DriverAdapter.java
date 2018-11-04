package Adapter;

import java.util.ArrayList;
import java.util.List;

public class DriverAdapter {

    public static void main(String[] args){
        List<Integer> li = new ArrayList<Integer>();
        li.add(5);
        li.add(10);
        li.add(15);
        CalculatorAdapter cal = new CalculatorAdapter();

        System.out.println(cal.getTotal(li));
    }
}
