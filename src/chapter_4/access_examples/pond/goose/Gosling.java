package chapter_4.access_examples.pond.goose;
import chapter_4.access_examples.pond.shore.Bird;


public class Gosling extends Bird {     // extends means create subclass
    public void swim() {
        floatInWater();               // calling protected member
        System.out.println(text);     // calling protected member
    }
}