package frequencies;

import java.util.HashMap;

public class Frequencies {

    public static void main(String[] args) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int [] vector = {0,1,0,2,0,3,0,4,0,1,0,5,0,6,0,1,0,2,7,3,4,5,6,7,8,9};
        int maxNumber=0;
        int maxTimes=0;
        int number=0;
        
        for (int i : vector) {
            if (map.containsKey(i)) {
                number=map.get(i);
                map.put(i, ++number);
            }else map.put(i, 1);
        }
        
        for (Integer value : map.keySet()) {
            System.out.print(value);
            System.out.print(" ");
            System.out.print(map.get(value));
            System.out.println();
            if (map.get(value)>maxTimes){
                maxTimes=map.get(value);
                maxNumber=value;
            }
        }
        System.out.print("Most frequent number is ");
        System.out.print(maxNumber);
        System.out.print(" which appears ");
        System.out.print(maxTimes);
        System.out.print(" times");
        System.out.println();
    }

}
