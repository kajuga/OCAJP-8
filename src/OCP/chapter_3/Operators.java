package OCP.chapter_3;

public class Operators {

    long egg = (long) (2.0 / 9);        // DOES NOT COMPILE
    int tadpole = (int)(5 * 2L);  // DOES NOT COMPILE
    short frog = (short) (3 - 2.0);       // DOES NOT COMPILE
    int sas = (int) 2f * 10;
    static short ticketTaker = (short)1921222;  // Stored as 20678

    public static void main(String[] args) {
        System.out.println(ticketTaker);
        System.out.print(2147483647+1);  // -2147483648
        int b = 1;
        System.out.println(b);
    }

    public static void openZoo(Object time) {
        if (time instanceof Integer) {
            // DOES NOT COMPILE
        }
    }

    }
