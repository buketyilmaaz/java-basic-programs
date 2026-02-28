package oyun2;

import java.util.Random;

public class Kahraman {
	int saglikPuani;
    int tecrubePuani;
    boolean hayattaMi;

    public Kahraman() {
        saglikPuani = 1000;
        tecrubePuani = 0;
        hayattaMi = true;
    }

    public void karsilas(Canavar canavar) {
        Random rastgele = new Random();
        boolean savasacakMi = rastgele.nextBoolean();

        if (savasacakMi) {
            savas(canavar);
        } else {
            System.out.println("Kahraman kacmayi secti.");
        }
    }

    private void savas(Canavar canavar) {
        if (saglikPuani > canavar.saldiriPuani) {
            saglikPuani += 100;
            tecrubePuani += 20;
            canavar.hayattaMi = false;
            System.out.println("Canavar yenildi.");
        } else {
            saglikPuani -= canavar.saldiriPuani;
            System.out.println("Kahraman yenildi.");
            if (saglikPuani <= 0) {
                hayattaMi = false;
                System.out.println("Kahraman oldu.");
            }
        }
    }

}
