package OCP.chapter_5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayExercise {
    public static void main(String[] args) {
//        ArrayList list = new ArrayList();
//        list.add("123");
//        list.add(666);
//        System.out.println(list);
//        list.add(2, 444);
//        System.out.println(list.size());
//        System.out.println(list);
//        list.add(null);
//        System.out.println(list);
//        System.out.println(list.size());
//        System.out.println(list.get(3));
//
//        list.set(12, 34);

//        list.add(null);
//        System.out.println(list);
//        Object i = list.get(0);
//        System.out.println((i));

        List<String> s1 = new ArrayList<>();
        s1.add("11");
        s1.add("22");
        List<String> s2 = new ArrayList<>();
        System.out.println(s1.equals(s2));
        s2.add("22");
        s2.add("11");
        System.out.println(s1.equals(s2));
        Collections.sort(s2);
        System.out.println(s1.equals(s2));





    }
}
