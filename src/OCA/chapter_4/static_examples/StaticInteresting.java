package OCA.chapter_4.static_examples;

public class StaticInteresting {
    private static int one;
    private static final int two;
    private static final int three = 3;
//    private static final int four;     // DOES NOT COMPILE
    static {
        one = 1;
        two = 2;
//        four = 5;
//        three = 3;     // DOES NOT COMPILE
//        two = 4;     // DOES NOT COMPILE
    }
}
