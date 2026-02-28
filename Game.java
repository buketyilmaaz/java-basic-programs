package oyun;

import java.util.Random;

public class Game {
	  private Hero[] heroes = new Hero[3];
	    private Random rnd = new Random();

	    public Game() {
	        for (int i = 0; i < heroes.length; i++) {
	            heroes[i] = new Hero();
	        }
	    }

	    public void start() {
	        while (anyHeroAlive()) {
	            for (Hero hero : heroes) {
	                if (!hero.isAlive()) continue;

	                int distance = rnd.nextInt(101);
	                System.out.println("Kahraman " + distance + " birim ilerledi.");

	                if (rnd.nextBoolean()) {
	                    Monster monster = new Monster();
	                    hero.encounter(monster);
	                }
	            }
	        }
	        System.out.println("Tüm kahramanlar öldü. Oyun bitti.");
	    }

	    private boolean anyHeroAlive() {
	        for (Hero h : heroes) {
	            if (h.isAlive()) return true;
	        }
	        return false;
	    }

}
