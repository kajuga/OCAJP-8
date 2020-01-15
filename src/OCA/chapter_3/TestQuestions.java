package OCA.chapter_3;

public class TestQuestions {
    public static void main(String[] args) {
        String a = "";
        String b = "";

        a += 2;
        a += 'c';
        a += false;
        if ( a == "2cfalse") {
            System.out.println("==");
        }
        if ( a.equals("2cfalse")) {
            System.out.println("equals");
        }
    }
}
