package OCA.chapter_5;

abstract class Reptile {
    public final void layEggs() {
        System.out.println("Reptile laying eggs");
    }

    public static void main(String[] args) {
        Reptile reptile = new Lizard();
        reptile.layEggs();
    }
}

public class Lizard extends Reptile {
    public void layEggs(int a) { System.out.println("Lizard laying eggs");
    }
}
