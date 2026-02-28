package oyun;

import java.util.Random;

public class Monster {  
private int attackPower;
private boolean alive = true;

public Monster() {
    Random rnd = new Random();
    attackPower = rnd.nextInt(100) + 50;
}

public int getAttackPower() {
    return attackPower;
}

public void die() {
    alive = false;
}
}
