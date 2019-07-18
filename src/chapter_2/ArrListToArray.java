package chapter_2;

import java.util.ArrayList;
import java.util.List;

public class ArrListToArray {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("hawk");
        list.add("robin");
        Object[] objectArray = list.toArray();
        System.out.println(objectArray.length);
        String[] stringArray = list.toArray(new String[0]);
        System.out.println(stringArray.length);     // 2
        for (String str : stringArray
                ) {
            System.out.println(str);
        }
    }

}
