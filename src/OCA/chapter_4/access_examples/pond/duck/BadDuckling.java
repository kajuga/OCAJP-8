package OCA.chapter_4.access_examples.pond.duck;

public class BadDuckling {
    public void makeNoise() {
        FatherDuck duck = new FatherDuck();
//        duck.quack();                       // DOES NOT COMPILE
//        System.out.println(duck.noise);     // DOES NOT COMPILE
    } }
