package rpg.characters;
public class Cleric {
    public String name;
    int hp = 50;
    static final int MAX_HP = 50;
    int mp =10;
    static final int MAX_MP = 10;

    public void selfAid() {
        System.out.println(this.name + "は、セルフエイドを唱えた！");
        this.mp -= 5;
        this.hp = this.MAX_HP;
        System.out.println("HPが全回復した");
    }

    public int pray(int sec) {
        System.out.println(this.name + "は、" + sec + "秒間、祈った！");
        int recover = sec + new java.util.Random().nextInt(3);
        int beforeMp = this.mp;
        this.mp += recover;
        if (this.mp > this.MAX_MP) {
            this.mp = this.MAX_MP;
        }
        System.out.println("MPが" + (this.mp - beforeMp) + "回復した");
        return this.mp - beforeMp;
    }
}
