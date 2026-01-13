package Util;

import java.util.Random;

public class RandomUtils {

    private static final Random RANDOM = new Random();
    private RandomUtils(){
    }
    public static int numeroEntero (int min, int max){
        return RANDOM.nextInt( max - min +1) + min;
    }
    public static boolean probabilidad (double prob){
        return Math.random() <= prob;
    }
}
