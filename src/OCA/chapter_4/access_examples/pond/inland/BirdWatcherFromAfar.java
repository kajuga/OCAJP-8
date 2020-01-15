package OCA.chapter_4.access_examples.pond.inland;
import OCA.chapter_4.access_examples.pond.shore.Bird;

public class BirdWatcherFromAfar {
    public void watchBird() {
        Bird bird = new Bird();
//        bird.floatInWater();               // DOES NOT COMPILE
//        System.out.println(bird.text);     // DOES NOT COMPILE
    }
}
