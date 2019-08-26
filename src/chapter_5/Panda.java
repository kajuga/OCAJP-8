package chapter_5;

public class Panda extends Bear {
    public void sneeze(int a) {  // DOES NOT COMPILE
        System.out.println("Panda bear sneezes quietly");
    }
    public void hibernate() {  // DOES NOT COMPILE
        System.out.println("Panda bear is going to sleep");
    }
}
