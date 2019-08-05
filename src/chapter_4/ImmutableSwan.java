package chapter_4;

public class ImmutableSwan {
    private static int numberEggs;
    public ImmutableSwan(int numberEggs) {
        this.numberEggs = numberEggs;
    }
    public int getNumberEggs() {
        return numberEggs;
    }

    public static void main(String[] args) {
        numberEggs = 3;
        System.out.println(numberEggs);
        numberEggs = 44;
        System.out.println(numberEggs);
    }

}



