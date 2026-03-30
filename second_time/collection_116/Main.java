import java.util.*;

public class Main {
    public static void main(String[] args) {
        Hero h1 = new Hero("斎藤");
        Hero h2 = new Hero("鈴木");
        List<Hero> heroes = new ArrayList<Hero>();
        heroes.add(h1);
        heroes.add(h2);
        for (Hero h : heroes) {
            System.out.println(h.getName());
        }

        Map<Hero, Integer> enemies = new HashMap<Hero, Integer>();
        enemies.put(h1, 3);
        enemies.put(h2, 7);
        for (Hero key : enemies.keySet()) {
            int value = enemies.get(key);
            System.out.println(key + "が倒した敵＝" + value);
        }
    }
}
