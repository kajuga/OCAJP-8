package chapter_2;

public class StringTest {

    public static void main(String[] args) {
        String one = "wanpapabula doop";
        System.out.println("charAt(3): " + one.charAt(3));
        System.out.println("charAt(3): " + one.charAt(4));
        System.out.println("charAt(3): " + one.charAt(5));
        System.out.println("indexOf(doo)" + one.indexOf("doo"));
        System.out.println("substring(doo) " + one.substring(12, 16));
        System.out.println("replace " + one.replace("doop", "XXX"));

        StringBuilder sb =new StringBuilder("kickAss");
        sb.replace(0, 4, "Ass");
        System.out.println(sb);




    }


}
