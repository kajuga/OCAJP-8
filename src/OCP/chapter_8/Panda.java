package OCP.chapter_8;

public class Panda extends Bear {
    public void sneeze(int a) {           // DOES NOT COMPILE
        System.out.println("Panda sneezes quietly");
    }
    public static void hibernate(String z) { // DOES NOT COMPILE
        System.out.println("Panda is going to sleep");
    }
    public static void laugh() {  // DOES NOT COMPILE
        System.out.println("Panda is laughing");
    }
}
