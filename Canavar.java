package oyun2;

import java.util.Random;

public class Canavar {
	int saglikPuani;
    int saldiriPuani;
    boolean hayattaMi;

    public Canavar() {
        Random rastgele = new Random();
        saglikPuani = rastgele.nextInt(200) + 100;
        saldiriPuani = rastgele.nextInt(100) + 50;
        hayattaMi = true;
    }

}
