package be.intecbrussel;

import java.util.Random;

public class RandomApp {
    public static void main(String[] args) {

        Random rng = new Random();
        int random1 = rng.nextInt();
        int random2 = rng.nextInt(10);
        int random3 = rng.nextInt(5) + 5;
        int random4 = rng.nextInt(10) - 5;

        System.out.println(random1);
        System.out.println(random2);
        System.out.println(random3);
        System.out.println(random4);
    }
}
