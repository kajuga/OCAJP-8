package OCA.chapter_2;

public class SoumExample {
    public static void main(String[] args) {
        int x = 3;
        int y = ++x * 5 / x-- + --x;
        System.out.println("x is " + x);
        System.out.println("y is " + y);

        long xx = 10;
        int yy = 5;
        yy *= xx;  // DOES NOT COMPILE
    }
}
