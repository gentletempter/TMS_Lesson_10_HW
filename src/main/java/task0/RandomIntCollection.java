package task0;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

/**
 * Fills the collection with 10 random integers between 2 and 98.
 * Finds the two maximum items and displays them
 */
public class RandomIntCollection {
    public static void getRandomIntCollection() {
        ArrayList<Integer> randomIntList = new ArrayList<>();
        Random random = new Random();
        int minRandomInt = 2;
        int maxRandomInt = 98;

        for (int i = 0; i < 10; i++) {
            randomIntList.add(minRandomInt + random.nextInt(maxRandomInt - minRandomInt));
        }
        randomIntList.sort(Comparator.naturalOrder());

        System.out.println("Initialized collection: " + randomIntList);
        System.out.printf("Maximum elements: %d and %d\n", randomIntList.get(8), randomIntList.get(9));
    }
}
