package hust.soict.hedspi.test.trash;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

public class Sort {
    public static void main(String[] args) {
        final int MAX = 10000000;
        final int MIN = 1;
        Random random = new Random();
        ArrayList<Integer> arrayToSort = new ArrayList<>();

        long startTime = System.currentTimeMillis();

        for (int i = 0; i < MAX; i++) {
            arrayToSort.add(random.nextInt(MAX) + 1);
        }
        Collections.sort(arrayToSort);
        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);
    }
}
