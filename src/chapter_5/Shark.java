package chapter_5;

public class Shark extends Fish {
    private int numberOfFins = 8;
    int age = 16;
//    int size;

    public Shark(int age) {
        super(age);
        this.size = 4;

    }

    public void displaySharkDetails() {
        System.out.print("Shark with age: "+this.getAge());
        System.out.print(" and "+this.size+" meters long");
        System.out.print(" with "+this.numberOfFins+" fins");
    }



    public static void main(String[] args) {
        Shark shark = new Shark(10);
        shark.displaySharkDetails();
    }

}