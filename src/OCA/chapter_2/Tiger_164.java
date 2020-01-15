package OCA.chapter_2;

public class Tiger_164 {
    String name;
    public static void main(String[] args) {
        Tiger_164 t1 = new Tiger_164();
        Tiger_164 t2 = new Tiger_164();
        Tiger_164 t3 = t1;
        System.out.println(t1 == t1); // true
        System.out.println(t1 == t2); // false
        System.out.println(t1.equals(t2)); // false
        System.out.println(t1);
        System.out.println(t3 == t1);
    }

}
