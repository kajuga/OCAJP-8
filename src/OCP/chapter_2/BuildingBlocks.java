package OCP.chapter_2;

import java.util.Objects;

public class BuildingBlocks {
    boolean _alsoOK1d3ntifi3r;
    char __SStillOkbutKnotsonice$;
    static int i1, i2, i3 = 0;

    double d1; double d2;
    double d3, d4;

   static void paintFence() {
        int i1, i2, i3 = 0;
    }

    public static void main(String[] args) {
        System.out.println(i1);

        short apples = (short)10;
        apples = (byte)5;
//        apples = 1_000_000;  // DOES NOT COMPILE
        short aaa = (int)15;


    }

    public void doesThisCompile(boolean check) {
        var question = 1;
        int answer;
        if (check) {
            answer = 2;
        } else {
            answer = 3;
        }
        System.out.println(answer);
    }


}
