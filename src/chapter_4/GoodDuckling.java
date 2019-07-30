package chapter_4;

public class GoodDuckling {
    public void makeNoise() {
        MotherDuck duck = new MotherDuck();
        duck.quack();                         // default access_examples
        System.out.println(duck.noise);          // default access_examples
    } }