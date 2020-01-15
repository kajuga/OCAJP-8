package OCA.chapter_2;

import java.util.ArrayList;
import java.util.List;

public class LuckyTalon {
    int number = 123543;


    public void isLucky(int num) {
        boolean result = false;
        List<Integer> arr = new ArrayList<Integer>();
        while (num/10>1) {
            arr.add(num%10);
            num = num/10;
        }


        do {
            arr.add(num % 10);
        } while (num / 10 > 1);
        System.out.println( arr.add(num%10));
    }



    public static void main(String[] args) {

        LuckyTalon talon = new LuckyTalon();
        talon.isLucky(123543);

    }






}
