package chapter_2;

import java.util.ArrayList;
import java.util.List;

public class ArrAddSomething {

    public static void main(String[] args) {
        List arr = new ArrayList();

        int  z = 3;
        int zz = 333;
        arr.add(z);
        arr.add(null);
        arr.add(0);
        System.out.println(arr.size());
        System.out.println(arr.get(2));


    }
}
