package chapter_4.exam;

public class BirdSeed {
    private int numberBags;
    private int xxx;
    boolean call;

    public BirdSeed() {
        // LINE 1
        this(2);
        this.xxx  = (3);
        call = false;
        // LINE 2
    }
    public BirdSeed(int numberBags) {
        this.numberBags = numberBags;
    }
    public static void main(String[] args) {
        BirdSeed seed = new BirdSeed();
        System.out.println(seed.numberBags + seed.xxx);
    } }
