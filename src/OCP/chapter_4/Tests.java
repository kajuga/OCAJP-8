package OCP.chapter_4;

import java.util.ArrayList;
import java.util.List;

public class Tests {

    public static void main(String[] args) {
        for (var penguin : new int[2])
            System.out.println(penguin);
        var ostrich = new Character[3];
        for (var emu : ostrich)
            System.out.println(emu);
        List parrots = new ArrayList();
        for (var macaw : parrots)
            System.out.println(macaw);


        final char a = 'A', e = 'E';
        char grade = 'B';
        switch (grade) {

            case a:
                System.out.println("2112");
            case 'B':
            case 'C':
                System.out.print("great ");
            case 'D':
                System.out.print("good ");
            case e:
            case 'F':
                System.out.print("not good ");
            default:
                System.out.println(111);
        }



    }
}
