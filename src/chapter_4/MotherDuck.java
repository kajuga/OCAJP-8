package chapter_4;

public class MotherDuck {
    String noise = "quack";

    void quack() {
        System.out.println(noise);     // default access_examples is ok
    }

    private void makeNoise() {
        quack();                    // default access_examples is ok
    }
}