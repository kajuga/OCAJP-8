package OCP.introduction;

public class InternTesr {
    public static void main(String[] args) {
            String a = "string a";
            String b = new String("string a");
            String c = b.intern();

            System.out.println(a == b);
            System.out.println(b == c);
            System.out.println(a == c);
        }
    }
