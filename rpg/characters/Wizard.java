package rpg.characters;
import rpg.monsters.Monster;
public class Wizard extends Character {
    private int hp;
    private int mp;
    private String name;
    private Wand wand;

    public int getHp() { return this.hp; }
    public void setHp(int hp) {
        if (hp < 0) {
            this.hp = 0;
        } else {
            this.hp = hp;
        }
    } 
    public int getMp() { return this.mp; }
    public void setMp(int mp) {
        if (mp < 0) {
            throw new IllegalArgumentException("MPが0未満です。");
        }
        this.mp = mp;    
    }
    public String getName() { return this.name; }
    public void setName(String name) {
        if (name == null ||name.length() < 3) {
            throw new IllegalArgumentException("名前が短すぎます。");
        }
        this.name = name;
    }
    public Wand getWand() { return this.wand; }
    public void setWand(Wand wand) {
        if (wand == null) {
            throw new IllegalArgumentException("杖を装備していません。");
        }
        this.wand = wand;
    }

    public void heal(Hero h) {
        int basePoint = 10;
        int recovPoint = (int)(basePoint * this.wand.power);
        h.setHp(h.getHp() + recovPoint);
        System.out.println(h.getName() + "のHPを" + recovPoint + "回復した！");
    }
    public void attatck(Monster m) {
        System.out.println(this.name + "の攻撃！");
        System.out.println("敵に3ポイントのダメージ");
        m.hp -= 3;
    }
    public void fireball(Monster m) {
        System.out.println(this.name + "は火の玉を放った！");
        System.out.println("敵に20ポイントのダメージ");
        m.hp -= 20;
    }
    @Override
    public void attack(Monster m) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'attack'");
    }
    


}
