package homework1;

import java.util.Random;

public class Homework1 {
    public static void main(String[] args) {
        int max = 20;
        int min = -20;
        Random random = new Random();
        String randomStr = String.valueOf(random.nextInt(max - min + 1) + min);
        System.out.println(randomStr);
    }
}
