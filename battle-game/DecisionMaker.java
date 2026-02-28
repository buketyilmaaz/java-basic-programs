package oyun;

import java.util.Random;

public class DecisionMaker {
    private static Random rnd = new Random();

    public static boolean shouldFight() {
        return rnd.nextBoolean(); // true = savaş, false = kaç
    }
}

