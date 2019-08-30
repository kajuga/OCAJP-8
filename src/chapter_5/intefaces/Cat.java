package chapter_5.intefaces;

public class Cat implements Walk, Run {  // DOES NOT COMPILE
    //    public static void main(String[] args) {
////        System.out.println(new Cat().getSpeed());
//    }
    public int getSpeed() {
        return 10;
    }
}
