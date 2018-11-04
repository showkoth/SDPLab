package Adapter;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class CalculatorAdapter {
    public Calculator _cal;
    public CalculatorAdapter(){
        _cal = new Calculator();
    }
    private static int[] toArr(List number){
       // Iterator<Integer> it = number.iterator();
        int a[] = new int[number.size()];
        for(int i=0; i<number.size(); i++){
            a[i] = (Integer)number.get(i);
        }
        return a;
    }

    public int getTotal(List number){
        int sum = _cal.getSum(toArr(number));
        return sum;
    }
}
