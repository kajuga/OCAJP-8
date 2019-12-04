package chapter_5;

public class Shark extends Fish {
    private int numberOfFins = 8;
//    int age = 16;
//    int size;

    public Shark(int age) {
        super(age);
        this.size = 4;
//        super.size = 2;
//        this.age = age;

    }

    public void displaySharkDetails() {
        System.out.print("Shark with age: "+this.getAge() + "\n");
        System.out.print("Shark with age: "+this.getAge());
        System.out.print(" and "+this +" meters long" + "\n");
        System.out.print(" with "+this.numberOfFins+" fins"+ "\n");
        System.out.println(" SUPER = " + this.size + " " + this.getAge() + "\n");

    }



    public static void main(String[] args) {
        Shark shark = new Shark(10);
        shark.displaySharkDetails();
        Fish fish = new Fish();
        System.out.println("FISH - " + fish.size + " " + fish.getAge());

    }

}