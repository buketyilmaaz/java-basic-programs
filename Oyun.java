package oyun2;

import java.util.Random;

public class Oyun {
	 Kahraman[] kahramanlar;
	    Random rastgele = new Random();

	    public Oyun() {
	        kahramanlar = new Kahraman[3];
	        for (int i = 0; i < 3; i++) {
	            kahramanlar[i] = new Kahraman();
	        }
	    }

	    public void baslat() {
	        while (enAzBirKahramanHayattaMi()) {
	            for (Kahraman kahraman : kahramanlar) {
	                if (!kahraman.hayattaMi)
	                    continue;
	                int mesafe = rastgele.nextInt(101);
	                System.out.println("Kahraman " + mesafe + " birim ilerledi.");

	                if (rastgele.nextBoolean()) {
	                    System.out.println("Bir canavar ortaya cikti!");
	                    Canavar canavar = new Canavar();
	                    kahraman.karsilas(canavar);
	                }
	            }
	        }

	        System.out.println("Tum kahramanlar oldu. Oyun sona erdi.");
	    }

	    private boolean enAzBirKahramanHayattaMi() {
	        for (Kahraman k : kahramanlar) {
	            if (k.hayattaMi)
	                return true;
	        }
	        return false;
	    }           

}
