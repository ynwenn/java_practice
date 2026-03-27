public class Cleric {
    String name;
    int hp = 50;
    static final int MAX_HP = 50;
    int mp = 10;
    static final int MAX_MP = 10;

    public void selfAid() {
        System.out.println(this.name + "はセルフエイドを唱えた！");
        this.mp -= 5;
        this.hp = this.MAX_HP;
        System.out.println("HPが最大まで回復した");
    }

    public int pray(int second) {
        System.out.println(this.name + "は" + second + "秒間天に祈った！")
        int recovery = second + new java.util.Random().nextInt(3);
        if (recovery + this.mp > MAX_MP) {
            this.mp = MAX_MP;
        } else {
            this.mp += recovery;
        }
        return recovery;
    } 
}
