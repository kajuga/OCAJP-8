package OCA.chapter_1;

public class Test {
    boolean timeToEat;


    public void eatMore(boolean hungry, int amountOfFood) {
        double x = 39.21;
        float y = 2.1f;
        short xx = 10;
        short yy = 3;
        short xxx = (short) (xx + yy);

        int numGrains = (int) 5.6;
        int roomInBelly = 5;
        int amountEaten = 3;
        System.out.println(timeToEat);
        if (hungry) {
            boolean timeToEat;
//            System.out.println(timeToEat);
            while (amountOfFood > 0) {
                amountEaten = 2;
                roomInBelly = roomInBelly - amountEaten;
                amountOfFood = amountOfFood - amountEaten;
            }
        }
        System.out.println(amountOfFood);
        System.out.println(amountEaten);
    }


}
