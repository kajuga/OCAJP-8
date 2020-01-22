package OCP.chapter_2;

public class Scopes {

    {
        var  as = new Object();
        as = "";
    }
//    char chipmunk = -1;

    public static void main(String[] args) {
        long age = 000000001;
        double a = 1.0_0;


        Scopes sc = new Scopes();
        sc.eatMore(true, 1);
        System.out.println(age);


    }
    public void eatMore (boolean hungry, int amountOfFood){
        int roomInBelly = 5;
        if (hungry) {
            var timeToEat = true;
            while (amountOfFood > 0) {
                int amountEaten = 2;
                roomInBelly = roomInBelly - amountEaten;
                amountOfFood = amountOfFood - amountEaten;
            }
        }
        System.out.println(amountOfFood);
    }


}
