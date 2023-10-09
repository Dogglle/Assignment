package JAVA;
import java.util.*;

public class ShuffleArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};

        // Shuffle the array
        Random rand = new Random();
        for (int i = array.length - 1; i > 0; i--) {
            int index = rand.nextInt(i + 1);
            int temp = array[i];
            array[i] = array[index];
            array[index] = temp;
        }

        // Print the shuffled array
        System.out.println(Arrays.toString(array));
    }
}
