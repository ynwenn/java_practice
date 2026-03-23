public class PoisonMatango extends Matango {
    int numberOfAttack = 5;
    public PoisonMatango(char suffix) {
        super(suffix);
    }
    public void attack(Hero h) {
        super.attack(h);
        if (numberOfAttack > 0) {
            System.out.println("さらに胞子をばらまいた！");
            int damage = h.hp / 5;
            h.hp -= damage;
            System.out.println(damage + "ポイントのダメージ！");
            numberOfAttack --;
        }
    }
}
