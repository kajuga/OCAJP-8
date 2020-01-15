package OCA.chapter_4.lambdas;

import java.util.ArrayList;
import java.util.List;

public class MyLambdazz {


    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("sashok");
        list.add("qwsashok");
        list.add("ewsashok");
        list.add("resashok");

        System.out.println(list);
        list.removeIf(a -> a.charAt(0) == 's');

        System.out.println(list);


    }
}
