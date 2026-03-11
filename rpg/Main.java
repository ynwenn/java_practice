package rpg;
import rpg.characters.*;
import rpg.monsters.*;

public class Main {
    public static void main(String[] args) {
        //Hero
        Sword s = new Sword();
        s.name = "炎の剣";
        s.damage = 10;
        Hero h1 = new Hero("ヒロシ");
        h1.sword = s;
        System.out.println("現在の武器は" + h1.sword.name);
        System.out.println("勇者" + h1.name + "を生み出しました！");

        Hero h2 = new Hero("ヨシヒコ");
        System.out.println("勇者" + h2.name + "も生み出しました！");

        SuperHero sh = new SuperHero("アベヒロシ");
        System.out.println("スーパーヒーローも生み出しました！");

        //Team
        Wizard w = new Wizard();
        w.name = "サダヲ";
        w.hp = 50;
        System.out.println("魔法使い" + w.name + "が姿を現しました！");

        Cleric c = new Cleric();
        c.name = "クレリック";
        System.out.println("聖職者" + c.name + "も姿を現しました！");

        //Monster
        Matango m1 = new Matango('A');
        m1.hp = 50;
        m1.suffix = 'A';
        Matango m2 = new Matango('B');
        m2.hp = 48;
        m2.suffix = 'B';
        System.out.println("お化けキノコが2体現れました！");

        Slime s1 = new Slime();
        Monster m = new Slime();
        s1.run(); m.run();



        
        h1.attack(m1);
        w.heal(h1);
        m1.run();
        c.pray(5);
        m2.run();
        h1.run();
        h2.run();
        sh.run();
    }
}
