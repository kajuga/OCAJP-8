package OCA.chapter_5;

public class Zebra extends Animal {
    public Zebra(int age) {
        super(age);
    }

    public Zebra() {
        this(4);
//        super();
    }
}
