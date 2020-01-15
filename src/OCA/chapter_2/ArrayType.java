package OCA.chapter_2;

public class ArrayType {
    public static void main(String args[]) {
        String [] bugs = { "cricket", "beetle", "ladybug" };
        System.out.println(bugs.toString()); // [Ljava.lang.String;@160bc7c0
        String [] alias = { "cricket", "beetle", "ladybug" };
        System.out.println(bugs.equals(alias));     // true

        System.out.println(alias.toString()); // [Ljava.lang.String;@160bc7c0
    } }
