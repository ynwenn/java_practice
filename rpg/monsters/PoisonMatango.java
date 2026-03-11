package rpg.monsters;

import rpg.characters.Hero;

public class PoisonMatango extends Matango {
    public PoisonMatango(char suffix) {
        super(suffix);
    }
    int poisonCount = 5;

    public void attack(Hero h) {
        super.attack(h);
        if(poisonCount > 0) {
            System.out.println("さらに毒の胞子をばらまいた！");
            int damage = h.hp / 5;
            h.hp -= damage;
            System.out.println(damage + "ポイントのダメージ！");
            this.poisonCount--;
        }

    }
}
