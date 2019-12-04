package chapter_5;

public abstract class Bird {
    private void fly() {
        System.out.println("Bird is flying");
    }

    public static void main(String[] args) {
        Bird bird = new Pelican();
        bird.fly();
        ((Pelican) bird).fly2();
    }
}

class Pelican extends Bird {
    protected void fly() {
        System.out.println("Pelican is flying");
    }
    protected void fly2() {
        System.out.println("Pelican is flying2");
    }
}

