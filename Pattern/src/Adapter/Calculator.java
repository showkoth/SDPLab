package Adapter;

public class Calculator {
    public Calculator(){

    }

    public int getSum(int[] numbers){
        int sz = numbers.length;
        int sum = 0;
        for(int i=0; i<sz; i++){
            sum += numbers[i];
        }
        return sum;
    }

}
