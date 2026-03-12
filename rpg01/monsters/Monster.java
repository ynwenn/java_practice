package rpg.monsters;

public abstract class Monster {
    public int hp;
    public String suffix;
    public void run() {
        System.out.println("モンスターは逃げ出した。");
    }
}
