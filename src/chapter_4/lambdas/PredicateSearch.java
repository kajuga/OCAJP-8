package chapter_4.lambdas;

import java.util.*;
import java.util.function.*;

public class PredicateSearch {

    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<Animal>();
        animals.add(new Animal("fish", false, true));
        animals.add(new Animal("elephant", false, true));
        animals.add(new Animal("fox", true, false));
        animals.add(new Animal("turtle", false, true));

        print(animals, a -> a.canHop());
        print(animals, Animal::canSwim);
        animals.removeIf(Animal::canSwim);
    }

    private static void print(List<Animal> animals, Predicate<Animal> checker) {
        for (Animal animal : animals) {
            if (checker.test(animal))
                System.out.print(animal + " ");
        }
        System.out.println();
    }
}
