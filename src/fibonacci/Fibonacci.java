package fibonacci;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Fibonacci {
    public static void main(String[] args) {
        Random anyNumber = new Random();
        int number = anyNumber.nextInt(350) + 0;
        boolean verification = isFibonacci(number);
        System.out.println(number + " belongs to fibonacci sequence? " + verification);
    }

    public static List<Integer> fibonacci() {
        List<Integer> list = new ArrayList<Integer>();
        if(list.isEmpty()){
            list.add(0);
            list.add(1);
        }
        while(list.get(list.size()-1) <= 350){
            int n = list.size();
            list.add(list.get(n - 1) + list.get(n - 2));
        }
        return list;
    }

    public static Boolean isFibonacci(Integer a) {
        Boolean validation = fibonacci().contains(a);
        return validation;
    }
}
