package rpg.characters;
import rpg.monsters.Monster;
public abstract class Character {
    String name;
    public int hp;
    //逃げる
    public void run() {
        System.out.println(this.name + "は逃げ出した");
    }
    //戦う
    public abstract void attack(Monster m);
}
