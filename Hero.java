
package oyun;

public class Hero { 
private int hp = 1000;
private int exp = 0;
private boolean alive = true;

public void encounter(Monster monster) {
    if (DecisionMaker.shouldFight()) {
        BattleSystem.fight(this, monster);
    } else {
        System.out.println("Kahraman kaçtı.");
    }
}

public void win() {
    hp += 100;
    exp += 20;
}

public void lose(int damage) {
    hp -= damage;
    if (hp <= 0) alive = false;
}

public boolean isAlive() {
    return alive;
}

public int getHp() {
    return hp;
}

}
