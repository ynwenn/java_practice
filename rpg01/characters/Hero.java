package rpg.characters;

import rpg.monsters.Monster;

public class Hero extends Character{
    protected String name;
    private int hp;
    private Sword sword;
    private static int money;

    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        if (name == null) {
            throw new IllegalArgumentException("名前がnullである。処理を中断。");
        }
        if (name.length() <= 1) {
            throw new IllegalArgumentException("名前が短すぎる。処理を中断。");
        }
        if (name.length() >= 8) {
            throw new IllegalArgumentException("名前が長すぎる。処理を中断。");
        }
        this.name = name;
    }
    public int getHp() {
        return this.hp;
    }
    public void setHp(int hp) {
        this.hp = hp;
    }
    public static void setRandomMoney() {
        Hero.money = (int)(Math.random() * 1000);
    }

    public void attack1(Monster m) {
        System.out.println(this.name + "は" + this.sword.name + "で攻撃した！");
        m.hp -= 5;
        System.out.println("敵に5ポイントのダメージをあたえた！");

        System.out.println("お化けキノコ" + m.suffix + "から2ポイントの反撃を受けた");
        this.hp -= 2;
        if (this.hp <= 0) {
            this.die();
        }
    }
    void sleep() {
        this.hp = 100;
        System.out.println(this.name + "は、眠って回復した！");
    }
    public void sit(int sec) {
        this.hp += sec;
        System.out.println(this.name + "は、" + sec + "秒座った！");
        System.out.println("HPが" + sec + "ポイント回復した");
    }
    public void slip() {
        this.hp -= 5;
        System.out.println(this.name + "は、転んだ！");
        System.out.println("5のダメージ！");
    }
    public void run() {
        System.out.println(this.name + "は、逃げ出した！");
        System.out.println("GAMEOVER");
        System.out.println("最終HPは" + this.hp + "でした");
    }
    public void bye() {
        System.out.println("勇者は別れを告げた");
    }
    private void die() {
        System.out.println(this.name + "は死んでしまった！");
        System.out.println("GAME OVERです。");
    }
    public Hero(String name) {
        this.hp = 100;
        this.name = name;
    }
    @Override
    public void attack(Monster m) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'attack'");
    }
}
