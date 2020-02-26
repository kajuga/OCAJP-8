package OCP.chapter_8;

public class Zebra extends Animal2 {
    public Zebra(int age) {
        super(age);  // Refers to constructor in Animal
    }
    public Zebra() {
        this(4);     // Refers to constructor in Zebra with int argument
    }
}
