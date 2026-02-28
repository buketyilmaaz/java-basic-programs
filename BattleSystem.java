package oyun;

public class BattleSystem {
	public static void fight(Hero hero, Monster monster) {
    if (hero.getHp() >= monster.getAttackPower()) {
        hero.win();
        monster.die();
        System.out.println("Canavar yenildi!");
    } else {
        hero.lose(monster.getAttackPower());
        System.out.println("Kahraman hasar aldı!");
    }
}

}
