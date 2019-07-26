package chapter_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListZeroDeleter {
    public static void main(String[] args) {
//        List<Integer> lis = new ArrayList<>();
//        lis.remove(0);
        int[] random = { 6, -4, 12, 0, -10 };
        int x = 12;
        int y = Arrays.binarySearch(random, x);
        System.out.println(y);
    }
}
